package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.connectionMod.RequestHandler
import typings.vscodeJsonrpc.connectionMod.RequestHandler0
import typings.vscodeLanguageserverProtocol.anon.Delta
import typings.vscodeLanguageserverProtocol.anon.Full
import typings.vscodeLanguageserverProtocol.messagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType0
import typings.vscodeLanguageserverProtocol.messagesMod.RegistrationType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.relative
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokens
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashfull
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashfullSlashdelta
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashsemanticTokensSlashrange
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.workspaceSlashsemanticTokensSlashrefresh
import typings.vscodeLanguageserverTypes.mod.Range
import typings.vscodeLanguageserverTypes.mod.SemanticTokens
import typings.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import typings.vscodeLanguageserverTypes.mod.SemanticTokensEdit
import typings.vscodeLanguageserverTypes.mod.SemanticTokensLegend
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolSemanticTokensMod {
  
  object SemanticTokensDeltaRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensDeltaRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensDeltaRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashfullSlashdelta = js.native
    
    /* was `typeof SemanticTokensRegistrationType.method` */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensDeltaRequest.registrationMethod")
    @js.native
    val registrationMethod: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensDeltaRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensDeltaParams, 
        SemanticTokens | SemanticTokensDelta | Null, 
        SemanticTokensPartialResult | SemanticTokensDeltaPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[SemanticTokensDeltaParams, SemanticTokens | SemanticTokensDelta | Null, Unit]
  }
  
  object SemanticTokensRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRangeRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRangeRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashrange = js.native
    
    /* was `typeof SemanticTokensRegistrationType.method` */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRangeRequest.registrationMethod")
    @js.native
    val registrationMethod: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensRangeParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        Unit
      ] = js.native
    
    type HandlerSignature = RequestHandler[SemanticTokensRangeParams, SemanticTokens | Null, Unit]
  }
  
  object SemanticTokensRefreshRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRefreshRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRefreshRequest.method")
    @js.native
    val method: workspaceSlashsemanticTokensSlashrefresh = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRefreshRequest.type")
    @js.native
    val `type`: ProtocolRequestType0[Unit, Unit, Unit, Unit] = js.native
    
    type HandlerSignature = RequestHandler0[Unit, Unit]
  }
  
  object SemanticTokensRegistrationType {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRegistrationType.method")
    @js.native
    val method: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRegistrationType.type")
    @js.native
    val `type`: RegistrationType[SemanticTokensRegistrationOptions] = js.native
  }
  
  object SemanticTokensRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRequest.method")
    @js.native
    val method: textDocumentSlashsemanticTokensSlashfull = js.native
    
    /* was `typeof SemanticTokensRegistrationType.method` */
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRequest.registrationMethod")
    @js.native
    val registrationMethod: textDocumentSlashsemanticTokens = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "SemanticTokensRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        SemanticTokensParams, 
        SemanticTokens | Null, 
        SemanticTokensPartialResult, 
        Unit, 
        SemanticTokensRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[SemanticTokensDeltaParams, SemanticTokens | Null, Unit]
  }
  
  object TokenFormat {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.semanticTokens", "TokenFormat.Relative")
    @js.native
    val Relative: relative = js.native
  }
  type TokenFormat = relative
  
  trait SemanticTokensClientCapabilities extends StObject {
    
    /**
      * Whether the client uses semantic tokens to augment existing
      * syntax tokens. If set to `true` client side created syntax
      * tokens and semantic tokens are both used for colorization. If
      * set to `false` the client only uses the returned semantic tokens
      * for colorization.
      *
      * If the value is `undefined` then the client behavior is not
      * specified.
      *
      * @since 3.17.0
      */
    var augmentsSyntaxTokens: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether implementation supports dynamic registration. If this is set to `true`
      * the client supports the new `(TextDocumentRegistrationOptions & StaticRegistrationOptions)`
      * return value for the corresponding server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The token formats the clients supports.
      */
    var formats: js.Array[TokenFormat]
    
    /**
      * Whether the client supports tokens that can span multiple lines.
      */
    var multilineTokenSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the client supports tokens that can overlap each other.
      */
    var overlappingTokenSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which requests the client supports and might send to the server
      * depending on the server's capability. Please note that clients might not
      * show semantic tokens or degrade some of the user experience if a range
      * or full request is advertised by the client but not provided by the
      * server. If for example the client capability `requests.full` and
      * `request.range` are both set to true but the server only provides a
      * range provider the client might not render a minimap correctly or might
      * even decide to not show any semantic tokens at all.
      */
    var requests: Full
    
    /**
      * Whether the client allows the server to actively cancel a
      * semantic token request, e.g. supports returning
      * LSPErrorCodes.ServerCancelled. If a server does the client
      * needs to retrigger the request.
      *
      * @since 3.17.0
      */
    var serverCancelSupport: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The token modifiers that the client supports.
      */
    var tokenModifiers: js.Array[String]
    
    /**
      * The token types that the client supports.
      */
    var tokenTypes: js.Array[String]
  }
  object SemanticTokensClientCapabilities {
    
    inline def apply(
      formats: js.Array[TokenFormat],
      requests: Full,
      tokenModifiers: js.Array[String],
      tokenTypes: js.Array[String]
    ): SemanticTokensClientCapabilities = {
      val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], tokenModifiers = tokenModifiers.asInstanceOf[js.Any], tokenTypes = tokenTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensClientCapabilities]
    }
    
    extension [Self <: SemanticTokensClientCapabilities](x: Self) {
      
      inline def setAugmentsSyntaxTokens(value: Boolean): Self = StObject.set(x, "augmentsSyntaxTokens", value.asInstanceOf[js.Any])
      
      inline def setAugmentsSyntaxTokensUndefined: Self = StObject.set(x, "augmentsSyntaxTokens", js.undefined)
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setFormats(value: js.Array[TokenFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsVarargs(value: TokenFormat*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setMultilineTokenSupport(value: Boolean): Self = StObject.set(x, "multilineTokenSupport", value.asInstanceOf[js.Any])
      
      inline def setMultilineTokenSupportUndefined: Self = StObject.set(x, "multilineTokenSupport", js.undefined)
      
      inline def setOverlappingTokenSupport(value: Boolean): Self = StObject.set(x, "overlappingTokenSupport", value.asInstanceOf[js.Any])
      
      inline def setOverlappingTokenSupportUndefined: Self = StObject.set(x, "overlappingTokenSupport", js.undefined)
      
      inline def setRequests(value: Full): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
      
      inline def setServerCancelSupport(value: Boolean): Self = StObject.set(x, "serverCancelSupport", value.asInstanceOf[js.Any])
      
      inline def setServerCancelSupportUndefined: Self = StObject.set(x, "serverCancelSupport", js.undefined)
      
      inline def setTokenModifiers(value: js.Array[String]): Self = StObject.set(x, "tokenModifiers", value.asInstanceOf[js.Any])
      
      inline def setTokenModifiersVarargs(value: String*): Self = StObject.set(x, "tokenModifiers", js.Array(value*))
      
      inline def setTokenTypes(value: js.Array[String]): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
      
      inline def setTokenTypesVarargs(value: String*): Self = StObject.set(x, "tokenTypes", js.Array(value*))
    }
  }
  
  trait SemanticTokensDeltaParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The result id of a previous response. The result Id can either point to a full response
      * or a delta response depending on what was received last.
      */
    var previousResultId: String
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object SemanticTokensDeltaParams {
    
    inline def apply(previousResultId: String, textDocument: TextDocumentIdentifier): SemanticTokensDeltaParams = {
      val __obj = js.Dynamic.literal(previousResultId = previousResultId.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensDeltaParams]
    }
    
    extension [Self <: SemanticTokensDeltaParams](x: Self) {
      
      inline def setPreviousResultId(value: String): Self = StObject.set(x, "previousResultId", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait SemanticTokensDeltaPartialResult extends StObject {
    
    var edits: js.Array[SemanticTokensEdit]
  }
  object SemanticTokensDeltaPartialResult {
    
    inline def apply(edits: js.Array[SemanticTokensEdit]): SemanticTokensDeltaPartialResult = {
      val __obj = js.Dynamic.literal(edits = edits.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensDeltaPartialResult]
    }
    
    extension [Self <: SemanticTokensDeltaPartialResult](x: Self) {
      
      inline def setEdits(value: js.Array[SemanticTokensEdit]): Self = StObject.set(x, "edits", value.asInstanceOf[js.Any])
      
      inline def setEditsVarargs(value: SemanticTokensEdit*): Self = StObject.set(x, "edits", js.Array(value*))
    }
  }
  
  trait SemanticTokensOptions
    extends StObject
       with WorkDoneProgressOptions {
    
    /**
      * Server supports providing semantic tokens for a full document.
      */
    var full: js.UndefOr[Boolean | Delta] = js.undefined
    
    /**
      * The legend used by the server
      */
    var legend: SemanticTokensLegend
    
    /**
      * Server supports providing semantic tokens for a specific range
      * of a document.
      */
    var range: js.UndefOr[Boolean | js.Object] = js.undefined
  }
  object SemanticTokensOptions {
    
    inline def apply(legend: SemanticTokensLegend): SemanticTokensOptions = {
      val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensOptions]
    }
    
    extension [Self <: SemanticTokensOptions](x: Self) {
      
      inline def setFull(value: Boolean | Delta): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setFullUndefined: Self = StObject.set(x, "full", js.undefined)
      
      inline def setLegend(value: SemanticTokensLegend): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Boolean | js.Object): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait SemanticTokensParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object SemanticTokensParams {
    
    inline def apply(textDocument: TextDocumentIdentifier): SemanticTokensParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensParams]
    }
    
    extension [Self <: SemanticTokensParams](x: Self) {
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait SemanticTokensPartialResult extends StObject {
    
    var data: js.Array[uinteger]
  }
  object SemanticTokensPartialResult {
    
    inline def apply(data: js.Array[uinteger]): SemanticTokensPartialResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensPartialResult]
    }
    
    extension [Self <: SemanticTokensPartialResult](x: Self) {
      
      inline def setData(value: js.Array[uinteger]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: uinteger*): Self = StObject.set(x, "data", js.Array(value*))
    }
  }
  
  trait SemanticTokensRangeParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The range the semantic tokens are requested for.
      */
    var range: Range
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object SemanticTokensRangeParams {
    
    inline def apply(range: Range, textDocument: TextDocumentIdentifier): SemanticTokensRangeParams = {
      val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[SemanticTokensRangeParams]
    }
    
    extension [Self <: SemanticTokensRangeParams](x: Self) {
      
      inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait SemanticTokensRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with SemanticTokensOptions
       with StaticRegistrationOptions
  object SemanticTokensRegistrationOptions {
    
    inline def apply(legend: SemanticTokensLegend): SemanticTokensRegistrationOptions = {
      val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], documentSelector = null)
      __obj.asInstanceOf[SemanticTokensRegistrationOptions]
    }
  }
  
  trait SemanticTokensWorkspaceClientCapabilities extends StObject {
    
    /**
      * Whether the client implementation supports a refresh request sent from
      * the server to the client.
      *
      * Note that this event is global and will force the client to refresh all
      * semantic tokens currently shown. It should be used with absolute care
      * and is useful for situation where a server for example detects a project
      * wide change that requires such a calculation.
      */
    var refreshSupport: js.UndefOr[Boolean] = js.undefined
  }
  object SemanticTokensWorkspaceClientCapabilities {
    
    inline def apply(): SemanticTokensWorkspaceClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SemanticTokensWorkspaceClientCapabilities]
    }
    
    extension [Self <: SemanticTokensWorkspaceClientCapabilities](x: Self) {
      
      inline def setRefreshSupport(value: Boolean): Self = StObject.set(x, "refreshSupport", value.asInstanceOf[js.Any])
      
      inline def setRefreshSupportUndefined: Self = StObject.set(x, "refreshSupport", js.undefined)
    }
  }
}
