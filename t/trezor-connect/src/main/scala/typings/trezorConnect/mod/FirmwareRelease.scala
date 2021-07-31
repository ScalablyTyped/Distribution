package typings.trezorConnect.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareRelease extends StObject {
  
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
  
  @scala.inline
  implicit class FirmwareReleaseMutableBuilder[Self <: FirmwareRelease] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBootloader_version(value: js.Array[Double]): Self = StObject.set(x, "bootloader_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBootloader_versionVarargs(value: Double*): Self = StObject.set(x, "bootloader_version", js.Array(value :_*))
    
    @scala.inline
    def setChangelog(value: String): Self = StObject.set(x, "changelog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_bootloader_version(value: js.Array[Double]): Self = StObject.set(x, "min_bootloader_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_bootloader_versionVarargs(value: Double*): Self = StObject.set(x, "min_bootloader_version", js.Array(value :_*))
    
    @scala.inline
    def setMin_bridge_version(value: js.Array[Double]): Self = StObject.set(x, "min_bridge_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_bridge_versionVarargs(value: Double*): Self = StObject.set(x, "min_bridge_version", js.Array(value :_*))
    
    @scala.inline
    def setMin_firmware_version(value: js.Array[Double]): Self = StObject.set(x, "min_firmware_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin_firmware_versionVarargs(value: Double*): Self = StObject.set(x, "min_firmware_version", js.Array(value :_*))
    
    @scala.inline
    def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: js.Array[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionVarargs(value: Double*): Self = StObject.set(x, "version", js.Array(value :_*))
  }
}
