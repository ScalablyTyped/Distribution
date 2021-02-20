package typings.xmppJid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  def apply(address: String): JID_ = js.native
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  def apply(local: js.UndefOr[scala.Nothing], domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  def apply(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID_ = js.native
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  def apply(local: String, domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  def apply(local: String, domain: String, resource: String): JID_ = js.native
  
  @JSImport("@xmpp/jid", "JID")
  @js.native
  class JID_ protected () extends StObject {
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
  
  @JSImport("@xmpp/jid", "createJID")
  @js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", "createJID")
  @js.native
  def createJID(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID_ = js.native
  @JSImport("@xmpp/jid", "createJID")
  @js.native
  def createJID(local: String, domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", "createJID")
  @js.native
  def createJID(local: String, domain: String, resource: String): JID_ = js.native
  
  @JSImport("@xmpp/jid", "detectEscape")
  @js.native
  def detectEscape(): Boolean = js.native
  @JSImport("@xmpp/jid", "detectEscape")
  @js.native
  def detectEscape(local: String): Boolean = js.native
  
  @JSImport("@xmpp/jid", "equal")
  @js.native
  def equal(a: JID_, b: JID_): Boolean = js.native
  
  @JSImport("@xmpp/jid", "escapeLocal")
  @js.native
  def escapeLocal(local: String): String = js.native
  
  @JSImport("@xmpp/jid", "jid")
  @js.native
  def jid(address: String): JID_ = js.native
  @JSImport("@xmpp/jid", "jid")
  @js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", "jid")
  @js.native
  def jid(local: js.UndefOr[scala.Nothing], domain: String, resource: String): JID_ = js.native
  @JSImport("@xmpp/jid", "jid")
  @js.native
  def jid(local: String, domain: String): JID_ = js.native
  @JSImport("@xmpp/jid", "jid")
  @js.native
  def jid(local: String, domain: String, resource: String): JID_ = js.native
  
  @JSImport("@xmpp/jid", "parse")
  @js.native
  def parse(s: String): JID_ = js.native
  
  @JSImport("@xmpp/jid", "unescapeLocal")
  @js.native
  def unescapeLocal(local: String): String = js.native
}
