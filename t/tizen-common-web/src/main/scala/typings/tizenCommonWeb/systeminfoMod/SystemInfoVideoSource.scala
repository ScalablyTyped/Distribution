package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInfoVideoSource
  extends StObject
     with SystemInfoProperty {
  
  /**
    * Represents a list of video sources that a device is connected with.
    */
  val connected: js.Array[SystemInfoVideoSourceInfo]
  
  /**
    * Represents a list of video sources that a device is not connected with.
    */
  val disconnected: js.Array[SystemInfoVideoSourceInfo]
}
object SystemInfoVideoSource {
  
  inline def apply(connected: js.Array[SystemInfoVideoSourceInfo], disconnected: js.Array[SystemInfoVideoSourceInfo]): SystemInfoVideoSource = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSource]
  }
  
  extension [Self <: SystemInfoVideoSource](x: Self) {
    
    inline def setConnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = StObject.set(x, "connected", js.Array(value :_*))
    
    inline def setDisconnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    inline def setDisconnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = StObject.set(x, "disconnected", js.Array(value :_*))
  }
}
