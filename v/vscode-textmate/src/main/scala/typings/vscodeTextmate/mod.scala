package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.releaseDiffStateStacksMod.StackDiff
import typings.vscodeTextmate.releaseEncodedTokenAttributesMod.StandardTokenType
import typings.vscodeTextmate.releaseGrammarMod.StateStackImpl
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseOnigLibMod.OnigString
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseThemeMod.IRawTheme
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-textmate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate", "INITIAL")
  @js.native
  val INITIAL: StateStack = js.native
  
  @JSImport("vscode-textmate", "Registry")
  @js.native
  open class Registry protected () extends StObject {
    def this(options: RegistryOptions) = this()
    
    /* private */ var _doLoadSingleGrammar: Any = js.native
    
    /* private */ val _ensureGrammarCache: Any = js.native
    
    /**
      * Get the grammar for `scopeName`. The grammar must first be created via `loadGrammar` or `addGrammar`.
      */
    /* private */ var _grammarForScopeName: Any = js.native
    
    /* private */ var _loadGrammar: Any = js.native
    
    /* private */ var _loadSingleGrammar: Any = js.native
    
    /* private */ val _options: Any = js.native
    
    /* private */ val _syncRegistry: Any = js.native
    
    /**
      * Adds a rawGrammar.
      */
    def addGrammar(rawGrammar: IRawGrammar): js.Promise[IGrammar] = js.native
    def addGrammar(rawGrammar: IRawGrammar, injections: js.Array[String]): js.Promise[IGrammar] = js.native
    def addGrammar(rawGrammar: IRawGrammar, injections: js.Array[String], initialLanguage: Double): js.Promise[IGrammar] = js.native
    def addGrammar(
      rawGrammar: IRawGrammar,
      injections: js.Array[String],
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap
    ): js.Promise[IGrammar] = js.native
    def addGrammar(
      rawGrammar: IRawGrammar,
      injections: js.Array[String],
      initialLanguage: Unit,
      embeddedLanguages: IEmbeddedLanguagesMap
    ): js.Promise[IGrammar] = js.native
    def addGrammar(rawGrammar: IRawGrammar, injections: Unit, initialLanguage: Double): js.Promise[IGrammar] = js.native
    def addGrammar(
      rawGrammar: IRawGrammar,
      injections: Unit,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap
    ): js.Promise[IGrammar] = js.native
    def addGrammar(
      rawGrammar: IRawGrammar,
      injections: Unit,
      initialLanguage: Unit,
      embeddedLanguages: IEmbeddedLanguagesMap
    ): js.Promise[IGrammar] = js.native
    
    def dispose(): Unit = js.native
    
    /**
      * Returns a lookup array for color ids.
      */
    def getColorMap(): js.Array[String] = js.native
    
    /**
      * Load the grammar for `scopeName` and all referenced included grammars asynchronously.
      */
    def loadGrammar(initialScopeName: ScopeName): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Load the grammar for `scopeName` and all referenced included grammars asynchronously.
      * Please do not use language id 0.
      */
    def loadGrammarWithConfiguration(initialScopeName: ScopeName, initialLanguage: Double, configuration: IGrammarConfiguration): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Load the grammar for `scopeName` and all referenced included grammars asynchronously.
      * Please do not use language id 0.
      */
    def loadGrammarWithEmbeddedLanguages(initialScopeName: ScopeName, initialLanguage: Double, embeddedLanguages: IEmbeddedLanguagesMap): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Change the theme. Once called, no previous `ruleStack` should be used anymore.
      */
    def setTheme(theme: IRawTheme): Unit = js.native
    def setTheme(theme: IRawTheme, colorMap: js.Array[String]): Unit = js.native
  }
  
  inline def applyStateStackDiff(stack: Null, diff: StackDiff): StateStackImpl | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStateStackDiff")(stack.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl | Null]
  inline def applyStateStackDiff(stack: StateStack, diff: StackDiff): StateStackImpl | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("applyStateStackDiff")(stack.asInstanceOf[js.Any], diff.asInstanceOf[js.Any])).asInstanceOf[StateStackImpl | Null]
  
  inline def diffStateStacksRefEq(first: StateStack, second: StateStack): StackDiff = (^.asInstanceOf[js.Dynamic].applyDynamic("diffStateStacksRefEq")(first.asInstanceOf[js.Any], second.asInstanceOf[js.Any])).asInstanceOf[StackDiff]
  
  inline def disposeOnigString(str: OnigString): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disposeOnigString")(str.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseRawGrammar(content: String): IRawGrammar = ^.asInstanceOf[js.Dynamic].applyDynamic("parseRawGrammar")(content.asInstanceOf[js.Any]).asInstanceOf[IRawGrammar]
  inline def parseRawGrammar(content: String, filePath: String): IRawGrammar = (^.asInstanceOf[js.Dynamic].applyDynamic("parseRawGrammar")(content.asInstanceOf[js.Any], filePath.asInstanceOf[js.Any])).asInstanceOf[IRawGrammar]
  
  type IEmbeddedLanguagesMap = StringDictionary[Double]
  
  @js.native
  trait IGrammar extends StObject {
    
    /**
      * Tokenize `lineText` using previous line state `prevState`.
      */
    def tokenizeLine(lineText: String): ITokenizeLineResult = js.native
    def tokenizeLine(lineText: String, prevState: Null, timeLimit: Double): ITokenizeLineResult = js.native
    def tokenizeLine(lineText: String, prevState: StateStack): ITokenizeLineResult = js.native
    def tokenizeLine(lineText: String, prevState: StateStack, timeLimit: Double): ITokenizeLineResult = js.native
    
    /**
      * Tokenize `lineText` using previous line state `prevState`.
      * The result contains the tokens in binary format, resolved with the following information:
      *  - language
      *  - token type (regex, string, comment, other)
      *  - font style
      *  - foreground color
      *  - background color
      * e.g. for getting the languageId: `(metadata & MetadataConsts.LANGUAGEID_MASK) >>> MetadataConsts.LANGUAGEID_OFFSET`
      */
    def tokenizeLine2(lineText: String): ITokenizeLineResult2 = js.native
    def tokenizeLine2(lineText: String, prevState: Null, timeLimit: Double): ITokenizeLineResult2 = js.native
    def tokenizeLine2(lineText: String, prevState: StateStack): ITokenizeLineResult2 = js.native
    def tokenizeLine2(lineText: String, prevState: StateStack, timeLimit: Double): ITokenizeLineResult2 = js.native
  }
  
  trait IGrammarConfiguration extends StObject {
    
    var balancedBracketSelectors: js.UndefOr[js.Array[String]] = js.undefined
    
    var embeddedLanguages: js.UndefOr[IEmbeddedLanguagesMap] = js.undefined
    
    var tokenTypes: js.UndefOr[ITokenTypeMap] = js.undefined
    
    var unbalancedBracketSelectors: js.UndefOr[js.Array[String]] = js.undefined
  }
  object IGrammarConfiguration {
    
    inline def apply(): IGrammarConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IGrammarConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGrammarConfiguration] (val x: Self) extends AnyVal {
      
      inline def setBalancedBracketSelectors(value: js.Array[String]): Self = StObject.set(x, "balancedBracketSelectors", value.asInstanceOf[js.Any])
      
      inline def setBalancedBracketSelectorsUndefined: Self = StObject.set(x, "balancedBracketSelectors", js.undefined)
      
      inline def setBalancedBracketSelectorsVarargs(value: String*): Self = StObject.set(x, "balancedBracketSelectors", js.Array(value*))
      
      inline def setEmbeddedLanguages(value: IEmbeddedLanguagesMap): Self = StObject.set(x, "embeddedLanguages", value.asInstanceOf[js.Any])
      
      inline def setEmbeddedLanguagesUndefined: Self = StObject.set(x, "embeddedLanguages", js.undefined)
      
      inline def setTokenTypes(value: ITokenTypeMap): Self = StObject.set(x, "tokenTypes", value.asInstanceOf[js.Any])
      
      inline def setTokenTypesUndefined: Self = StObject.set(x, "tokenTypes", js.undefined)
      
      inline def setUnbalancedBracketSelectors(value: js.Array[String]): Self = StObject.set(x, "unbalancedBracketSelectors", value.asInstanceOf[js.Any])
      
      inline def setUnbalancedBracketSelectorsUndefined: Self = StObject.set(x, "unbalancedBracketSelectors", js.undefined)
      
      inline def setUnbalancedBracketSelectorsVarargs(value: String*): Self = StObject.set(x, "unbalancedBracketSelectors", js.Array(value*))
    }
  }
  
  trait IToken extends StObject {
    
    val endIndex: Double
    
    val scopes: js.Array[String]
    
    var startIndex: Double
  }
  object IToken {
    
    inline def apply(endIndex: Double, scopes: js.Array[String], startIndex: Double): IToken = {
      val __obj = js.Dynamic.literal(endIndex = endIndex.asInstanceOf[js.Any], scopes = scopes.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[IToken]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IToken] (val x: Self) extends AnyVal {
      
      inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
      
      inline def setScopes(value: js.Array[String]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesVarargs(value: String*): Self = StObject.set(x, "scopes", js.Array(value*))
      
      inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type ITokenTypeMap = StringDictionary[StandardTokenType]
  
  trait ITokenizeLineResult extends StObject {
    
    /**
      * The `prevState` to be passed on to the next line tokenization.
      */
    val ruleStack: StateStack
    
    /**
      * Did tokenization stop early due to reaching the time limit.
      */
    val stoppedEarly: Boolean
    
    val tokens: js.Array[IToken]
  }
  object ITokenizeLineResult {
    
    inline def apply(ruleStack: StateStack, stoppedEarly: Boolean, tokens: js.Array[IToken]): ITokenizeLineResult = {
      val __obj = js.Dynamic.literal(ruleStack = ruleStack.asInstanceOf[js.Any], stoppedEarly = stoppedEarly.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenizeLineResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITokenizeLineResult] (val x: Self) extends AnyVal {
      
      inline def setRuleStack(value: StateStack): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setStoppedEarly(value: Boolean): Self = StObject.set(x, "stoppedEarly", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[IToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: IToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait ITokenizeLineResult2 extends StObject {
    
    /**
      * The `prevState` to be passed on to the next line tokenization.
      */
    val ruleStack: StateStack
    
    /**
      * Did tokenization stop early due to reaching the time limit.
      */
    val stoppedEarly: Boolean
    
    /**
      * The tokens in binary format. Each token occupies two array indices. For token i:
      *  - at offset 2*i => startIndex
      *  - at offset 2*i + 1 => metadata
      *
      */
    val tokens: js.typedarray.Uint32Array
  }
  object ITokenizeLineResult2 {
    
    inline def apply(ruleStack: StateStack, stoppedEarly: Boolean, tokens: js.typedarray.Uint32Array): ITokenizeLineResult2 = {
      val __obj = js.Dynamic.literal(ruleStack = ruleStack.asInstanceOf[js.Any], stoppedEarly = stoppedEarly.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenizeLineResult2]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ITokenizeLineResult2] (val x: Self) extends AnyVal {
      
      inline def setRuleStack(value: StateStack): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setStoppedEarly(value: Boolean): Self = StObject.set(x, "stoppedEarly", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.typedarray.Uint32Array): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegistryOptions extends StObject {
    
    var colorMap: js.UndefOr[js.Array[String]] = js.undefined
    
    var getInjections: js.UndefOr[js.Function1[/* scopeName */ ScopeName, js.UndefOr[js.Array[ScopeName]]]] = js.undefined
    
    def loadGrammar(scopeName: ScopeName): js.Promise[js.UndefOr[IRawGrammar | Null]]
    
    var onigLib: js.Promise[IOnigLib]
    
    var theme: js.UndefOr[IRawTheme] = js.undefined
  }
  object RegistryOptions {
    
    inline def apply(
      loadGrammar: ScopeName => js.Promise[js.UndefOr[IRawGrammar | Null]],
      onigLib: js.Promise[IOnigLib]
    ): RegistryOptions = {
      val __obj = js.Dynamic.literal(loadGrammar = js.Any.fromFunction1(loadGrammar), onigLib = onigLib.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegistryOptions] (val x: Self) extends AnyVal {
      
      inline def setColorMap(value: js.Array[String]): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setColorMapVarargs(value: String*): Self = StObject.set(x, "colorMap", js.Array(value*))
      
      inline def setGetInjections(value: /* scopeName */ ScopeName => js.UndefOr[js.Array[ScopeName]]): Self = StObject.set(x, "getInjections", js.Any.fromFunction1(value))
      
      inline def setGetInjectionsUndefined: Self = StObject.set(x, "getInjections", js.undefined)
      
      inline def setLoadGrammar(value: ScopeName => js.Promise[js.UndefOr[IRawGrammar | Null]]): Self = StObject.set(x, "loadGrammar", js.Any.fromFunction1(value))
      
      inline def setOnigLib(value: js.Promise[IOnigLib]): Self = StObject.set(x, "onigLib", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IRawTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait StateStack extends StObject {
    
    var _stackElementBrand: Unit
    
    val depth: Double
    
    def equals(other: StateStack): Boolean
  }
  object StateStack {
    
    inline def apply(_stackElementBrand: Unit, depth: Double, equals_ : StateStack => Boolean): StateStack = {
      val __obj = js.Dynamic.literal(_stackElementBrand = _stackElementBrand.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[StateStack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateStack] (val x: Self) extends AnyVal {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: StateStack => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def set_stackElementBrand(value: Unit): Self = StObject.set(x, "_stackElementBrand", value.asInstanceOf[js.Any])
    }
  }
}
