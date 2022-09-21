package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoMemory
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents the low memory state.
    */
  val status: SystemInfoLowMemoryStatus
}
object SystemInfoMemory {
  
  inline def apply(status: SystemInfoLowMemoryStatus): SystemInfoMemory = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoMemory]
  }
  
  extension [Self <: SystemInfoMemory](x: Self) {
    
    inline def setStatus(value: SystemInfoLowMemoryStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
