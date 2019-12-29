package typings.atXmppJid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", JSImport.Namespace)
@js.native
object atXmppJidMod extends js.Object {
  @js.native
  class JID protected () extends js.Object {
    def this(local: js.UndefOr[scala.Nothing], domain: String) = this()
    def this(local: String, domain: String) = this()
    def this(local: js.UndefOr[scala.Nothing], domain: String, resource: String) = this()
    def this(local: String, domain: String, resource: String) = this()
    var domain: String = js.native
    var local: String = js.native
    var resource: String = js.native
    /**
      * Convenience method to distinguish users
      */
    def bare(): JID = js.native
    /**
      * Comparison function
      */
    def equals(other: JID): Boolean = js.native
    def getDomain(): String = js.native
    def getLocal(): String = js.native
    def getLocal(unescape: Boolean): String = js.native
    def getResource(): String = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-domain
      */
    def setDomain(value: String): Unit = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-localpart
      */
    def setLocal(local: String): Unit = js.native
    def setLocal(local: String, escape: Boolean): Unit = js.native
    /**
      * http://xmpp.org/rfcs/rfc6122.html#addressing-resourcepart
      */
    def setResource(value: String): Unit = js.native
    def toString(unescape: Boolean): String = js.native
  }
  
  def apply(address: String): JID = js.native
  def apply(local: js.UndefOr[scala.Nothing], domain: String): JID = js.native
  def apply(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID = js.native
  def apply(local: String, domain: String): JID = js.native
  def apply(local: String, domain: String, resource: String): JID = js.native
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

