package typings.tuyaPanelKit.themeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends js.Object {
  
  var background: BackgroundProps = js.native
  
  var brand: String = js.native
  
  var dividerColor: String = js.native
  
  var error: String = js.native
  
  var fontSizeBase: Double = js.native
  
  var mask: String = js.native
  
  var success: String = js.native
  
  var text: GlobalText = js.native
  
  var warning: String = js.native
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
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: BackgroundProps): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDividerColor(value: String): Self = this.set("dividerColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSizeBase(value: Double): Self = this.set("fontSizeBase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: String): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: GlobalText): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarning(value: String): Self = this.set("warning", value.asInstanceOf[js.Any])
  }
}
