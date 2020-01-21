package typings.trezorConnect.mod

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
    val __obj = js.Dynamic.literal(bootloader_version = bootloader_version.asInstanceOf[js.Any], changelog = changelog.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], min_bootloader_version = min_bootloader_version.asInstanceOf[js.Any], min_bridge_version = min_bridge_version.asInstanceOf[js.Any], min_firmware_version = min_firmware_version.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FirmwareRelease]
  }
}

