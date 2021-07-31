package typings.winrt.Windows.Networking.NetworkOperators

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileUsage extends StObject {
  
  var lastSyncTime: Date
  
  var usageInMegabytes: Double
}
object ProfileUsage {
  
  @scala.inline
  def apply(lastSyncTime: Date, usageInMegabytes: Double): ProfileUsage = {
    val __obj = js.Dynamic.literal(lastSyncTime = lastSyncTime.asInstanceOf[js.Any], usageInMegabytes = usageInMegabytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileUsage]
  }
  
  @scala.inline
  implicit class ProfileUsageMutableBuilder[Self <: ProfileUsage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastSyncTime(value: Date): Self = StObject.set(x, "lastSyncTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsageInMegabytes(value: Double): Self = StObject.set(x, "usageInMegabytes", value.asInstanceOf[js.Any])
  }
}
