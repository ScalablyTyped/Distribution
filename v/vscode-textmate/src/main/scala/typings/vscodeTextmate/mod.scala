package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.anon.Background
import typings.vscodeTextmate.typesMod.IOnigLib
import typings.vscodeTextmate.typesMod.IRawGrammar
import typings.vscodeTextmate.vscodeTextmateDoubles.`4278190080`
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1024`
import typings.vscodeTextmate.vscodeTextmateInts.`10`
import typings.vscodeTextmate.vscodeTextmateInts.`11`
import typings.vscodeTextmate.vscodeTextmateInts.`15`
import typings.vscodeTextmate.vscodeTextmateInts.`16744448`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import typings.vscodeTextmate.vscodeTextmateInts.`24`
import typings.vscodeTextmate.vscodeTextmateInts.`255`
import typings.vscodeTextmate.vscodeTextmateInts.`2`
import typings.vscodeTextmate.vscodeTextmateInts.`30720`
import typings.vscodeTextmate.vscodeTextmateInts.`3`
import typings.vscodeTextmate.vscodeTextmateInts.`768`
import typings.vscodeTextmate.vscodeTextmateInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vscode-textmate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate", "INITIAL")
  @js.native
  val INITIAL: StackElement = js.native
  
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
    def loadGrammar(initialScopeName: String): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Load the grammar for `scopeName` and all referenced included grammars asynchronously.
      * Please do not use language id 0.
      */
    def loadGrammarWithConfiguration(initialScopeName: String, initialLanguage: Double, configuration: IGrammarConfiguration): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Load the grammar for `scopeName` and all referenced included grammars asynchronously.
      * Please do not use language id 0.
      */
    def loadGrammarWithEmbeddedLanguages(initialScopeName: String, initialLanguage: Double, embeddedLanguages: IEmbeddedLanguagesMap): js.Promise[IGrammar | Null] = js.native
    
    /**
      * Change the theme. Once called, no previous `ruleStack` should be used anymore.
      */
    def setTheme(theme: IRawTheme): Unit = js.native
    def setTheme(theme: IRawTheme, colorMap: js.Array[String]): Unit = js.native
  }
  
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
    def tokenizeLine(lineText: String, prevState: StackElement): ITokenizeLineResult = js.native
    def tokenizeLine(lineText: String, prevState: StackElement, timeLimit: Double): ITokenizeLineResult = js.native
    
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
    def tokenizeLine2(lineText: String, prevState: StackElement): ITokenizeLineResult2 = js.native
    def tokenizeLine2(lineText: String, prevState: StackElement, timeLimit: Double): ITokenizeLineResult2 = js.native
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
    
    extension [Self <: IGrammarConfiguration](x: Self) {
      
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
  
  trait IRawTheme extends StObject {
    
    val name: js.UndefOr[String] = js.undefined
    
    val settings: js.Array[IRawThemeSetting]
  }
  object IRawTheme {
    
    inline def apply(settings: js.Array[IRawThemeSetting]): IRawTheme = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawTheme]
    }
    
    extension [Self <: IRawTheme](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSettings(value: js.Array[IRawThemeSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsVarargs(value: IRawThemeSetting*): Self = StObject.set(x, "settings", js.Array(value*))
    }
  }
  
  trait IRawThemeSetting extends StObject {
    
    val name: js.UndefOr[String] = js.undefined
    
    val scope: js.UndefOr[String | js.Array[String]] = js.undefined
    
    val settings: Background
  }
  object IRawThemeSetting {
    
    inline def apply(settings: Background): IRawThemeSetting = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawThemeSetting]
    }
    
    extension [Self <: IRawThemeSetting](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScope(value: String | js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSettings(value: Background): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
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
    
    extension [Self <: IToken](x: Self) {
      
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
    val ruleStack: StackElement
    
    /**
      * Did tokenization stop early due to reaching the time limit.
      */
    val stoppedEarly: Boolean
    
    val tokens: js.Array[IToken]
  }
  object ITokenizeLineResult {
    
    inline def apply(ruleStack: StackElement, stoppedEarly: Boolean, tokens: js.Array[IToken]): ITokenizeLineResult = {
      val __obj = js.Dynamic.literal(ruleStack = ruleStack.asInstanceOf[js.Any], stoppedEarly = stoppedEarly.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenizeLineResult]
    }
    
    extension [Self <: ITokenizeLineResult](x: Self) {
      
      inline def setRuleStack(value: StackElement): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setStoppedEarly(value: Boolean): Self = StObject.set(x, "stoppedEarly", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.Array[IToken]): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
      
      inline def setTokensVarargs(value: IToken*): Self = StObject.set(x, "tokens", js.Array(value*))
    }
  }
  
  trait ITokenizeLineResult2 extends StObject {
    
    /**
      * The `prevState` to be passed on to the next line tokenization.
      */
    val ruleStack: StackElement
    
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
    
    inline def apply(ruleStack: StackElement, stoppedEarly: Boolean, tokens: js.typedarray.Uint32Array): ITokenizeLineResult2 = {
      val __obj = js.Dynamic.literal(ruleStack = ruleStack.asInstanceOf[js.Any], stoppedEarly = stoppedEarly.asInstanceOf[js.Any], tokens = tokens.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITokenizeLineResult2]
    }
    
    extension [Self <: ITokenizeLineResult2](x: Self) {
      
      inline def setRuleStack(value: StackElement): Self = StObject.set(x, "ruleStack", value.asInstanceOf[js.Any])
      
      inline def setStoppedEarly(value: Boolean): Self = StObject.set(x, "stoppedEarly", value.asInstanceOf[js.Any])
      
      inline def setTokens(value: js.typedarray.Uint32Array): Self = StObject.set(x, "tokens", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`255`
    - typings.vscodeTextmate.vscodeTextmateInts.`768`
    - typings.vscodeTextmate.vscodeTextmateInts.`1024`
    - typings.vscodeTextmate.vscodeTextmateInts.`30720`
    - typings.vscodeTextmate.vscodeTextmateInts.`16744448`
    - typings.vscodeTextmate.vscodeTextmateDoubles.`4278190080`
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`8`
    - typings.vscodeTextmate.vscodeTextmateInts.`10`
    - typings.vscodeTextmate.vscodeTextmateInts.`11`
    - typings.vscodeTextmate.vscodeTextmateInts.`15`
    - typings.vscodeTextmate.vscodeTextmateInts.`24`
  */
  trait MetadataConsts extends StObject
  object MetadataConsts {
    
    inline def BACKGROUND_MASK: `4278190080` = 4278190080d.asInstanceOf[`4278190080`]
    
    inline def BACKGROUND_OFFSET: `24` = 24.asInstanceOf[`24`]
    
    inline def BALANCED_BRACKETS_MASK: `1024` = 1024.asInstanceOf[`1024`]
    
    inline def BALANCED_BRACKETS_OFFSET: `10` = 10.asInstanceOf[`10`]
    
    inline def FONT_STYLE_MASK: `30720` = 30720.asInstanceOf[`30720`]
    
    inline def FONT_STYLE_OFFSET: `11` = 11.asInstanceOf[`11`]
    
    inline def FOREGROUND_MASK: `16744448` = 16744448.asInstanceOf[`16744448`]
    
    inline def FOREGROUND_OFFSET: `15` = 15.asInstanceOf[`15`]
    
    inline def LANGUAGEID_MASK: `255` = 255.asInstanceOf[`255`]
    
    inline def LANGUAGEID_OFFSET: `0` = 0.asInstanceOf[`0`]
    
    inline def TOKEN_TYPE_MASK: `768` = 768.asInstanceOf[`768`]
    
    inline def TOKEN_TYPE_OFFSET: `8` = 8.asInstanceOf[`8`]
  }
  
  trait RegistryOptions extends StObject {
    
    var colorMap: js.UndefOr[js.Array[String]] = js.undefined
    
    var getInjections: js.UndefOr[js.Function1[/* scopeName */ String, js.UndefOr[js.Array[String]]]] = js.undefined
    
    def loadGrammar(scopeName: String): js.Promise[js.UndefOr[IRawGrammar | Null]]
    
    var onigLib: js.Promise[IOnigLib]
    
    var theme: js.UndefOr[IRawTheme] = js.undefined
  }
  object RegistryOptions {
    
    inline def apply(loadGrammar: String => js.Promise[js.UndefOr[IRawGrammar | Null]], onigLib: js.Promise[IOnigLib]): RegistryOptions = {
      val __obj = js.Dynamic.literal(loadGrammar = js.Any.fromFunction1(loadGrammar), onigLib = onigLib.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegistryOptions]
    }
    
    extension [Self <: RegistryOptions](x: Self) {
      
      inline def setColorMap(value: js.Array[String]): Self = StObject.set(x, "colorMap", value.asInstanceOf[js.Any])
      
      inline def setColorMapUndefined: Self = StObject.set(x, "colorMap", js.undefined)
      
      inline def setColorMapVarargs(value: String*): Self = StObject.set(x, "colorMap", js.Array(value*))
      
      inline def setGetInjections(value: /* scopeName */ String => js.UndefOr[js.Array[String]]): Self = StObject.set(x, "getInjections", js.Any.fromFunction1(value))
      
      inline def setGetInjectionsUndefined: Self = StObject.set(x, "getInjections", js.undefined)
      
      inline def setLoadGrammar(value: String => js.Promise[js.UndefOr[IRawGrammar | Null]]): Self = StObject.set(x, "loadGrammar", js.Any.fromFunction1(value))
      
      inline def setOnigLib(value: js.Promise[IOnigLib]): Self = StObject.set(x, "onigLib", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: IRawTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait StackElement extends StObject {
    
    var _stackElementBrand: Unit
    
    val depth: Double
    
    def equals(other: StackElement): Boolean
  }
  object StackElement {
    
    inline def apply(_stackElementBrand: Unit, depth: Double, equals_ : StackElement => Boolean): StackElement = {
      val __obj = js.Dynamic.literal(_stackElementBrand = _stackElementBrand.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[StackElement]
    }
    
    extension [Self <: StackElement](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setEquals_(value: StackElement => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def set_stackElementBrand(value: Unit): Self = StObject.set(x, "_stackElementBrand", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`3`
  */
  trait StandardTokenType extends StObject
  object StandardTokenType {
    
    inline def Comment: `1` = 1.asInstanceOf[`1`]
    
    inline def Other: `0` = 0.asInstanceOf[`0`]
    
    inline def RegEx: `3` = 3.asInstanceOf[`3`]
    
    inline def String: `2` = 2.asInstanceOf[`2`]
  }
}
