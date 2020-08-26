package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "getParseTreeNode")
@js.native
object getParseTreeNode extends js.Object {
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def apply(node: Node): Node = js.native
  /**
    * Gets the original parse tree node for a node.
    *
    * @param node The original node.
    * @param nodeTest A callback used to ensure the correct type of parse tree node is returned.
    * @returns The original parse tree node if found; otherwise, undefined.
    */
  def apply[T /* <: Node */](): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: js.UndefOr[scala.Nothing], nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
  def apply[T /* <: Node */](node: Node, nodeTest: js.Function1[/* node */ Node, /* is T */ Boolean]): js.UndefOr[T] = js.native
}

