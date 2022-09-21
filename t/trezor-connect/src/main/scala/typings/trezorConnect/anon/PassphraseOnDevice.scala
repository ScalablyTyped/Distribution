package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassphraseOnDevice extends StObject {
  
  var passphraseOnDevice: js.UndefOr[Boolean] = js.undefined
  
  var save: Boolean
  
  var value: String
}
object PassphraseOnDevice {
  
  inline def apply(save: Boolean, value: String): PassphraseOnDevice = {
    val __obj = js.Dynamic.literal(save = save.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PassphraseOnDevice]
  }
  
  extension [Self <: PassphraseOnDevice](x: Self) {
    
    inline def setPassphraseOnDevice(value: Boolean): Self = StObject.set(x, "passphraseOnDevice", value.asInstanceOf[js.Any])
    
    inline def setPassphraseOnDeviceUndefined: Self = StObject.set(x, "passphraseOnDevice", js.undefined)
    
    inline def setSave(value: Boolean): Self = StObject.set(x, "save", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
