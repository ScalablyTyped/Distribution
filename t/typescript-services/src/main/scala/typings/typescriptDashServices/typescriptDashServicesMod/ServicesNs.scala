package typings.typescriptDashServices.typescriptDashServicesMod

import typings.std.Error
import typings.typescriptDashServices.Fn_Context
import typings.typescriptDashServices.FormattingOptions
import typings.typescriptDashServices.TypeScriptNs.ICallExpression
import typings.typescriptDashServices.TypeScriptNs.ILogger
import typings.typescriptDashServices.TypeScriptNs.IScriptSnapshot
import typings.typescriptDashServices.TypeScriptNs.ISimpleText
import typings.typescriptDashServices.TypeScriptNs.PullVisibleSymbolsInfo
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.CachedCompletionEntryDetails
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.ITokenAccess
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.IClassifierHost
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.ICoreServicesHost
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.ILanguageService
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.ILanguageServiceHost
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.ILanguageServiceShimHost
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation
import typings.typescriptDashServices.TypeScriptNs.ServicesNs.IShimFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services")
@js.native
object ServicesNs extends js.Object {
  @js.native
  class ActualSignatureInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ActualSignatureInfo
  
  @js.native
  class BraceMatcher ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.BraceMatcher
  
  @js.native
  class ClassificationInfo protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ClassificationInfo {
    def this(length: Double, classification: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass) = this()
  }
  
  @js.native
  class ClassificationResult ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ClassificationResult
  
  @js.native
  class Classifier protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.Classifier {
    def this(host: IClassifierHost) = this()
  }
  
  @js.native
  class ClassifierShim protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ClassifierShim {
    def this(factory: IShimFactory, host: IClassifierHost) = this()
  }
  
  @js.native
  class CompletionHelpers ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.CompletionHelpers
  
  @js.native
  class CompletionInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.CompletionInfo
  
  @js.native
  class CompletionSession protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.CompletionSession {
    def this(
      fileName: String,
      position: Double,
      entries: typings.typescriptDashServices.TypeScriptNs.IdentiferNameHashTable[CachedCompletionEntryDetails]
    ) = this()
  }
  
  @js.native
  class CoreServices protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.CoreServices {
    def this(host: ICoreServicesHost) = this()
  }
  
  @js.native
  class CoreServicesShim protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.CoreServicesShim {
    def this(factory: IShimFactory, host: ICoreServicesHost) = this()
  }
  
  @js.native
  class DeclReferenceCompletionEntry protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.DeclReferenceCompletionEntry {
    def this(
      name: String,
      kind: String,
      kindModifiers: String,
      decl: typings.typescriptDashServices.TypeScriptNs.PullDecl
    ) = this()
  }
  
  @js.native
  class DefinitionInfo protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.DefinitionInfo {
    def this(
      fileName: String,
      minChar: Double,
      limChar: Double,
      kind: String,
      name: String,
      containerKind: String,
      containerName: String
    ) = this()
  }
  
  @js.native
  class DiagnosticCategory ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.DiagnosticCategory
  
  @js.native
  class EditorOptions ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.EditorOptions
  
  @js.native
  class FindReferenceHelpers ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FindReferenceHelpers
  
  @js.native
  class FormalParameterInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormalParameterInfo
  
  @js.native
  class FormalSignatureItemInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormalSignatureItemInfo
  
  @js.native
  class FormalTypeParameterInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormalTypeParameterInfo
  
  @js.native
  class FormatCodeOptions ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormatCodeOptions
  
  @js.native
  class GetScriptLexicalStructureWalker protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.GetScriptLexicalStructureWalker {
    def this(fileName: String) = this()
  }
  
  @js.native
  class Indenter ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.Indenter
  
  @js.native
  class KeywordCompletions ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.KeywordCompletions
  
  @js.native
  class LanguageService protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageService {
    def this(host: ILanguageServiceHost) = this()
  }
  
  @js.native
  class LanguageServiceCompiler protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageServiceCompiler {
    def this(host: ILanguageServiceHost) = this()
  }
  
  @js.native
  class LanguageServiceShim protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageServiceShim {
    def this(factory: IShimFactory, host: ILanguageServiceShimHost, languageService: ILanguageService) = this()
  }
  
  @js.native
  class LanguageServiceShimHostAdapter protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageServiceShimHostAdapter {
    def this(shimHost: ILanguageServiceShimHost) = this()
  }
  
  @js.native
  class MatchKind ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.MatchKind
  
  @js.native
  class NavigateToItem ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.NavigateToItem
  
  @js.native
  class OutliningElementsCollector ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.OutliningElementsCollector
  
  @js.native
  class ReferenceEntry protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ReferenceEntry {
    def this(fileName: String, minChar: Double, limChar: Double, isWriteAccess: Boolean) = this()
  }
  
  @js.native
  class ResolvedCompletionEntry protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ResolvedCompletionEntry {
    def this(
      name: String,
      kind: String,
      kindModifiers: String,
      `type`: String,
      fullSymbolName: String,
      docComment: String
    ) = this()
  }
  
  @js.native
  class ScriptElementKind ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ScriptElementKind
  
  @js.native
  class ScriptElementKindModifier ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ScriptElementKindModifier
  
  @js.native
  class ShimBase protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.ShimBase {
    def this(factory: IShimFactory) = this()
  }
  
  @js.native
  class SignatureInfo ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.SignatureInfo
  
  @js.native
  class SignatureInfoHelpers ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.SignatureInfoHelpers
  
  @js.native
  class SpanInfo protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.SpanInfo {
    def this(minChar: Double, limChar: Double) = this()
    def this(minChar: Double, limChar: Double, text: String) = this()
  }
  
  @js.native
  class SyntaxTreeCache protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.SyntaxTreeCache {
    def this(_host: ILanguageServiceHost) = this()
  }
  
  @js.native
  class TextEdit protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.TextEdit {
    def this(minChar: Double, limChar: Double, text: String) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.TypeInfo {
    def this(
      memberName: typings.typescriptDashServices.TypeScriptNs.MemberName,
      docComment: String,
      fullSymbolName: String,
      kind: String,
      minChar: Double,
      limChar: Double
    ) = this()
  }
  
  @js.native
  class TypeScriptServicesFactory ()
    extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.TypeScriptServicesFactory
  
  def copyDataObject(dst: js.Any, src: js.Any): js.Any = js.native
  def forwardJSONCall(logger: ILogger, actionDescription: String, action: js.Function0[_]): String = js.native
  def logInternalError(logger: ILogger, err: Error): Unit = js.native
  def simpleForwardCall(logger: ILogger, actionDescription: String, action: js.Function0[_]): js.Any = js.native
  /* static members */
  @js.native
  object BraceMatcher extends js.Object {
    def getMatchSpans(syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree, position: Double): js.Array[typings.typescriptDashServices.TypeScriptNs.TextSpan] = js.native
    /* private */ def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
    /* private */ def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
    /* private */ def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
    /* private */ def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  }
  
  @JSName("Breakpoints")
  @js.native
  object BreakpointsNs extends js.Object {
    def getBreakpointLocation(syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree, askedPos: Double): typings.typescriptDashServices.TypeScriptNs.ServicesNs.SpanInfo = js.native
  }
  
  /* static members */
  @js.native
  object CompletionHelpers extends js.Object {
    def filterContextualMembersList(
      contextualMemberSymbols: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSymbol],
      existingMembers: PullVisibleSymbolsInfo,
      fileName: String,
      position: Double
    ): js.Array[typings.typescriptDashServices.TypeScriptNs.PullSymbol] = js.native
    def getContainingObjectLiteralApplicableForCompletion(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedElement = js.native
    def getNonIdentifierCompleteTokenOnLeft(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): typings.typescriptDashServices.TypeScriptNs.PositionedToken = js.native
    /* private */ def getSpan(ast: js.Any): js.Any = js.native
    def getValidCompletionEntryDisplayName(displayName: String): String = js.native
    def isCompletionListBlocker(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
    def isIdentifierDefinitionLocation(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
    def isRightOfIllegalDot(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
    /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DiagnosticCategory extends js.Object {
    var error: String = js.native
    var message: String = js.native
    var none: String = js.native
    var warning: String = js.native
  }
  
  /* static members */
  @js.native
  object EditorOptions extends js.Object {
    def clone(objectToClone: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EditorOptions): typings.typescriptDashServices.TypeScriptNs.ServicesNs.EditorOptions = js.native
  }
  
  @js.native
  object EndOfLineState extends js.Object {
    /* 3 */ val InDoubleQuoteStringLiteral: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EndOfLineState.InDoubleQuoteStringLiteral with Double = js.native
    /* 1 */ val InMultiLineCommentTrivia: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EndOfLineState.InMultiLineCommentTrivia with Double = js.native
    /* 2 */ val InSingleQuoteStringLiteral: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EndOfLineState.InSingleQuoteStringLiteral with Double = js.native
    /* 0 */ val Start: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EndOfLineState.Start with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.typescriptDashServices.TypeScriptNs.ServicesNs.EndOfLineState with Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object FindReferenceHelpers extends js.Object {
    /* private */ def checkSymbolsForDeclarationEquality(firstSymbol: js.Any, secondSymbol: js.Any): js.Any = js.native
    def compareSymbolsForLexicalIdentity(
      firstSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
      secondSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol
    ): Boolean = js.native
    /* private */ def declarationsAreSameOrParents(firstDecl: js.Any, secondDecl: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FormatCodeOptions extends js.Object {
    def clone(objectToClone: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormatCodeOptions): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormatCodeOptions = js.native
  }
  
  @JSName("Formatting")
  @js.native
  object FormattingNs extends js.Object {
    @js.native
    class Formatter protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.Formatter {
      def this(
        textSpan: typings.typescriptDashServices.TypeScriptNs.TextSpan,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        indentFirstToken: Boolean,
        options: FormattingOptions,
        snapshot: ITextSnapshot,
        rulesProvider: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider,
        formattingRequestKind: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
      ) = this()
    }
    
    @js.native
    class FormattingContext protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext {
      def this(
        snapshot: ITextSnapshot,
        formattingRequestKind: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
      ) = this()
    }
    
    @js.native
    class FormattingManager protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingManager {
      def this(
        syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree,
        snapshot: ITextSnapshot,
        rulesProvider: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider,
        editorOptions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EditorOptions
      ) = this()
    }
    
    @js.native
    class IndentationNodeContext protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext {
      def this(
        parent: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext,
        node: typings.typescriptDashServices.TypeScriptNs.SyntaxNode,
        fullStart: Double,
        indentationAmount: Double,
        childIndentationAmountDelta: Double
      ) = this()
    }
    
    @js.native
    class IndentationNodeContextPool ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContextPool
    
    @js.native
    class IndentationTrackingWalker protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationTrackingWalker {
      def this(
        textSpan: typings.typescriptDashServices.TypeScriptNs.TextSpan,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        snapshot: ITextSnapshot,
        indentFirstToken: Boolean,
        options: FormattingOptions
      ) = this()
    }
    
    @js.native
    class MultipleTokenIndenter protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.MultipleTokenIndenter {
      def this(
        textSpan: typings.typescriptDashServices.TypeScriptNs.TextSpan,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        snapshot: ITextSnapshot,
        indentFirstToken: Boolean,
        options: FormattingOptions
      ) = this()
    }
    
    @js.native
    class Rule protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.Rule {
      def this(
        Descriptor: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor,
        Operation: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation
      ) = this()
      def this(
        Descriptor: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor,
        Operation: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation,
        Flag: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags
      ) = this()
    }
    
    @js.native
    class RuleDescriptor protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor {
      def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
    }
    
    @js.native
    class RuleOperation ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation
    
    @js.native
    class RuleOperationContext protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext {
      def this(funcs: Fn_Context*) = this()
    }
    
    @js.native
    class Rules ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.Rules
    
    @js.native
    class RulesBucket ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesBucket
    
    @js.native
    class RulesBucketConstructionState ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesBucketConstructionState
    
    @js.native
    class RulesMap ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesMap
    
    @js.native
    class RulesProvider protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider {
      def this(logger: ILogger) = this()
    }
    
    @js.native
    class SingleTokenIndenter protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SingleTokenIndenter {
      def this(
        indentationPosition: Double,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        snapshot: ITextSnapshot,
        indentFirstToken: Boolean,
        options: FormattingOptions
      ) = this()
    }
    
    @js.native
    class SnapshotPoint protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SnapshotPoint {
      def this(snapshot: ITextSnapshot, position: Double) = this()
    }
    
    @js.native
    class TextEditInfo protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.TextEditInfo {
      def this(position: Double, length: Double, replaceWith: String) = this()
    }
    
    @js.native
    class TextSnapshot protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.TextSnapshot {
      def this(snapshot: ISimpleText) = this()
    }
    
    @js.native
    class TextSnapshotLine protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.TextSnapshotLine {
      def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
    }
    
    @js.native
    class TokenSpan protected ()
      extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.TokenSpan {
      def this(kind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind, start: Double, length: Double) = this()
    }
    
    /* static members */
    @js.native
    object Formatter extends js.Object {
      def getEdits(
        textSpan: typings.typescriptDashServices.TypeScriptNs.TextSpan,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        options: FormattingOptions,
        indentFirstToken: Boolean,
        snapshot: ITextSnapshot,
        rulesProvider: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider,
        formattingRequestKind: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
      ): js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.TextEditInfo] = js.native
    }
    
    @js.native
    object FormattingRequestKind extends js.Object {
      /* 0 */ val FormatDocument: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatDocument with Double = js.native
      /* 4 */ val FormatOnClosingCurlyBrace: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnClosingCurlyBrace with Double = js.native
      /* 2 */ val FormatOnEnter: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnEnter with Double = js.native
      /* 5 */ val FormatOnPaste: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnPaste with Double = js.native
      /* 3 */ val FormatOnSemicolon: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnSemicolon with Double = js.native
      /* 1 */ val FormatSelection: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatSelection with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind with Double
          ] = js.native
    }
    
    @js.native
    object RuleAction extends js.Object {
      /* 3 */ val Delete: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Delete with Double = js.native
      /* 0 */ val Ignore: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Ignore with Double = js.native
      /* 2 */ val NewLine: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.NewLine with Double = js.native
      /* 1 */ val Space: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Space with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction with Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object RuleDescriptor extends js.Object {
      def create1(
        left: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
        right: typings.typescriptDashServices.TypeScriptNs.SyntaxKind
      ): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create2(left: TokenRange, right: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create3(left: typings.typescriptDashServices.TypeScriptNs.SyntaxKind, right: TokenRange): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create4(left: TokenRange, right: TokenRange): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
    }
    
    @js.native
    object RuleFlags extends js.Object {
      /* 1 */ val CanDeleteNewLines: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.CanDeleteNewLines with Double = js.native
      /* 0 */ val None: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.None with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags with Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object RuleOperation extends js.Object {
      def create1(action: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation = js.native
      def create2(
        context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext,
        action: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
      ): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation = js.native
    }
    
    /* static members */
    @js.native
    object RuleOperationContext extends js.Object {
      var Any: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext = js.native
    }
    
    /* static members */
    @js.native
    object Rules extends js.Object {
      def IsAfterCodeBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsBeforeBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsBeforeMultilineBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsBinaryOpContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsControlDeclContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsForContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsFunctionCallContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsFunctionCallOrNewContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsFunctionDeclContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsModuleDeclContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsMultilineBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsNewContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsNotBinaryOpContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsNotForContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsNotFormatOnEnter(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsObjectContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsObjectTypeContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsSameLineTokenContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsSameLineTokenOrBeforeMultilineBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsSingleLineBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsTypeArgumentOrParameter(
        tokenKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
        parentKind: typings.typescriptDashServices.TypeScriptNs.SyntaxKind
      ): Boolean = js.native
      def IsTypeArgumentOrParameterContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsTypeScriptDeclWithBlockContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def IsVoidOpContext(context: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): Boolean = js.native
      def NodeIsBlockContext(node: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext): Boolean = js.native
      def NodeIsTypeScriptDeclWithBlockContext(node: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext): Boolean = js.native
    }
    
    /* static members */
    @js.native
    object RulesMap extends js.Object {
      def create(rules: js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.Rule]): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesMap = js.native
    }
    
    @js.native
    object RulesPosition extends js.Object {
      /* 2 */ val ContextRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesAny with Double = js.native
      /* 1 */ val ContextRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesSpecific with Double = js.native
      /* 0 */ val IgnoreRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesAny with Double = js.native
      /* 0 */ val IgnoreRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesSpecific with Double = js.native
      /* 4 */ val NoContextRulesAny: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesAny with Double = js.native
      /* 3 */ val NoContextRulesSpecific: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesSpecific with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition with Double
          ] = js.native
    }
    
    @JSName("Shared")
    @js.native
    object SharedNs extends js.Object {
      @js.native
      class TokenAllAccess ()
        extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenAllAccess
      
      @js.native
      class TokenRange protected ()
        extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange {
        def this(tokenAccess: ITokenAccess) = this()
      }
      
      @js.native
      class TokenRangeAccess protected ()
        extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRangeAccess {
        def this(
          from: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
          to: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
          except: js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxKind]
        ) = this()
      }
      
      @js.native
      class TokenSingleValueAccess protected ()
        extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenSingleValueAccess {
        def this(token: typings.typescriptDashServices.TypeScriptNs.SyntaxKind) = this()
      }
      
      @js.native
      class TokenValuesAccess protected ()
        extends typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenValuesAccess {
        def this(tks: js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxKind]) = this()
      }
      
      /* static members */
      @js.native
      object TokenRange extends js.Object {
        var Any: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var AnyIncludingMultilineComments: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var BinaryKeywordOperators: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var BinaryOperators: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Comments: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Keywords: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Operators: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var ReservedKeywords: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var TypeNames: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPostdecrementExpressions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPostincrementExpressions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPredecrementExpressions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPrefixExpressions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPrefixOperators: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPreincrementExpressions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def AllTokens(): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromRange(
          f: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
          to: typings.typescriptDashServices.TypeScriptNs.SyntaxKind
        ): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromRange(
          f: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
          to: typings.typescriptDashServices.TypeScriptNs.SyntaxKind,
          except: js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxKind]
        ): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromToken(token: typings.typescriptDashServices.TypeScriptNs.SyntaxKind): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromTokens(tokens: js.Array[typings.typescriptDashServices.TypeScriptNs.SyntaxKind]): typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object SingleTokenIndenter extends js.Object {
      def getIndentationAmount(
        position: Double,
        sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
        snapshot: ITextSnapshot,
        options: FormattingOptions
      ): Double = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object GetScriptLexicalStructureWalker extends js.Object {
    def getListsOfAllScriptLexicalStructure(
      items: js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.NavigateToItem],
      fileName: String,
      unit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax
    ): Unit = js.native
  }
  
  /* static members */
  @js.native
  object Indenter extends js.Object {
    /* private */ def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
    /* private */ def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
    def getIndentation(
      node: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax,
      soruceText: IScriptSnapshot,
      position: Double,
      editorOptions: typings.typescriptDashServices.TypeScriptNs.ServicesNs.EditorOptions
    ): Double = js.native
    /* private */ def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
    /* private */ def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object KeywordCompletions extends js.Object {
    var keywordCompletions: js.Any = js.native
    var keywords: js.Any = js.native
    def getKeywordCompltions(): js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.ResolvedCompletionEntry] = js.native
  }
  
  /* static members */
  @js.native
  object LanguageServiceShim extends js.Object {
    /* private */ def realizeDiagnostic(diagnostic: js.Any): js.Any = js.native
    /* private */ def realizeDiagnosticCategory(category: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object MatchKind extends js.Object {
    var exact: String = js.native
    var none: String = js.native
    var prefix: String = js.native
    var subString: String = js.native
  }
  
  /* static members */
  @js.native
  object OutliningElementsCollector extends js.Object {
    var MaximumDepth: js.Any = js.native
    def collectElements(node: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax): js.Array[typings.typescriptDashServices.TypeScriptNs.TextSpan] = js.native
  }
  
  /* static members */
  @js.native
  object ScriptElementKind extends js.Object {
    var callSignatureElement: String = js.native
    var classElement: String = js.native
    var constructSignatureElement: String = js.native
    var constructorImplementationElement: String = js.native
    var enumElement: String = js.native
    var functionElement: String = js.native
    var indexSignatureElement: String = js.native
    var interfaceElement: String = js.native
    var keyword: String = js.native
    var localFunctionElement: String = js.native
    var localVariableElement: String = js.native
    var memberFunctionElement: String = js.native
    var memberGetAccessorElement: String = js.native
    var memberSetAccessorElement: String = js.native
    var memberVariableElement: String = js.native
    var moduleElement: String = js.native
    var parameterElement: String = js.native
    var primitiveType: String = js.native
    var scriptElement: String = js.native
    var typeParameterElement: String = js.native
    var unknown: String = js.native
    var variableElement: String = js.native
  }
  
  /* static members */
  @js.native
  object ScriptElementKindModifier extends js.Object {
    var ambientModifier: String = js.native
    var exportedModifier: String = js.native
    var none: String = js.native
    var privateMemberModifier: String = js.native
    var publicMemberModifier: String = js.native
    var staticModifier: String = js.native
  }
  
  /* static members */
  @js.native
  object SignatureInfoHelpers extends js.Object {
    def getActualSignatureInfoFromCallExpression(
      ast: ICallExpression,
      caretPosition: Double,
      typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation
    ): typings.typescriptDashServices.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
    def getActualSignatureInfoFromPartiallyWritenGenericExpression(caretPosition: Double, typeParameterInformation: IPartiallyWrittenTypeArgumentListInformation): typings.typescriptDashServices.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
    def getSignatureInfoFromGenericSymbol(
      symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
      enclosingScopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
      compilerState: typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageServiceCompiler
    ): js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
    def getSignatureInfoFromSignatureSymbol(
      symbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
      signatures: js.Array[typings.typescriptDashServices.TypeScriptNs.PullSignatureSymbol],
      enclosingScopeSymbol: typings.typescriptDashServices.TypeScriptNs.PullSymbol,
      compilerState: typings.typescriptDashServices.TypeScriptNs.ServicesNs.LanguageServiceCompiler
    ): js.Array[typings.typescriptDashServices.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
    def isInPartiallyWrittenTypeArgumentList(syntaxTree: typings.typescriptDashServices.TypeScriptNs.SyntaxTree, position: Double): IPartiallyWrittenTypeArgumentListInformation = js.native
    def isSignatureHelpBlocker(sourceUnit: typings.typescriptDashServices.TypeScriptNs.SourceUnitSyntax, position: Double): Boolean = js.native
    def isTargetOfObjectCreationExpression(positionedToken: typings.typescriptDashServices.TypeScriptNs.PositionedToken): Boolean = js.native
    /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TextEdit extends js.Object {
    def createDelete(minChar: Double, limChar: Double): typings.typescriptDashServices.TypeScriptNs.ServicesNs.TextEdit = js.native
    def createInsert(pos: Double, text: String): typings.typescriptDashServices.TypeScriptNs.ServicesNs.TextEdit = js.native
    def createReplace(minChar: Double, limChar: Double, text: String): typings.typescriptDashServices.TypeScriptNs.ServicesNs.TextEdit = js.native
  }
  
  @js.native
  object TokenClass extends js.Object {
    /* 3 */ val Comment: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Comment with Double = js.native
    /* 5 */ val Identifier: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Identifier with Double = js.native
    /* 1 */ val Keyword: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Keyword with Double = js.native
    /* 6 */ val NumberLiteral: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.NumberLiteral with Double = js.native
    /* 2 */ val Operator: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Operator with Double = js.native
    /* 0 */ val Punctuation: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Punctuation with Double = js.native
    /* 8 */ val RegExpLiteral: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.RegExpLiteral with Double = js.native
    /* 7 */ val StringLiteral: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.StringLiteral with Double = js.native
    /* 4 */ val Whitespace: typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass.Whitespace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptDashServices.TypeScriptNs.ServicesNs.TokenClass with Double] = js.native
  }
  
}

