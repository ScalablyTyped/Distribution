package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "isTypeNode")
@js.native
object isTypeNode extends js.Object {
  /**
    * Node test that determines whether a node is a valid type node.
    * This differs from the `isPartOfTypeNode` function which determines whether a node is *part*
    * of a TypeNode.
    */
  def apply(node: Node): /* is typescript.typescript.TypeNode */ Boolean = js.native
}

