package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var _passphrase_cached: js.UndefOr[Boolean] = js.undefined
  
  var auto_lock_delay_ms: Double | Null
  
  var backup_type: BackupType | Null
  
  var bootloader_hash: String | Null
  
  var bootloader_mode: Boolean | Null
  
  var capabilities: js.Array[Capability]
  
  var device_id: String | Null
  
  var display_rotation: Double | Null
  
  var experimental_features: Boolean | Null
  
  var firmware_present: Boolean | Null
  
  var flags: Double | Null
  
  var fw_major: Double | Null
  
  var fw_minor: Double | Null
  
  var fw_patch: Double | Null
  
  var fw_vendor: String | Null
  
  var imported: Boolean | Null
  
  var initialized: Boolean | Null
  
  var label: String | Null
  
  var language: String | Null
  
  var major_version: Double
  
  var minor_version: Double
  
  var model: String
  
  var needs_backup: Boolean | Null
  
  var no_backup: Boolean | Null
  
  var passphrase_always_on_device: Boolean | Null
  
  var passphrase_protection: Boolean | Null
  
  var patch_version: Double
  
  var pin_protection: Boolean | Null
  
  var recovery_mode: Boolean | Null
  
  var revision: String | Null
  
  var safety_checks: SafetyCheckLevel | Null
  
  var sd_card_present: Boolean | Null
  
  var sd_protection: Boolean | Null
  
  var session_id: String | Null
  
  var unfinished_backup: Boolean | Null
  
  var unlocked: Boolean | Null
  
  var vendor: String
  
  var wipe_code_protection: Boolean | Null
}
object Features {
  
  inline def apply(
    capabilities: js.Array[Capability],
    major_version: Double,
    minor_version: Double,
    model: String,
    patch_version: Double,
    vendor: String
  ): Features = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any], major_version = major_version.asInstanceOf[js.Any], minor_version = minor_version.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], patch_version = patch_version.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], auto_lock_delay_ms = null, backup_type = null, bootloader_hash = null, bootloader_mode = null, device_id = null, display_rotation = null, experimental_features = null, firmware_present = null, flags = null, fw_major = null, fw_minor = null, fw_patch = null, fw_vendor = null, imported = null, initialized = null, label = null, language = null, needs_backup = null, no_backup = null, passphrase_always_on_device = null, passphrase_protection = null, pin_protection = null, recovery_mode = null, revision = null, safety_checks = null, sd_card_present = null, sd_protection = null, session_id = null, unfinished_backup = null, unlocked = null, wipe_code_protection = null)
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setAuto_lock_delay_ms(value: Double): Self = StObject.set(x, "auto_lock_delay_ms", value.asInstanceOf[js.Any])
    
    inline def setAuto_lock_delay_msNull: Self = StObject.set(x, "auto_lock_delay_ms", null)
    
    inline def setBackup_type(value: BackupType): Self = StObject.set(x, "backup_type", value.asInstanceOf[js.Any])
    
    inline def setBackup_typeNull: Self = StObject.set(x, "backup_type", null)
    
    inline def setBootloader_hash(value: String): Self = StObject.set(x, "bootloader_hash", value.asInstanceOf[js.Any])
    
    inline def setBootloader_hashNull: Self = StObject.set(x, "bootloader_hash", null)
    
    inline def setBootloader_mode(value: Boolean): Self = StObject.set(x, "bootloader_mode", value.asInstanceOf[js.Any])
    
    inline def setBootloader_modeNull: Self = StObject.set(x, "bootloader_mode", null)
    
    inline def setCapabilities(value: js.Array[Capability]): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesVarargs(value: Capability*): Self = StObject.set(x, "capabilities", js.Array(value*))
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setDevice_idNull: Self = StObject.set(x, "device_id", null)
    
    inline def setDisplay_rotation(value: Double): Self = StObject.set(x, "display_rotation", value.asInstanceOf[js.Any])
    
    inline def setDisplay_rotationNull: Self = StObject.set(x, "display_rotation", null)
    
    inline def setExperimental_features(value: Boolean): Self = StObject.set(x, "experimental_features", value.asInstanceOf[js.Any])
    
    inline def setExperimental_featuresNull: Self = StObject.set(x, "experimental_features", null)
    
    inline def setFirmware_present(value: Boolean): Self = StObject.set(x, "firmware_present", value.asInstanceOf[js.Any])
    
    inline def setFirmware_presentNull: Self = StObject.set(x, "firmware_present", null)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsNull: Self = StObject.set(x, "flags", null)
    
    inline def setFw_major(value: Double): Self = StObject.set(x, "fw_major", value.asInstanceOf[js.Any])
    
    inline def setFw_majorNull: Self = StObject.set(x, "fw_major", null)
    
    inline def setFw_minor(value: Double): Self = StObject.set(x, "fw_minor", value.asInstanceOf[js.Any])
    
    inline def setFw_minorNull: Self = StObject.set(x, "fw_minor", null)
    
    inline def setFw_patch(value: Double): Self = StObject.set(x, "fw_patch", value.asInstanceOf[js.Any])
    
    inline def setFw_patchNull: Self = StObject.set(x, "fw_patch", null)
    
    inline def setFw_vendor(value: String): Self = StObject.set(x, "fw_vendor", value.asInstanceOf[js.Any])
    
    inline def setFw_vendorNull: Self = StObject.set(x, "fw_vendor", null)
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setImportedNull: Self = StObject.set(x, "imported", null)
    
    inline def setInitialized(value: Boolean): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setInitializedNull: Self = StObject.set(x, "initialized", null)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setMajor_version(value: Double): Self = StObject.set(x, "major_version", value.asInstanceOf[js.Any])
    
    inline def setMinor_version(value: Double): Self = StObject.set(x, "minor_version", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setNeeds_backup(value: Boolean): Self = StObject.set(x, "needs_backup", value.asInstanceOf[js.Any])
    
    inline def setNeeds_backupNull: Self = StObject.set(x, "needs_backup", null)
    
    inline def setNo_backup(value: Boolean): Self = StObject.set(x, "no_backup", value.asInstanceOf[js.Any])
    
    inline def setNo_backupNull: Self = StObject.set(x, "no_backup", null)
    
    inline def setPassphrase_always_on_device(value: Boolean): Self = StObject.set(x, "passphrase_always_on_device", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_always_on_deviceNull: Self = StObject.set(x, "passphrase_always_on_device", null)
    
    inline def setPassphrase_protection(value: Boolean): Self = StObject.set(x, "passphrase_protection", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_protectionNull: Self = StObject.set(x, "passphrase_protection", null)
    
    inline def setPatch_version(value: Double): Self = StObject.set(x, "patch_version", value.asInstanceOf[js.Any])
    
    inline def setPin_protection(value: Boolean): Self = StObject.set(x, "pin_protection", value.asInstanceOf[js.Any])
    
    inline def setPin_protectionNull: Self = StObject.set(x, "pin_protection", null)
    
    inline def setRecovery_mode(value: Boolean): Self = StObject.set(x, "recovery_mode", value.asInstanceOf[js.Any])
    
    inline def setRecovery_modeNull: Self = StObject.set(x, "recovery_mode", null)
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionNull: Self = StObject.set(x, "revision", null)
    
    inline def setSafety_checks(value: SafetyCheckLevel): Self = StObject.set(x, "safety_checks", value.asInstanceOf[js.Any])
    
    inline def setSafety_checksNull: Self = StObject.set(x, "safety_checks", null)
    
    inline def setSd_card_present(value: Boolean): Self = StObject.set(x, "sd_card_present", value.asInstanceOf[js.Any])
    
    inline def setSd_card_presentNull: Self = StObject.set(x, "sd_card_present", null)
    
    inline def setSd_protection(value: Boolean): Self = StObject.set(x, "sd_protection", value.asInstanceOf[js.Any])
    
    inline def setSd_protectionNull: Self = StObject.set(x, "sd_protection", null)
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    inline def setSession_idNull: Self = StObject.set(x, "session_id", null)
    
    inline def setUnfinished_backup(value: Boolean): Self = StObject.set(x, "unfinished_backup", value.asInstanceOf[js.Any])
    
    inline def setUnfinished_backupNull: Self = StObject.set(x, "unfinished_backup", null)
    
    inline def setUnlocked(value: Boolean): Self = StObject.set(x, "unlocked", value.asInstanceOf[js.Any])
    
    inline def setUnlockedNull: Self = StObject.set(x, "unlocked", null)
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setWipe_code_protection(value: Boolean): Self = StObject.set(x, "wipe_code_protection", value.asInstanceOf[js.Any])
    
    inline def setWipe_code_protectionNull: Self = StObject.set(x, "wipe_code_protection", null)
    
    inline def set_passphrase_cached(value: Boolean): Self = StObject.set(x, "_passphrase_cached", value.asInstanceOf[js.Any])
    
    inline def set_passphrase_cachedUndefined: Self = StObject.set(x, "_passphrase_cached", js.undefined)
  }
}
