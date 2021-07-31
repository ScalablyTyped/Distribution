package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
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
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.method")
    @js.native
    val method: textDocumentSlashdeclaration = js.native
    
    /** @deprecated Use DeclarationRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.declaration", "DeclarationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        DeclarationParams, 
        Location | (js.Array[Location | LocationLink]) | Null, 
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
    
    @scala.inline
    def apply(): DeclarationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeclarationClientCapabilities]
    }
    
    @scala.inline
    implicit class DeclarationClientCapabilitiesMutableBuilder[Self <: DeclarationClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      @scala.inline
      def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
    }
  }
  
  type DeclarationOptions = WorkDoneProgressOptions
  
  trait DeclarationParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object DeclarationParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): DeclarationParams = {
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
    
    @scala.inline
    def apply(): DeclarationRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[DeclarationRegistrationOptions]
    }
  }
}
