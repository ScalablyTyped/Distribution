package typings.ts3NodejsLibrary.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ts3-nodejs-library.ts3-nodejs-library/lib/types/ResponseTypes.ServerEntry> */
trait PartialServerEntry extends StObject {
  
  var virtualserverAutostart: js.UndefOr[Double] = js.undefined
  
  var virtualserverClientsonline: js.UndefOr[Double] = js.undefined
  
  var virtualserverId: js.UndefOr[String] = js.undefined
  
  var virtualserverMachineId: js.UndefOr[String] = js.undefined
  
  var virtualserverMaxclients: js.UndefOr[Double] = js.undefined
  
  var virtualserverName: js.UndefOr[String] = js.undefined
  
  var virtualserverPort: js.UndefOr[Double] = js.undefined
  
  var virtualserverQueryclientsonline: js.UndefOr[Double] = js.undefined
  
  var virtualserverStatus: js.UndefOr[String] = js.undefined
  
  var virtualserverUniqueIdentifier: js.UndefOr[String] = js.undefined
  
  var virtualserverUptime: js.UndefOr[Double] = js.undefined
}
object PartialServerEntry {
  
  @scala.inline
  def apply(): PartialServerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerEntry]
  }
  
  @scala.inline
  implicit class PartialServerEntryMutableBuilder[Self <: PartialServerEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVirtualserverAutostart(value: Double): Self = StObject.set(x, "virtualserverAutostart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverAutostartUndefined: Self = StObject.set(x, "virtualserverAutostart", js.undefined)
    
    @scala.inline
    def setVirtualserverClientsonline(value: Double): Self = StObject.set(x, "virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverClientsonlineUndefined: Self = StObject.set(x, "virtualserverClientsonline", js.undefined)
    
    @scala.inline
    def setVirtualserverId(value: String): Self = StObject.set(x, "virtualserverId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverIdUndefined: Self = StObject.set(x, "virtualserverId", js.undefined)
    
    @scala.inline
    def setVirtualserverMachineId(value: String): Self = StObject.set(x, "virtualserverMachineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMachineIdUndefined: Self = StObject.set(x, "virtualserverMachineId", js.undefined)
    
    @scala.inline
    def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverMaxclientsUndefined: Self = StObject.set(x, "virtualserverMaxclients", js.undefined)
    
    @scala.inline
    def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverNameUndefined: Self = StObject.set(x, "virtualserverName", js.undefined)
    
    @scala.inline
    def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverPortUndefined: Self = StObject.set(x, "virtualserverPort", js.undefined)
    
    @scala.inline
    def setVirtualserverQueryclientsonline(value: Double): Self = StObject.set(x, "virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverQueryclientsonlineUndefined: Self = StObject.set(x, "virtualserverQueryclientsonline", js.undefined)
    
    @scala.inline
    def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverStatusUndefined: Self = StObject.set(x, "virtualserverStatus", js.undefined)
    
    @scala.inline
    def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUniqueIdentifierUndefined: Self = StObject.set(x, "virtualserverUniqueIdentifier", js.undefined)
    
    @scala.inline
    def setVirtualserverUptime(value: Double): Self = StObject.set(x, "virtualserverUptime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualserverUptimeUndefined: Self = StObject.set(x, "virtualserverUptime", js.undefined)
  }
}
