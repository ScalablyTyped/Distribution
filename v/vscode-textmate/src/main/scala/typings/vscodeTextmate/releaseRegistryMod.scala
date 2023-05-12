package typings.vscodeTextmate

import typings.vscodeTextmate.mod.IEmbeddedLanguagesMap
import typings.vscodeTextmate.mod.IGrammar
import typings.vscodeTextmate.mod.ITokenTypeMap
import typings.vscodeTextmate.releaseGrammarGrammarMod.IGrammarRepository
import typings.vscodeTextmate.releaseGrammarGrammarMod.IThemeProvider
import typings.vscodeTextmate.releaseGrammarMod.BalancedBracketSelectors
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import typings.vscodeTextmate.releaseThemeMod.ScopeStack
import typings.vscodeTextmate.releaseThemeMod.StyleAttributes
import typings.vscodeTextmate.releaseThemeMod.Theme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseRegistryMod {
  
  @JSImport("vscode-textmate/release/registry", "SyncRegistry")
  @js.native
  open class SyncRegistry protected ()
    extends StObject
       with IGrammarRepository
       with IThemeProvider {
    def this(theme: Theme, _onigLibPromise: js.Promise[IOnigLib]) = this()
    
    /* private */ val _grammars: Any = js.native
    
    /* private */ val _injectionGrammars: Any = js.native
    
    /* private */ val _onigLibPromise: Any = js.native
    
    /* private */ val _rawGrammars: Any = js.native
    
    /* private */ var _theme: Any = js.native
    
    /**
      * Add `grammar` to registry and return a list of referenced scope names
      */
    def addGrammar(grammar: IRawGrammar): Unit = js.native
    def addGrammar(grammar: IRawGrammar, injectionScopeNames: js.Array[ScopeName]): Unit = js.native
    
    def dispose(): Unit = js.native
    
    def getColorMap(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getDefaults(): StyleAttributes = js.native
    
    /**
      * Lookup a grammar.
      */
    def grammarForScopeName(scopeName: ScopeName, initialLanguage: Double): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(
      scopeName: ScopeName,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: Null,
      balancedBracketSelectors: BalancedBracketSelectors
    ): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(scopeName: ScopeName, initialLanguage: Double, embeddedLanguages: Null, tokenTypes: ITokenTypeMap): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(
      scopeName: ScopeName,
      initialLanguage: Double,
      embeddedLanguages: Null,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: BalancedBracketSelectors
    ): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(scopeName: ScopeName, initialLanguage: Double, embeddedLanguages: IEmbeddedLanguagesMap): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(
      scopeName: ScopeName,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: Null,
      balancedBracketSelectors: BalancedBracketSelectors
    ): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(
      scopeName: ScopeName,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: ITokenTypeMap
    ): js.Promise[IGrammar | Null] = js.native
    def grammarForScopeName(
      scopeName: ScopeName,
      initialLanguage: Double,
      embeddedLanguages: IEmbeddedLanguagesMap,
      tokenTypes: ITokenTypeMap,
      balancedBracketSelectors: BalancedBracketSelectors
    ): js.Promise[IGrammar | Null] = js.native
    
    /* CompleteClass */
    override def injections(scopeName: ScopeName): js.Array[ScopeName] = js.native
    
    /* CompleteClass */
    override def lookup(scopeName: ScopeName): js.UndefOr[IRawGrammar] = js.native
    
    def setTheme(theme: Theme): Unit = js.native
    
    /* CompleteClass */
    override def themeMatch(scopePath: ScopeStack): StyleAttributes | Null = js.native
  }
}
