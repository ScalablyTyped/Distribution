package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxValue extends StObject {
  
  var maxValue: Double
  
  var minValue: Double
}
object MaxValue {
  
  @scala.inline
  def apply(maxValue: Double, minValue: Double): MaxValue = {
    val __obj = js.Dynamic.literal(maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxValue]
  }
  
  @scala.inline
  implicit class MaxValueMutableBuilder[Self <: MaxValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
  }
}
