package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
@js.native
trait NetworkOperatorTetheringAccessPointConfiguration extends js.Object {
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: String = js.native
  /** Gets or sets the network account ID. */
  var ssid: String = js.native
}

object NetworkOperatorTetheringAccessPointConfiguration {
  @scala.inline
  def apply(passphrase: String, ssid: String): NetworkOperatorTetheringAccessPointConfiguration = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringAccessPointConfiguration]
  }
  @scala.inline
  implicit class NetworkOperatorTetheringAccessPointConfigurationOps[Self <: NetworkOperatorTetheringAccessPointConfiguration] (val x: Self) extends AnyVal {
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
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def setSsid(value: String): Self = this.set("ssid", value.asInstanceOf[js.Any])
  }
  
}

