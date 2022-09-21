package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatteryColor extends StObject {
  
  var batteryColor: String
}
object BatteryColor {
  
  inline def apply(batteryColor: String): BatteryColor = {
    val __obj = js.Dynamic.literal(batteryColor = batteryColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatteryColor]
  }
  
  extension [Self <: BatteryColor](x: Self) {
    
    inline def setBatteryColor(value: String): Self = StObject.set(x, "batteryColor", value.asInstanceOf[js.Any])
  }
}
