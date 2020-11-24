package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextConstantsStatics extends js.Object {
  
  var autoColor: Color = js.native
  
  var maxUnitCount: Double = js.native
  
  var minUnitCount: Double = js.native
  
  var undefinedColor: Color = js.native
  
  var undefinedFloatValue: Double = js.native
  
  var undefinedFontStretch: FontStretch = js.native
  
  var undefinedFontStyle: FontStyle = js.native
  
  var undefinedInt32Value: Double = js.native
}
object ITextConstantsStatics {
  
  @scala.inline
  def apply(
    autoColor: Color,
    maxUnitCount: Double,
    minUnitCount: Double,
    undefinedColor: Color,
    undefinedFloatValue: Double,
    undefinedFontStretch: FontStretch,
    undefinedFontStyle: FontStyle,
    undefinedInt32Value: Double
  ): ITextConstantsStatics = {
    val __obj = js.Dynamic.literal(autoColor = autoColor.asInstanceOf[js.Any], maxUnitCount = maxUnitCount.asInstanceOf[js.Any], minUnitCount = minUnitCount.asInstanceOf[js.Any], undefinedColor = undefinedColor.asInstanceOf[js.Any], undefinedFloatValue = undefinedFloatValue.asInstanceOf[js.Any], undefinedFontStretch = undefinedFontStretch.asInstanceOf[js.Any], undefinedFontStyle = undefinedFontStyle.asInstanceOf[js.Any], undefinedInt32Value = undefinedInt32Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITextConstantsStatics]
  }
  
  @scala.inline
  implicit class ITextConstantsStaticsOps[Self <: ITextConstantsStatics] (val x: Self) extends AnyVal {
    
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
    def setAutoColor(value: Color): Self = this.set("autoColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnitCount(value: Double): Self = this.set("maxUnitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUnitCount(value: Double): Self = this.set("minUnitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedColor(value: Color): Self = this.set("undefinedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFloatValue(value: Double): Self = this.set("undefinedFloatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFontStretch(value: FontStretch): Self = this.set("undefinedFontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFontStyle(value: FontStyle): Self = this.set("undefinedFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedInt32Value(value: Double): Self = this.set("undefinedInt32Value", value.asInstanceOf[js.Any])
  }
}
