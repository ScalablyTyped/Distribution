package typings.vscodeTextmate

import typings.vscodeTextmate.mod.IEmbeddedLanguagesMap
import typings.vscodeTextmate.mod.IGrammar
import typings.vscodeTextmate.mod.IToken
import typings.vscodeTextmate.mod.ITokenTypeMap
import typings.vscodeTextmate.mod.ITokenizeLineResult
import typings.vscodeTextmate.mod.ITokenizeLineResult2
import typings.vscodeTextmate.mod.StateStack
import typings.vscodeTextmate.releaseEncodedTokenAttributesMod.EncodedTokenAttributes
import typings.vscodeTextmate.releaseEncodedTokenAttributesMod.StandardTokenType
import typings.vscodeTextmate.releaseGrammarBasicScopesAttributeProviderMod.BasicScopeAttributes
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseOnigLibMod.OnigScanner
import typings.vscodeTextmate.releaseOnigLibMod.OnigString
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseRawGrammarMod.IRawRepository
import typings.vscodeTextmate.releaseRuleMod.IRuleFactoryHelper
import typings.vscodeTextmate.releaseRuleMod.IRuleRegistry
import typings.vscodeTextmate.releaseRuleMod.Rule
import typings.vscodeTextmate.releaseRuleMod.RuleId
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import typings.vscodeTextmate.releaseThemeMod.ScopePath
import typings.vscodeTextmate.releaseThemeMod.ScopeStack
import typings.vscodeTextmate.releaseThemeMod.StyleAttributes
import typings.vscodeTextmate.vscodeTextmateInts.`-1`
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseGrammarGrammarMod {
  
  @JSImport("vscode-textmate/release/grammar/grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/grammar/grammar", "AttributedScopeStack")
  @js.native
  /**
    * Invariant:
    * ```
    * if (parent && !scopePath.extends(parent.scopePath)) {
    * 	throw new Error();
    * }
    * ```
    */
  /* private */ open class AttributedScopeStack () extends StObject {
    
    def equals(other: AttributedScopeStack): Boolean = js.native
    
    def getExtensionIfDefined(): js.UndefOr[js.Array[AttributedScopeStackFrame]] = js.native
    def getExtensionIfDefined(base: AttributedScopeStack): js.UndefOr[js.Array[AttributedScopeStackFrame]] = js.native
    
    def getScopeNames(): js.Array[String] = js.native
    
    val parent: AttributedScopeStack | Null = js.native
    
    def pushAttributed(scopePath: Null, grammar: Grammar): AttributedScopeStack = js.native
    def pushAttributed(scopePath: ScopePath, grammar: Grammar): AttributedScopeStack = js.native
    
    def scopeName: ScopeName = js.native
    
    val scopePath: ScopeStack = js.native
    
    val tokenAttributes: EncodedTokenAttributes = js.native
  }
  /* static members */
  object AttributedScopeStack {
    
    @JSImport("vscode-textmate/release/grammar/grammar", "AttributedScopeStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/grammar/grammar", "AttributedScopeStack._pushAttributed")
    @js.native
    def _pushAttributed: Any = js.native
    inline def _pushAttributed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pushAttributed")(x.asInstanceOf[js.Any])
    
    inline def createRoot(scopeName: ScopeName, tokenAttributes: EncodedTokenAttributes): AttributedScopeStack = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(scopeName.asInstanceOf[js.Any], tokenAttributes.asInstanceOf[js.Any])).asInstanceOf[AttributedScopeStack]
    
    inline def createRootAndLookUpScopeName(scopeName: ScopeName, tokenAttributes: EncodedTokenAttributes, grammar: Grammar): AttributedScopeStack = (^.asInstanceOf[js.Dynamic].applyDynamic("createRootAndLookUpScopeName")(scopeName.asInstanceOf[js.Any], tokenAttributes.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[AttributedScopeStack]
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Null, b: AttributedScopeStack): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: AttributedScopeStack): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(a: AttributedScopeStack, b: AttributedScopeStack): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromExtension(namesScopeList: Null, contentNameScopesList: js.Array[AttributedScopeStackFrame]): AttributedScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtension")(namesScopeList.asInstanceOf[js.Any], contentNameScopesList.asInstanceOf[js.Any])).asInstanceOf[AttributedScopeStack | Null]
    inline def fromExtension(namesScopeList: AttributedScopeStack, contentNameScopesList: js.Array[AttributedScopeStackFrame]): AttributedScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtension")(namesScopeList.asInstanceOf[js.Any], contentNameScopesList.asInstanceOf[js.Any])).asInstanceOf[AttributedScopeStack | Null]
    
    @JSImport("vscode-textmate/release/grammar/grammar", "AttributedScopeStack.mergeAttributes")
    @js.native
    def mergeAttributes: Any = js.native
    inline def mergeAttributes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeAttributes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vscode-textmate/release/grammar/grammar", "BalancedBracketSelectors")
  @js.native
  open class BalancedBracketSelectors protected () extends StObject {
    def this(balancedBracketScopes: js.Array[String], unbalancedBracketScopes: js.Array[String]) = this()
    
    /* private */ var allowAny: Any = js.native
    
    /* private */ val balancedBracketScopes: Any = js.native
    
    def `match`(scopes: js.Array[String]): Boolean = js.native
    
    def matchesAlways: Boolean = js.native
    
    def matchesNever: Boolean = js.native
    
    /* private */ val unbalancedBracketScopes: Any = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammar", "Grammar")
  @js.native
  open class Grammar protected ()
    extends StObject
       with IGrammar
       with IRuleFactoryHelper
       with IOnigLib {
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: Null,
      balancedBracketSelectors: Null,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: Null,
      balancedBracketSelectors: BalancedBracketSelectors,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: Null,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: BalancedBracketSelectors,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: Null,
      balancedBracketSelectors: Null,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: Null,
      balancedBracketSelectors: BalancedBracketSelectors,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: Null,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    def this(
      _rootScopeName: ScopeName,
      grammar: IRawGrammar,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: BalancedBracketSelectors,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
    
    /* private */ val _basicScopeAttributesProvider: Any = js.native
    
    /* private */ var _collectInjections: Any = js.native
    
    /* private */ val _grammar: Any = js.native
    
    /* private */ val _grammarRepository: Any = js.native
    
    /* private */ val _includedGrammars: Any = js.native
    
    /* private */ var _injections: Any = js.native
    
    /* private */ var _lastRuleId: Any = js.native
    
    /* private */ val _onigLib: Any = js.native
    
    /* private */ var _rootId: Any = js.native
    
    /* private */ val _rootScopeName: Any = js.native
    
    /* private */ val _ruleId2desc: Any = js.native
    
    /* private */ val _tokenTypeMatchers: Any = js.native
    
    /* private */ var _tokenize: Any = js.native
    
    /* private */ val balancedBracketSelectors: Any = js.native
    
    /* CompleteClass */
    override def createOnigScanner(sources: js.Array[String]): OnigScanner = js.native
    
    /* CompleteClass */
    override def createOnigString(str: String): OnigString = js.native
    
    def dispose(): Unit = js.native
    
    def getExternalGrammar(scopeName: String): js.UndefOr[IRawGrammar] = js.native
    /* CompleteClass */
    override def getExternalGrammar(scopeName: String, repository: IRawRepository): js.UndefOr[IRawGrammar | Null] = js.native
    
    def getInjections(): js.Array[Injection] = js.native
    
    def getMetadataForScope(scope: String): BasicScopeAttributes = js.native
    
    /* CompleteClass */
    override def getRule(ruleId: RuleId): Rule = js.native
    
    /* CompleteClass */
    override def registerRule[T /* <: Rule */](factory: js.Function1[/* id */ RuleId, T]): T = js.native
    
    def themeProvider: IThemeProvider = js.native
    
    def tokenizeLine(lineText: String, prevState: StateStackImpl): ITokenizeLineResult = js.native
    def tokenizeLine(lineText: String, prevState: StateStackImpl, timeLimit: Double): ITokenizeLineResult = js.native
    
    def tokenizeLine2(lineText: String, prevState: StateStackImpl): ITokenizeLineResult2 = js.native
    def tokenizeLine2(lineText: String, prevState: StateStackImpl, timeLimit: Double): ITokenizeLineResult2 = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammar", "LineTokens")
  @js.native
  open class LineTokens protected () extends StObject {
    def this(emitBinaryTokens: Boolean, lineText: String, tokenTypeOverrides: js.Array[TokenTypeMatcher]) = this()
    def this(
      emitBinaryTokens: Boolean,
      lineText: String,
      tokenTypeOverrides: js.Array[TokenTypeMatcher],
      balancedBracketSelectors: BalancedBracketSelectors
    ) = this()
    
    /**
      * used only if `_emitBinaryTokens` is true.
      */
    /* private */ val _binaryTokens: Any = js.native
    
    /* private */ val _emitBinaryTokens: Any = js.native
    
    /* private */ var _lastTokenEndIndex: Any = js.native
    
    /**
      * defined only if `DebugFlags.InDebugMode`.
      */
    /* private */ val _lineText: Any = js.native
    
    /* private */ val _tokenTypeOverrides: Any = js.native
    
    /**
      * used only if `_emitBinaryTokens` is false.
      */
    /* private */ val _tokens: Any = js.native
    
    /* private */ val balancedBracketSelectors: Any = js.native
    
    def getBinaryResult(stack: StateStackImpl, lineLength: Double): js.typedarray.Uint32Array = js.native
    
    def getResult(stack: StateStackImpl, lineLength: Double): js.Array[IToken] = js.native
    
    def produce(stack: StateStackImpl, endIndex: Double): Unit = js.native
    
    def produceFromScopes(scopesList: Null, endIndex: Double): Unit = js.native
    def produceFromScopes(scopesList: AttributedScopeStack, endIndex: Double): Unit = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl")
  @js.native
  open class StateStackImpl protected ()
    extends StObject
       with StateStack {
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean
    ) = this()
    /**
      * Invariant:
      * ```
      * if (contentNameScopesList !== nameScopesList && contentNameScopesList?.parent !== nameScopesList) {
      * 	throw new Error();
      * }
      * if (this.parent && !nameScopesList.extends(this.parent.contentNameScopesList)) {
      * 	throw new Error();
      * }
      * ```
      */
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: Null,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: Null,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: Null,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: Null,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: String,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: Null,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: StateStackImpl,
      /**
      * The state (rule) that this element represents.
      */
    ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    beginRuleCapturedEOL: Boolean,
      /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    endRule: Null,
      /**
      * The list of scopes containing the "name" for this state.
      */
    nameScopesList: AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: AttributedScopeStack
    ) = this()
    
    /**
      * The captured anchor position when this stack element was pushed.
      * This is relevant only while tokenizing a line, to restore the anchor position when popping.
      * Its value is meaningless across lines.
      */
    /* private */ var _anchorPos: Any = js.native
    
    /**
      * The position on the current line where this state was pushed.
      * This is relevant only while tokenizing a line, to detect endless loops.
      * Its value is meaningless across lines.
      */
    /* private */ var _enterPos: Any = js.native
    
    /* CompleteClass */
    var _stackElementBrand: Unit = js.native
    
    /* private */ var _writeString: Any = js.native
    
    /**
      * The state has entered and captured \n. This means that the next line should have an anchorPosition of 0.
      */
    val beginRuleCapturedEOL: Boolean = js.native
    
    /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    val contentNameScopesList: AttributedScopeStack | Null = js.native
    
    /* CompleteClass */
    override val depth: Double = js.native
    
    /**
      * The "pop" (end) condition for this state in case that it was dynamically generated through captured text.
      */
    val endRule: String | Null = js.native
    
    /* CompleteClass */
    override def equals(other: StateStack): Boolean = js.native
    def equals(other: StateStackImpl): Boolean = js.native
    
    def getAnchorPos(): Double = js.native
    
    def getEnterPos(): Double = js.native
    
    def getRule(grammar: IRuleRegistry): Rule = js.native
    
    def hasSameRuleAs(other: StateStackImpl): Boolean = js.native
    
    /**
      * The list of scopes containing the "name" for this state.
      */
    val nameScopesList: AttributedScopeStack | Null = js.native
    
    /**
      * The previous state on the stack (or null for the root state).
      */
    val parent: StateStackImpl | Null = js.native
    
    def pop(): StateStackImpl | Null = js.native
    
    def push(ruleId: RuleId, enterPos: Double, anchorPos: Double, beginRuleCapturedEOL: Boolean): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: String
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: String,
      nameScopesList: Null,
      contentNameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: String,
      nameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: String,
      nameScopesList: AttributedScopeStack,
      contentNameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: Null,
      nameScopesList: Null,
      contentNameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: Null,
      nameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    def push(
      ruleId: RuleId,
      enterPos: Double,
      anchorPos: Double,
      beginRuleCapturedEOL: Boolean,
      endRule: Null,
      nameScopesList: AttributedScopeStack,
      contentNameScopesList: AttributedScopeStack
    ): StateStackImpl = js.native
    
    def reset(): Unit = js.native
    
    /**
      * The state (rule) that this element represents.
      */
    /* private */ val ruleId: Any = js.native
    
    def safePop(): StateStackImpl = js.native
    
    def toStateStackFrame(): StateStackFrame = js.native
    
    def withContentNameScopesList(contentNameScopeStack: AttributedScopeStack): StateStackImpl = js.native
    
    def withEndRule(endRule: String): StateStackImpl = js.native
  }
  /* static members */
  object StateStackImpl {
    
    @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl.NULL")
    @js.native
    def NULL: StateStackImpl = js.native
    inline def NULL_=(x: StateStackImpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl._equals")
    @js.native
    def _equals: Any = js.native
    inline def _equals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_equals")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl._reset")
    @js.native
    def _reset: Any = js.native
    inline def _reset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_reset")(x.asInstanceOf[js.Any])
    
    /**
      * A structural equals check. Does not take into account `scopes`.
      */
    @JSImport("vscode-textmate/release/grammar/grammar", "StateStackImpl._structuralEquals")
    @js.native
    def _structuralEquals: Any = js.native
    inline def _structuralEquals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_structuralEquals")(x.asInstanceOf[js.Any])
    
    inline def pushFrame(self: Null, frame: StateStackFrame): StateStackImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFrame")(self.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl]
    inline def pushFrame(self: StateStackImpl, frame: StateStackFrame): StateStackImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFrame")(self.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl]
  }
  
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: Null,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: Null,
    balancedBracketSelectors: BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: Null,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: Null,
    balancedBracketSelectors: BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[Grammar]
  
  trait AttributedScopeStackFrame extends StObject {
    
    var encodedTokenAttributes: Double
    
    var scopeNames: js.Array[String]
  }
  object AttributedScopeStackFrame {
    
    inline def apply(encodedTokenAttributes: Double, scopeNames: js.Array[String]): AttributedScopeStackFrame = {
      val __obj = js.Dynamic.literal(encodedTokenAttributes = encodedTokenAttributes.asInstanceOf[js.Any], scopeNames = scopeNames.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributedScopeStackFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AttributedScopeStackFrame] (val x: Self) extends AnyVal {
      
      inline def setEncodedTokenAttributes(value: Double): Self = StObject.set(x, "encodedTokenAttributes", value.asInstanceOf[js.Any])
      
      inline def setScopeNames(value: js.Array[String]): Self = StObject.set(x, "scopeNames", value.asInstanceOf[js.Any])
      
      inline def setScopeNamesVarargs(value: String*): Self = StObject.set(x, "scopeNames", js.Array(value*))
    }
  }
  
  trait IGrammarRepository extends StObject {
    
    def injections(scopeName: ScopeName): js.Array[ScopeName]
    
    def lookup(scopeName: ScopeName): js.UndefOr[IRawGrammar]
  }
  object IGrammarRepository {
    
    inline def apply(injections: ScopeName => js.Array[ScopeName], lookup: ScopeName => js.UndefOr[IRawGrammar]): IGrammarRepository = {
      val __obj = js.Dynamic.literal(injections = js.Any.fromFunction1(injections), lookup = js.Any.fromFunction1(lookup))
      __obj.asInstanceOf[IGrammarRepository]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGrammarRepository] (val x: Self) extends AnyVal {
      
      inline def setInjections(value: ScopeName => js.Array[ScopeName]): Self = StObject.set(x, "injections", js.Any.fromFunction1(value))
      
      inline def setLookup(value: ScopeName => js.UndefOr[IRawGrammar]): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
    }
  }
  
  trait IThemeProvider extends StObject {
    
    def getDefaults(): StyleAttributes
    
    def themeMatch(scopePath: ScopeStack): StyleAttributes | Null
  }
  object IThemeProvider {
    
    inline def apply(getDefaults: () => StyleAttributes, themeMatch: ScopeStack => StyleAttributes | Null): IThemeProvider = {
      val __obj = js.Dynamic.literal(getDefaults = js.Any.fromFunction0(getDefaults), themeMatch = js.Any.fromFunction1(themeMatch))
      __obj.asInstanceOf[IThemeProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IThemeProvider] (val x: Self) extends AnyVal {
      
      inline def setGetDefaults(value: () => StyleAttributes): Self = StObject.set(x, "getDefaults", js.Any.fromFunction0(value))
      
      inline def setThemeMatch(value: ScopeStack => StyleAttributes | Null): Self = StObject.set(x, "themeMatch", js.Any.fromFunction1(value))
    }
  }
  
  trait Injection extends StObject {
    
    val debugSelector: String
    
    val grammar: IRawGrammar
    
    def matcher(matcherInput: js.Array[String]): Boolean
    
    val priority: `-1` | `0` | `1`
    
    val ruleId: RuleId
  }
  object Injection {
    
    inline def apply(
      debugSelector: String,
      grammar: IRawGrammar,
      matcher: js.Array[String] => Boolean,
      priority: `-1` | `0` | `1`,
      ruleId: RuleId
    ): Injection = {
      val __obj = js.Dynamic.literal(debugSelector = debugSelector.asInstanceOf[js.Any], grammar = grammar.asInstanceOf[js.Any], matcher = js.Any.fromFunction1(matcher), priority = priority.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
      __obj.asInstanceOf[Injection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Injection] (val x: Self) extends AnyVal {
      
      inline def setDebugSelector(value: String): Self = StObject.set(x, "debugSelector", value.asInstanceOf[js.Any])
      
      inline def setGrammar(value: IRawGrammar): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setMatcher(value: js.Array[String] => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setPriority(value: `-1` | `0` | `1`): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setRuleId(value: RuleId): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateStackFrame extends StObject {
    
    var anchorPos: js.UndefOr[Double] = js.undefined
    
    var beginRuleCapturedEOL: Boolean
    
    /**
      * on top of nameScopesList
      */
    var contentNameScopesList: js.Array[AttributedScopeStackFrame]
    
    var endRule: String | Null
    
    var enterPos: js.UndefOr[Double] = js.undefined
    
    var nameScopesList: js.Array[AttributedScopeStackFrame]
    
    var ruleId: Double
  }
  object StateStackFrame {
    
    inline def apply(
      beginRuleCapturedEOL: Boolean,
      contentNameScopesList: js.Array[AttributedScopeStackFrame],
      nameScopesList: js.Array[AttributedScopeStackFrame],
      ruleId: Double
    ): StateStackFrame = {
      val __obj = js.Dynamic.literal(beginRuleCapturedEOL = beginRuleCapturedEOL.asInstanceOf[js.Any], contentNameScopesList = contentNameScopesList.asInstanceOf[js.Any], nameScopesList = nameScopesList.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], endRule = null)
      __obj.asInstanceOf[StateStackFrame]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateStackFrame] (val x: Self) extends AnyVal {
      
      inline def setAnchorPos(value: Double): Self = StObject.set(x, "anchorPos", value.asInstanceOf[js.Any])
      
      inline def setAnchorPosUndefined: Self = StObject.set(x, "anchorPos", js.undefined)
      
      inline def setBeginRuleCapturedEOL(value: Boolean): Self = StObject.set(x, "beginRuleCapturedEOL", value.asInstanceOf[js.Any])
      
      inline def setContentNameScopesList(value: js.Array[AttributedScopeStackFrame]): Self = StObject.set(x, "contentNameScopesList", value.asInstanceOf[js.Any])
      
      inline def setContentNameScopesListVarargs(value: AttributedScopeStackFrame*): Self = StObject.set(x, "contentNameScopesList", js.Array(value*))
      
      inline def setEndRule(value: String): Self = StObject.set(x, "endRule", value.asInstanceOf[js.Any])
      
      inline def setEndRuleNull: Self = StObject.set(x, "endRule", null)
      
      inline def setEnterPos(value: Double): Self = StObject.set(x, "enterPos", value.asInstanceOf[js.Any])
      
      inline def setEnterPosUndefined: Self = StObject.set(x, "enterPos", js.undefined)
      
      inline def setNameScopesList(value: js.Array[AttributedScopeStackFrame]): Self = StObject.set(x, "nameScopesList", value.asInstanceOf[js.Any])
      
      inline def setNameScopesListVarargs(value: AttributedScopeStackFrame*): Self = StObject.set(x, "nameScopesList", js.Array(value*))
      
      inline def setRuleId(value: Double): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenTypeMatcher extends StObject {
    
    def matcher(matcherInput: js.Array[String]): Boolean
    
    val `type`: StandardTokenType
  }
  object TokenTypeMatcher {
    
    inline def apply(matcher: js.Array[String] => Boolean, `type`: StandardTokenType): TokenTypeMatcher = {
      val __obj = js.Dynamic.literal(matcher = js.Any.fromFunction1(matcher))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenTypeMatcher]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenTypeMatcher] (val x: Self) extends AnyVal {
      
      inline def setMatcher(value: js.Array[String] => Boolean): Self = StObject.set(x, "matcher", js.Any.fromFunction1(value))
      
      inline def setType(value: StandardTokenType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
