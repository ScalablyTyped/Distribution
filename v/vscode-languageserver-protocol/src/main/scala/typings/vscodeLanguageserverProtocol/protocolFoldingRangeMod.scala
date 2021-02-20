package typings.vscodeLanguageserverProtocol

import typings.vscodeJsonrpc.mod.ProgressType
import typings.vscodeJsonrpc.mod.RequestHandler
import typings.vscodeLanguageserverProtocol.messagesMod.ProtocolRequestType
import typings.vscodeLanguageserverProtocol.protocolMod.PartialResultParams
import typings.vscodeLanguageserverProtocol.protocolMod.StaticRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.TextDocumentRegistrationOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressOptions
import typings.vscodeLanguageserverProtocol.protocolMod.WorkDoneProgressParams
import typings.vscodeLanguageserverProtocol.vscodeLanguageserverProtocolStrings.textDocumentSlashfoldingRange
import typings.vscodeLanguageserverTypes.mod.TextDocumentIdentifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object protocolFoldingRangeMod {
  
  @js.native
  sealed trait FoldingRangeKind extends StObject
  @JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeKind")
  @js.native
  object FoldingRangeKind extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FoldingRangeKind with String] = js.native
    
    /**
      * Folding range for a comment
      */
    @js.native
    sealed trait Comment extends FoldingRangeKind
    /* "comment" */ val Comment: typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeKind.Comment with String = js.native
    
    /**
      * Folding range for a imports or includes
      */
    @js.native
    sealed trait Imports extends FoldingRangeKind
    /* "imports" */ val Imports: typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeKind.Imports with String = js.native
    
    /**
      * Folding range for a region (e.g. `#region`)
      */
    @js.native
    sealed trait Region extends FoldingRangeKind
    /* "region" */ val Region: typings.vscodeLanguageserverProtocol.protocolFoldingRangeMod.FoldingRangeKind.Region with String = js.native
  }
  
  object FoldingRangeRequest {
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeRequest.method")
    @js.native
    val method: textDocumentSlashfoldingRange = js.native
    
    /** @deprecated Use FoldingRangeRequest.type */
    @JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeRequest.resultType")
    @js.native
    val resultType: ProgressType[js.Array[FoldingRange]] = js.native
    
    type HandlerSignature = RequestHandler[FoldingRangeParams, js.Array[FoldingRange] | Null, Unit]
    
    @JSImport("vscode-languageserver-protocol/lib/protocol.foldingRange", "FoldingRangeRequest.type")
    @js.native
    val `type`: ProtocolRequestType[
        FoldingRangeParams, 
        js.Array[FoldingRange] | Null, 
        js.Array[FoldingRange], 
        js.Any, 
        FoldingRangeRegistrationOptions
      ] = js.native
  }
  
  @js.native
  trait FoldingRange extends StObject {
    
    /**
      * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
      */
    var endCharacter: js.UndefOr[Double] = js.native
    
    /**
      * The zero-based line number where the folded range ends.
      */
    var endLine: Double = js.native
    
    /**
      * Describes the kind of the folding range such as `comment' or 'region'. The kind
      * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
      * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
      */
    var kind: js.UndefOr[String] = js.native
    
    /**
      * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
      */
    var startCharacter: js.UndefOr[Double] = js.native
    
    /**
      * The zero-based line number from where the folded range starts.
      */
    var startLine: Double = js.native
  }
  object FoldingRange {
    
    @scala.inline
    def apply(endLine: Double, startLine: Double): FoldingRange = {
      val __obj = js.Dynamic.literal(endLine = endLine.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoldingRange]
    }
    
    @scala.inline
    implicit class FoldingRangeMutableBuilder[Self <: FoldingRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndCharacter(value: Double): Self = StObject.set(x, "endCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndCharacterUndefined: Self = StObject.set(x, "endCharacter", js.undefined)
      
      @scala.inline
      def setEndLine(value: Double): Self = StObject.set(x, "endLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setStartCharacter(value: Double): Self = StObject.set(x, "startCharacter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartCharacterUndefined: Self = StObject.set(x, "startCharacter", js.undefined)
      
      @scala.inline
      def setStartLine(value: Double): Self = StObject.set(x, "startLine", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FoldingRangeClientCapabilities extends StObject {
    
    /**
      * Whether implementation supports dynamic registration for folding range providers. If this is set to `true`
      * the client supports the new `FoldingRangeRegistrationOptions` return value for the corresponding server
      * capability as well.
      */
    var dynamicRegistration: js.UndefOr[Boolean] = js.native
    
    /**
      * If set, the client signals that it only supports folding complete lines. If set, client will
      * ignore specified `startCharacter` and `endCharacter` properties in a FoldingRange.
      */
    var lineFoldingOnly: js.UndefOr[Boolean] = js.native
    
    /**
      * The maximum number of folding ranges that the client prefers to receive per document. The value serves as a
      * hint, servers are free to follow the limit.
      */
    var rangeLimit: js.UndefOr[Double] = js.native
  }
  object FoldingRangeClientCapabilities {
    
    @scala.inline
    def apply(): FoldingRangeClientCapabilities = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeClientCapabilities]
    }
    
    @scala.inline
    implicit class FoldingRangeClientCapabilitiesMutableBuilder[Self <: FoldingRangeClientCapabilities] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDynamicRegistration(value: Boolean): Self = StObject.set(x, "dynamicRegistration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicRegistrationUndefined: Self = StObject.set(x, "dynamicRegistration", js.undefined)
      
      @scala.inline
      def setLineFoldingOnly(value: Boolean): Self = StObject.set(x, "lineFoldingOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineFoldingOnlyUndefined: Self = StObject.set(x, "lineFoldingOnly", js.undefined)
      
      @scala.inline
      def setRangeLimit(value: Double): Self = StObject.set(x, "rangeLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeLimitUndefined: Self = StObject.set(x, "rangeLimit", js.undefined)
    }
  }
  
  type FoldingRangeOptions = WorkDoneProgressOptions
  
  @js.native
  trait FoldingRangeParams
    extends WorkDoneProgressParams
       with PartialResultParams {
    
    /**
      * The text document.
      */
    var textDocument: TextDocumentIdentifier = js.native
  }
  object FoldingRangeParams {
    
    @scala.inline
    def apply(textDocument: TextDocumentIdentifier): FoldingRangeParams = {
      val __obj = js.Dynamic.literal(textDocument = textDocument.asInstanceOf[js.Any])
      __obj.asInstanceOf[FoldingRangeParams]
    }
    
    @scala.inline
    implicit class FoldingRangeParamsMutableBuilder[Self <: FoldingRangeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTextDocument(value: TextDocumentIdentifier): Self = StObject.set(x, "textDocument", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FoldingRangeRegistrationOptions
    extends TextDocumentRegistrationOptions
       with WorkDoneProgressOptions
       with StaticRegistrationOptions
  object FoldingRangeRegistrationOptions {
    
    @scala.inline
    def apply(): FoldingRangeRegistrationOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FoldingRangeRegistrationOptions]
    }
  }
}
