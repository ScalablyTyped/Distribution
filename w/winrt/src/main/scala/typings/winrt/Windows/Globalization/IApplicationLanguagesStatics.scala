package typings.winrt.Windows.Globalization

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IApplicationLanguagesStatics extends js.Object {
  
  var languages: IVectorView[String] = js.native
  
  var manifestLanguages: IVectorView[String] = js.native
  
  var primaryLanguageOverride: String = js.native
}
object IApplicationLanguagesStatics {
  
  @scala.inline
  def apply(
    languages: IVectorView[String],
    manifestLanguages: IVectorView[String],
    primaryLanguageOverride: String
  ): IApplicationLanguagesStatics = {
    val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any], manifestLanguages = manifestLanguages.asInstanceOf[js.Any], primaryLanguageOverride = primaryLanguageOverride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IApplicationLanguagesStatics]
  }
  
  @scala.inline
  implicit class IApplicationLanguagesStaticsOps[Self <: IApplicationLanguagesStatics] (val x: Self) extends AnyVal {
    
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
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManifestLanguages(value: IVectorView[String]): Self = this.set("manifestLanguages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryLanguageOverride(value: String): Self = this.set("primaryLanguageOverride", value.asInstanceOf[js.Any])
  }
}
