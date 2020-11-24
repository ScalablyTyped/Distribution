package typings.vuexI18n.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait i18nState extends js.Object {
  
  var fallback: String | Null = js.native
  
  var locale: String | Null = js.native
  
  var translations: StringDictionary[Translations] = js.native
}
object i18nState {
  
  @scala.inline
  def apply(translations: StringDictionary[Translations]): i18nState = {
    val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
    __obj.asInstanceOf[i18nState]
  }
  
  @scala.inline
  implicit class i18nStateOps[Self <: i18nState] (val x: Self) extends AnyVal {
    
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
    def setTranslations(value: StringDictionary[Translations]): Self = this.set("translations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallback(value: String): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbackNull: Self = this.set("fallback", null)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleNull: Self = this.set("locale", null)
  }
}
