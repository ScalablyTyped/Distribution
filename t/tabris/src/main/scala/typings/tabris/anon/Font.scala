package typings.tabris.anon

import typings.tabris.mod.FontValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Font extends StObject {
  
  var font: FontValue
  
  var markupEnabled: js.UndefOr[Boolean] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var text: String
}
object Font {
  
  @scala.inline
  def apply(text: String): Font = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], font = null)
    __obj.asInstanceOf[Font]
  }
  
  @scala.inline
  implicit class FontMutableBuilder[Self <: Font] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: FontValue): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setMarkupEnabled(value: Boolean): Self = StObject.set(x, "markupEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkupEnabledUndefined: Self = StObject.set(x, "markupEnabled", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
