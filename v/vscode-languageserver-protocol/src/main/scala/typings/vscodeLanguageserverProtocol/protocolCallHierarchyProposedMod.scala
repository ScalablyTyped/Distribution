package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.anon.CallHierarchy
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentPositionParams
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.Position
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.SymbolKind
import typings.vscodeLanguageserverTypes.mod.SymbolTag
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolCallHierarchyProposedMod {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyIncomingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyIncomingCallsParams, js.Array[CallHierarchyIncomingCall] | Null, Unit]
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyOutgoingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyOutgoingCallsParams, js.Array[CallHierarchyOutgoingCall] | Null, Unit]
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.callHierarchy.proposed", "CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[CallHierarchyPrepareParams, js.Array[CallHierarchyItem] | Null, Unit]
  }
  
  trait CallHierarchyClientCapabilities extends StObject {
    
    /**
      * The text document client capabilities
      */
    var textDocument: js.UndefOr[CallHierarchy] = js.undefined
  }
  object CallHierarchyClientCapabilities {
    
    inline def apply(): CallHierarchyClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyClientCapabilities]
    }
    
    extension [Self <: CallHierarchyClientCapabilities](x: Self) {
      
      inline def setTextDocument(value: CallHierarchy): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
      
      inline def setTextDocumentUndefined: Self = StObject.set(x, "textDocument", js.undefined)
    }
  }
  
  trait CallHierarchyIncomingCall extends StObject {
    
    /**
      * The item that makes the call.
      */
    var from: CallHierarchyItem
    
    /**
      * The range at which at which the calls appears. This is relative to the caller
      * denoted by [`this.from`](#CallHierarchyIncomingCall.from).
      */
    var fromRanges: js.Array[Range]
  }
  object CallHierarchyIncomingCall {
    
    inline def apply(from: CallHierarchyItem, fromRanges: js.Array[Range]): CallHierarchyIncomingCall = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], fromRanges = fromRanges.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyIncomingCall]
    }
    
    extension [Self <: CallHierarchyIncomingCall](x: Self) {
      
      inline def setFrom(value: CallHierarchyItem): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
      
      inline def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value :_*))
    }
  }
  
  trait CallHierarchyIncomingCallsParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem
  }
  object CallHierarchyIncomingCallsParams {
    
    inline def apply(item: CallHierarchyItem): CallHierarchyIncomingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyIncomingCallsParams]
    }
    
    extension [Self <: CallHierarchyIncomingCallsParams](x: Self) {
      
      inline def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallHierarchyItem extends StObject {
    
    /**
      * More detail for this item, e.g. the signature of a function.
      */
    var detail: js.UndefOr[String] = js.undefined
    
    /**
      * The kind of this item.
      */
    var kind: SymbolKind
    
    /**
      * The name of this item.
      */
    var name: String
    
    /**
      * The range enclosing this symbol not including leading/trailing whitespace but everything else, e.g. comments and code.
      */
    var range: Range
    
    /**
      * The range that should be selected and revealed when this symbol is being picked, e.g. the name of a function.
      * Must be contained by the [`range`](#CallHierarchyItem.range).
      */
    var selectionRange: Range
    
    /**
      * Tags for this item.
      */
    var tags: js.UndefOr[js.Array[SymbolTag]] = js.undefined
    
    /**
      * The resource identifier of this item.
      */
    var uri: DocumentUri
  }
  object CallHierarchyItem {
    
    inline def apply(kind: SymbolKind, name: String, range: Range, selectionRange: Range, uri: DocumentUri): CallHierarchyItem = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], selectionRange = selectionRange.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyItem]
    }
    
    extension [Self <: CallHierarchyItem](x: Self) {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setKind(value: SymbolKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setSelectionRange(value: Range): Self = StObject.set(x, "selectionRange", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[SymbolTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: SymbolTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
  
  type CallHierarchyOptions = WorkDoneProgressOptions
  
  trait CallHierarchyOutgoingCall extends StObject {
    
    /**
      * The range at which this item is called. This is the range relative to the caller, e.g the item
      * passed to [`provideCallHierarchyOutgoingCalls`](#CallHierarchyItemProvider.provideCallHierarchyOutgoingCalls)
      * and not [`this.to`](#CallHierarchyOutgoingCall.to).
      */
    var fromRanges: js.Array[Range]
    
    /**
      * The item that is called.
      */
    var to: CallHierarchyItem
  }
  object CallHierarchyOutgoingCall {
    
    inline def apply(fromRanges: js.Array[Range], to: CallHierarchyItem): CallHierarchyOutgoingCall = {
      val __obj = js.Dynamic.literal(fromRanges = fromRanges.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyOutgoingCall]
    }
    
    extension [Self <: CallHierarchyOutgoingCall](x: Self) {
      
      inline def setFromRanges(value: js.Array[Range]): Self = StObject.set(x, "fromRanges", value.asInstanceOf[js.Any])
      
      inline def setFromRangesVarargs(value: Range*): Self = StObject.set(x, "fromRanges", js.Array(value :_*))
      
      inline def setTo(value: CallHierarchyItem): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallHierarchyOutgoingCallsParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    var item: CallHierarchyItem
  }
  object CallHierarchyOutgoingCallsParams {
    
    inline def apply(item: CallHierarchyItem): CallHierarchyOutgoingCallsParams = {
      val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyOutgoingCallsParams]
    }
    
    extension [Self <: CallHierarchyOutgoingCallsParams](x: Self) {
      
      inline def setItem(value: CallHierarchyItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallHierarchyPrepareParams
    extends StObject
       with TextDocumentPositionParams
       with WorkDoneProgressParams
  object CallHierarchyPrepareParams {
    
    inline def apply(position: Position, textDocument: TextDocumentIdentifier): CallHierarchyPrepareParams = {
      val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallHierarchyPrepareParams]
    }
  }
  
  trait CallHierarchyRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
  object CallHierarchyRegistrationOptions {
    
    inline def apply(): CallHierarchyRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[CallHierarchyRegistrationOptions]
    }
  }
  
  trait CallHierarchyServerCapabilities extends StObject {
    
    /**
      * The server provides Call Hierarchy support.
      */
    var callHierarchyProvider: js.UndefOr[
        Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions & StaticRegistrationOptions)
      ] = js.undefined
  }
  object CallHierarchyServerCapabilities {
    
    inline def apply(): CallHierarchyServerCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallHierarchyServerCapabilities]
    }
    
    extension [Self <: CallHierarchyServerCapabilities](x: Self) {
      
      inline def setCallHierarchyProvider(
        value: Boolean | CallHierarchyOptions | (CallHierarchyRegistrationOptions & StaticRegistrationOptions)
      ): Self = StObject.set(x, "callHierarchyProvider", value.asInstanceOf[js.Any])
      
      inline def setCallHierarchyProviderUndefined: Self = StObject.set(x, "callHierarchyProvider", js.undefined)
    }
  }
}
