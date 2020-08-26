package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirmwareRelease extends js.Object {
  var bootloader_version: js.Array[Double] = js.native
  var changelog: String = js.native
  var channel: String = js.native
  var fingerprint: String = js.native
  var min_bootloader_version: js.Array[Double] = js.native
  var min_bridge_version: js.Array[Double] = js.native
  var min_firmware_version: js.Array[Double] = js.native
  var required: Boolean = js.native
  var url: String = js.native
  var version: js.Array[Double] = js.native
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
  @scala.inline
  implicit class FirmwareReleaseOps[Self <: FirmwareRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBootloader_versionVarargs(value: Double*): Self = this.set("bootloader_version", js.Array(value :_*))
    @scala.inline
    def setBootloader_version(value: js.Array[Double]): Self = this.set("bootloader_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setChangelog(value: String): Self = this.set("changelog", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_bootloader_versionVarargs(value: Double*): Self = this.set("min_bootloader_version", js.Array(value :_*))
    @scala.inline
    def setMin_bootloader_version(value: js.Array[Double]): Self = this.set("min_bootloader_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_bridge_versionVarargs(value: Double*): Self = this.set("min_bridge_version", js.Array(value :_*))
    @scala.inline
    def setMin_bridge_version(value: js.Array[Double]): Self = this.set("min_bridge_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin_firmware_versionVarargs(value: Double*): Self = this.set("min_firmware_version", js.Array(value :_*))
    @scala.inline
    def setMin_firmware_version(value: js.Array[Double]): Self = this.set("min_firmware_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionVarargs(value: Double*): Self = this.set("version", js.Array(value :_*))
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

