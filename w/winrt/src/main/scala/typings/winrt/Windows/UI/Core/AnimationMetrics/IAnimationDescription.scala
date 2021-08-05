package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAnimationDescription extends StObject {
  
  var animations: IVectorView[IPropertyAnimation]
  
  var delayLimit: Double
  
  var staggerDelay: Double
  
  var staggerDelayFactor: Double
  
  var zOrder: Double
}
object IAnimationDescription {
  
  inline def apply(
    animations: IVectorView[IPropertyAnimation],
    delayLimit: Double,
    staggerDelay: Double,
    staggerDelayFactor: Double,
    zOrder: Double
  ): IAnimationDescription = {
    val __obj = js.Dynamic.literal(animations = animations.asInstanceOf[js.Any], delayLimit = delayLimit.asInstanceOf[js.Any], staggerDelay = staggerDelay.asInstanceOf[js.Any], staggerDelayFactor = staggerDelayFactor.asInstanceOf[js.Any], zOrder = zOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAnimationDescription]
  }
  
  extension [Self <: IAnimationDescription](x: Self) {
    
    inline def setAnimations(value: IVectorView[IPropertyAnimation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
    
    inline def setDelayLimit(value: Double): Self = StObject.set(x, "delayLimit", value.asInstanceOf[js.Any])
    
    inline def setStaggerDelay(value: Double): Self = StObject.set(x, "staggerDelay", value.asInstanceOf[js.Any])
    
    inline def setStaggerDelayFactor(value: Double): Self = StObject.set(x, "staggerDelayFactor", value.asInstanceOf[js.Any])
    
    inline def setZOrder(value: Double): Self = StObject.set(x, "zOrder", value.asInstanceOf[js.Any])
  }
}
