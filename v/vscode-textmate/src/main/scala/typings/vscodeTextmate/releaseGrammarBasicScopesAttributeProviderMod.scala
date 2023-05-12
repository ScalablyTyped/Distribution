package typings.vscodeTextmate

import typings.vscodeTextmate.mod.IEmbeddedLanguagesMap
import typings.vscodeTextmate.releaseEncodedTokenAttributesMod.OptionalStandardTokenType
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseGrammarBasicScopesAttributeProviderMod {
  
  @JSImport("vscode-textmate/release/grammar/basicScopesAttributeProvider", "BasicScopeAttributes")
  @js.native
  open class BasicScopeAttributes protected () extends StObject {
    def this(languageId: Double, tokenType: OptionalStandardTokenType) = this()
    
    val languageId: Double = js.native
    
    val tokenType: OptionalStandardTokenType = js.native
  }
  
  @JSImport("vscode-textmate/release/grammar/basicScopesAttributeProvider", "BasicScopeAttributesProvider")
  @js.native
  open class BasicScopeAttributesProvider protected () extends StObject {
    def this(initialLanguageId: Double) = this()
    def this(initialLanguageId: Double, embeddedLanguages: IEmbeddedLanguagesMap) = this()
    
    /* private */ val _defaultAttributes: Any = js.native
    
    /* private */ val _embeddedLanguagesMatcher: Any = js.native
    
    /* private */ val _getBasicScopeAttributes: Any = js.native
    
    /**
      * Given a produced TM scope, return the language that token describes or null if unknown.
      * e.g. source.html => html, source.css.embedded.html => css, punctuation.definition.tag.html => null
      */
    /* private */ var _scopeToLanguage: Any = js.native
    
    /* private */ var _toStandardTokenType: Any = js.native
    
    def getBasicScopeAttributes(): BasicScopeAttributes = js.native
    def getBasicScopeAttributes(scopeName: ScopeName): BasicScopeAttributes = js.native
    
    def getDefaultAttributes(): BasicScopeAttributes = js.native
  }
  /* static members */
  object BasicScopeAttributesProvider {
    
    @JSImport("vscode-textmate/release/grammar/basicScopesAttributeProvider", "BasicScopeAttributesProvider")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/grammar/basicScopesAttributeProvider", "BasicScopeAttributesProvider.STANDARD_TOKEN_TYPE_REGEXP")
    @js.native
    def STANDARD_TOKEN_TYPE_REGEXP: Any = js.native
    inline def STANDARD_TOKEN_TYPE_REGEXP_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANDARD_TOKEN_TYPE_REGEXP")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/grammar/basicScopesAttributeProvider", "BasicScopeAttributesProvider._NULL_SCOPE_METADATA")
    @js.native
    val _NULL_SCOPE_METADATA: Any = js.native
  }
}
