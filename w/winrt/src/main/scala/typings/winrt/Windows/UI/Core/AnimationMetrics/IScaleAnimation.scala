package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScaleAnimation
  extends StObject
     with IPropertyAnimation {
  
  var finalScaleX: Double
  
  var finalScaleY: Double
  
  var initialScaleX: Double
  
  var initialScaleY: Double
  
  var normalizedOrigin: Point
}
object IScaleAnimation {
  
  @scala.inline
  def apply(
    control1: Point,
    control2: Point,
    delay: Double,
    duration: Double,
    finalScaleX: Double,
    finalScaleY: Double,
    initialScaleX: Double,
    initialScaleY: Double,
    normalizedOrigin: Point,
    `type`: PropertyAnimationType
  ): IScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalScaleX = finalScaleX.asInstanceOf[js.Any], finalScaleY = finalScaleY.asInstanceOf[js.Any], initialScaleX = initialScaleX.asInstanceOf[js.Any], initialScaleY = initialScaleY.asInstanceOf[js.Any], normalizedOrigin = normalizedOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScaleAnimation]
  }
  
  @scala.inline
  implicit class IScaleAnimationMutableBuilder[Self <: IScaleAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinalScaleX(value: Double): Self = StObject.set(x, "finalScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalScaleY(value: Double): Self = StObject.set(x, "finalScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScaleX(value: Double): Self = StObject.set(x, "initialScaleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialScaleY(value: Double): Self = StObject.set(x, "initialScaleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedOrigin(value: Point): Self = StObject.set(x, "normalizedOrigin", value.asInstanceOf[js.Any])
  }
}
