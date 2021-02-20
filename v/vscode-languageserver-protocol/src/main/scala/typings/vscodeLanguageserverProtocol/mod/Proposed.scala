package typings.vscodeLanguageserverProtocol.mod

import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashedits
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proposed {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyIncomingCallsRequest.type")
    @js.native
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
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyOutgoingCallsRequest.type")
    @js.native
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
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    type HandlerSignature = typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareRequest.HandlerSignature
    
    @JSImport("vscode-languageserver-protocol", "Proposed.CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams, 
        (js.Array[
          typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
        ]) | Null, 
        scala.Nothing, 
        Unit, 
        typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  /* was `typeof st.SemanticTokenModifiers` */
  @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokenModifiers")
  @js.native
  object SemanticTokenModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers with String
      ] = js.native
    
    /* "abstract" */ val `abstract`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.`abstract` with String = js.native
    
    /* "async" */ val async: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.async with String = js.native
    
    /* "declaration" */ val declaration: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.declaration with String = js.native
    
    /* "definition" */ val definition: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.definition with String = js.native
    
    /* "deprecated" */ val deprecated: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.deprecated with String = js.native
    
    /* "documentation" */ val documentation: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.documentation with String = js.native
    
    /* "readonly" */ val readonly: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.readonly with String = js.native
    
    /* "reference" */ val reference: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.reference with String = js.native
    
    /* "static" */ val static: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.static with String = js.native
    
    /* "volatile" */ val volatile: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.volatile with String = js.native
  }
  
  /* was `typeof st.SemanticTokenTypes` */
  @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokenTypes")
  @js.native
  object SemanticTokenTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes with String
      ] = js.native
    
    /* "class" */ val `class`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`class` with String = js.native
    
    /* "comment" */ val comment: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.comment with String = js.native
    
    /* "enum" */ val enum: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.enum with String = js.native
    
    /* "function" */ val function: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.function with String = js.native
    
    /* "interface" */ val interface: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.interface with String = js.native
    
    /* "keyword" */ val keyword: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.keyword with String = js.native
    
    /* "label" */ val label: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.label with String = js.native
    
    /* "macro" */ val `macro`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`macro` with String = js.native
    
    /* "member" */ val member: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.member with String = js.native
    
    /* "namespace" */ val namespace: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.namespace with String = js.native
    
    /* "number" */ val number: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.number with String = js.native
    
    /* "operator" */ val operator: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.operator with String = js.native
    
    /* "parameter" */ val parameter: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.parameter with String = js.native
    
    /* "property" */ val property: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.property with String = js.native
    
    /* "regexp" */ val regexp: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.regexp with String = js.native
    
    /* "string" */ val string: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.string with String = js.native
    
    /* "struct" */ val struct: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.struct with String = js.native
    
    /* "type" */ val `type`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`type` with String = js.native
    
    /* "typeParameter" */ val typeParameter: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.typeParameter with String = js.native
    
    /* "variable" */ val variable: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.variable with String = js.native
  }
  
  /* was `typeof st.SemanticTokens` */
  object SemanticTokens {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokens.is")
    @js.native
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = js.native
  }
  type SemanticTokens = typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
  
  object SemanticTokensEditsRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensEditsRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensEditsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits | Null, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult | typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult, 
        Unit, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  object SemanticTokensRangeRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRangeRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens | Null, 
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  object SemanticTokensRequest {
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol", "Proposed.SemanticTokensRequest.type")
    @js.native
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
