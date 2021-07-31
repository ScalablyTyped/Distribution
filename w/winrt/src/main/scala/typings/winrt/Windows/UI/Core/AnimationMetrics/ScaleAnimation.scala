package typings.winrt.Windows.UI.Core.AnimationMetrics

import typings.winrt.Windows.Foundation.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleAnimation
  extends StObject
     with IScaleAnimation
object ScaleAnimation {
  
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
  ): ScaleAnimation = {
    val __obj = js.Dynamic.literal(control1 = control1.asInstanceOf[js.Any], control2 = control2.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finalScaleX = finalScaleX.asInstanceOf[js.Any], finalScaleY = finalScaleY.asInstanceOf[js.Any], initialScaleX = initialScaleX.asInstanceOf[js.Any], initialScaleY = initialScaleY.asInstanceOf[js.Any], normalizedOrigin = normalizedOrigin.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleAnimation]
  }
}
