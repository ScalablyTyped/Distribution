package typings.winrt.Windows.UI.Text

import typings.winrt.Windows.UI.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITextConstantsStatics extends StObject {
  
  var autoColor: Color
  
  var maxUnitCount: Double
  
  var minUnitCount: Double
  
  var undefinedColor: Color
  
  var undefinedFloatValue: Double
  
  var undefinedFontStretch: FontStretch
  
  var undefinedFontStyle: FontStyle
  
  var undefinedInt32Value: Double
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
  implicit class ITextConstantsStaticsMutableBuilder[Self <: ITextConstantsStatics] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoColor(value: Color): Self = StObject.set(x, "autoColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUnitCount(value: Double): Self = StObject.set(x, "maxUnitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUnitCount(value: Double): Self = StObject.set(x, "minUnitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedColor(value: Color): Self = StObject.set(x, "undefinedColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFloatValue(value: Double): Self = StObject.set(x, "undefinedFloatValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFontStretch(value: FontStretch): Self = StObject.set(x, "undefinedFontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedFontStyle(value: FontStyle): Self = StObject.set(x, "undefinedFontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUndefinedInt32Value(value: Double): Self = StObject.set(x, "undefinedInt32Value", value.asInstanceOf[js.Any])
  }
}
