package typings.trezorConnect.eventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransportInfo extends StObject {
  
  var bridge: js.UndefOr[BridgeInfo] = js.undefined
  
  var outdated: Boolean
  
  var `type`: String
  
  var udev: js.UndefOr[UdevInfo] = js.undefined
  
  var version: String
}
object TransportInfo {
  
  inline def apply(outdated: Boolean, `type`: String, version: String): TransportInfo = {
    val __obj = js.Dynamic.literal(outdated = outdated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportInfo]
  }
  
  extension [Self <: TransportInfo](x: Self) {
    
    inline def setBridge(value: BridgeInfo): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setOutdated(value: Boolean): Self = StObject.set(x, "outdated", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUdev(value: UdevInfo): Self = StObject.set(x, "udev", value.asInstanceOf[js.Any])
    
    inline def setUdevUndefined: Self = StObject.set(x, "udev", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
