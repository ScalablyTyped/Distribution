package typings.stropheJs.mod.Strophe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("strophe.js", "Strophe.getNodeFromJid")
@js.native
object getNodeFromJid extends js.Object {
  /** Function: getNodeFromJid
    *  Get the node portion of a JID String.
    *
    *  Parameters:
    *    (String) jid - A JID.
    *
    *  Returns:
    *    A String containing the node.
    */
  def apply(jid: String): String = js.native
}

