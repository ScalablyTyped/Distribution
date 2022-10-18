package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplySettings extends StObject {
  
  var _passphrase_source: js.UndefOr[Double] = js.undefined
  
  var auto_lock_delay_ms: js.UndefOr[Double] = js.undefined
  
  var display_rotation: js.UndefOr[Double] = js.undefined
  
  var experimental_features: js.UndefOr[Boolean] = js.undefined
  
  var homescreen: js.UndefOr[String] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var passphrase_always_on_device: js.UndefOr[Boolean] = js.undefined
  
  var safety_checks: js.UndefOr[SafetyCheckLevel] = js.undefined
  
  var use_passphrase: js.UndefOr[Boolean] = js.undefined
}
object ApplySettings {
  
  inline def apply(): ApplySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplySettings]
  }
  
  extension [Self <: ApplySettings](x: Self) {
    
    inline def setAuto_lock_delay_ms(value: Double): Self = StObject.set(x, "auto_lock_delay_ms", value.asInstanceOf[js.Any])
    
    inline def setAuto_lock_delay_msUndefined: Self = StObject.set(x, "auto_lock_delay_ms", js.undefined)
    
    inline def setDisplay_rotation(value: Double): Self = StObject.set(x, "display_rotation", value.asInstanceOf[js.Any])
    
    inline def setDisplay_rotationUndefined: Self = StObject.set(x, "display_rotation", js.undefined)
    
    inline def setExperimental_features(value: Boolean): Self = StObject.set(x, "experimental_features", value.asInstanceOf[js.Any])
    
    inline def setExperimental_featuresUndefined: Self = StObject.set(x, "experimental_features", js.undefined)
    
    inline def setHomescreen(value: String): Self = StObject.set(x, "homescreen", value.asInstanceOf[js.Any])
    
    inline def setHomescreenUndefined: Self = StObject.set(x, "homescreen", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPassphrase_always_on_device(value: Boolean): Self = StObject.set(x, "passphrase_always_on_device", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_always_on_deviceUndefined: Self = StObject.set(x, "passphrase_always_on_device", js.undefined)
    
    inline def setSafety_checks(value: SafetyCheckLevel): Self = StObject.set(x, "safety_checks", value.asInstanceOf[js.Any])
    
    inline def setSafety_checksUndefined: Self = StObject.set(x, "safety_checks", js.undefined)
    
    inline def setUse_passphrase(value: Boolean): Self = StObject.set(x, "use_passphrase", value.asInstanceOf[js.Any])
    
    inline def setUse_passphraseUndefined: Self = StObject.set(x, "use_passphrase", js.undefined)
    
    inline def set_passphrase_source(value: Double): Self = StObject.set(x, "_passphrase_source", value.asInstanceOf[js.Any])
    
    inline def set_passphrase_sourceUndefined: Self = StObject.set(x, "_passphrase_source", js.undefined)
  }
}
