package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler0
import typings.vscodeLanguageserverProtocol.anon.Properties
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.inlayHintSlashresolve
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashinlayHint
import typings.vscodeLanguageserverTypes.mod.InlayHint
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotinlayHintMod {
  
  object InlayHintRefreshRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRefreshRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRefreshRequest.method")
    @js.native
    val method: /* template literal string: workspace/inlayHint/refresh */ String = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRefreshRequest.type")
    @js.native
    val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler0[Unit, Unit]
  }
  
  object InlayHintRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRequest.method")
    @js.native
    val method: textDocumentSlashinlayHint = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        InlayHintParams, 
        js.Array[InlayHint] | Null, 
        js.Array[InlayHint], 
        Unit, 
        InlayHintRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[InlayHintParams, js.Array[InlayHint] | Null, Unit]
  }
  
  object InlayHintResolveRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintResolveRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintResolveRequest.method")
    @js.native
    val method: inlayHintSlashresolve = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlayHint", "InlayHintResolveRequest.type")
    @js.native
    val `type`: ProtocolRequestType[InlayHint, InlayHint, scala.Nothing, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler[InlayHint, InlayHint, Unit]
  }
  
  trait InlayHintClientCapabilities extends StObject {
    
    /**
      * Whether inlay hints support dynamic registration.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates which properties a client can resolve lazily on an inlay
      * hint.
      */
    var resolveSupport: js.UndefOr[Properties] = js.undefined
  }
  object InlayHintClientCapabilities {
    
    inline def apply(): InlayHintClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlayHintClientCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlayHintClientCapabilities] (val x: Self) extends AnyVal {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setResolveSupport(value: Properties): Self = StObject.set(x, "resolveSupport", value.asInstanceOf[js.Any])
      
      inline def setResolveSupportUndefined: Self = StObject.set(x, "resolveSupport", js.undefined)
    }
  }
  
  trait InlayHintOptions
    extends StObject
       with WorkDoneProgressOptions {
    
    /**
      * The server provides support to resolve additional
      * information for an inlay hint item.
      */
    var resolveProvider: js.UndefOr[Boolean] = js.undefined
  }
  object InlayHintOptions {
    
    inline def apply(): InlayHintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlayHintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlayHintOptions] (val x: Self) extends AnyVal {
      
      inline def setResolveProvider(value: Boolean): Self = StObject.set(x, "resolveProvider", value.asInstanceOf[js.Any])
      
      inline def setResolveProviderUndefined: Self = StObject.set(x, "resolveProvider", js.undefined)
    }
  }
  
  trait InlayHintParams
    extends StObject
       with WorkDoneProgressParams {
    
    /**
      * The document range for which inlay hints should be computed.
      */
    var range: Range
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object InlayHintParams {
    
    inline def apply(range: Range, textDocument: TextDocumentIdentifier): InlayHintParams = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlayHintParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlayHintParams] (val x: Self) extends AnyVal {
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  type InlayHintRegistrationOptions = InlayHintOptions & TextDocumentRegistrationOptions & StaticRegistrationOptions
  
  trait InlayHintWorkspaceClientCapabilities extends StObject {
    
    /**
      * Whether the client implementation supports a refresh request sent from
      * the server to the client.
      *
      * Note that this event is global and will force the client to refresh all
      * inlay hints currently shown. It should be used with absolute care and
      * is useful for situation where a server for example detects a project wide
      * change that requires such a calculation.
      */
    var refreshSupport: js.UndefOr[Boolean] = js.undefined
  }
  object InlayHintWorkspaceClientCapabilities {
    
    inline def apply(): InlayHintWorkspaceClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlayHintWorkspaceClientCapabilities]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InlayHintWorkspaceClientCapabilities] (val x: Self) extends AnyVal {
      
      inline def setRefreshSupport(value: Boolean): Self = StObject.set(x, "refreshSupport", value.asInstanceOf[js.Any])
      
      inline def setRefreshSupportUndefined: Self = StObject.set(x, "refreshSupport", js.undefined)
    }
  }
}
