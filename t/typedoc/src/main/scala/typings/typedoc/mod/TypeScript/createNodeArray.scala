package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import typings.typescript.mod.NodeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.createNodeArray")
@js.native
object createNodeArray extends js.Object {
  
  /** @deprecated Use `factory.createNodeArray` or the factory supplied by your transformation context instead. */
  def apply[T /* <: Node */](): NodeArray[T] = js.native
  def apply[T /* <: Node */](elements: js.UndefOr[scala.Nothing], hasTrailingComma: Boolean): NodeArray[T] = js.native
  def apply[T /* <: Node */](elements: js.Array[T]): NodeArray[T] = js.native
  def apply[T /* <: Node */](elements: js.Array[T], hasTrailingComma: Boolean): NodeArray[T] = js.native
}
