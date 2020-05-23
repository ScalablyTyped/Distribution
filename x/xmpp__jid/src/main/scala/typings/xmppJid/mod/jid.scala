package typings.xmppJid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", "jid")
@js.native
object jid extends js.Object {
  def apply(address: String): JID_ = js.native
  def apply(local: js.UndefOr[String], domain: String): JID_ = js.native
  def apply(local: js.UndefOr[String], domain: String, resource: String): JID_ = js.native
}

