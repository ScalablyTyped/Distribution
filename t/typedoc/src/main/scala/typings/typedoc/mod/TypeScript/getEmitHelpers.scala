package typings.typedoc.mod.TypeScript

import typings.typescript.mod.EmitHelper
import typings.typescript.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.getEmitHelpers")
@js.native
object getEmitHelpers extends js.Object {
  /**
    * Gets the EmitHelpers of a node.
    */
  def apply(node: Node): js.UndefOr[js.Array[EmitHelper]] = js.native
}

