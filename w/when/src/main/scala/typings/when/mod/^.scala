package typings.when.mod

import typings.when.When.Promise_
import typings.when.When.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("when", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): Promise_[Unit] = js.native
  def apply[T](promiseOrValue: T): Promise_[T] = js.native
  def apply[T](promiseOrValue: Promise_[T]): Promise_[T] = js.native
  def apply[T](promiseOrValue: Thenable[T]): Promise_[T] = js.native
  def apply[T, U](promiseOrValue: T, transform: js.Function1[/* val */ T, U]): Promise_[U] = js.native
  def apply[T, U](promiseOrValue: Promise_[T], transform: js.Function1[/* val */ T, U]): Promise_[U] = js.native
  def apply[T, U](promiseOrValue: Thenable[T], transform: js.Function1[/* val */ T, U]): Promise_[U] = js.native
}

