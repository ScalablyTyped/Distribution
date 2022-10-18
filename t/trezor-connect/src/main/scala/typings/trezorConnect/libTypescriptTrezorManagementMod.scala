package typings.trezorConnect

import typings.trezorConnect.trezorConnectInts.`0`
import typings.trezorConnect.trezorConnectInts.`12`
import typings.trezorConnect.trezorConnectInts.`18`
import typings.trezorConnect.trezorConnectInts.`1`
import typings.trezorConnect.trezorConnectInts.`24`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTrezorManagementMod {
  
  trait ApplyFlags extends StObject {
    
    var flags: Double
  }
  object ApplyFlags {
    
    inline def apply(flags: Double): ApplyFlags = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyFlags]
    }
    
    extension [Self <: ApplyFlags](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangePin extends StObject {
    
    var remove: js.UndefOr[Boolean] = js.undefined
  }
  object ChangePin {
    
    inline def apply(): ChangePin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangePin]
    }
    
    extension [Self <: ChangePin](x: Self) {
      
      inline def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    }
  }
  
  trait FirmwareUpdate extends StObject {
    
    var baseUrl: js.UndefOr[String] = js.undefined
    
    var btcOnly: js.UndefOr[Boolean] = js.undefined
    
    var intermediary: js.UndefOr[Boolean] = js.undefined
    
    var version: js.Array[Double]
  }
  object FirmwareUpdate {
    
    inline def apply(version: js.Array[Double]): FirmwareUpdate = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirmwareUpdate]
    }
    
    extension [Self <: FirmwareUpdate](x: Self) {
      
      inline def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      inline def setBaseUrlUndefined: Self = StObject.set(x, "baseUrl", js.undefined)
      
      inline def setBtcOnly(value: Boolean): Self = StObject.set(x, "btcOnly", value.asInstanceOf[js.Any])
      
      inline def setBtcOnlyUndefined: Self = StObject.set(x, "btcOnly", js.undefined)
      
      inline def setIntermediary(value: Boolean): Self = StObject.set(x, "intermediary", value.asInstanceOf[js.Any])
      
      inline def setIntermediaryUndefined: Self = StObject.set(x, "intermediary", js.undefined)
      
      inline def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value*))
    }
  }
  
  trait FirmwareUpdateBinary extends StObject {
    
    var binary: js.typedarray.ArrayBuffer
  }
  object FirmwareUpdateBinary {
    
    inline def apply(binary: js.typedarray.ArrayBuffer): FirmwareUpdateBinary = {
      val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirmwareUpdateBinary]
    }
    
    extension [Self <: FirmwareUpdateBinary](x: Self) {
      
      inline def setBinary(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    }
  }
  
  trait RecoveryDevice extends StObject {
    
    var dry_run: js.UndefOr[Boolean] = js.undefined
    
    var enforce_wordlist: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var passphrase_protection: js.UndefOr[Boolean] = js.undefined
    
    var pin_protection: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[`0` | `1`] = js.undefined
    
    var u2f_counter: js.UndefOr[Double] = js.undefined
    
    var word_count: js.UndefOr[`12` | `18` | `24`] = js.undefined
  }
  object RecoveryDevice {
    
    inline def apply(): RecoveryDevice = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecoveryDevice]
    }
    
    extension [Self <: RecoveryDevice](x: Self) {
      
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
      
      inline def setType(value: `0` | `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setU2f_counter(value: Double): Self = StObject.set(x, "u2f_counter", value.asInstanceOf[js.Any])
      
      inline def setU2f_counterUndefined: Self = StObject.set(x, "u2f_counter", js.undefined)
      
      inline def setWord_count(value: `12` | `18` | `24`): Self = StObject.set(x, "word_count", value.asInstanceOf[js.Any])
      
      inline def setWord_countUndefined: Self = StObject.set(x, "word_count", js.undefined)
    }
  }
  
  trait ResetDevice extends StObject {
    
    var backup_type: js.UndefOr[`0` | `1`] = js.undefined
    
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
    
    extension [Self <: ResetDevice](x: Self) {
      
      inline def setBackup_type(value: `0` | `1`): Self = StObject.set(x, "backup_type", value.asInstanceOf[js.Any])
      
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
}
