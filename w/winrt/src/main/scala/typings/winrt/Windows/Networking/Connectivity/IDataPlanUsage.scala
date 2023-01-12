package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDataPlanUsage extends StObject {
  
  var lastSyncTime: js.Date
  
  var megabytesUsed: Double
}
object IDataPlanUsage {
  
  inline def apply(lastSyncTime: js.Date, megabytesUsed: Double): IDataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataPlanUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDataPlanUsage] (val x: Self) extends AnyVal {
    
    inline def setLastSyncTime(value: js.Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    inline def setMegabytesUsed(value: Double): Self = StObject.set(x, "megabytesUsed", value.asInstanceOf[js.Any])
  }
}
