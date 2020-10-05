package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript", "addEmitHelper")
@js.native
object addEmitHelper extends js.Object {
  /**
    * Adds an EmitHelper to a node.
    */
  def apply[T /* <: Node */](node: T, helper: EmitHelper): T = js.native
}

