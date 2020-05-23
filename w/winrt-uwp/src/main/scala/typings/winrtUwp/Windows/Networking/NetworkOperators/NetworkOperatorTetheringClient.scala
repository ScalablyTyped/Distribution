package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about a tethering client. */
trait NetworkOperatorTetheringClient extends js.Object {
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: IVectorView[HostName]
  /** Gets the MAC address of this tethering client. */
  var macAddress: String
}

object NetworkOperatorTetheringClient {
  @scala.inline
  def apply(hostNames: IVectorView[HostName], macAddress: String): NetworkOperatorTetheringClient = {
    val __obj = js.Dynamic.literal(hostNames = hostNames.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringClient]
  }
}

