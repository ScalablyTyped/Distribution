package typings.typescriptServices.global.TypeScript.Services

import typings.typescriptServices.FormattingOptions
import typings.typescriptServices.TypeScript.ILogger
import typings.typescriptServices.TypeScript.ISimpleText
import typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind
import typings.typescriptServices.TypeScript.Services.Formatting.ITextSnapshot
import typings.typescriptServices.TypeScript.Services.Formatting.RuleAction
import typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.ITokenAccess
import typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange
import typings.typescriptServices.TypeScript.SourceUnitSyntax
import typings.typescriptServices.TypeScript.SyntaxKind
import typings.typescriptServices.TypeScript.SyntaxNode
import typings.typescriptServices.TypeScript.SyntaxTree
import typings.typescriptServices.TypeScript.TextSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Formatting {
  
  @JSGlobal("TypeScript.Services.Formatting.Formatter")
  @js.native
  class Formatter protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Formatter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      indentFirstToken: Boolean,
      options: FormattingOptions,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ) = this()
  }
  object Formatter {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Formatter.getEdits")
    @js.native
    def getEdits(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      options: FormattingOptions,
      indentFirstToken: Boolean,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      formattingRequestKind: FormattingRequestKind
    ): js.Array[typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo] = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingContext")
  @js.native
  class FormattingContext protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext {
    def this(snapshot: ITextSnapshot, formattingRequestKind: FormattingRequestKind) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingManager")
  @js.native
  class FormattingManager protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.FormattingManager {
    def this(
      syntaxTree: SyntaxTree,
      snapshot: ITextSnapshot,
      rulesProvider: typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider,
      editorOptions: typings.typescriptServices.TypeScript.Services.EditorOptions
    ) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.FormattingRequestKind")
  @js.native
  object FormattingRequestKind extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind with Double
      ] = js.native
    
    /* 0 */ val FormatDocument: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatDocument with Double = js.native
    
    /* 4 */ val FormatOnClosingCurlyBrace: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnClosingCurlyBrace with Double = js.native
    
    /* 2 */ val FormatOnEnter: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnEnter with Double = js.native
    
    /* 5 */ val FormatOnPaste: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnPaste with Double = js.native
    
    /* 3 */ val FormatOnSemicolon: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatOnSemicolon with Double = js.native
    
    /* 1 */ val FormatSelection: typings.typescriptServices.TypeScript.Services.Formatting.FormattingRequestKind.FormatSelection with Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContext")
  @js.native
  class IndentationNodeContext protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext {
    def this(
      parent: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext,
      node: SyntaxNode,
      fullStart: Double,
      indentationAmount: Double,
      childIndentationAmountDelta: Double
    ) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationNodeContextPool")
  @js.native
  class IndentationNodeContextPool ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContextPool
  
  @JSGlobal("TypeScript.Services.Formatting.IndentationTrackingWalker")
  @js.native
  class IndentationTrackingWalker protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.IndentationTrackingWalker {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.MultipleTokenIndenter")
  @js.native
  class MultipleTokenIndenter protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.MultipleTokenIndenter {
    def this(
      textSpan: TextSpan,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rule")
  @js.native
  class Rule protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Rule {
    def this(
      Descriptor: typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation
    ) = this()
    def this(
      Descriptor: typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor,
      Operation: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation,
      Flag: RuleFlags
    ) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleAction")
  @js.native
  object RuleAction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptServices.TypeScript.Services.Formatting.RuleAction with Double] = js.native
    
    /* 3 */ val Delete: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Delete with Double = js.native
    
    /* 0 */ val Ignore: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Ignore with Double = js.native
    
    /* 2 */ val NewLine: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.NewLine with Double = js.native
    
    /* 1 */ val Space: typings.typescriptServices.TypeScript.Services.Formatting.RuleAction.Space with Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor")
  @js.native
  class RuleDescriptor protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor {
    def this(LeftTokenRange: TokenRange, RightTokenRange: TokenRange) = this()
  }
  object RuleDescriptor {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor.create1")
    @js.native
    def create1(left: SyntaxKind, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor.create2")
    @js.native
    def create2(left: TokenRange, right: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor.create3")
    @js.native
    def create3(left: SyntaxKind, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleDescriptor.create4")
    @js.native
    def create4(left: TokenRange, right: TokenRange): typings.typescriptServices.TypeScript.Services.Formatting.RuleDescriptor = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleFlags")
  @js.native
  object RuleFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags with Double] = js.native
    
    /* 1 */ val CanDeleteNewLines: typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags.CanDeleteNewLines with Double = js.native
    
    /* 0 */ val None: typings.typescriptServices.TypeScript.Services.Formatting.RuleFlags.None with Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperation")
  @js.native
  class RuleOperation ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation
  object RuleOperation {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleOperation.create1")
    @js.native
    def create1(action: RuleAction): typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleOperation.create2")
    @js.native
    def create2(
      context: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext,
      action: RuleAction
    ): typings.typescriptServices.TypeScript.Services.Formatting.RuleOperation = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
  @js.native
  class RuleOperationContext protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext {
    def this(funcs: (js.Function1[
            /* context */ typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext, 
            Boolean
          ])*) = this()
  }
  object RuleOperationContext {
    
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RuleOperationContext.Any")
    @js.native
    def Any: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext = js.native
    @scala.inline
    def Any_=(x: typings.typescriptServices.TypeScript.Services.Formatting.RuleOperationContext): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("TypeScript.Services.Formatting.Rules")
  @js.native
  class Rules ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.Rules
  object Rules {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsAfterCodeBlockContext")
    @js.native
    def IsAfterCodeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsBeforeBlockContext")
    @js.native
    def IsBeforeBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsBeforeMultilineBlockContext")
    @js.native
    def IsBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsBinaryOpContext")
    @js.native
    def IsBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsBlockContext")
    @js.native
    def IsBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsControlDeclContext")
    @js.native
    def IsControlDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsForContext")
    @js.native
    def IsForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsFunctionCallContext")
    @js.native
    def IsFunctionCallContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsFunctionCallOrNewContext")
    @js.native
    def IsFunctionCallOrNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsFunctionDeclContext")
    @js.native
    def IsFunctionDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsModuleDeclContext")
    @js.native
    def IsModuleDeclContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsMultilineBlockContext")
    @js.native
    def IsMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsNewContext")
    @js.native
    def IsNewContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsNotBinaryOpContext")
    @js.native
    def IsNotBinaryOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsNotForContext")
    @js.native
    def IsNotForContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsNotFormatOnEnter")
    @js.native
    def IsNotFormatOnEnter(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsObjectContext")
    @js.native
    def IsObjectContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsObjectTypeContext")
    @js.native
    def IsObjectTypeContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsSameLineTokenContext")
    @js.native
    def IsSameLineTokenContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsSameLineTokenOrBeforeMultilineBlockContext")
    @js.native
    def IsSameLineTokenOrBeforeMultilineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsSingleLineBlockContext")
    @js.native
    def IsSingleLineBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsTypeArgumentOrParameter")
    @js.native
    def IsTypeArgumentOrParameter(tokenKind: SyntaxKind, parentKind: SyntaxKind): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsTypeArgumentOrParameterContext")
    @js.native
    def IsTypeArgumentOrParameterContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsTypeScriptDeclWithBlockContext")
    @js.native
    def IsTypeScriptDeclWithBlockContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.IsVoidOpContext")
    @js.native
    def IsVoidOpContext(context: typings.typescriptServices.TypeScript.Services.Formatting.FormattingContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.NodeIsBlockContext")
    @js.native
    def NodeIsBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.Rules.NodeIsTypeScriptDeclWithBlockContext")
    @js.native
    def NodeIsTypeScriptDeclWithBlockContext(node: typings.typescriptServices.TypeScript.Services.Formatting.IndentationNodeContext): Boolean = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucket")
  @js.native
  class RulesBucket ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RulesBucket
  
  @JSGlobal("TypeScript.Services.Formatting.RulesBucketConstructionState")
  @js.native
  class RulesBucketConstructionState ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RulesBucketConstructionState
  
  @JSGlobal("TypeScript.Services.Formatting.RulesMap")
  @js.native
  class RulesMap ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RulesMap
  object RulesMap {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.RulesMap.create")
    @js.native
    def create(rules: js.Array[typings.typescriptServices.TypeScript.Services.Formatting.Rule]): typings.typescriptServices.TypeScript.Services.Formatting.RulesMap = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesPosition")
  @js.native
  object RulesPosition extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition with Double
      ] = js.native
    
    /* 2 */ val ContextRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesAny with Double = js.native
    
    /* 1 */ val ContextRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.ContextRulesSpecific with Double = js.native
    
    /* 0 */ val IgnoreRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesAny with Double = js.native
    
    /* 0 */ val IgnoreRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.IgnoreRulesSpecific with Double = js.native
    
    /* 4 */ val NoContextRulesAny: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesAny with Double = js.native
    
    /* 3 */ val NoContextRulesSpecific: typings.typescriptServices.TypeScript.Services.Formatting.RulesPosition.NoContextRulesSpecific with Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.RulesProvider")
  @js.native
  class RulesProvider protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.RulesProvider {
    def this(logger: ILogger) = this()
  }
  
  object Shared {
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenAllAccess")
    @js.native
    class TokenAllAccess ()
      extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenAllAccess
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
    @js.native
    class TokenRange protected ()
      extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange {
      def this(tokenAccess: ITokenAccess) = this()
    }
    object TokenRange {
      
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.AllTokens")
      @js.native
      def AllTokens(): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Any")
      @js.native
      def Any: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.AnyIncludingMultilineComments")
      @js.native
      def AnyIncludingMultilineComments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def AnyIncludingMultilineComments_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AnyIncludingMultilineComments")(x.asInstanceOf[js.Any])
      
      @scala.inline
      def Any_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryKeywordOperators")
      @js.native
      def BinaryKeywordOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def BinaryKeywordOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryKeywordOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.BinaryOperators")
      @js.native
      def BinaryOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def BinaryOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BinaryOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Comments")
      @js.native
      def Comments: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Comments_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Comments")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.FromRange")
      @js.native
      def FromRange(f: SyntaxKind, to: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.FromRange")
      @js.native
      def FromRange(f: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.FromToken")
      @js.native
      def FromToken(token: SyntaxKind): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.FromTokens")
      @js.native
      def FromTokens(tokens: js.Array[SyntaxKind]): typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Keywords")
      @js.native
      def Keywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Keywords_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Keywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.Operators")
      @js.native
      def Operators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def Operators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.ReservedKeywords")
      @js.native
      def ReservedKeywords: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def ReservedKeywords_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ReservedKeywords")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.TypeNames")
      @js.native
      def TypeNames: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def TypeNames_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TypeNames")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostdecrementExpressions")
      @js.native
      def UnaryPostdecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPostdecrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostdecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPostincrementExpressions")
      @js.native
      def UnaryPostincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPostincrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPostincrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPredecrementExpressions")
      @js.native
      def UnaryPredecrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPredecrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPredecrementExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixExpressions")
      @js.native
      def UnaryPrefixExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPrefixExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixExpressions")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPrefixOperators")
      @js.native
      def UnaryPrefixOperators: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPrefixOperators_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPrefixOperators")(x.asInstanceOf[js.Any])
      
      /* static member */
      @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRange.UnaryPreincrementExpressions")
      @js.native
      def UnaryPreincrementExpressions: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange = js.native
      @scala.inline
      def UnaryPreincrementExpressions_=(x: typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UnaryPreincrementExpressions")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenRangeAccess")
    @js.native
    class TokenRangeAccess protected ()
      extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenRangeAccess {
      def this(from: SyntaxKind, to: SyntaxKind, except: js.Array[SyntaxKind]) = this()
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenSingleValueAccess")
    @js.native
    class TokenSingleValueAccess protected ()
      extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenSingleValueAccess {
      def this(token: SyntaxKind) = this()
    }
    
    @JSGlobal("TypeScript.Services.Formatting.Shared.TokenValuesAccess")
    @js.native
    class TokenValuesAccess protected ()
      extends typings.typescriptServices.TypeScript.Services.Formatting.Shared.TokenValuesAccess {
      def this(tks: js.Array[SyntaxKind]) = this()
    }
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter")
  @js.native
  class SingleTokenIndenter protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.SingleTokenIndenter {
    def this(
      indentationPosition: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      indentFirstToken: Boolean,
      options: FormattingOptions
    ) = this()
  }
  object SingleTokenIndenter {
    
    /* static member */
    @JSGlobal("TypeScript.Services.Formatting.SingleTokenIndenter.getIndentationAmount")
    @js.native
    def getIndentationAmount(
      position: Double,
      sourceUnit: SourceUnitSyntax,
      snapshot: ITextSnapshot,
      options: FormattingOptions
    ): Double = js.native
  }
  
  @JSGlobal("TypeScript.Services.Formatting.SnapshotPoint")
  @js.native
  class SnapshotPoint protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.SnapshotPoint {
    def this(snapshot: ITextSnapshot, position: Double) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextEditInfo")
  @js.native
  class TextEditInfo protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.TextEditInfo {
    def this(position: Double, length: Double, replaceWith: String) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshot")
  @js.native
  class TextSnapshot protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshot {
    def this(snapshot: ISimpleText) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TextSnapshotLine")
  @js.native
  class TextSnapshotLine protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.TextSnapshotLine {
    def this(_snapshot: ITextSnapshot, _lineNumber: Double, _start: Double, _end: Double, _lineBreak: String) = this()
  }
  
  @JSGlobal("TypeScript.Services.Formatting.TokenSpan")
  @js.native
  class TokenSpan protected ()
    extends typings.typescriptServices.TypeScript.Services.Formatting.TokenSpan {
    def this(kind: SyntaxKind, start: Double, length: Double) = this()
  }
}
