package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typings.vscodeLanguageserverProtocol.anon.CollapsedText
import typings.vscodeLanguageserverProtocol.anon.`5`
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.MessageDirection
import typings.vscodeLanguageserverProtocol.libCommonMessagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.libCommonProtocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageserverTypes.mod.FoldingRange
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import typings.vscodeLanguageserverTypes.mod.uinteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCommonProtocolDotfoldingRangeMod {
  
  object FoldingRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.foldingRange", "FoldingRangeRequest.messageDirection")
    @js.native
    val messageDirection: MessageDirection = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.foldingRange", "FoldingRangeRequest.method")
    @js.native
    val method: textDocumentSlashfoldingRange = js.native
    
    @JSImport("vscode-languageserver-protocol/lib/common/protocol.foldingRange", "FoldingRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        FoldingRangeParams, 
        js.Array[FoldingRange] | Null, 
        js.Array[FoldingRange], 
        Unit, 
        FoldingRangeRegistrationOptions
      ] = js.native
    
    type HandlerSignature = RequestHandler[FoldingRangeParams, js.Array[FoldingRange] | Null, Unit]
  }
  
  trait FoldingRangeClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration for folding range
      * providers. If this is set to `true` the client supports the new
      * `FoldingRangeRegistrationOptions` return value for the corresponding
      * server capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specific options for the folding range.
      *
      * @since 3.17.0
      */
    var foldingRange: js.UndefOr[CollapsedText] = js.undefined
    
    /**
      * Specific options for the folding range kind.
      *
      * @since 3.17.0
      */
    var foldingRangeKind: js.UndefOr[`5`] = js.undefined
    
    /**
      * If set, the client signals that it only supports folding complete lines.
      * If set, client will ignore specified `startCharacter` and `endCharacter`
      * properties in a FoldingRange.
      */
    var lineFoldingOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The maximum number of folding ranges that the client prefers to receive
      * per document. The value serves as a hint, servers are free to follow the
      * limit.
      */
    var rangeLimit: js.UndefOr[uinteger] = js.undefined
  }
  object FoldingRangeClientCapabilities {
    
    inline def apply(): FoldingRangeClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeClientCapabilities]
    }
    
    extension [Self <: FoldingRangeClientCapabilities](x: Self) {
      
      inline def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      inline def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      inline def setFoldingRange(value: CollapsedText): Self = StObject.set(x, "foldingRange", value.asInstanceOf[js.Any])
      
      inline def setFoldingRangeKind(value: `5`): Self = StObject.set(x, "foldingRangeKind", value.asInstanceOf[js.Any])
      
      inline def setFoldingRangeKindUndefined: Self = StObject.set(x, "foldingRangeKind", js.undefined)
      
      inline def setFoldingRangeUndefined: Self = StObject.set(x, "foldingRange", js.undefined)
      
      inline def setLineFoldingOnly(value: Boolean): Self = StObject.set(x, "lineFoldingOnly", value.asInstanceOf[js.Any])
      
      inline def setLineFoldingOnlyUndefined: Self = StObject.set(x, "lineFoldingOnly", js.undefined)
      
      inline def setRangeLimit(value: uinteger): Self = StObject.set(x, "rangeLimit", value.asInstanceOf[js.Any])
      
      inline def setRangeLimitUndefined: Self = StObject.set(x, "rangeLimit", js.undefined)
    }
  }
  
  type FoldingRangeOptions = WorkDoneProgressOptions
  
  trait FoldingRangeParams
    extends StObject
       with WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier
  }
  object FoldingRangeParams {
    
    inline def apply(textDocument: TextDocumentIdentifier): FoldingRangeParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoldingRangeParams]
    }
    
    extension [Self <: FoldingRangeParams](x: Self) {
      
      inline def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  trait FoldingRangeRegistrationOptions
    extends StObject
       with TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object FoldingRangeRegistrationOptions {
    
    inline def apply(): FoldingRangeRegistrationOptions = {
      val __obj = js.Dynamic.literal(documentSelector = null)
      __obj.asInstanceOf[FoldingRangeRegistrationOptions]
    }
  }
}
