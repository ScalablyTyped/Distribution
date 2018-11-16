package typings
package whenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object whenLibMembers extends js.Object {
  def When(): whenLib.WhenNs.Promise[scala.Unit] = js.native
  def When[T](promiseOrValue: T): whenLib.WhenNs.Promise[T] = js.native
  def When[T](promiseOrValue: whenLib.WhenNs.Promise[T]): whenLib.WhenNs.Promise[T] = js.native
  def When[T](promiseOrValue: whenLib.WhenNs.Thenable[T]): whenLib.WhenNs.Promise[T] = js.native
  def When[T, U](promiseOrValue: T, transform: js.Function1[/* val */ T, U]): whenLib.WhenNs.Promise[U] = js.native
  def When[T, U](promiseOrValue: whenLib.WhenNs.Promise[T], transform: js.Function1[/* val */ T, U]): whenLib.WhenNs.Promise[U] = js.native
  def When[T, U](promiseOrValue: whenLib.WhenNs.Thenable[T], transform: js.Function1[/* val */ T, U]): whenLib.WhenNs.Promise[U] = js.native
}

