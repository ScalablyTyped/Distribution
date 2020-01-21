package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "createNodeArray")
@js.native
object createNodeArray extends js.Object {
  def apply[T /* <: Node */](): NodeArray[T] = js.native
  def apply[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
  def apply[T /* <: Node */](elements: js.Array[T], hasTrailingComma: Boolean): NodeArray[T] = js.native
}

