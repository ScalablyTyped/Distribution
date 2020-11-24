package typings.when.global.When

import typings.when.When.Promise
import typings.when.When.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("When.resolve")
@js.native
object resolve extends js.Object {
  
  /**
    * Returns a resolved promise. The returned promise will be
    *  - fulfilled with promiseOrValue if it is a value, or
    *  - if promiseOrValue is a promise
    *    - fulfilled with promiseOrValue's value after it is fulfilled
    *    - rejected with promiseOrValue's reason after it is rejected
    */
  def apply(): Promise[Unit] = js.native
  def apply[T](promiseOrValue: T): Promise[T] = js.native
  def apply[T](promiseOrValue: Promise[T]): Promise[T] = js.native
  def apply[T](promiseOrValue: Thenable[T]): Promise[T] = js.native
}
