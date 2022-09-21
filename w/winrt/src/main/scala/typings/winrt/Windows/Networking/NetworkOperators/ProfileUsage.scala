package typings.winrt.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileUsage extends StObject {
  
  var lastSyncTime: js.Date
  
  var usageInMegabytes: Double
}
object ProfileUsage {
  
  inline def apply(lastSyncTime: js.Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  
  extension [Self <: ProfileUsage](x: Self) {
    
    inline def setLastSyncTime(value: js.Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setUsageInMegabytes(value: Double): Self = StObject.set(x, "usageInMegabytes", value.asInstanceOf[js.Any])
  }
}
