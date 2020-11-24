package typings.winrt.Windows.Globalization.NumberFormatting

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INumberFormatterOptions extends js.Object {
  
  var fractionDigits: Double = js.native
  
  var geographicRegion: String = js.native
  
  var integerDigits: Double = js.native
  
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  
  var isGrouped: Boolean = js.native
  
  var languages: IVectorView[String] = js.native
  
  var numeralSystem: String = js.native
  
  var resolvedGeographicRegion: String = js.native
  
  var resolvedLanguage: String = js.native
}
object INumberFormatterOptions {
  
  @scala.inline
  def apply(
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    languages: IVectorView[String],
    numeralSystem: String,
    resolvedGeographicRegion: String,
    resolvedLanguage: String
  ): INumberFormatterOptions = {
    val __obj = js.Dynamic.literal(fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.asInstanceOf[INumberFormatterOptions]
  }
  
  @scala.inline
  implicit class INumberFormatterOptionsOps[Self <: INumberFormatterOptions] (val x: Self) extends AnyVal {
    
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
    def setFractionDigits(value: Double): Self = this.set("fractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeographicRegion(value: String): Self = this.set("geographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerDigits(value: Double): Self = this.set("integerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDecimalPointAlwaysDisplayed(value: Boolean): Self = this.set("isDecimalPointAlwaysDisplayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGrouped(value: Boolean): Self = this.set("isGrouped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguages(value: IVectorView[String]): Self = this.set("languages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumeralSystem(value: String): Self = this.set("numeralSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedGeographicRegion(value: String): Self = this.set("resolvedGeographicRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolvedLanguage(value: String): Self = this.set("resolvedLanguage", value.asInstanceOf[js.Any])
  }
}
