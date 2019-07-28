package typings.trezorDashConnect.trezorDashConnectMod

import typings.trezorDashConnect.trezorDashConnectNumbers.`false`
import typings.trezorDashConnect.trezorDashConnectNumbers.`true`
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
    bootloader_mode: js.UndefOr[Boolean] = js.undefined,
    firmware_present: js.UndefOr[Boolean] = js.undefined,
    label: String = null,
    language: String = null
  ): Features = {
    val __obj = js.Dynamic.literal(bootloader_hash = bootloader_hash, device_id = device_id, flags = flags, fw_major = fw_major, fw_minor = fw_minor, fw_patch = fw_patch, fw_vendor = fw_vendor, fw_vendor_keys = fw_vendor_keys, imported = imported, initialized = initialized, major_version = major_version, minor_version = minor_version, model = model, needs_backup = needs_backup, no_backup = no_backup, passphrase_cached = passphrase_cached, passphrase_protection = passphrase_protection, patch_version = patch_version, pin_cached = pin_cached, pin_protection = pin_protection, revision = revision, unfinished_backup = unfinished_backup, vendor = vendor)
    if (!js.isUndefined(bootloader_mode)) __obj.updateDynamic("bootloader_mode")(bootloader_mode)
    if (!js.isUndefined(firmware_present)) __obj.updateDynamic("firmware_present")(firmware_present)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Features]
  }
}

