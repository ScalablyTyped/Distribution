package typings.when

import typings.when.WhenNs.Promise
import typings.when.WhenNs.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def When(): Promise[Unit] = js.native
  def When[T](promiseOrValue: T): Promise[T] = js.native
  def When[T](promiseOrValue: Promise[T]): Promise[T] = js.native
  def When[T](promiseOrValue: Thenable[T]): Promise[T] = js.native
  def When[T, U](promiseOrValue: T, transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
  def When[T, U](promiseOrValue: Promise[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
  def When[T, U](promiseOrValue: Thenable[T], transform: js.Function1[/* val */ T, U]): Promise[U] = js.native
}

