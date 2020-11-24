package typings.ts3NodejsLibrary.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerEntry> */
@js.native
trait PartialServerEntry extends js.Object {
  
  var virtualserverAutostart: js.UndefOr[Double] = js.native
  
  var virtualserverClientsonline: js.UndefOr[Double] = js.native
  
  var virtualserverId: js.UndefOr[String] = js.native
  
  var virtualserverMachineId: js.UndefOr[String] = js.native
  
  var virtualserverMaxclients: js.UndefOr[Double] = js.native
  
  var virtualserverName: js.UndefOr[String] = js.native
  
  var virtualserverPort: js.UndefOr[Double] = js.native
  
  var virtualserverQueryclientsonline: js.UndefOr[Double] = js.native
  
  var virtualserverStatus: js.UndefOr[String] = js.native
  
  var virtualserverUniqueIdentifier: js.UndefOr[String] = js.native
  
  var virtualserverUptime: js.UndefOr[Double] = js.native
}
object PartialServerEntry {
  
  @scala.inline
  def apply(): PartialServerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerEntry]
  }
  
  @scala.inline
  implicit class PartialServerEntryOps[Self <: PartialServerEntry] (val x: Self) extends AnyVal {
    
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
    def deleteVirtualserverAutostart: Self = this.set("virtualserverAutostart", js.undefined)
    
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = this.set("virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverClientsonline: Self = this.set("virtualserverClientsonline", js.undefined)
    
    @scala.inline
    def setVirtualserverId(value: String): Self = this.set("virtualserverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverId: Self = this.set("virtualserverId", js.undefined)
    
    @scala.inline
    def setVirtualserverMachineId(value: String): Self = this.set("virtualserverMachineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMachineId: Self = this.set("virtualserverMachineId", js.undefined)
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = this.set("virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverMaxclients: Self = this.set("virtualserverMaxclients", js.undefined)
    
    @scala.inline
    def setVirtualserverName(value: String): Self = this.set("virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverName: Self = this.set("virtualserverName", js.undefined)
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = this.set("virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverPort: Self = this.set("virtualserverPort", js.undefined)
    
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = this.set("virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverQueryclientsonline: Self = this.set("virtualserverQueryclientsonline", js.undefined)
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = this.set("virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverStatus: Self = this.set("virtualserverStatus", js.undefined)
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = this.set("virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverUniqueIdentifier: Self = this.set("virtualserverUniqueIdentifier", js.undefined)
    
    @scala.inline
    def setVirtualserverUptime(value: Double): Self = this.set("virtualserverUptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualserverUptime: Self = this.set("virtualserverUptime", js.undefined)
  }
}
