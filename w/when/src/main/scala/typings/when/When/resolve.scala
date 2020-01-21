package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(): Promise_[Unit] = js.native
  def apply[T](promiseOrValue: T): Promise_[T] = js.native
  def apply[T](promiseOrValue: Promise_[T]): Promise_[T] = js.native
  def apply[T](promiseOrValue: Thenable[T]): Promise_[T] = js.native
}

