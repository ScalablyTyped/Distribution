package typings
package xmppDashJidLib.xmppDashJidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmpp-jid", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def create(local: java.lang.String, domain: java.lang.String): JID = js.native
  def create(local: java.lang.String, domain: java.lang.String, resource: java.lang.String): JID = js.native
  def equal(jid1: java.lang.String, jid2: java.lang.String): scala.Boolean = js.native
  def equal(jid1: java.lang.String, jid2: java.lang.String, requriePrep: scala.Boolean): scala.Boolean = js.native
  def equal(jid1: java.lang.String, jid2: JID): scala.Boolean = js.native
  def equal(jid1: java.lang.String, jid2: JID, requriePrep: scala.Boolean): scala.Boolean = js.native
  def equal(jid1: JID, jid2: java.lang.String): scala.Boolean = js.native
  def equal(jid1: JID, jid2: java.lang.String, requriePrep: scala.Boolean): scala.Boolean = js.native
  def equal(jid1: JID, jid2: JID): scala.Boolean = js.native
  def equal(jid1: JID, jid2: JID, requriePrep: scala.Boolean): scala.Boolean = js.native
  def equalBare(jid1: java.lang.String, jid2: java.lang.String): scala.Boolean = js.native
  def equalBare(jid1: java.lang.String, jid2: java.lang.String, requirePrep: scala.Boolean): scala.Boolean = js.native
  def equalBare(jid1: java.lang.String, jid2: JID): scala.Boolean = js.native
  def equalBare(jid1: java.lang.String, jid2: JID, requirePrep: scala.Boolean): scala.Boolean = js.native
  def equalBare(jid1: JID, jid2: java.lang.String): scala.Boolean = js.native
  def equalBare(jid1: JID, jid2: java.lang.String, requirePrep: scala.Boolean): scala.Boolean = js.native
  def equalBare(jid1: JID, jid2: JID): scala.Boolean = js.native
  def equalBare(jid1: JID, jid2: JID, requirePrep: scala.Boolean): scala.Boolean = js.native
  def escape(value: java.lang.String): java.lang.String = js.native
  def isBare(jid: java.lang.String): scala.Boolean = js.native
  def isBare(jid: JID): scala.Boolean = js.native
  def isFull(jid: java.lang.String): scala.Boolean = js.native
  def isFull(jid: JID): scala.Boolean = js.native
  def parse(jid: java.lang.String): ParsedJID = js.native
  def parse(jid: java.lang.String, trusted: scala.Boolean): ParsedJID = js.native
  def prep(data: ParsedJID): ParsedJID = js.native
  def unescape(value: java.lang.String): java.lang.String = js.native
}

