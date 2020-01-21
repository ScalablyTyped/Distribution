package typings.stropheJs.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe.js", "Strophe.escapeNode")
@js.native
object escapeNode extends js.Object {
  /** Function: escapeNode
    *  Escape the node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An escaped node (or local part).
    */
  def apply(node: String): String = js.native
}

