package typings.atXmppJid.atXmppJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(address: String): JID = js.native
  def apply(local: js.UndefOr[String], domain: String): JID = js.native
  def apply(local: js.UndefOr[String], domain: String, resource: String): JID = js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: String): JID = js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID = js.native
  def createJID(local: String, domain: String): JID = js.native
  def createJID(local: String, domain: String, resource: String): JID = js.native
  def detectEscape(): Boolean = js.native
  def detectEscape(local: String): Boolean = js.native
  def equal(a: JID, b: JID): Boolean = js.native
  def escapeLocal(local: String): String = js.native
  def jid(address: String): JID = js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: String): JID = js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID = js.native
  def jid(local: String, domain: String): JID = js.native
  def jid(local: String, domain: String, resource: String): JID = js.native
  def parse(s: String): JID = js.native
  def unescapeLocal(local: String): String = js.native
}

