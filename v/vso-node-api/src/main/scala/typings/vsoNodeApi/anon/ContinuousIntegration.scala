package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousIntegration extends StObject {
  
  var continuousIntegration: scala.Double = js.native
  
  var manual: scala.Double = js.native
  
  var none: scala.Double = js.native
  
  var schedule: scala.Double = js.native
}
object ContinuousIntegration {
  
  @scala.inline
  def apply(
    continuousIntegration: scala.Double,
    manual: scala.Double,
    none: scala.Double,
    schedule: scala.Double
  ): ContinuousIntegration = {
    val __obj = js.Dynamic.literal(continuousIntegration = continuousIntegration.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], schedule = schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousIntegration]
  }
  
  @scala.inline
  implicit class ContinuousIntegrationMutableBuilder[Self <: ContinuousIntegration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinuousIntegration(value: scala.Double): Self = StObject.set(x, "continuousIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManual(value: scala.Double): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: scala.Double): Self = StObject.set(x, "schedule", value.asInstanceOf[js.Any])
  }
}
