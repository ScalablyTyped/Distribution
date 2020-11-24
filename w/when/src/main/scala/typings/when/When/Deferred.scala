package typings.when.When

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deferred[T] extends js.Object {
  
  def notify(update: js.Any): Unit = js.native
  
  var promise: Promise[T] = js.native
  
  def reject(reason: js.Any): Unit = js.native
  
  def resolve(): Unit = js.native
  def resolve(value: T): Unit = js.native
  def resolve(value: Promise[T]): Unit = js.native
}
