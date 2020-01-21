package typings.xmppJid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", "createJID")
@js.native
object createJID extends js.Object {
  def apply(local: js.UndefOr[scala.Nothing], domain: String): JID_ = js.native
  def apply(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID_ = js.native
  def apply(local: String, domain: String): JID_ = js.native
  def apply(local: String, domain: String, resource: String): JID_ = js.native
}

