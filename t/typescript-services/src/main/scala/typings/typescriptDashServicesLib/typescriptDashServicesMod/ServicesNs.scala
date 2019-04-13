package typings
package typescriptDashServicesLib.typescriptDashServicesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typescript-services", "Services")
@js.native
object ServicesNs extends js.Object {
  @js.native
  class ActualSignatureInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ActualSignatureInfo
  
  @js.native
  class BraceMatcher ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.BraceMatcher
  
  @js.native
  class ClassificationInfo protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ClassificationInfo {
    def this(length: scala.Double, classification: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass) = this()
  }
  
  @js.native
  class ClassificationResult ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ClassificationResult
  
  @js.native
  class Classifier protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.Classifier {
    def this(host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IClassifierHost) = this()
  }
  
  @js.native
  class ClassifierShim protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ClassifierShim {
    def this(factory: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IShimFactory, host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IClassifierHost) = this()
  }
  
  @js.native
  class CompletionHelpers ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.CompletionHelpers
  
  @js.native
  class CompletionInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.CompletionInfo
  
  @js.native
  class CompletionSession protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.CompletionSession {
    def this(fileName: java.lang.String, position: scala.Double, entries: typescriptDashServicesLib.TypeScriptNs.IdentiferNameHashTable[typescriptDashServicesLib.TypeScriptNs.ServicesNs.CachedCompletionEntryDetails]) = this()
  }
  
  @js.native
  class CoreServices protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.CoreServices {
    def this(host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ICoreServicesHost) = this()
  }
  
  @js.native
  class CoreServicesShim protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.CoreServicesShim {
    def this(factory: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IShimFactory, host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ICoreServicesHost) = this()
  }
  
  @js.native
  class DeclReferenceCompletionEntry protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.DeclReferenceCompletionEntry {
    def this(name: java.lang.String, kind: java.lang.String, kindModifiers: java.lang.String, decl: typescriptDashServicesLib.TypeScriptNs.PullDecl) = this()
  }
  
  @js.native
  class DefinitionInfo protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.DefinitionInfo {
    def this(fileName: java.lang.String, minChar: scala.Double, limChar: scala.Double, kind: java.lang.String, name: java.lang.String, containerKind: java.lang.String, containerName: java.lang.String) = this()
  }
  
  @js.native
  class DiagnosticCategory ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.DiagnosticCategory
  
  @js.native
  class EditorOptions ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions
  
  @js.native
  class FindReferenceHelpers ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FindReferenceHelpers
  
  @js.native
  class FormalParameterInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalParameterInfo
  
  @js.native
  class FormalSignatureItemInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalSignatureItemInfo
  
  @js.native
  class FormalTypeParameterInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalTypeParameterInfo
  
  @js.native
  class FormatCodeOptions ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormatCodeOptions
  
  @js.native
  class GetScriptLexicalStructureWalker protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.GetScriptLexicalStructureWalker {
    def this(fileName: java.lang.String) = this()
  }
  
  @js.native
  class Indenter ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.Indenter
  
  @js.native
  class KeywordCompletions ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.KeywordCompletions
  
  @js.native
  class LanguageService protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageService {
    def this(host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageServiceHost) = this()
  }
  
  @js.native
  class LanguageServiceCompiler protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceCompiler {
    def this(host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageServiceHost) = this()
  }
  
  @js.native
  class LanguageServiceShim protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceShim {
    def this(factory: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IShimFactory, host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageServiceShimHost, languageService: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageService) = this()
  }
  
  @js.native
  class LanguageServiceShimHostAdapter protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceShimHostAdapter {
    def this(shimHost: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageServiceShimHost) = this()
  }
  
  @js.native
  class MatchKind ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.MatchKind
  
  @js.native
  class NavigateToItem ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.NavigateToItem
  
  @js.native
  class OutliningElementsCollector ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.OutliningElementsCollector
  
  @js.native
  class ReferenceEntry protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ReferenceEntry {
    def this(fileName: java.lang.String, minChar: scala.Double, limChar: scala.Double, isWriteAccess: scala.Boolean) = this()
  }
  
  @js.native
  class ResolvedCompletionEntry protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ResolvedCompletionEntry {
    def this(name: java.lang.String, kind: java.lang.String, kindModifiers: java.lang.String, `type`: java.lang.String, fullSymbolName: java.lang.String, docComment: java.lang.String) = this()
  }
  
  @js.native
  class ScriptElementKind ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ScriptElementKind
  
  @js.native
  class ScriptElementKindModifier ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ScriptElementKindModifier
  
  @js.native
  class ShimBase protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.ShimBase {
    def this(factory: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IShimFactory) = this()
  }
  
  @js.native
  class SignatureInfo ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.SignatureInfo
  
  @js.native
  class SignatureInfoHelpers ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.SignatureInfoHelpers
  
  @js.native
  class SpanInfo protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.SpanInfo {
    def this(minChar: scala.Double, limChar: scala.Double) = this()
    def this(minChar: scala.Double, limChar: scala.Double, text: java.lang.String) = this()
  }
  
  @js.native
  class SyntaxTreeCache protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.SyntaxTreeCache {
    def this(_host: typescriptDashServicesLib.TypeScriptNs.ServicesNs.ILanguageServiceHost) = this()
  }
  
  @js.native
  class TextEdit protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit {
    def this(minChar: scala.Double, limChar: scala.Double, text: java.lang.String) = this()
  }
  
  @js.native
  class TypeInfo protected ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TypeInfo {
    def this(memberName: typescriptDashServicesLib.TypeScriptNs.MemberName, docComment: java.lang.String, fullSymbolName: java.lang.String, kind: java.lang.String, minChar: scala.Double, limChar: scala.Double) = this()
  }
  
  @js.native
  class TypeScriptServicesFactory ()
    extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.TypeScriptServicesFactory
  
  def copyDataObject(dst: js.Any, src: js.Any): js.Any = js.native
  def forwardJSONCall(
    logger: typescriptDashServicesLib.TypeScriptNs.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): java.lang.String = js.native
  def logInternalError(logger: typescriptDashServicesLib.TypeScriptNs.ILogger, err: stdLib.Error): scala.Unit = js.native
  def simpleForwardCall(
    logger: typescriptDashServicesLib.TypeScriptNs.ILogger,
    actionDescription: java.lang.String,
    action: js.Function0[_]
  ): js.Any = js.native
  /* static members */
  @js.native
  object BraceMatcher extends js.Object {
    def getMatchSpans(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, position: scala.Double): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan] = js.native
    /* private */ def getMatchingCloseBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
    /* private */ def getMatchingCloseBraceTokenKind(positionedElement: js.Any): js.Any = js.native
    /* private */ def getMatchingOpenBrace(currentToken: js.Any, position: js.Any, result: js.Any): js.Any = js.native
    /* private */ def getMatchingOpenBraceTokenKind(positionedElement: js.Any): js.Any = js.native
  }
  
  @JSName("Breakpoints")
  @js.native
  object BreakpointsNs extends js.Object {
    def getBreakpointLocation(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, askedPos: scala.Double): typescriptDashServicesLib.TypeScriptNs.ServicesNs.SpanInfo = js.native
  }
  
  /* static members */
  @js.native
  object CompletionHelpers extends js.Object {
    def filterContextualMembersList(
      contextualMemberSymbols: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol],
      existingMembers: typescriptDashServicesLib.TypeScriptNs.PullVisibleSymbolsInfo,
      fileName: java.lang.String,
      position: scala.Double
    ): js.Array[typescriptDashServicesLib.TypeScriptNs.PullSymbol] = js.native
    def getContainingObjectLiteralApplicableForCompletion(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedElement = js.native
    def getNonIdentifierCompleteTokenOnLeft(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.PositionedToken = js.native
    /* private */ def getSpan(ast: js.Any): js.Any = js.native
    def getValidCompletionEntryDisplayName(displayName: java.lang.String): java.lang.String = js.native
    def isCompletionListBlocker(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
    def isIdentifierDefinitionLocation(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
    def isRightOfIllegalDot(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
    /* private */ def symbolDeclarationIntersectsPosition(symbol: js.Any, fileName: js.Any, position: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object DiagnosticCategory extends js.Object {
    var error: java.lang.String = js.native
    var message: java.lang.String = js.native
    var none: java.lang.String = js.native
    var warning: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object EditorOptions extends js.Object {
    def clone(objectToClone: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions): typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions = js.native
  }
  
  @js.native
  object EndOfLineState extends js.Object {
    /* 3 */ val InDoubleQuoteStringLiteral: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState.InDoubleQuoteStringLiteral with scala.Double = js.native
    /* 1 */ val InMultiLineCommentTrivia: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState.InMultiLineCommentTrivia with scala.Double = js.native
    /* 2 */ val InSingleQuoteStringLiteral: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState.InSingleQuoteStringLiteral with scala.Double = js.native
    /* 0 */ val Start: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState.Start with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        typescriptDashServicesLib.TypeScriptNs.ServicesNs.EndOfLineState with scala.Double
      ] = js.native
  }
  
  /* static members */
  @js.native
  object FindReferenceHelpers extends js.Object {
    /* private */ def checkSymbolsForDeclarationEquality(firstSymbol: js.Any, secondSymbol: js.Any): js.Any = js.native
    def compareSymbolsForLexicalIdentity(
      firstSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
      secondSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol
    ): scala.Boolean = js.native
    /* private */ def declarationsAreSameOrParents(firstDecl: js.Any, secondDecl: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object FormatCodeOptions extends js.Object {
    def clone(objectToClone: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormatCodeOptions): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormatCodeOptions = js.native
  }
  
  @JSName("Formatting")
  @js.native
  object FormattingNs extends js.Object {
    @js.native
    class Formatter protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.Formatter {
      def this(textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions, snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, rulesProvider: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider, formattingRequestKind: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind) = this()
    }
    
    @js.native
    class FormattingContext protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext {
      def this(snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, formattingRequestKind: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind) = this()
    }
    
    @js.native
    class FormattingManager protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingManager {
      def this(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, rulesProvider: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider, editorOptions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions) = this()
    }
    
    @js.native
    class IndentationNodeContext protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext {
      def this(parent: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext, node: typescriptDashServicesLib.TypeScriptNs.SyntaxNode, fullStart: scala.Double, indentationAmount: scala.Double, childIndentationAmountDelta: scala.Double) = this()
    }
    
    @js.native
    class IndentationNodeContextPool ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContextPool
    
    @js.native
    class IndentationTrackingWalker protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationTrackingWalker {
      def this(textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
    }
    
    @js.native
    class MultipleTokenIndenter protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.MultipleTokenIndenter {
      def this(textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
    }
    
    @js.native
    class Rule protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.Rule {
      def this(Descriptor: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor, Operation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation) = this()
      def this(Descriptor: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor, Operation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation, Flag: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags) = this()
    }
    
    @js.native
    class RuleDescriptor protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor {
      def this(LeftTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange, RightTokenRange: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange) = this()
    }
    
    @js.native
    class RuleOperation ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation
    
    @js.native
    class RuleOperationContext protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext {
      def this(funcs: typescriptDashServicesLib.Anon_Context*) = this()
    }
    
    @js.native
    class Rules ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.Rules
    
    @js.native
    class RulesBucket ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesBucket
    
    @js.native
    class RulesBucketConstructionState ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesBucketConstructionState
    
    @js.native
    class RulesMap ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesMap
    
    @js.native
    class RulesProvider protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider {
      def this(logger: typescriptDashServicesLib.TypeScriptNs.ILogger) = this()
    }
    
    @js.native
    class SingleTokenIndenter protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SingleTokenIndenter {
      def this(indentationPosition: scala.Double, sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, indentFirstToken: scala.Boolean, options: typescriptDashServicesLib.FormattingOptions) = this()
    }
    
    @js.native
    class SnapshotPoint protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SnapshotPoint {
      def this(snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, position: scala.Double) = this()
    }
    
    @js.native
    class TextEditInfo protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.TextEditInfo {
      def this(position: scala.Double, length: scala.Double, replaceWith: java.lang.String) = this()
    }
    
    @js.native
    class TextSnapshot protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.TextSnapshot {
      def this(snapshot: typescriptDashServicesLib.TypeScriptNs.ISimpleText) = this()
    }
    
    @js.native
    class TextSnapshotLine protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.TextSnapshotLine {
      def this(_snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot, _lineNumber: scala.Double, _start: scala.Double, _end: scala.Double, _lineBreak: java.lang.String) = this()
    }
    
    @js.native
    class TokenSpan protected ()
      extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.TokenSpan {
      def this(kind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, start: scala.Double, length: scala.Double) = this()
    }
    
    /* static members */
    @js.native
    object Formatter extends js.Object {
      def getEdits(
        textSpan: typescriptDashServicesLib.TypeScriptNs.TextSpan,
        sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
        options: typescriptDashServicesLib.FormattingOptions,
        indentFirstToken: scala.Boolean,
        snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot,
        rulesProvider: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesProvider,
        formattingRequestKind: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind
      ): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.TextEditInfo] = js.native
    }
    
    @js.native
    object FormattingRequestKind extends js.Object {
      /* 0 */ val FormatDocument: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatDocument with scala.Double = js.native
      /* 4 */ val FormatOnClosingCurlyBrace: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnClosingCurlyBrace with scala.Double = js.native
      /* 2 */ val FormatOnEnter: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnEnter with scala.Double = js.native
      /* 5 */ val FormatOnPaste: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnPaste with scala.Double = js.native
      /* 3 */ val FormatOnSemicolon: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatOnSemicolon with scala.Double = js.native
      /* 1 */ val FormatSelection: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind.FormatSelection with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingRequestKind with scala.Double
          ] = js.native
    }
    
    @js.native
    object RuleAction extends js.Object {
      /* 3 */ val Delete: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Delete with scala.Double = js.native
      /* 0 */ val Ignore: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Ignore with scala.Double = js.native
      /* 2 */ val NewLine: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.NewLine with scala.Double = js.native
      /* 1 */ val Space: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction.Space with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction with scala.Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object RuleDescriptor extends js.Object {
      def create1(
        left: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
        right: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
      ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create2(
        left: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange,
        right: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
      ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create3(
        left: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
        right: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
      ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
      def create4(
        left: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange,
        right: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange
      ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleDescriptor = js.native
    }
    
    @js.native
    object RuleFlags extends js.Object {
      /* 1 */ val CanDeleteNewLines: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.CanDeleteNewLines with scala.Double = js.native
      /* 0 */ val None: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags.None with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleFlags with scala.Double
          ] = js.native
    }
    
    /* static members */
    @js.native
    object RuleOperation extends js.Object {
      def create1(action: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation = js.native
      def create2(
        context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext,
        action: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleAction
      ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperation = js.native
    }
    
    /* static members */
    @js.native
    object RuleOperationContext extends js.Object {
      var Any: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RuleOperationContext = js.native
    }
    
    /* static members */
    @js.native
    object Rules extends js.Object {
      def IsAfterCodeBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsBeforeBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsBeforeMultilineBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsBinaryOpContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsControlDeclContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsForContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsFunctionCallContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsFunctionCallOrNewContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsFunctionDeclContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsModuleDeclContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsMultilineBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsNewContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsNotBinaryOpContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsNotForContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsNotFormatOnEnter(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsObjectContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsObjectTypeContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsSameLineTokenContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsSameLineTokenOrBeforeMultilineBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsSingleLineBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsTypeArgumentOrParameter(
        tokenKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
        parentKind: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
      ): scala.Boolean = js.native
      def IsTypeArgumentOrParameterContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsTypeScriptDeclWithBlockContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def IsVoidOpContext(context: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.FormattingContext): scala.Boolean = js.native
      def NodeIsBlockContext(node: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext): scala.Boolean = js.native
      def NodeIsTypeScriptDeclWithBlockContext(node: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.IndentationNodeContext): scala.Boolean = js.native
    }
    
    /* static members */
    @js.native
    object RulesMap extends js.Object {
      def create(rules: js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.Rule]): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesMap = js.native
    }
    
    @js.native
    object RulesPosition extends js.Object {
      val ContextRulesAny: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesAny with scala.Double = js.native
      val ContextRulesSpecific: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.ContextRulesSpecific with scala.Double = js.native
      val IgnoreRulesAny: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesAny with scala.Double = js.native
      /* 0 */ val IgnoreRulesSpecific: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.IgnoreRulesSpecific with scala.Double = js.native
      val NoContextRulesAny: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesAny with scala.Double = js.native
      val NoContextRulesSpecific: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition.NoContextRulesSpecific with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.RulesPosition with scala.Double
          ] = js.native
    }
    
    @JSName("Shared")
    @js.native
    object SharedNs extends js.Object {
      @js.native
      class TokenAllAccess ()
        extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenAllAccess
      
      @js.native
      class TokenRange protected ()
        extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange {
        def this(tokenAccess: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.ITokenAccess) = this()
      }
      
      @js.native
      class TokenRangeAccess protected ()
        extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRangeAccess {
        def this(from: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind, except: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]) = this()
      }
      
      @js.native
      class TokenSingleValueAccess protected ()
        extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenSingleValueAccess {
        def this(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind) = this()
      }
      
      @js.native
      class TokenValuesAccess protected ()
        extends typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenValuesAccess {
        def this(tks: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]) = this()
      }
      
      /* static members */
      @js.native
      object TokenRange extends js.Object {
        var Any: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var AnyIncludingMultilineComments: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var BinaryKeywordOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var BinaryOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Comments: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Keywords: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var Operators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var ReservedKeywords: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var TypeNames: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPostdecrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPostincrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPredecrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPrefixExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPrefixOperators: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        var UnaryPreincrementExpressions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def AllTokens(): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromRange(
          f: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
          to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind
        ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromRange(
          f: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
          to: typescriptDashServicesLib.TypeScriptNs.SyntaxKind,
          except: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]
        ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromToken(token: typescriptDashServicesLib.TypeScriptNs.SyntaxKind): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
        def FromTokens(tokens: js.Array[typescriptDashServicesLib.TypeScriptNs.SyntaxKind]): typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.SharedNs.TokenRange = js.native
      }
      
    }
    
    /* static members */
    @js.native
    object SingleTokenIndenter extends js.Object {
      def getIndentationAmount(
        position: scala.Double,
        sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
        snapshot: typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormattingNs.ITextSnapshot,
        options: typescriptDashServicesLib.FormattingOptions
      ): scala.Double = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object GetScriptLexicalStructureWalker extends js.Object {
    def getListsOfAllScriptLexicalStructure(
      items: js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.NavigateToItem],
      fileName: java.lang.String,
      unit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax
    ): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object Indenter extends js.Object {
    /* private */ def belongsToBracket(sourceText: js.Any, token: js.Any, position: js.Any): js.Any = js.native
    /* private */ def getCustomListIndentation(list: js.Any, element: js.Any): js.Any = js.native
    def getIndentation(
      node: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax,
      soruceText: typescriptDashServicesLib.TypeScriptNs.IScriptSnapshot,
      position: scala.Double,
      editorOptions: typescriptDashServicesLib.TypeScriptNs.ServicesNs.EditorOptions
    ): scala.Double = js.native
    /* private */ def getListItemIndentation(list: js.Any, elementIndex: js.Any): js.Any = js.native
    /* private */ def isInContainerNode(parent: js.Any, element: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object KeywordCompletions extends js.Object {
    var keywordCompletions: js.Any = js.native
    var keywords: js.Any = js.native
    def getKeywordCompltions(): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.ResolvedCompletionEntry] = js.native
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
    var exact: java.lang.String = js.native
    var none: java.lang.String = js.native
    var prefix: java.lang.String = js.native
    var subString: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object OutliningElementsCollector extends js.Object {
    var MaximumDepth: js.Any = js.native
    def collectElements(node: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax): js.Array[typescriptDashServicesLib.TypeScriptNs.TextSpan] = js.native
  }
  
  /* static members */
  @js.native
  object ScriptElementKind extends js.Object {
    var callSignatureElement: java.lang.String = js.native
    var classElement: java.lang.String = js.native
    var constructSignatureElement: java.lang.String = js.native
    var constructorImplementationElement: java.lang.String = js.native
    var enumElement: java.lang.String = js.native
    var functionElement: java.lang.String = js.native
    var indexSignatureElement: java.lang.String = js.native
    var interfaceElement: java.lang.String = js.native
    var keyword: java.lang.String = js.native
    var localFunctionElement: java.lang.String = js.native
    var localVariableElement: java.lang.String = js.native
    var memberFunctionElement: java.lang.String = js.native
    var memberGetAccessorElement: java.lang.String = js.native
    var memberSetAccessorElement: java.lang.String = js.native
    var memberVariableElement: java.lang.String = js.native
    var moduleElement: java.lang.String = js.native
    var parameterElement: java.lang.String = js.native
    var primitiveType: java.lang.String = js.native
    var scriptElement: java.lang.String = js.native
    var typeParameterElement: java.lang.String = js.native
    var unknown: java.lang.String = js.native
    var variableElement: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object ScriptElementKindModifier extends js.Object {
    var ambientModifier: java.lang.String = js.native
    var exportedModifier: java.lang.String = js.native
    var none: java.lang.String = js.native
    var privateMemberModifier: java.lang.String = js.native
    var publicMemberModifier: java.lang.String = js.native
    var staticModifier: java.lang.String = js.native
  }
  
  /* static members */
  @js.native
  object SignatureInfoHelpers extends js.Object {
    def getActualSignatureInfoFromCallExpression(
      ast: typescriptDashServicesLib.TypeScriptNs.ICallExpression,
      caretPosition: scala.Double,
      typeParameterInformation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation
    ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
    def getActualSignatureInfoFromPartiallyWritenGenericExpression(
      caretPosition: scala.Double,
      typeParameterInformation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation
    ): typescriptDashServicesLib.TypeScriptNs.ServicesNs.ActualSignatureInfo = js.native
    def getSignatureInfoFromGenericSymbol(
      symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
      enclosingScopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
      compilerState: typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceCompiler
    ): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
    def getSignatureInfoFromSignatureSymbol(
      symbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
      signatures: js.Array[typescriptDashServicesLib.TypeScriptNs.PullSignatureSymbol],
      enclosingScopeSymbol: typescriptDashServicesLib.TypeScriptNs.PullSymbol,
      compilerState: typescriptDashServicesLib.TypeScriptNs.ServicesNs.LanguageServiceCompiler
    ): js.Array[typescriptDashServicesLib.TypeScriptNs.ServicesNs.FormalSignatureItemInfo] = js.native
    def isInPartiallyWrittenTypeArgumentList(syntaxTree: typescriptDashServicesLib.TypeScriptNs.SyntaxTree, position: scala.Double): typescriptDashServicesLib.TypeScriptNs.ServicesNs.IPartiallyWrittenTypeArgumentListInformation = js.native
    def isSignatureHelpBlocker(sourceUnit: typescriptDashServicesLib.TypeScriptNs.SourceUnitSyntax, position: scala.Double): scala.Boolean = js.native
    def isTargetOfObjectCreationExpression(positionedToken: typescriptDashServicesLib.TypeScriptNs.PositionedToken): scala.Boolean = js.native
    /* private */ def moveBackUpTillMatchingTokenKind(token: js.Any, tokenKind: js.Any, matchingTokenKind: js.Any): js.Any = js.native
  }
  
  /* static members */
  @js.native
  object TextEdit extends js.Object {
    def createDelete(minChar: scala.Double, limChar: scala.Double): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
    def createInsert(pos: scala.Double, text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
    def createReplace(minChar: scala.Double, limChar: scala.Double, text: java.lang.String): typescriptDashServicesLib.TypeScriptNs.ServicesNs.TextEdit = js.native
  }
  
  @js.native
  object TokenClass extends js.Object {
    /* 3 */ val Comment: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Comment with scala.Double = js.native
    /* 5 */ val Identifier: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Identifier with scala.Double = js.native
    /* 1 */ val Keyword: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Keyword with scala.Double = js.native
    /* 6 */ val NumberLiteral: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.NumberLiteral with scala.Double = js.native
    /* 2 */ val Operator: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Operator with scala.Double = js.native
    /* 0 */ val Punctuation: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Punctuation with scala.Double = js.native
    /* 8 */ val RegExpLiteral: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.RegExpLiteral with scala.Double = js.native
    /* 7 */ val StringLiteral: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.StringLiteral with scala.Double = js.native
    /* 4 */ val Whitespace: typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass.Whitespace with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[typescriptDashServicesLib.TypeScriptNs.ServicesNs.TokenClass with scala.Double] = js.native
  }
  
}

