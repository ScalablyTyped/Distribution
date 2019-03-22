package typings
package trezorDashConnectLib.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirmwareRelease extends js.Object {
  var bootloader_version: js.Array[scala.Double]
  var changelog: java.lang.String
  var channel: java.lang.String
  var fingerprint: java.lang.String
  var min_bootloader_version: js.Array[scala.Double]
  var min_bridge_version: js.Array[scala.Double]
  var min_firmware_version: js.Array[scala.Double]
  var required: scala.Boolean
  var url: java.lang.String
  var version: js.Array[scala.Double]
}

object FirmwareRelease {
  @scala.inline
  def apply(
    bootloader_version: js.Array[scala.Double],
    changelog: java.lang.String,
    channel: java.lang.String,
    fingerprint: java.lang.String,
    min_bootloader_version: js.Array[scala.Double],
    min_bridge_version: js.Array[scala.Double],
    min_firmware_version: js.Array[scala.Double],
    required: scala.Boolean,
    url: java.lang.String,
    version: js.Array[scala.Double]
  ): FirmwareRelease = {
    val __obj = js.Dynamic.literal(bootloader_version = bootloader_version, changelog = changelog, channel = channel, fingerprint = fingerprint, min_bootloader_version = min_bootloader_version, min_bridge_version = min_bridge_version, min_firmware_version = min_firmware_version, required = required, url = url, version = version)
  
    __obj.asInstanceOf[FirmwareRelease]
  }
}

