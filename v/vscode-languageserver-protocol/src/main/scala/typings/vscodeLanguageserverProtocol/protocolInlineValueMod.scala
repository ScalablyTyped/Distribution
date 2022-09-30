package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeJsonrpc.connectionMod.RequestHandler0
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashinlineValue
import typings.vscodeLanguageserverTypes.mod.InlineValue
import typings.vscodeLanguageserverTypes.mod.InlineValueContext
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolInlineValueMod {
  
  object InlineValueRefreshRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRefreshRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRefreshRequest.method")
    @js.native
    val method: /* template literal string: workspace/inlineValue/refresh */ String = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRefreshRequest.type")
    @js.native
    val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler0[Unit, Unit]
  }
  
  object InlineValueRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRequest.method")
    @js.native
    val method: textDocumentSlashinlineValue = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.inlineValue", "InlineValueRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        InlineValueParams, 
        js.Array[InlineValue] | Null, 
        js.Array[InlineValue], 
        Unit, 
        InlineValueRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[InlineValueParams, js.Array[InlineValue] | Null, Unit]
  }
  
  trait InlineValueClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration for inline value providers.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
  }
  object InlineValueClientCapabilities {
    
    inline def apply(): InlineValueClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineValueClientCapabilities]
    }
    
    extension [Self <: InlineValueClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
    }
  }
  
  type InlineValueOptions = WorkDoneProgressOptions
  
  trait InlineValueParams
    extends StObject
       with WorkDoneProgressParams {
    
    /**
      * Additional information about the context in which inline values were
      * requested.
      */
    var context: InlineValueContext
    
    /**
      * The document range for which inline values should be computed.
      */
    var range: Range
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object InlineValueParams {
    
    inline def apply(context: InlineValueContext, range: Range, textDocument: TextDocumentIdentifier): InlineValueParams = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[InlineValueParams]
    }
    
    extension [Self <: InlineValueParams](x: Self) {
      
      inline def setContext(value: InlineValueContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait InlineValueRegistrationOptions
    extends StObject
       with WorkDoneProgressOptions
       with TextDocumentRegistrationOptions
       with StaticRegistrationOptions
  object InlineValueRegistrationOptions {
    
    inline def apply(): InlineValueRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[InlineValueRegistrationOptions]
    }
  }
  
  trait InlineValueWorkspaceClientCapabilities extends StObject {
    
    /**
      * Whether the client implementation supports a refresh request sent from the
      * server to the client.
      *
      * Note that this event is global and will force the client to refresh all
      * inline values currently shown. It should be used with absolute care and is
      * useful for situation where a server for example detects a project wide
      * change that requires such a calculation.
      */
    var refreshSupport: js.UndefOr[Boolean] = js.undefined
  }
  object InlineValueWorkspaceClientCapabilities {
    
    inline def apply(): InlineValueWorkspaceClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineValueWorkspaceClientCapabilities]
    }
    
    extension [Self <: InlineValueWorkspaceClientCapabilities](x: Self) {
      
      inline def setRefreshSupport(value: Boolean): Self = StObject.set(x, "refreshSupport", value.asInstanceOf[js.Any])
      
      inline def setRefreshSupportUndefined: Self = StObject.set(x, "refreshSupport", js.undefined)
    }
  }
}
