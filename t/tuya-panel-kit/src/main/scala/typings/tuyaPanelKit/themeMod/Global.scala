package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  var background: BackgroundProps
  
  var brand: String
  
  var dividerColor: String
  
  var error: String
  
  var fontSizeBase: Double
  
  var mask: String
  
  var success: String
  
  var text: GlobalText
  
  var warning: String
}
object Global {
  
  @scala.inline
  def apply(
    background: BackgroundProps,
    brand: String,
    dividerColor: String,
    error: String,
    fontSizeBase: Double,
    mask: String,
    success: String,
    text: GlobalText,
    warning: String
  ): Global = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], brand = brand.asInstanceOf[js.Any], dividerColor = dividerColor.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fontSizeBase = fontSizeBase.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerColor(value: String): Self = StObject.set(x, "dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeBase(value: Double): Self = StObject.set(x, "fontSizeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: GlobalText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
  }
}
