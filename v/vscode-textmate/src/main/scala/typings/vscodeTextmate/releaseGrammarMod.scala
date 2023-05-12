package typings.vscodeTextmate

import typings.vscodeTextmate.mod.IEmbeddedLanguagesMap
import typings.vscodeTextmate.mod.ITokenTypeMap
import typings.vscodeTextmate.releaseEncodedTokenAttributesMod.EncodedTokenAttributes
import typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStackFrame
import typings.vscodeTextmate.releaseGrammarGrammarMod.IGrammarRepository
import typings.vscodeTextmate.releaseGrammarGrammarMod.IThemeProvider
import typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackFrame
import typings.vscodeTextmate.releaseGrammarGrammarMod.TokenTypeMatcher
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseRuleMod.RuleId
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseGrammarMod {
  
  @JSImport("vscode-textmate/release/grammar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/grammar", "AttributedScopeStack")
  @js.native
  /**
    * Invariant:
    * ```
    * if (parent && !scopePath.extends(parent.scopePath)) {
    * 	throw new Error();
    * }
    * ```
    */
  /* private */ open class AttributedScopeStack ()
    extends typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
  /* static members */
  object AttributedScopeStack {
    
    @JSImport("vscode-textmate/release/grammar", "AttributedScopeStack")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/grammar", "AttributedScopeStack._pushAttributed")
    @js.native
    def _pushAttributed: Any = js.native
    inline def _pushAttributed_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_pushAttributed")(x.asInstanceOf[js.Any])
    
    inline def createRoot(scopeName: ScopeName, tokenAttributes: EncodedTokenAttributes): typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack = (^.asInstanceOf[js.Dynamic].applyDynamic("createRoot")(scopeName.asInstanceOf[js.Any], tokenAttributes.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack]
    
    inline def createRootAndLookUpScopeName(
      scopeName: ScopeName,
      tokenAttributes: EncodedTokenAttributes,
      grammar: typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar
    ): typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack = (^.asInstanceOf[js.Dynamic].applyDynamic("createRootAndLookUpScopeName")(scopeName.asInstanceOf[js.Any], tokenAttributes.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack]
    
    inline def equals(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
    inline def equals(a: Null, b: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def equals(a: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def equals(
      a: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      b: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def fromExtension(namesScopeList: Null, contentNameScopesList: js.Array[AttributedScopeStackFrame]): typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtension")(namesScopeList.asInstanceOf[js.Any], contentNameScopesList.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack | Null]
    inline def fromExtension(
      namesScopeList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      contentNameScopesList: js.Array[AttributedScopeStackFrame]
    ): typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("fromExtension")(namesScopeList.asInstanceOf[js.Any], contentNameScopesList.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack | Null]
    
    @JSImport("vscode-textmate/release/grammar", "AttributedScopeStack.mergeAttributes")
    @js.native
    def mergeAttributes: Any = js.native
    inline def mergeAttributes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeAttributes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vscode-textmate/release/grammar", "BalancedBracketSelectors")
  @js.native
  open class BalancedBracketSelectors protected ()
    extends typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors {
    def this(balancedBracketScopes: js.Array[String], unbalancedBracketScopes: js.Array[String]) = this()
  }
  
  @JSImport("vscode-textmate/release/grammar", "Grammar")
  @js.native
  open class Grammar protected ()
    extends typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar {
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
      balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
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
      balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
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
      balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
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
      balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
      grammarRepository: IGrammarRepository & IThemeProvider,
      _onigLib: IOnigLib
    ) = this()
  }
  
  @JSImport("vscode-textmate/release/grammar", "LineTokens")
  @js.native
  open class LineTokens protected ()
    extends typings.vscodeTextmate.releaseGrammarGrammarMod.LineTokens {
    def this(emitBinaryTokens: Boolean, lineText: String, tokenTypeOverrides: js.Array[TokenTypeMatcher]) = this()
    def this(
      emitBinaryTokens: Boolean,
      lineText: String,
      tokenTypeOverrides: js.Array[TokenTypeMatcher],
      balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors
    ) = this()
  }
  
  @JSImport("vscode-textmate/release/grammar", "StateStackImpl")
  @js.native
  open class StateStackImpl protected ()
    extends typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl {
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
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
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
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
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
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
    def this(
      /**
      * The previous state on the stack (or null for the root state).
      */
    parent: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl,
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
    nameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack,
      /**
      * The list of scopes containing the "contentName" (besides "name") for this state.
      * This list **must** contain as an element `scopeName`.
      */
    contentNameScopesList: typings.vscodeTextmate.releaseGrammarGrammarMod.AttributedScopeStack
    ) = this()
  }
  /* static members */
  object StateStackImpl {
    
    @JSImport("vscode-textmate/release/grammar", "StateStackImpl")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/grammar", "StateStackImpl.NULL")
    @js.native
    def NULL: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl = js.native
    inline def NULL_=(x: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/grammar", "StateStackImpl._equals")
    @js.native
    def _equals: Any = js.native
    inline def _equals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_equals")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/grammar", "StateStackImpl._reset")
    @js.native
    def _reset: Any = js.native
    inline def _reset_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_reset")(x.asInstanceOf[js.Any])
    
    /**
      * A structural equals check. Does not take into account `scopes`.
      */
    @JSImport("vscode-textmate/release/grammar", "StateStackImpl._structuralEquals")
    @js.native
    def _structuralEquals: Any = js.native
    inline def _structuralEquals_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_structuralEquals")(x.asInstanceOf[js.Any])
    
    inline def pushFrame(self: Null, frame: StateStackFrame): typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFrame")(self.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl]
    inline def pushFrame(self: typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl, frame: StateStackFrame): typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl = (^.asInstanceOf[js.Dynamic].applyDynamic("pushFrame")(self.asInstanceOf[js.Any], frame.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.StateStackImpl]
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
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: Null,
    balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: Null,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: Null,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: Null,
    balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: Null,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
  inline def createGrammar(
    scopeName: ScopeName,
    grammar: IRawGrammar,
    initialLanguage: Double,
    embeddedLanguages: IEmbeddedLanguagesMap,
    tokenTypes: ITokenTypeMap,
    balancedBracketSelectors: typings.vscodeTextmate.releaseGrammarGrammarMod.BalancedBracketSelectors,
    grammarRepository: IGrammarRepository & IThemeProvider,
    onigLib: IOnigLib
  ): typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar = (^.asInstanceOf[js.Dynamic].applyDynamic("createGrammar")(scopeName.asInstanceOf[js.Any], grammar.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any], embeddedLanguages.asInstanceOf[js.Any], tokenTypes.asInstanceOf[js.Any], balancedBracketSelectors.asInstanceOf[js.Any], grammarRepository.asInstanceOf[js.Any], onigLib.asInstanceOf[js.Any])).asInstanceOf[typings.vscodeTextmate.releaseGrammarGrammarMod.Grammar]
}
