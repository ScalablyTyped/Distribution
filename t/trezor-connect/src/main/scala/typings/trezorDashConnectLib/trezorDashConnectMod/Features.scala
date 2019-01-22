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

