package typings.typedoc.mod.TypeScript

import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TypeScript.getParseTreeNode")
@js.native
object getParseTreeNode extends js.Object {
  
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def apply(): js.UndefOr[Node] = js.native
  def apply(node: Node): js.UndefOr[Node] = js.native
  def apply[T /* <: Node */](node: T): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: T, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
}
