package typings.w3cImageCapture

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaSettingsRange extends StObject {
  
  val max: Double
  
  val min: Double
  
  val step: Double
}
object MediaSettingsRange {
  
  @scala.inline
  def apply(max: Double, min: Double, step: Double): MediaSettingsRange = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaSettingsRange]
  }
  
  @scala.inline
  implicit class MediaSettingsRangeMutableBuilder[Self <: MediaSettingsRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
