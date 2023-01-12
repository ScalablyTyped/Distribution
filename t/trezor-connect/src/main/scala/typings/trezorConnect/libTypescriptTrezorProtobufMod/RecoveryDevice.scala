package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecoveryDevice extends StObject {
  
  var dry_run: js.UndefOr[Boolean] = js.undefined
  
  var enforce_wordlist: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var passphrase_protection: js.UndefOr[Boolean] = js.undefined
  
  var pin_protection: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[RecoveryDeviceType] = js.undefined
  
  var u2f_counter: js.UndefOr[Double] = js.undefined
  
  var word_count: js.UndefOr[Double] = js.undefined
}
object RecoveryDevice {
  
  inline def apply(): RecoveryDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecoveryDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecoveryDevice] (val x: Self) extends AnyVal {
    
    inline def setDry_run(value: Boolean): Self = StObject.set(x, "dry_run", value.asInstanceOf[js.Any])
    
    inline def setDry_runUndefined: Self = StObject.set(x, "dry_run", js.undefined)
    
    inline def setEnforce_wordlist(value: Boolean): Self = StObject.set(x, "enforce_wordlist", value.asInstanceOf[js.Any])
    
    inline def setEnforce_wordlistUndefined: Self = StObject.set(x, "enforce_wordlist", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPassphrase_protection(value: Boolean): Self = StObject.set(x, "passphrase_protection", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_protectionUndefined: Self = StObject.set(x, "passphrase_protection", js.undefined)
    
    inline def setPin_protection(value: Boolean): Self = StObject.set(x, "pin_protection", value.asInstanceOf[js.Any])
    
    inline def setPin_protectionUndefined: Self = StObject.set(x, "pin_protection", js.undefined)
    
    inline def setType(value: RecoveryDeviceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setU2f_counter(value: Double): Self = StObject.set(x, "u2f_counter", value.asInstanceOf[js.Any])
    
    inline def setU2f_counterUndefined: Self = StObject.set(x, "u2f_counter", js.undefined)
    
    inline def setWord_count(value: Double): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
    
    inline def setWord_countUndefined: Self = StObject.set(x, "word_count", js.undefined)
  }
}
