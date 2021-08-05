package typings.tizenCommonWeb.applicationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationBatteryUsage extends StObject {
  
  /**
    * An attribute storing ID of an application.
    */
  val appId: ApplicationId
  
  /**
    * An attribute which stores information about battery usage of an application with ApplicationId `appId`.
    * Battery usage is a ratio of battery consumption of the application with ApplicationId `appId` to the total battery consumption of all applications.
    * The attribute value scales from ***0*** to ***1***, the higher value, the more battery is consumed.
    */
  val batteryUsage: Double
}
object ApplicationBatteryUsage {
  
  inline def apply(appId: ApplicationId, batteryUsage: Double): ApplicationBatteryUsage = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], batteryUsage = batteryUsage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationBatteryUsage]
  }
  
  extension [Self <: ApplicationBatteryUsage](x: Self) {
    
    inline def setAppId(value: ApplicationId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBatteryUsage(value: Double): Self = StObject.set(x, "batteryUsage", value.asInstanceOf[js.Any])
  }
}
