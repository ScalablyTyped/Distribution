package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript", "addEmitHelper")
@js.native
object addEmitHelper extends js.Object {
  /**
    * Adds an EmitHelper to a node.
    */
  def apply[T /* <: Node */](node: T, helper: EmitHelper): T = js.native
}

