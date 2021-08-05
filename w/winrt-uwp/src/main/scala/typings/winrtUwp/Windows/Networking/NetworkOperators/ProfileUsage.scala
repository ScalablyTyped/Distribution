package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to update the usage of plan data. */
trait ProfileUsage extends StObject {
  
  /** The last time UsageInMegabytes was updated. */
  var lastSyncTime: Date
  
  /** Updates the usage in megabytes. */
  var usageInMegabytes: Double
}
object ProfileUsage {
  
  inline def apply(lastSyncTime: Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  
  extension [Self <: ProfileUsage](x: Self) {
    
    inline def setLastSyncTime(value: Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setUsageInMegabytes(value: Double): Self = StObject.set(x, "usageInMegabytes", value.asInstanceOf[js.Any])
  }
}
