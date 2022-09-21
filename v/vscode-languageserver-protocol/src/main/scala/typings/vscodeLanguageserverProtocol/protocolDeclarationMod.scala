package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashdeclaration
import typings.vscodeLanguageserverTypes.mod.Declaration
import typings.vscodeLanguageserverTypes.mod.DeclarationLink
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolDeclarationMod {
  
  object DeclarationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.method")
    @js.native
    val method: textDocumentSlashdeclaration = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.declaration", "DeclarationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DeclarationParams, 
        Declaration | js.Array[LocationLink] | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        DeclarationRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[DeclarationParams, Declaration | js.Array[DeclarationLink] | Null, Unit]
  }
  
  trait DeclarationClientCapabilities extends StObject {
    
    /**
      * Whether declaration supports dynamic registration. If this is set to `true`
      * the client supports the new `DeclarationRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The client supports additional metadata in the form of declaration links.
      */
    var linkSupport: js.UndefOr[Boolean] = js.undefined
  }
  object DeclarationClientCapabilities {
    
    inline def apply(): DeclarationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationClientCapabilities]
    }
    
    extension [Self <: DeclarationClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
      
      inline def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
    }
  }
  
  type DeclarationOptions = WorkDoneProgressOptions
  
  trait DeclarationParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object DeclarationParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): DeclarationParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeclarationParams]
    }
  }
  
  trait DeclarationRegistrationOptions
    extends StObject
       with WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object DeclarationRegistrationOptions {
    
    inline def apply(): DeclarationRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[DeclarationRegistrationOptions]
    }
  }
}
