package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaintenanceTrigger
  extends StObject
     with IBackgroundTrigger {
  
  var freshnessTime: Double
  
  var oneShot: Boolean
}
object IMaintenanceTrigger {
  
  inline def apply(freshnessTime: Double, oneShot: Boolean): IMaintenanceTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaintenanceTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IMaintenanceTrigger] (val x: Self) extends AnyVal {
    
    inline def setFreshnessTime(value: Double): Self = StObject.set(x, "freshnessTime", value.asInstanceOf[js.Any])
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
  }
}
