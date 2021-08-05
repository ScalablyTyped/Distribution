package typings.winrt.Windows.ApplicationModel.Background

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITimeTrigger
  extends StObject
     with IBackgroundTrigger {
  
  var freshnessTime: Double
  
  var oneShot: Boolean
}
object ITimeTrigger {
  
  inline def apply(freshnessTime: Double, oneShot: Boolean): ITimeTrigger = {
    val __obj = js.Dynamic.literal(freshnessTime = freshnessTime.asInstanceOf[js.Any], oneShot = oneShot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeTrigger]
  }
  
  extension [Self <: ITimeTrigger](x: Self) {
    
    inline def setFreshnessTime(value: Double): Self = StObject.set(x, "freshnessTime", value.asInstanceOf[js.Any])
    
    inline def setOneShot(value: Boolean): Self = StObject.set(x, "oneShot", value.asInstanceOf[js.Any])
  }
}
