package typings.winrtUwp.Windows.Globalization.Fonts

import typings.winrtUwp.Windows.UI.Text.FontStretch
import typings.winrtUwp.Windows.UI.Text.FontStyle
import typings.winrtUwp.Windows.UI.Text.FontWeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data related to a particular font recommendation for a given language. */
@js.native
trait LanguageFont extends js.Object {
  
  /** Gets the family name of the font. */
  var fontFamily: String = js.native
  
  /** Gets the FontStretch property of the font. */
  var fontStretch: FontStretch = js.native
  
  /** Gets the FontStyle property of the font. */
  var fontStyle: FontStyle = js.native
  
  /** Gets the weight of the font ( FontWeight ). */
  var fontWeight: FontWeight = js.native
  
  /** Gets a recommended font size scaling factor for the font. */
  var scaleFactor: Double = js.native
}
object LanguageFont {
  
  @scala.inline
  def apply(
    fontFamily: String,
    fontStretch: FontStretch,
    fontStyle: FontStyle,
    fontWeight: FontWeight,
    scaleFactor: Double
  ): LanguageFont = {
    val __obj = js.Dynamic.literal(fontFamily = fontFamily.asInstanceOf[js.Any], fontStretch = fontStretch.asInstanceOf[js.Any], fontStyle = fontStyle.asInstanceOf[js.Any], fontWeight = fontWeight.asInstanceOf[js.Any], scaleFactor = scaleFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageFont]
  }
  
  @scala.inline
  implicit class LanguageFontOps[Self <: LanguageFont] (val x: Self) extends AnyVal {
    
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
    def setFontFamily(value: String): Self = this.set("fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = this.set("fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = this.set("fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFactor(value: Double): Self = this.set("scaleFactor", value.asInstanceOf[js.Any])
  }
}
