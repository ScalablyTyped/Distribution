package typings.trezorConnect.anon

import typings.trezorConnect.eventsMod.BridgeInfo
import typings.trezorConnect.eventsMod.UdevInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  var bridge: js.UndefOr[BridgeInfo] = js.undefined
  
  var error: String
  
  var udev: js.UndefOr[UdevInfo] = js.undefined
}
object Bridge {
  
  inline def apply(error: String): Bridge = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  extension [Self <: Bridge](x: Self) {
    
    inline def setBridge(value: BridgeInfo): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setUdev(value: UdevInfo): Self = StObject.set(x, "udev", value.asInstanceOf[js.Any])
    
    inline def setUdevUndefined: Self = StObject.set(x, "udev", js.undefined)
  }
}
