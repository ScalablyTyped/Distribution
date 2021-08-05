package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPropertyAnimation extends StObject {
  
  var control1: Point
  
  var control2: Point
  
  var delay: Double
  
  var duration: Double
  
  var `type`: PropertyAnimationType
}
object IPropertyAnimation {
  
  inline def apply(control1: Point, control2: Point, delay: Double, duration: Double, `type`: PropertyAnimationType): IPropertyAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyAnimation]
  }
  
  extension [Self <: IPropertyAnimation](x: Self) {
    
    inline def setControl1(value: Point): Self = StObject.set(x, "control1", value.asInstanceOf[js.Any])
    
    inline def setControl2(value: Point): Self = StObject.set(x, "control2", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setType(value: PropertyAnimationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
