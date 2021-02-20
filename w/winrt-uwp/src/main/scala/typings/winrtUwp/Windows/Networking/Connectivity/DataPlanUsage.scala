package typings.winrtUwp.Windows.Networking.Connectivity

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents data plan specific data usage information for a connection. */
@js.native
trait DataPlanUsage extends StObject {
  
  /** Gets a DateTime object indicating the date and time when the MegabytesUsed property was last updated. */
  var lastSyncTime: Date = js.native
  
  /** Gets a value indicating the total amount of data transferred, in megabytes, over the connection. */
  var megabytesUsed: Double = js.native
}
object DataPlanUsage {
  
  @scala.inline
  def apply(lastSyncTime: Date, megabytesUsed: Double): DataPlanUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], megabytesUsed = megabytesUsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPlanUsage]
  }
  
  @scala.inline
  implicit class DataPlanUsageMutableBuilder[Self <: DataPlanUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSyncTime(value: Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMegabytesUsed(value: Double): Self = StObject.set(x, "megabytesUsed", value.asInstanceOf[js.Any])
  }
}
