package typings.three.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThresholdAngle extends StObject {
  
  var thresholdAngle: Double
}
object ThresholdAngle {
  
  @scala.inline
  def apply(thresholdAngle: Double): ThresholdAngle = {
    val __obj = js.Dynamic.literal(thresholdAngle = thresholdAngle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdAngle]
  }
  
  @scala.inline
  implicit class ThresholdAngleMutableBuilder[Self <: ThresholdAngle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setThresholdAngle(value: Double): Self = StObject.set(x, "thresholdAngle", value.asInstanceOf[js.Any])
  }
}
