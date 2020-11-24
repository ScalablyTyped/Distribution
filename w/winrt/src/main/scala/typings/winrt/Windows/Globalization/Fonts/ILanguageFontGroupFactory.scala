package typings.winrt.Windows.Globalization.Fonts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageFontGroupFactory extends js.Object {
  
  def createLanguageFontGroup(languageTag: String): LanguageFontGroup = js.native
}
object ILanguageFontGroupFactory {
  
  @scala.inline
  def apply(createLanguageFontGroup: String => LanguageFontGroup): ILanguageFontGroupFactory = {
    val __obj = js.Dynamic.literal(createLanguageFontGroup = js.Any.fromFunction1(createLanguageFontGroup))
    __obj.asInstanceOf[ILanguageFontGroupFactory]
  }
  
  @scala.inline
  implicit class ILanguageFontGroupFactoryOps[Self <: ILanguageFontGroupFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateLanguageFontGroup(value: String => LanguageFontGroup): Self = this.set("createLanguageFontGroup", js.Any.fromFunction1(value))
  }
}
