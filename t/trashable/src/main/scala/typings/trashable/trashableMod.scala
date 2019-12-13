package typings.trashable

import typings.trashable.trashableMod.TrashablePromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("trashable", JSImport.Namespace)
@js.native
object trashableMod extends js.Object {
  def apply[T](promise: js.Promise[T]): TrashablePromise[T] = js.native
  type TrashablePromise[T] = js.Promise[T] with Anon_Trash
}

