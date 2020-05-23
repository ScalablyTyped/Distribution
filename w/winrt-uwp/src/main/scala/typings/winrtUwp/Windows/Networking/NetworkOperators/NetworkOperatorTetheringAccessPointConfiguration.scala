package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
trait NetworkOperatorTetheringAccessPointConfiguration extends js.Object {
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: String
  /** Gets or sets the network account ID. */
  var ssid: String
}

object NetworkOperatorTetheringAccessPointConfiguration {
  @scala.inline
  def apply(passphrase: String, ssid: String): NetworkOperatorTetheringAccessPointConfiguration = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringAccessPointConfiguration]
  }
}

