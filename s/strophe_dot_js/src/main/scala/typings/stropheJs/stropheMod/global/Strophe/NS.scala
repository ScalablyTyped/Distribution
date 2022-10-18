package typings.stropheJs.stropheMod.global.Strophe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NS extends StObject
/** Constants: XMPP Namespace Constants
  *  Common namespace constants from the XMPP RFCs and XEPs.
  *
  *  NS.HTTPBIND - HTTP BIND namespace from XEP 124.
  *  NS.BOSH - BOSH namespace from XEP 206.
  *  NS.CLIENT - Main XMPP client namespace.
  *  NS.AUTH - Legacy authentication namespace.
  *  NS.ROSTER - Roster operations namespace.
  *  NS.PROFILE - Profile namespace.
  *  NS.DISCO_INFO - Service discovery info namespace from XEP 30.
  *  NS.DISCO_ITEMS - Service discovery items namespace from XEP 30.
  *  NS.MUC - Multi-User Chat namespace from XEP 45.
  *  NS.SASL - XMPP SASL namespace from RFC 3920.
  *  NS.STREAM - XMPP Streams namespace from RFC 3920.
  *  NS.BIND - XMPP Binding namespace from RFC 3920 and RFC 6120.
  *  NS.SESSION - XMPP Session namespace from RFC 3920.
  *  NS.XHTML_IM - XHTML-IM namespace from XEP 71.
  *  NS.XHTML - XHTML body namespace from XEP 71.
  */
@JSGlobal("Strophe.NS")
@js.native
object NS extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[NS & String] = js.native
  
  @js.native
  sealed trait AUTH
    extends StObject
       with NS
  /* "jabber:iq:auth" */ val AUTH: typings.stropheJs.stropheMod.global.Strophe.NS.AUTH & String = js.native
  
  @js.native
  sealed trait BIND
    extends StObject
       with NS
  /* "urn:ietf:params:xml:ns:xmpp-bind" */ val BIND: typings.stropheJs.stropheMod.global.Strophe.NS.BIND & String = js.native
  
  @js.native
  sealed trait BOSH
    extends StObject
       with NS
  /* "urn:xmpp:xbosh" */ val BOSH: typings.stropheJs.stropheMod.global.Strophe.NS.BOSH & String = js.native
  
  @js.native
  sealed trait CLIENT
    extends StObject
       with NS
  /* "jabber:client" */ val CLIENT: typings.stropheJs.stropheMod.global.Strophe.NS.CLIENT & String = js.native
  
  @js.native
  sealed trait DISCO_INFO
    extends StObject
       with NS
  /* "http://jabber.org/protocol/disco#info" */ val DISCO_INFO: typings.stropheJs.stropheMod.global.Strophe.NS.DISCO_INFO & String = js.native
  
  @js.native
  sealed trait DISCO_ITEMS
    extends StObject
       with NS
  /* "http://jabber.org/protocol/disco#items" */ val DISCO_ITEMS: typings.stropheJs.stropheMod.global.Strophe.NS.DISCO_ITEMS & String = js.native
  
  @js.native
  sealed trait FRAMING
    extends StObject
       with NS
  /* "urn:ietf:params:xml:ns:xmpp-framing" */ val FRAMING: typings.stropheJs.stropheMod.global.Strophe.NS.FRAMING & String = js.native
  
  @js.native
  sealed trait HTTPBIND
    extends StObject
       with NS
  /* "http://jabber.org/protocol/httpbind" */ val HTTPBIND: typings.stropheJs.stropheMod.global.Strophe.NS.HTTPBIND & String = js.native
  
  @js.native
  sealed trait MUC
    extends StObject
       with NS
  /* "http://jabber.org/protocol/muc" */ val MUC: typings.stropheJs.stropheMod.global.Strophe.NS.MUC & String = js.native
  
  @js.native
  sealed trait PROFILE
    extends StObject
       with NS
  /* "jabber:iq:profile" */ val PROFILE: typings.stropheJs.stropheMod.global.Strophe.NS.PROFILE & String = js.native
  
  @js.native
  sealed trait ROSTER
    extends StObject
       with NS
  /* "jabber:iq:roster" */ val ROSTER: typings.stropheJs.stropheMod.global.Strophe.NS.ROSTER & String = js.native
  
  @js.native
  sealed trait SASL
    extends StObject
       with NS
  /* "urn:ietf:params:xml:ns:xmpp-sasl" */ val SASL: typings.stropheJs.stropheMod.global.Strophe.NS.SASL & String = js.native
  
  @js.native
  sealed trait SESSION
    extends StObject
       with NS
  /* "urn:ietf:params:xml:ns:xmpp-session" */ val SESSION: typings.stropheJs.stropheMod.global.Strophe.NS.SESSION & String = js.native
  
  @js.native
  sealed trait STANZAS
    extends StObject
       with NS
  /* "urn:ietf:params:xml:ns:xmpp-stanzas" */ val STANZAS: typings.stropheJs.stropheMod.global.Strophe.NS.STANZAS & String = js.native
  
  @js.native
  sealed trait STREAM
    extends StObject
       with NS
  /* "http://etherx.jabber.org/streams" */ val STREAM: typings.stropheJs.stropheMod.global.Strophe.NS.STREAM & String = js.native
  
  @js.native
  sealed trait VERSION
    extends StObject
       with NS
  /* "jabber:iq:version" */ val VERSION: typings.stropheJs.stropheMod.global.Strophe.NS.VERSION & String = js.native
  
  @js.native
  sealed trait XHTML
    extends StObject
       with NS
  /* "http://www.w3.org/1999/xhtml" */ val XHTML: typings.stropheJs.stropheMod.global.Strophe.NS.XHTML & String = js.native
  
  @js.native
  sealed trait XHTML_IM
    extends StObject
       with NS
  /* "http://jabber.org/protocol/xhtml-im" */ val XHTML_IM: typings.stropheJs.stropheMod.global.Strophe.NS.XHTML_IM & String = js.native
}
