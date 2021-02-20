package typings.tizenCommonWeb.systeminfoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SystemInfoVideoSource extends SystemInfoProperty {
  
  /**
    * Represents a list of video sources that a device is connected with.
    */
  val connected: js.Array[SystemInfoVideoSourceInfo] = js.native
  
  /**
    * Represents a list of video sources that a device is not connected with.
    */
  val disconnected: js.Array[SystemInfoVideoSourceInfo] = js.native
}
object SystemInfoVideoSource {
  
  @scala.inline
  def apply(connected: js.Array[SystemInfoVideoSourceInfo], disconnected: js.Array[SystemInfoVideoSourceInfo]): SystemInfoVideoSource = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSource]
  }
  
  @scala.inline
  implicit class SystemInfoVideoSourceMutableBuilder[Self <: SystemInfoVideoSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = StObject.set(x, "connected", js.Array(value :_*))
    
    @scala.inline
    def setDisconnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = StObject.set(x, "disconnected", js.Array(value :_*))
  }
}
