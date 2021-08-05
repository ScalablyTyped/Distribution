package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDeviceParams
  extends StObject
     with CommonParams {
  
  var label: js.UndefOr[String] = js.undefined
  
  var noBackup: js.UndefOr[Boolean] = js.undefined
  
  var passphraseProtection: js.UndefOr[Boolean] = js.undefined
  
  var pinProtection: js.UndefOr[Boolean] = js.undefined
  
  var skipBackup: js.UndefOr[Boolean] = js.undefined
  
  var strength: js.UndefOr[Double] = js.undefined
  
  var u2fCounter: js.UndefOr[Double] = js.undefined
}
object ResetDeviceParams {
  
  inline def apply(): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeviceParams]
  }
  
  extension [Self <: ResetDeviceParams](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setNoBackup(value: Boolean): Self = StObject.set(x, "noBackup", value.asInstanceOf[js.Any])
    
    inline def setNoBackupUndefined: Self = StObject.set(x, "noBackup", js.undefined)
    
    inline def setPassphraseProtection(value: Boolean): Self = StObject.set(x, "passphraseProtection", value.asInstanceOf[js.Any])
    
    inline def setPassphraseProtectionUndefined: Self = StObject.set(x, "passphraseProtection", js.undefined)
    
    inline def setPinProtection(value: Boolean): Self = StObject.set(x, "pinProtection", value.asInstanceOf[js.Any])
    
    inline def setPinProtectionUndefined: Self = StObject.set(x, "pinProtection", js.undefined)
    
    inline def setSkipBackup(value: Boolean): Self = StObject.set(x, "skipBackup", value.asInstanceOf[js.Any])
    
    inline def setSkipBackupUndefined: Self = StObject.set(x, "skipBackup", js.undefined)
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setU2fCounter(value: Double): Self = StObject.set(x, "u2fCounter", value.asInstanceOf[js.Any])
    
    inline def setU2fCounterUndefined: Self = StObject.set(x, "u2fCounter", js.undefined)
  }
}
