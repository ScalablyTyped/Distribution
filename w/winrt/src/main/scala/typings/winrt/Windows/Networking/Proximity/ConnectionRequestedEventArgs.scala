package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionRequestedEventArgs extends IConnectionRequestedEventArgs

object ConnectionRequestedEventArgs {
  @scala.inline
  def apply(peerInformation: PeerInformation): ConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionRequestedEventArgs]
  }
}

