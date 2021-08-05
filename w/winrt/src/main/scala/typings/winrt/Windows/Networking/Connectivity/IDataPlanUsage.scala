package typings.winrt.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataPlanUsage extends StObject {
  
  var lastSyncTime: Date
  
  var megabytesUsed: Double
}
object IDataPlanUsage {
  
  inline def apply(lastSyncTime: Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
  
  extension [Self <: IDataPlanUsage](x: Self) {
    
    inline def setLastSyncTime(value: Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setMegabytesUsed(value: Double): Self = StObject.set(x, "megabytesUsed", value.asInstanceOf[js.Any])
  }
}
