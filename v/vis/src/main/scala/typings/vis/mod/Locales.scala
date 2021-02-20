package typings.vis.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Locales
  extends /* language */ StringDictionary[js.UndefOr[LocaleMessages]] {
  
  var cn: js.UndefOr[LocaleMessages] = js.native
  
  var de: js.UndefOr[LocaleMessages] = js.native
  
  var en: js.UndefOr[LocaleMessages] = js.native
  
  var es: js.UndefOr[LocaleMessages] = js.native
  
  var it: js.UndefOr[LocaleMessages] = js.native
  
  var nl: js.UndefOr[LocaleMessages] = js.native
  
  var `pt-br`: js.UndefOr[LocaleMessages] = js.native
  
  var ru: js.UndefOr[LocaleMessages] = js.native
}
object Locales {
  
  @scala.inline
  def apply(): Locales = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Locales]
  }
  
  @scala.inline
  implicit class LocalesMutableBuilder[Self <: Locales] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCn(value: LocaleMessages): Self = StObject.set(x, "cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCnUndefined: Self = StObject.set(x, "cn", js.undefined)
    
    @scala.inline
    def setDe(value: LocaleMessages): Self = StObject.set(x, "de", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeUndefined: Self = StObject.set(x, "de", js.undefined)
    
    @scala.inline
    def setEn(value: LocaleMessages): Self = StObject.set(x, "en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnUndefined: Self = StObject.set(x, "en", js.undefined)
    
    @scala.inline
    def setEs(value: LocaleMessages): Self = StObject.set(x, "es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsUndefined: Self = StObject.set(x, "es", js.undefined)
    
    @scala.inline
    def setIt(value: LocaleMessages): Self = StObject.set(x, "it", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItUndefined: Self = StObject.set(x, "it", js.undefined)
    
    @scala.inline
    def setNl(value: LocaleMessages): Self = StObject.set(x, "nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNlUndefined: Self = StObject.set(x, "nl", js.undefined)
    
    @scala.inline
    def `setPt-br`(value: LocaleMessages): Self = StObject.set(x, "pt-br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setPt-brUndefined`: Self = StObject.set(x, "pt-br", js.undefined)
    
    @scala.inline
    def setRu(value: LocaleMessages): Self = StObject.set(x, "ru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuUndefined: Self = StObject.set(x, "ru", js.undefined)
  }
}
