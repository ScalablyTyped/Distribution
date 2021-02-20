package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResetDeviceParams extends CommonParams {
  
  var label: js.UndefOr[String] = js.native
  
  var noBackup: js.UndefOr[Boolean] = js.native
  
  var passphraseProtection: js.UndefOr[Boolean] = js.native
  
  var pinProtection: js.UndefOr[Boolean] = js.native
  
  var skipBackup: js.UndefOr[Boolean] = js.native
  
  var strength: js.UndefOr[Double] = js.native
  
  var u2fCounter: js.UndefOr[Double] = js.native
}
object ResetDeviceParams {
  
  @scala.inline
  def apply(): ResetDeviceParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDeviceParams]
  }
  
  @scala.inline
  implicit class ResetDeviceParamsMutableBuilder[Self <: ResetDeviceParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    @scala.inline
    def setNoBackup(value: Boolean): Self = StObject.set(x, "noBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBackupUndefined: Self = StObject.set(x, "noBackup", js.undefined)
    
    @scala.inline
    def setPassphraseProtection(value: Boolean): Self = StObject.set(x, "passphraseProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassphraseProtectionUndefined: Self = StObject.set(x, "passphraseProtection", js.undefined)
    
    @scala.inline
    def setPinProtection(value: Boolean): Self = StObject.set(x, "pinProtection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinProtectionUndefined: Self = StObject.set(x, "pinProtection", js.undefined)
    
    @scala.inline
    def setSkipBackup(value: Boolean): Self = StObject.set(x, "skipBackup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipBackupUndefined: Self = StObject.set(x, "skipBackup", js.undefined)
    
    @scala.inline
    def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    @scala.inline
    def setU2fCounter(value: Double): Self = StObject.set(x, "u2fCounter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setU2fCounterUndefined: Self = StObject.set(x, "u2fCounter", js.undefined)
  }
}
