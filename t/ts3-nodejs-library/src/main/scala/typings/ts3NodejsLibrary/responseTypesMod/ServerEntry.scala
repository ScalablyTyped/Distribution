package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import org.scalablytyped.runtime.StObject
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
  implicit class ServerEntryMutableBuilder[Self <: ServerEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualserverAutostart(value: Double): Self = StObject.set(x, "virtualserverAutostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = StObject.set(x, "virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverId(value: String): Self = StObject.set(x, "virtualserverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMachineId(value: String): Self = StObject.set(x, "virtualserverMachineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = StObject.set(x, "virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUptime(value: Double): Self = StObject.set(x, "virtualserverUptime", value.asInstanceOf[js.Any])
  }
}
