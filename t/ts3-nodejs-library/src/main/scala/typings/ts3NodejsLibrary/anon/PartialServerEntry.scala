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
  
  inline def apply(): PartialServerEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialServerEntry]
  }
  
  extension [Self <: PartialServerEntry](x: Self) {
    
    inline def setVirtualserverAutostart(value: Double): Self = StObject.set(x, "virtualserverAutostart", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverAutostartUndefined: Self = StObject.set(x, "virtualserverAutostart", js.undefined)
    
    inline def setVirtualserverClientsonline(value: Double): Self = StObject.set(x, "virtualserverClientsonline", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverClientsonlineUndefined: Self = StObject.set(x, "virtualserverClientsonline", js.undefined)
    
    inline def setVirtualserverId(value: String): Self = StObject.set(x, "virtualserverId", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverIdUndefined: Self = StObject.set(x, "virtualserverId", js.undefined)
    
    inline def setVirtualserverMachineId(value: String): Self = StObject.set(x, "virtualserverMachineId", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverMachineIdUndefined: Self = StObject.set(x, "virtualserverMachineId", js.undefined)
    
    inline def setVirtualserverMaxclients(value: Double): Self = StObject.set(x, "virtualserverMaxclients", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverMaxclientsUndefined: Self = StObject.set(x, "virtualserverMaxclients", js.undefined)
    
    inline def setVirtualserverName(value: String): Self = StObject.set(x, "virtualserverName", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverNameUndefined: Self = StObject.set(x, "virtualserverName", js.undefined)
    
    inline def setVirtualserverPort(value: Double): Self = StObject.set(x, "virtualserverPort", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverPortUndefined: Self = StObject.set(x, "virtualserverPort", js.undefined)
    
    inline def setVirtualserverQueryclientsonline(value: Double): Self = StObject.set(x, "virtualserverQueryclientsonline", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverQueryclientsonlineUndefined: Self = StObject.set(x, "virtualserverQueryclientsonline", js.undefined)
    
    inline def setVirtualserverStatus(value: String): Self = StObject.set(x, "virtualserverStatus", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverStatusUndefined: Self = StObject.set(x, "virtualserverStatus", js.undefined)
    
    inline def setVirtualserverUniqueIdentifier(value: String): Self = StObject.set(x, "virtualserverUniqueIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverUniqueIdentifierUndefined: Self = StObject.set(x, "virtualserverUniqueIdentifier", js.undefined)
    
    inline def setVirtualserverUptime(value: Double): Self = StObject.set(x, "virtualserverUptime", value.asInstanceOf[js.Any])
    
    inline def setVirtualserverUptimeUndefined: Self = StObject.set(x, "virtualserverUptime", js.undefined)
  }
}
