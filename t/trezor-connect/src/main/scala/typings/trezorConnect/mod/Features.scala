package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import typings.trezorConnect.trezorConnectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Features extends StObject {
  
  var bootloader_hash: String
  
  var bootloader_mode: Boolean | Null
  
  var device_id: String
  
  var firmware_present: Boolean | Null
  
  var flags: Double
  
  var fw_major: Double
  
  var fw_minor: Double
  
  var fw_patch: Double
  
  var fw_vendor: String
  
  var fw_vendor_keys: String
  
  var imported: Boolean
  
  var initialized: `true`
  
  var label: String | Null
  
  var language: String | Null
  
  var major_version: Double
  
  var minor_version: Double
  
  var model: String
  
  var needs_backup: `false`
  
  var no_backup: Boolean
  
  var passphrase_cached: Boolean
  
  var passphrase_protection: Boolean
  
  var patch_version: Double
  
  var pin_cached: Boolean
  
  var pin_protection: Boolean
  
  var revision: String
  
  var unfinished_backup: Boolean
  
  var vendor: String
}
object Features {
  
  inline def apply(
    bootloader_hash: String,
    device_id: String,
    flags: Double,
    fw_major: Double,
    fw_minor: Double,
    fw_patch: Double,
    fw_vendor: String,
    fw_vendor_keys: String,
    imported: Boolean,
    major_version: Double,
    minor_version: Double,
    model: String,
    no_backup: Boolean,
    passphrase_cached: Boolean,
    passphrase_protection: Boolean,
    patch_version: Double,
    pin_cached: Boolean,
    pin_protection: Boolean,
    revision: String,
    unfinished_backup: Boolean,
    vendor: String
  ): Features = {
    val __obj = js.Dynamic.literal(bootloader_hash = bootloader_hash.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fw_major = fw_major.asInstanceOf[js.Any], fw_minor = fw_minor.asInstanceOf[js.Any], fw_patch = fw_patch.asInstanceOf[js.Any], fw_vendor = fw_vendor.asInstanceOf[js.Any], fw_vendor_keys = fw_vendor_keys.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], initialized = true, major_version = major_version.asInstanceOf[js.Any], minor_version = minor_version.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], needs_backup = false, no_backup = no_backup.asInstanceOf[js.Any], passphrase_cached = passphrase_cached.asInstanceOf[js.Any], passphrase_protection = passphrase_protection.asInstanceOf[js.Any], patch_version = patch_version.asInstanceOf[js.Any], pin_cached = pin_cached.asInstanceOf[js.Any], pin_protection = pin_protection.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], unfinished_backup = unfinished_backup.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], bootloader_mode = null, firmware_present = null, label = null, language = null)
    __obj.asInstanceOf[Features]
  }
  
  extension [Self <: Features](x: Self) {
    
    inline def setBootloader_hash(value: String): Self = StObject.set(x, "bootloader_hash", value.asInstanceOf[js.Any])
    
    inline def setBootloader_mode(value: Boolean): Self = StObject.set(x, "bootloader_mode", value.asInstanceOf[js.Any])
    
    inline def setBootloader_modeNull: Self = StObject.set(x, "bootloader_mode", null)
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setFirmware_present(value: Boolean): Self = StObject.set(x, "firmware_present", value.asInstanceOf[js.Any])
    
    inline def setFirmware_presentNull: Self = StObject.set(x, "firmware_present", null)
    
    inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFw_major(value: Double): Self = StObject.set(x, "fw_major", value.asInstanceOf[js.Any])
    
    inline def setFw_minor(value: Double): Self = StObject.set(x, "fw_minor", value.asInstanceOf[js.Any])
    
    inline def setFw_patch(value: Double): Self = StObject.set(x, "fw_patch", value.asInstanceOf[js.Any])
    
    inline def setFw_vendor(value: String): Self = StObject.set(x, "fw_vendor", value.asInstanceOf[js.Any])
    
    inline def setFw_vendor_keys(value: String): Self = StObject.set(x, "fw_vendor_keys", value.asInstanceOf[js.Any])
    
    inline def setImported(value: Boolean): Self = StObject.set(x, "imported", value.asInstanceOf[js.Any])
    
    inline def setInitialized(value: `true`): Self = StObject.set(x, "initialized", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
    
    inline def setMajor_version(value: Double): Self = StObject.set(x, "major_version", value.asInstanceOf[js.Any])
    
    inline def setMinor_version(value: Double): Self = StObject.set(x, "minor_version", value.asInstanceOf[js.Any])
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setNeeds_backup(value: `false`): Self = StObject.set(x, "needs_backup", value.asInstanceOf[js.Any])
    
    inline def setNo_backup(value: Boolean): Self = StObject.set(x, "no_backup", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_cached(value: Boolean): Self = StObject.set(x, "passphrase_cached", value.asInstanceOf[js.Any])
    
    inline def setPassphrase_protection(value: Boolean): Self = StObject.set(x, "passphrase_protection", value.asInstanceOf[js.Any])
    
    inline def setPatch_version(value: Double): Self = StObject.set(x, "patch_version", value.asInstanceOf[js.Any])
    
    inline def setPin_cached(value: Boolean): Self = StObject.set(x, "pin_cached", value.asInstanceOf[js.Any])
    
    inline def setPin_protection(value: Boolean): Self = StObject.set(x, "pin_protection", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setUnfinished_backup(value: Boolean): Self = StObject.set(x, "unfinished_backup", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
