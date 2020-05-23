package typings.xmppJid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(address: String): JID_ = js.native
  def apply(local: js.UndefOr[String], domain: String): JID_ = js.native
  def apply(local: js.UndefOr[String], domain: String, resource: String): JID_ = js.native
}

