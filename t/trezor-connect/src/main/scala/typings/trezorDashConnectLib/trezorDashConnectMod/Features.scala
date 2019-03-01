package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Features extends js.Object {
  var bootloader_hash: java.lang.String
  var bootloader_mode: scala.Boolean | scala.Null
  var device_id: java.lang.String
  var firmware_present: scala.Boolean | scala.Null
  var flags: scala.Double
  var fw_major: scala.Double
  var fw_minor: scala.Double
  var fw_patch: scala.Double
  var fw_vendor: java.lang.String
  var fw_vendor_keys: java.lang.String
  var imported: scala.Boolean
  var initialized: trezorDashConnectLib.trezorDashConnectLibNumbers.`true`
  var label: java.lang.String | scala.Null
  var language: java.lang.String | scala.Null
  var major_version: scala.Double
  var minor_version: scala.Double
  var model: java.lang.String
  var needs_backup: trezorDashConnectLib.trezorDashConnectLibNumbers.`false`
  var no_backup: scala.Boolean
  var passphrase_cached: scala.Boolean
  var passphrase_protection: scala.Boolean
  var patch_version: scala.Double
  var pin_cached: scala.Boolean
  var pin_protection: scala.Boolean
  var revision: java.lang.String
  var unfinished_backup: scala.Boolean
  var vendor: java.lang.String
}

object Features {
  @scala.inline
  def apply(
    bootloader_hash: java.lang.String,
    device_id: java.lang.String,
    flags: scala.Double,
    fw_major: scala.Double,
    fw_minor: scala.Double,
    fw_patch: scala.Double,
    fw_vendor: java.lang.String,
    fw_vendor_keys: java.lang.String,
    imported: scala.Boolean,
    initialized: trezorDashConnectLib.trezorDashConnectLibNumbers.`true`,
    major_version: scala.Double,
    minor_version: scala.Double,
    model: java.lang.String,
    needs_backup: trezorDashConnectLib.trezorDashConnectLibNumbers.`false`,
    no_backup: scala.Boolean,
    passphrase_cached: scala.Boolean,
    passphrase_protection: scala.Boolean,
    patch_version: scala.Double,
    pin_cached: scala.Boolean,
    pin_protection: scala.Boolean,
    revision: java.lang.String,
    unfinished_backup: scala.Boolean,
    vendor: java.lang.String,
    bootloader_mode: js.UndefOr[scala.Boolean] = js.undefined,
    firmware_present: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String = null,
    language: java.lang.String = null
  ): Features = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootloader_hash")(bootloader_hash)
    __obj.updateDynamic("device_id")(device_id)
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("fw_major")(fw_major)
    __obj.updateDynamic("fw_minor")(fw_minor)
    __obj.updateDynamic("fw_patch")(fw_patch)
    __obj.updateDynamic("fw_vendor")(fw_vendor)
    __obj.updateDynamic("fw_vendor_keys")(fw_vendor_keys)
    __obj.updateDynamic("imported")(imported)
    __obj.updateDynamic("initialized")(initialized)
    __obj.updateDynamic("major_version")(major_version)
    __obj.updateDynamic("minor_version")(minor_version)
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("needs_backup")(needs_backup)
    __obj.updateDynamic("no_backup")(no_backup)
    __obj.updateDynamic("passphrase_cached")(passphrase_cached)
    __obj.updateDynamic("passphrase_protection")(passphrase_protection)
    __obj.updateDynamic("patch_version")(patch_version)
    __obj.updateDynamic("pin_cached")(pin_cached)
    __obj.updateDynamic("pin_protection")(pin_protection)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("unfinished_backup")(unfinished_backup)
    __obj.updateDynamic("vendor")(vendor)
    if (!js.isUndefined(bootloader_mode)) __obj.updateDynamic("bootloader_mode")(bootloader_mode)
    if (!js.isUndefined(firmware_present)) __obj.updateDynamic("firmware_present")(firmware_present)
    if (label != null) __obj.updateDynamic("label")(label)
    if (language != null) __obj.updateDynamic("language")(language)
    __obj.asInstanceOf[Features]
  }
}

