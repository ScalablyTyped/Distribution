package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashtypeDefinition
import typings.vscodeLanguageserverTypes.mod.Definition
import typings.vscodeLanguageserverTypes.mod.DefinitionLink
import typings.vscodeLanguageserverTypes.mod.Location
import typings.vscodeLanguageserverTypes.mod.LocationLink
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDottypeDefinitionMod {
  
  object TypeDefinitionRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeDefinition", "TypeDefinitionRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeDefinition", "TypeDefinitionRequest.method")
    @js.native
    val method: textDocumentSlashtypeDefinition = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeDefinition", "TypeDefinitionRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        TypeDefinitionParams, 
        Definition | js.Array[LocationLink] | Null, 
        js.Array[Location | LocationLink], 
        Unit, 
        TypeDefinitionRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[TypeDefinitionParams, Definition | js.Array[DefinitionLink] | Null, Unit]
  }
  
  trait TypeDefinitionClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `TypeDefinitionRegistrationOptions` return value
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
  object TypeDefinitionClientCapabilities {
    
    inline def apply(): TypeDefinitionClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeDefinitionClientCapabilities]
    }
    
    extension [Self <: TypeDefinitionClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setLinkSupport(value: Boolean): Self = StObject.set(x, "linkSupport", value.asInstanceOf[js.Any])
      
      inline def setLinkSupportUndefined: Self = StObject.set(x, "linkSupport", js.undefined)
    }
  }
  
  type TypeDefinitionOptions = WorkDoneProgressOptions
  
  trait TypeDefinitionParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
       with PartialResultParams
  object TypeDefinitionParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): TypeDefinitionParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeDefinitionParams]
    }
  }
  
  trait TypeDefinitionRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object TypeDefinitionRegistrationOptions {
    
    inline def apply(): TypeDefinitionRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[TypeDefinitionRegistrationOptions]
    }
  }
}
