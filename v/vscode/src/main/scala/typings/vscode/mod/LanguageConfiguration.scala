package typings.vscode.mod

import typings.std.RegExp
import typings.vscode.anon.AutoClosingPairs
import typings.vscode.anon.Brackets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageConfiguration extends StObject {
  
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated * Use the autoClosingPairs property in the language configuration file instead.
    */
  var __characterPairSupport: js.UndefOr[AutoClosingPairs] = js.native
  
  /**
    * **Deprecated** Do not use.
    *
    * @deprecated Will be replaced by a better API soon.
    */
  var __electricCharacterSupport: js.UndefOr[Brackets] = js.native
  
  /**
    * The language's brackets.
    * This configuration implicitly affects pressing Enter around these brackets.
    */
  var brackets: js.UndefOr[js.Array[CharacterPair]] = js.native
  
  /**
    * The language's comment settings.
    */
  var comments: js.UndefOr[CommentRule] = js.native
  
  /**
    * The language's indentation settings.
    */
  var indentationRules: js.UndefOr[IndentationRule] = js.native
  
  /**
    * The language's rules to be evaluated when pressing Enter.
    */
  var onEnterRules: js.UndefOr[js.Array[OnEnterRule]] = js.native
  
  /**
    * The language's word definition.
    * If the language supports Unicode identifiers (e.g. JavaScript), it is preferable
    * to provide a word definition that uses exclusion of known separators.
    * e.g.: A regex that matches anything except known separators (and dot is allowed to occur in a floating point number):
    *   /(-?\d*\.\d\w*)|([^\`\~\!\@\#\%\^\&\*\(\)\-\=\+\[\{\]\}\\\|\;\:\'\"\,\.\<\>\/\?\s]+)/g
    */
  var wordPattern: js.UndefOr[RegExp] = js.native
}
object LanguageConfiguration {
  
  @scala.inline
  def apply(): LanguageConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LanguageConfiguration]
  }
  
  @scala.inline
  implicit class LanguageConfigurationMutableBuilder[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBrackets(value: js.Array[CharacterPair]): Self = StObject.set(x, "brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketsUndefined: Self = StObject.set(x, "brackets", js.undefined)
    
    @scala.inline
    def setBracketsVarargs(value: CharacterPair*): Self = StObject.set(x, "brackets", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: CommentRule): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setIndentationRules(value: IndentationRule): Self = StObject.set(x, "indentationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndentationRulesUndefined: Self = StObject.set(x, "indentationRules", js.undefined)
    
    @scala.inline
    def setOnEnterRules(value: js.Array[OnEnterRule]): Self = StObject.set(x, "onEnterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnEnterRulesUndefined: Self = StObject.set(x, "onEnterRules", js.undefined)
    
    @scala.inline
    def setOnEnterRulesVarargs(value: OnEnterRule*): Self = StObject.set(x, "onEnterRules", js.Array(value :_*))
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = StObject.set(x, "wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordPatternUndefined: Self = StObject.set(x, "wordPattern", js.undefined)
    
    @scala.inline
    def set__characterPairSupport(value: AutoClosingPairs): Self = StObject.set(x, "__characterPairSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__characterPairSupportUndefined: Self = StObject.set(x, "__characterPairSupport", js.undefined)
    
    @scala.inline
    def set__electricCharacterSupport(value: Brackets): Self = StObject.set(x, "__electricCharacterSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__electricCharacterSupportUndefined: Self = StObject.set(x, "__electricCharacterSupport", js.undefined)
  }
}
