package typings.strophe.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe", "Strophe.unescapeNode")
@js.native
object unescapeNode extends js.Object {
  /** Function: unescapeNode
    *  Unescape a node part (also called local part) of a JID.
    *
    *  Parameters:
    *    (String) node - A node (or local part).
    *
    *  Returns:
    *    An unescaped node (or local part).
    */
  def apply(node: String): String = js.native
}

