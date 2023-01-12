package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetDevice extends StObject {
  
  var backup_type: js.UndefOr[String | Double] = js.undefined
  
  var display_random: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var no_backup: js.UndefOr[Boolean] = js.undefined
  
  var passphrase_protection: js.UndefOr[Boolean] = js.undefined
  
  var pin_protection: js.UndefOr[Boolean] = js.undefined
  
  var skip_backup: js.UndefOr[Boolean] = js.undefined
  
  var strength: js.UndefOr[Double] = js.undefined
  
  var u2f_counter: js.UndefOr[Double] = js.undefined
}
object ResetDevice {
  
  inline def apply(): ResetDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetDevice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResetDevice] (val x: Self) extends AnyVal {
    
    inline def setBackup_type(value: String | Double): Self = StObject.set(x, "backup_type", value.asInstanceOf[js.Any])
    
    inline def setBackup_typeUndefined: Self = StObject.set(x, "backup_type", js.undefined)
    
    inline def setDisplay_random(value: Boolean): Self = StObject.set(x, "display_random", value.asInstanceOf[js.Any])
    
    inline def setDisplay_randomUndefined: Self = StObject.set(x, "display_random", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setNo_backup(value: Boolean): Self = StObject.set(x, "no_backup", value.asInstanceOf[js.Any])
    
    inline def setNo_backupUndefined: Self = StObject.set(x, "no_backup", js.undefined)
    
    inline def setPassphrase_protection(value: Boolean): Self = StObject.set(x, "passphrase_protection", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_protectionUndefined: Self = StObject.set(x, "passphrase_protection", js.undefined)
    
    inline def setPin_protection(value: Boolean): Self = StObject.set(x, "pin_protection", value.asInstanceOf[js.Any])
    
    inline def setPin_protectionUndefined: Self = StObject.set(x, "pin_protection", js.undefined)
    
    inline def setSkip_backup(value: Boolean): Self = StObject.set(x, "skip_backup", value.asInstanceOf[js.Any])
    
    inline def setSkip_backupUndefined: Self = StObject.set(x, "skip_backup", js.undefined)
    
    inline def setStrength(value: Double): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setU2f_counter(value: Double): Self = StObject.set(x, "u2f_counter", value.asInstanceOf[js.Any])
    
    inline def setU2f_counterUndefined: Self = StObject.set(x, "u2f_counter", js.undefined)
  }
}
