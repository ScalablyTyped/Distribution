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
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashimplementation
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.DefinitionLink
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolImplementationMod {
  
  object ImplementationRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.method")
    @js.native
    val method: textDocumentSlashimplementation = js.native
    
    /** @deprecated Use ImplementationRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[Location | LocationLink]] = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.implementation", "ImplementationRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        ImplementationParams, 
        Location | (js.Array[Location | LocationLink]) | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        ImplementationRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[ImplementationParams, Definition | js.Array[DefinitionLink] | Null, Unit]
  }
  
  trait ImplementationClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `ImplementationRegistrationOptions` return value
      * for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The client supports additional metadata in the form of definition links.
      *
      * Since 3.14.0
      */
    var linkSupport: js.UndefOr[Boolean] = js.undefined
  }
  object ImplementationClientCapabilities {
    
    @scala.inline
    def apply(): ImplementationClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImplementationClientCapabilities]
    }
    
    @scala.inline
    implicit class ImplementationClientCapabilitiesMutableBuilder[Self <: ImplementationClientCapabilities] (val x: Self) extends AnyVal {
      
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
  
  type ImplementationOptions = WorkDoneProgressOptions
  
  trait ImplementationParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object ImplementationParams {
    
    @scala.inline
    def apply(position: Position, textDocument: TextDocumentIdentifier): ImplementationParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImplementationParams]
    }
  }
  
  trait ImplementationRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object ImplementationRegistrationOptions {
    
    @scala.inline
    def apply(): ImplementationRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[ImplementationRegistrationOptions]
    }
  }
}
