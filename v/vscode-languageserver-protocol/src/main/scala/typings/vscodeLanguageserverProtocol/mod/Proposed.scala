package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode-languageserver-protocol", "Proposed")
@js.native
object Proposed extends js.Object {
  
  val SemanticTokenModifiers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenModifiers */ js.Any = js.native
  
  val SemanticTokenTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof st.SemanticTokenTypes */ js.Any = js.native
  
  @js.native
  object CallHierarchyIncomingCallsRequest extends js.Object {
    
    val method: callHierarchySlashincomingCalls = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams, 
        (js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
        ]) | Null, 
        js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
        ], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsRequest.HandlerSignature
  }
  
  @js.native
  object CallHierarchyOutgoingCallsRequest extends js.Object {
    
    val method: callHierarchySlashoutgoingCalls = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams, 
        (js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
        ]) | Null, 
        js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
        ], 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsRequest.HandlerSignature
  }
  
  @js.native
  object CallHierarchyPrepareRequest extends js.Object {
    
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams, 
        (js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
        ]) | Null, 
        scala.Nothing, 
        Unit, 
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
      ] = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareRequest.HandlerSignature
  }
  
  @js.native
  object SemanticTokens extends js.Object {
    
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  
  @js.native
  object SemanticTokensEditsRequest extends js.Object {
    
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits | Null, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult | typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult, 
        Unit, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRangeRequest extends js.Object {
    
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  @js.native
  object SemanticTokensRequest extends js.Object {
    
    val method: textDocumentSlashsemanticTokens = js.native
    
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  type CallHierarchyClientCapabilities = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyClientCapabilities
  
  type CallHierarchyIncomingCall = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
  
  type CallHierarchyIncomingCallsParams = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams
  
  type CallHierarchyItem = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
  
  type CallHierarchyOptions = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOptions
  
  type CallHierarchyOutgoingCall = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
  
  type CallHierarchyOutgoingCallsParams = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams
  
  type CallHierarchyPrepareParams = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams
  
  type CallHierarchyRegistrationOptions = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
  
  type CallHierarchyServerCapabilities = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyServerCapabilities
  
  type SemanticTokens = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
  
  type SemanticTokensClientCapabilities = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensClientCapabilities
  
  type SemanticTokensEdit = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdit
  
  type SemanticTokensEdits = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits
  
  type SemanticTokensEditsParams = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams
  
  type SemanticTokensEditsPartialResult = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult
  
  type SemanticTokensLegend = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensLegend
  
  type SemanticTokensOptions = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensOptions
  
  type SemanticTokensParams = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams
  
  type SemanticTokensPartialResult = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult
  
  type SemanticTokensRangeParams = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams
  
  type SemanticTokensRegistrationOptions = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
  
  type SemanticTokensServerCapabilities = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensServerCapabilities
}
