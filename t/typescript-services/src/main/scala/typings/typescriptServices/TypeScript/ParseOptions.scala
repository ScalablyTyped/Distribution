package typings.typescriptServices.TypeScript

import typings.typescriptServices.anon.AllowAutomaticSemicolonInsertion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var _allowAutomaticSemicolonInsertion: js.Any = js.native
  
  var _languageVersion: js.Any = js.native
  
  def allowAutomaticSemicolonInsertion(): Boolean = js.native
  
  def languageVersion(): LanguageVersion = js.native
  
  def toJSON(key: js.Any): AllowAutomaticSemicolonInsertion = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(
    _allowAutomaticSemicolonInsertion: js.Any,
    _languageVersion: js.Any,
    allowAutomaticSemicolonInsertion: () => Boolean,
    languageVersion: () => LanguageVersion,
    toJSON: js.Any => AllowAutomaticSemicolonInsertion
  ): ParseOptions = {
    val __obj = js.Dynamic.literal(_allowAutomaticSemicolonInsertion = _allowAutomaticSemicolonInsertion.asInstanceOf[js.Any], _languageVersion = _languageVersion.asInstanceOf[js.Any], allowAutomaticSemicolonInsertion = js.Any.fromFunction0(allowAutomaticSemicolonInsertion), languageVersion = js.Any.fromFunction0(languageVersion), toJSON = js.Any.fromFunction1(toJSON))
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def set_allowAutomaticSemicolonInsertion(value: js.Any): Self = this.set("_allowAutomaticSemicolonInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_languageVersion(value: js.Any): Self = this.set("_languageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowAutomaticSemicolonInsertion(value: () => Boolean): Self = this.set("allowAutomaticSemicolonInsertion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLanguageVersion(value: () => LanguageVersion): Self = this.set("languageVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToJSON(value: js.Any => AllowAutomaticSemicolonInsertion): Self = this.set("toJSON", js.Any.fromFunction1(value))
  }
}
