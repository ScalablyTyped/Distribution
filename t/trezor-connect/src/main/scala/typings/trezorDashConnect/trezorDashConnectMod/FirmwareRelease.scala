package typings.trezorDashConnect.trezorDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirmwareRelease extends js.Object {
  var bootloader_version: js.Array[Double]
  var changelog: String
  var channel: String
  var fingerprint: String
  var min_bootloader_version: js.Array[Double]
  var min_bridge_version: js.Array[Double]
  var min_firmware_version: js.Array[Double]
  var required: Boolean
  var url: String
  var version: js.Array[Double]
}

object FirmwareRelease {
  @scala.inline
  def apply(
    bootloader_version: js.Array[Double],
    changelog: String,
    channel: String,
    fingerprint: String,
    min_bootloader_version: js.Array[Double],
    min_bridge_version: js.Array[Double],
    min_firmware_version: js.Array[Double],
    required: Boolean,
    url: String,
    version: js.Array[Double]
  ): FirmwareRelease = {
    val __obj = js.Dynamic.literal(bootloader_version = bootloader_version, changelog = changelog, channel = channel, fingerprint = fingerprint, min_bootloader_version = min_bootloader_version, min_bridge_version = min_bridge_version, min_firmware_version = min_firmware_version, required = required, url = url, version = version)
  
    __obj.asInstanceOf[FirmwareRelease]
  }
}

