package typings.vscode.mod

import typings.std.RegExp
import typings.vscode.anon.AutoClosingPairs
import typings.vscode.anon.Brackets
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageConfiguration extends js.Object {
  
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
  implicit class LanguageConfigurationOps[Self <: LanguageConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set__characterPairSupport(value: AutoClosingPairs): Self = this.set("__characterPairSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__characterPairSupport: Self = this.set("__characterPairSupport", js.undefined)
    
    @scala.inline
    def set__electricCharacterSupport(value: Brackets): Self = this.set("__electricCharacterSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__electricCharacterSupport: Self = this.set("__electricCharacterSupport", js.undefined)
    
    @scala.inline
    def setBracketsVarargs(value: CharacterPair*): Self = this.set("brackets", js.Array(value :_*))
    
    @scala.inline
    def setBrackets(value: js.Array[CharacterPair]): Self = this.set("brackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrackets: Self = this.set("brackets", js.undefined)
    
    @scala.inline
    def setComments(value: CommentRule): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setIndentationRules(value: IndentationRule): Self = this.set("indentationRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentationRules: Self = this.set("indentationRules", js.undefined)
    
    @scala.inline
    def setOnEnterRulesVarargs(value: OnEnterRule*): Self = this.set("onEnterRules", js.Array(value :_*))
    
    @scala.inline
    def setOnEnterRules(value: js.Array[OnEnterRule]): Self = this.set("onEnterRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnEnterRules: Self = this.set("onEnterRules", js.undefined)
    
    @scala.inline
    def setWordPattern(value: RegExp): Self = this.set("wordPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordPattern: Self = this.set("wordPattern", js.undefined)
  }
}
