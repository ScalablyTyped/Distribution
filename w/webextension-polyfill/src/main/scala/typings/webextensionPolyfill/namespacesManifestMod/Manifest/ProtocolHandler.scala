package typings.webextensionPolyfill.namespacesManifestMod.Manifest

import typings.webextensionPolyfill.webextensionPolyfillStrings.bitcoin
import typings.webextensionPolyfill.webextensionPolyfillStrings.dat
import typings.webextensionPolyfill.webextensionPolyfillStrings.dweb
import typings.webextensionPolyfill.webextensionPolyfillStrings.ftp
import typings.webextensionPolyfill.webextensionPolyfillStrings.geo
import typings.webextensionPolyfill.webextensionPolyfillStrings.gopher
import typings.webextensionPolyfill.webextensionPolyfillStrings.im
import typings.webextensionPolyfill.webextensionPolyfillStrings.ipfs
import typings.webextensionPolyfill.webextensionPolyfillStrings.ipns
import typings.webextensionPolyfill.webextensionPolyfillStrings.irc
import typings.webextensionPolyfill.webextensionPolyfillStrings.ircs
import typings.webextensionPolyfill.webextensionPolyfillStrings.magnet
import typings.webextensionPolyfill.webextensionPolyfillStrings.mailto
import typings.webextensionPolyfill.webextensionPolyfillStrings.matrix
import typings.webextensionPolyfill.webextensionPolyfillStrings.mms
import typings.webextensionPolyfill.webextensionPolyfillStrings.news
import typings.webextensionPolyfill.webextensionPolyfillStrings.nntp
import typings.webextensionPolyfill.webextensionPolyfillStrings.sip
import typings.webextensionPolyfill.webextensionPolyfillStrings.sms
import typings.webextensionPolyfill.webextensionPolyfillStrings.smsto
import typings.webextensionPolyfill.webextensionPolyfillStrings.ssb
import typings.webextensionPolyfill.webextensionPolyfillStrings.ssh
import typings.webextensionPolyfill.webextensionPolyfillStrings.tel
import typings.webextensionPolyfill.webextensionPolyfillStrings.urn
import typings.webextensionPolyfill.webextensionPolyfillStrings.webcal
import typings.webextensionPolyfill.webextensionPolyfillStrings.wtai
import typings.webextensionPolyfill.webextensionPolyfillStrings.xmpp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a protocol handler definition.
  */
trait ProtocolHandler extends StObject {
  
  /**
    * A user-readable title string for the protocol handler. This will be displayed to the user in interface objects as needed.
    */
  var name: String
  
  /**
    * The protocol the site wishes to handle, specified as a string. For example, you can register to handle SMS text message
    * links by registering to handle the "sms" scheme.
    */
  var protocol: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String
  
  /**
    * The URL of the handler, as a string. This string should include "%s" as a placeholder which will be replaced with the
    * escaped URL of the document to be handled. This URL might be a true URL, or it could be a phone number, email address,
    * or so forth.
    */
  var uriTemplate: ExtensionURL | HttpURL
}
object ProtocolHandler {
  
  inline def apply(
    name: String,
    protocol: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String,
    uriTemplate: ExtensionURL | HttpURL
  ): ProtocolHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uriTemplate = uriTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolHandler]
  }
  
  extension [Self <: ProtocolHandler](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocol(
      value: bitcoin | dat | dweb | ftp | geo | gopher | im | ipfs | ipns | irc | ircs | magnet | mailto | matrix | mms | news | nntp | sip | sms | smsto | ssb | ssh | tel | urn | webcal | wtai | xmpp | String
    ): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setUriTemplate(value: ExtensionURL | HttpURL): Self = StObject.set(x, "uriTemplate", value.asInstanceOf[js.Any])
  }
}
