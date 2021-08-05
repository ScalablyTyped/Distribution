package typings.xmppJid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(address: String): JID_ = ^.asInstanceOf[js.Dynamic].apply(address.asInstanceOf[js.Any]).asInstanceOf[JID_]
  inline def apply(local: String, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].apply(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def apply(local: String, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].apply(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def apply(local: Unit, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].apply(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def apply(local: Unit, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].apply(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  
  @JSImport("@xmpp/jid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@xmpp/jid", "JID")
  @js.native
  class JID_ protected () extends StObject {
    def this(local: String, domain: String) = this()
    def this(local: Unit, domain: String) = this()
    def this(local: String, domain: String, resource: String) = this()
    def this(local: Unit, domain: String, resource: String) = this()
    
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
  
  inline def createJID(local: String, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createJID")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def createJID(local: String, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createJID")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def createJID(local: Unit, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createJID")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def createJID(local: Unit, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("createJID")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  
  inline def detectEscape(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEscape")().asInstanceOf[Boolean]
  inline def detectEscape(local: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("detectEscape")(local.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def equal(a: JID_, b: JID_): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equal")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def escapeLocal(local: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeLocal")(local.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def jid(address: String): JID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("jid")(address.asInstanceOf[js.Any]).asInstanceOf[JID_]
  inline def jid(local: String, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jid")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def jid(local: String, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jid")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def jid(local: Unit, domain: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jid")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[JID_]
  inline def jid(local: Unit, domain: String, resource: String): JID_ = (^.asInstanceOf[js.Dynamic].applyDynamic("jid")(local.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], resource.asInstanceOf[js.Any])).asInstanceOf[JID_]
  
  inline def parse(s: String): JID_ = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[JID_]
  
  inline def unescapeLocal(local: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unescapeLocal")(local.asInstanceOf[js.Any]).asInstanceOf[String]
}
