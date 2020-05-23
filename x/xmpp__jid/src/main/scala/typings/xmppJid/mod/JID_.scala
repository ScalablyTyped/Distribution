package typings.xmppJid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@xmpp/jid", "JID")
@js.native
class JID_ protected () extends js.Object {
  def this(local: js.UndefOr[String], domain: String) = this()
  def this(local: js.UndefOr[String], domain: String, resource: String) = this()
  var domain: String = js.native
  var local: String = js.native
  var resource: String = js.native
  /**
    * Convenience method to distinguish users
    */
  def bare(): JID_ = js.native
  /**
    * Comparison function
    */
  def equals(other: JID_): Boolean = js.native
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

