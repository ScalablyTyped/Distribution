package typings.vscodeLanguageclient.mod

import typings.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashincomingCalls
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.callHierarchySlashoutgoingCalls
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashprepareCallHierarchy
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashedits
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCall
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyIncomingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyItem
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCall
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyOutgoingCallsParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyPrepareParams
import typings.vscodeLanguageserverProtocol.protocolCallHierarchyProposedMod.CallHierarchyRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokens
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEdits
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensEditsPartialResult
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensPartialResult
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRangeParams
import typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokensRegistrationOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Proposed {
  
  object CallHierarchyIncomingCallsRequest {
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyIncomingCallsRequest.method")
    @js.native
    val method: callHierarchySlashincomingCalls = js.native
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyIncomingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyIncomingCallsParams, 
        js.Array[CallHierarchyIncomingCall] | Null, 
        js.Array[CallHierarchyIncomingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  object CallHierarchyOutgoingCallsRequest {
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyOutgoingCallsRequest.method")
    @js.native
    val method: callHierarchySlashoutgoingCalls = js.native
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyOutgoingCallsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyOutgoingCallsParams, 
        js.Array[CallHierarchyOutgoingCall] | Null, 
        js.Array[CallHierarchyOutgoingCall], 
        Unit, 
        Unit
      ] = js.native
  }
  
  object CallHierarchyPrepareRequest {
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyPrepareRequest.method")
    @js.native
    val method: textDocumentSlashprepareCallHierarchy = js.native
    
    @JSImport("vscode-languageclient", "Proposed.CallHierarchyPrepareRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        CallHierarchyPrepareParams, 
        js.Array[CallHierarchyItem] | Null, 
        scala.Nothing, 
        Unit, 
        CallHierarchyRegistrationOptions
      ] = js.native
  }
  
  /* was `typeof st.SemanticTokenModifiers` */
  @JSImport("vscode-languageclient", "Proposed.SemanticTokenModifiers")
  @js.native
  object SemanticTokenModifiers extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers & String
      ] = js.native
    
    /* "abstract" */ val `abstract`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.`abstract` & String = js.native
    
    /* "async" */ val async: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.async & String = js.native
    
    /* "declaration" */ val declaration: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.declaration & String = js.native
    
    /* "definition" */ val definition: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.definition & String = js.native
    
    /* "deprecated" */ val deprecated: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.deprecated & String = js.native
    
    /* "documentation" */ val documentation: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.documentation & String = js.native
    
    /* "readonly" */ val readonly: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.readonly & String = js.native
    
    /* "reference" */ val reference: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.reference & String = js.native
    
    /* "static" */ val static: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.static & String = js.native
    
    /* "volatile" */ val volatile: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenModifiers.volatile & String = js.native
  }
  
  /* was `typeof st.SemanticTokenTypes` */
  @JSImport("vscode-languageclient", "Proposed.SemanticTokenTypes")
  @js.native
  object SemanticTokenTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes & String
      ] = js.native
    
    /* "class" */ val `class`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`class` & String = js.native
    
    /* "comment" */ val comment: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.comment & String = js.native
    
    /* "enum" */ val `enum`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`enum` & String = js.native
    
    /* "function" */ val function: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.function & String = js.native
    
    /* "interface" */ val interface: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.interface & String = js.native
    
    /* "keyword" */ val keyword: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.keyword & String = js.native
    
    /* "label" */ val label: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.label & String = js.native
    
    /* "macro" */ val `macro`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`macro` & String = js.native
    
    /* "member" */ val member: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.member & String = js.native
    
    /* "namespace" */ val namespace: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.namespace & String = js.native
    
    /* "number" */ val number: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.number & String = js.native
    
    /* "operator" */ val operator: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.operator & String = js.native
    
    /* "parameter" */ val parameter: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.parameter & String = js.native
    
    /* "property" */ val property: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.property & String = js.native
    
    /* "regexp" */ val regexp: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.regexp & String = js.native
    
    /* "string" */ val string: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.string & String = js.native
    
    /* "struct" */ val struct: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.struct & String = js.native
    
    /* "type" */ val `type`: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.`type` & String = js.native
    
    /* "typeParameter" */ val typeParameter: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.typeParameter & String = js.native
    
    /* "variable" */ val variable: typings.vscodeLanguageserverProtocol.protocolSematicTokensProposedMod.SemanticTokenTypes.variable & String = js.native
  }
  
  /* was `typeof st.SemanticTokens` */
  object SemanticTokens {
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokens")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def is(value: js.Any): /* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is")(value.asInstanceOf[js.Any]).asInstanceOf[/* is vscode-languageserver-protocol.vscode-languageserver-protocol/lib/protocol.sematicTokens.proposed.SemanticTokens */ Boolean]
  }
  
  object SemanticTokensEditsRequest {
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensEditsRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashedits = js.native
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensEditsRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensEditsParams, 
        SemanticTokens | SemanticTokensEdits | Null, 
        SemanticTokensPartialResult | SemanticTokensEditsPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
  
  object SemanticTokensRangeRequest {
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensRangeRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensRangeParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
  }
  
  object SemanticTokensRequest {
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageclient", "Proposed.SemanticTokensRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
  }
}
