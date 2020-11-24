package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerEntry extends ResponseEntry {
  
  var virtualserverAutostart: Double = js.native
  
  var virtualserverClientsonline: Double = js.native
  
  var virtualserverId: String = js.native
  
  var virtualserverMachineId: String = js.native
  
  var virtualserverMaxclients: Double = js.native
  
  var virtualserverName: String = js.native
  
  var virtualserverPort: Double = js.native
  
  var virtualserverQueryclientsonline: Double = js.native
  
  var virtualserverStatus: String = js.native
  
  var virtualserverUniqueIdentifier: String = js.native
  
  var virtualserverUptime: Double = js.native
}
object ServerEntry {
  
  @scala.inline
  def apply(
    virtualserverAutostart: Double,
    virtualserverClientsonline: Double,
    virtualserverId: String,
    virtualserverMachineId: String,
    virtualserverMaxclients: Double,
    virtualserverName: String,
    virtualserverPort: Double,
    virtualserverQueryclientsonline: Double,
    virtualserverStatus: String,
    virtualserverUniqueIdentifier: String,
    virtualserverUptime: Double
  ): ServerEntry = {
    val __obj = js.Dynamic.literal(virtualserverAutostart = virtualserverAutostart.asInstanceOf[js.Any], virtualserverClientsonline = virtualserverClientsonline.asInstanceOf[js.Any], virtualserverId = virtualserverId.asInstanceOf[js.Any], virtualserverMachineId = virtualserverMachineId.asInstanceOf[js.Any], virtualserverMaxclients = virtualserverMaxclients.asInstanceOf[js.Any], virtualserverName = virtualserverName.asInstanceOf[js.Any], virtualserverPort = virtualserverPort.asInstanceOf[js.Any], virtualserverQueryclientsonline = virtualserverQueryclientsonline.asInstanceOf[js.Any], virtualserverStatus = virtualserverStatus.asInstanceOf[js.Any], virtualserverUniqueIdentifier = virtualserverUniqueIdentifier.asInstanceOf[js.Any], virtualserverUptime = virtualserverUptime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerEntry]
  }
  
  @scala.inline
  implicit class ServerEntryOps[Self <: ServerEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVirtualserverAutostart(value: Double): Self = this.set("virtualserverAutostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = this.set("virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverId(value: String): Self = this.set("virtualserverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMachineId(value: String): Self = this.set("virtualserverMachineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = this.set("virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverName(value: String): Self = this.set("virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = this.set("virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = this.set("virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = this.set("virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = this.set("virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUptime(value: Double): Self = this.set("virtualserverUptime", value.asInstanceOf[js.Any])
  }
}
