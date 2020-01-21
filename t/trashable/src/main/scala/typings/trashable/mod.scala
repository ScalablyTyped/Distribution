package typings.trashable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trashable", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[T](promise: js.Promise[T]): TrashablePromise[T] = js.native
  type TrashablePromise[T] = js.Promise[T] with AnonTrash
}

