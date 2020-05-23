package typings.trezorConnect.mod

import typings.trezorConnect.trezorConnectBooleans.`false`
import typings.trezorConnect.trezorConnectBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
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
  @scala.inline
  def apply(
    bootloader_hash: String,
    device_id: String,
    flags: Double,
    fw_major: Double,
    fw_minor: Double,
    fw_patch: Double,
    fw_vendor: String,
    fw_vendor_keys: String,
    imported: Boolean,
    initialized: `true`,
    major_version: Double,
    minor_version: Double,
    model: String,
    needs_backup: `false`,
    no_backup: Boolean,
    passphrase_cached: Boolean,
    passphrase_protection: Boolean,
    patch_version: Double,
    pin_cached: Boolean,
    pin_protection: Boolean,
    revision: String,
    unfinished_backup: Boolean,
    vendor: String,
    bootloader_mode: Boolean = null.asInstanceOf[Boolean],
    firmware_present: Boolean = null.asInstanceOf[Boolean],
    label: String = null,
    language: String = null
  ): Features = {
    val __obj = js.Dynamic.literal(bootloader_hash = bootloader_hash.asInstanceOf[js.Any], device_id = device_id.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], fw_major = fw_major.asInstanceOf[js.Any], fw_minor = fw_minor.asInstanceOf[js.Any], fw_patch = fw_patch.asInstanceOf[js.Any], fw_vendor = fw_vendor.asInstanceOf[js.Any], fw_vendor_keys = fw_vendor_keys.asInstanceOf[js.Any], imported = imported.asInstanceOf[js.Any], initialized = initialized.asInstanceOf[js.Any], major_version = major_version.asInstanceOf[js.Any], minor_version = minor_version.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], needs_backup = needs_backup.asInstanceOf[js.Any], no_backup = no_backup.asInstanceOf[js.Any], passphrase_cached = passphrase_cached.asInstanceOf[js.Any], passphrase_protection = passphrase_protection.asInstanceOf[js.Any], patch_version = patch_version.asInstanceOf[js.Any], pin_cached = pin_cached.asInstanceOf[js.Any], pin_protection = pin_protection.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], unfinished_backup = unfinished_backup.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any], bootloader_mode = bootloader_mode.asInstanceOf[js.Any], firmware_present = firmware_present.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[Features]
  }
}

