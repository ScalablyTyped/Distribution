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
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareTypeHierarchy
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsubtypes
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.typeHierarchySlashsupertypes
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.TypeHierarchyItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolTypeHierarchyMod {
  
  object TypeHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchyPrepareRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareTypeHierarchy = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        TypeHierarchyPrepareParams, 
        js.Array[TypeHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        TypeHierarchyRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[TypeHierarchyPrepareParams, js.Array[TypeHierarchyItem] | Null, Unit]
  }
  
  object TypeHierarchySubtypesRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySubtypesRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySubtypesRequest.method")
    @js.native
    val method: typeHierarchySlashsubtypes = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySubtypesRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        TypeHierarchySubtypesParams, 
        js.Array[TypeHierarchyItem] | Null, 
        js.Array[TypeHierarchyItem], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[TypeHierarchySubtypesParams, js.Array[TypeHierarchyItem] | Null, Unit]
  }
  
  object TypeHierarchySupertypesRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySupertypesRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySupertypesRequest.method")
    @js.native
    val method: typeHierarchySlashsupertypes = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.typeHierarchy", "TypeHierarchySupertypesRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        TypeHierarchySupertypesParams, 
        js.Array[TypeHierarchyItem] | Null, 
        js.Array[TypeHierarchyItem], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[TypeHierarchySupertypesParams, js.Array[TypeHierarchyItem] | Null, Unit]
  }
  
  trait TypeHierarchyClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
      * return value for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object TypeHierarchyClientCapabilities {
    
    inline def apply(): TypeHierarchyClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypeHierarchyClientCapabilities]
    }
    
    extension [Self <: TypeHierarchyClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type TypeHierarchyOptions = WorkDoneProgressOptions
  
  trait TypeHierarchyPrepareParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
  object TypeHierarchyPrepareParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): TypeHierarchyPrepareParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHierarchyPrepareParams]
    }
  }
  
  trait TypeHierarchyRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object TypeHierarchyRegistrationOptions {
    
    inline def apply(): TypeHierarchyRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[TypeHierarchyRegistrationOptions]
    }
  }
  
  trait TypeHierarchySubtypesParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: TypeHierarchyItem
  }
  object TypeHierarchySubtypesParams {
    
    inline def apply(item: TypeHierarchyItem): TypeHierarchySubtypesParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHierarchySubtypesParams]
    }
    
    extension [Self <: TypeHierarchySubtypesParams](x: Self) {
      
      inline def setItem(value: TypeHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeHierarchySupertypesParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: TypeHierarchyItem
  }
  object TypeHierarchySupertypesParams {
    
    inline def apply(item: TypeHierarchyItem): TypeHierarchySupertypesParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeHierarchySupertypesParams]
    }
    
    extension [Self <: TypeHierarchySupertypesParams](x: Self) {
      
      inline def setItem(value: TypeHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
