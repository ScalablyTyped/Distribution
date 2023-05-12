package typings.thunderbirdWebextBrowser.messenger.manifest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProtocolHandler extends StObject {
  
  /**
    * A user-readable title string for the protocol handler. This will be
    * displayed to the user in interface objects as needed.
    */
  var name: String
  
  /**
    * The protocol the site wishes to handle, specified as a string. For
    * example, you can register to handle SMS text message links by
    * registering to handle the "sms" scheme.
    */
  var protocol: String | ProtocolHandlerProtocol
  
  /**
    * The URL of the handler, as a string. This string should include "%s"
    * as a placeholder which will be replaced with the escaped URL of the
    * document to be handled. This URL might be a true URL, or it could be a
    * phone number, email address, or so forth.
    */
  var uriTemplate: ExtensionURL | HttpURL
}
object ProtocolHandler {
  
  inline def apply(name: String, protocol: String | ProtocolHandlerProtocol, uriTemplate: ExtensionURL | HttpURL): ProtocolHandler = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], uriTemplate = uriTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtocolHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProtocolHandler] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String | ProtocolHandlerProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setUriTemplate(value: ExtensionURL | HttpURL): Self = StObject.set(x, "uriTemplate", value.asInstanceOf[js.Any])
  }
}
