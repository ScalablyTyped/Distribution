package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Settings governing "legacy" mode (non-Wi-Fi Direct connections to the access point being advertised.) */
@js.native
trait WiFiDirectLegacySettings extends js.Object {
  /** Gets or sets a value specifying whether "legacy mode" is enabled. When enabled, this mode causes this device to act as a normal Wi-Fi access point, and is intended to support devices which do not support connection via Wi-Fi Direct. */
  var isEnabled: Boolean = js.native
  /** Gets or sets the pass phrase used by non-Wi-Fi Direct clients to connect to this access point in "legacy mode". */
  var passphrase: PasswordCredential = js.native
  /** Gets or sets the Service Set Identifier (SSID, or "access point ID"). */
  var ssid: String = js.native
}

object WiFiDirectLegacySettings {
  @scala.inline
  def apply(isEnabled: Boolean, passphrase: PasswordCredential, ssid: String): WiFiDirectLegacySettings = {
    val __obj = js.Dynamic.literal(isEnabled = isEnabled.asInstanceOf[js.Any], passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[WiFiDirectLegacySettings]
  }
  @scala.inline
  implicit class WiFiDirectLegacySettingsOps[Self <: WiFiDirectLegacySettings] (val x: Self) extends AnyVal {
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
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassphrase(value: PasswordCredential): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsid(value: String): Self = this.set("ssid", value.asInstanceOf[js.Any])
  }
  
}

