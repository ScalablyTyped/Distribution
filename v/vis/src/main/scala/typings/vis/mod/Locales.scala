package typings.vis.mod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class LocalesOps[Self <: Locales] (val x: Self) extends AnyVal {
    
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
    def setCn(value: LocaleMessages): Self = this.set("cn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCn: Self = this.set("cn", js.undefined)
    
    @scala.inline
    def setDe(value: LocaleMessages): Self = this.set("de", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDe: Self = this.set("de", js.undefined)
    
    @scala.inline
    def setEn(value: LocaleMessages): Self = this.set("en", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEn: Self = this.set("en", js.undefined)
    
    @scala.inline
    def setEs(value: LocaleMessages): Self = this.set("es", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEs: Self = this.set("es", js.undefined)
    
    @scala.inline
    def setIt(value: LocaleMessages): Self = this.set("it", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIt: Self = this.set("it", js.undefined)
    
    @scala.inline
    def setNl(value: LocaleMessages): Self = this.set("nl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNl: Self = this.set("nl", js.undefined)
    
    @scala.inline
    def `setPt-br`(value: LocaleMessages): Self = this.set("pt-br", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `deletePt-br`: Self = this.set("pt-br", js.undefined)
    
    @scala.inline
    def setRu(value: LocaleMessages): Self = this.set("ru", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRu: Self = this.set("ru", js.undefined)
  }
}
