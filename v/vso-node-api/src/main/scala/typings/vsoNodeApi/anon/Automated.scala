package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Automated extends StObject {
  
  var automated: scala.Double
  
  var manual: scala.Double
  
  var none: scala.Double
  
  var scheduled: scala.Double
}
object Automated {
  
  @scala.inline
  def apply(automated: scala.Double, manual: scala.Double, none: scala.Double, scheduled: scala.Double): Automated = {
    val __obj = js.Dynamic.literal(automated = automated.asInstanceOf[js.Any], manual = manual.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], scheduled = scheduled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automated]
  }
  
  @scala.inline
  implicit class AutomatedMutableBuilder[Self <: Automated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomated(value: scala.Double): Self = StObject.set(x, "automated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManual(value: scala.Double): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduled(value: scala.Double): Self = StObject.set(x, "scheduled", value.asInstanceOf[js.Any])
  }
}
