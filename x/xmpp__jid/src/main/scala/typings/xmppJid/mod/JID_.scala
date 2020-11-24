package typings.xmppJid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@xmpp/jid", "JID")
@js.native
class JID_ protected () extends js.Object {
  def this(local: js.UndefOr[scala.Nothing], domain: String) = this()
  def this(local: String, domain: String) = this()
  def this(local: js.UndefOr[scala.Nothing], domain: String, resource: String) = this()
  def this(local: String, domain: String, resource: String) = this()
  
  /**
    * Convenience method to distinguish users
    */
  def bare(): JID_ = js.native
  
  var domain: String = js.native
  
  /**
    * Comparison function
    */
  def equals(other: JID_): Boolean = js.native
  
  def getDomain(): String = js.native
  
  def getLocal(): String = js.native
  def getLocal(unescape: Boolean): String = js.native
  
  def getResource(): String = js.native
  
  var local: String = js.native
  
  var resource: String = js.native
  
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
