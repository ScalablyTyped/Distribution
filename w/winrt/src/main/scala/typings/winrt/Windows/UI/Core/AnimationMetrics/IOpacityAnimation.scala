package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IOpacityAnimation
  extends StObject
     with IPropertyAnimation {
  
  var finalOpacity: Double
  
  var initialOpacity: Double
}
object IOpacityAnimation {
  
  inline def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalOpacity: Double,
    initialOpacity: Double,
    `type`: PropertyAnimationType
  ): IOpacityAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalOpacity = finalOpacity.asInstanceOf[js.Any], initialOpacity = initialOpacity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOpacityAnimation]
  }
  
  extension [Self <: IOpacityAnimation](x: Self) {
    
    inline def setFinalOpacity(value: Double): Self = StObject.set(x, "finalOpacity", value.asInstanceOf[js.Any])
    
    inline def setInitialOpacity(value: Double): Self = StObject.set(x, "initialOpacity", value.asInstanceOf[js.Any])
  }
}
