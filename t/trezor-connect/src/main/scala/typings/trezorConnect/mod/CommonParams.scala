package typings.trezorConnect.mod

import typings.trezorConnect.anon.Instance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonParams extends StObject {
  
  var allowSeedlessDevice: js.UndefOr[Boolean] = js.undefined
  
  var device: js.UndefOr[Instance] = js.undefined
  
  var keepSession: js.UndefOr[Boolean] = js.undefined
  
  var useEmptyPassphrase: js.UndefOr[Boolean] = js.undefined
}
object CommonParams {
  
  inline def apply(): CommonParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonParams]
  }
  
  extension [Self <: CommonParams](x: Self) {
    
    inline def setAllowSeedlessDevice(value: Boolean): Self = StObject.set(x, "allowSeedlessDevice", value.asInstanceOf[js.Any])
    
    inline def setAllowSeedlessDeviceUndefined: Self = StObject.set(x, "allowSeedlessDevice", js.undefined)
    
    inline def setDevice(value: Instance): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setKeepSession(value: Boolean): Self = StObject.set(x, "keepSession", value.asInstanceOf[js.Any])
    
    inline def setKeepSessionUndefined: Self = StObject.set(x, "keepSession", js.undefined)
    
    inline def setUseEmptyPassphrase(value: Boolean): Self = StObject.set(x, "useEmptyPassphrase", value.asInstanceOf[js.Any])
    
    inline def setUseEmptyPassphraseUndefined: Self = StObject.set(x, "useEmptyPassphrase", js.undefined)
  }
}
