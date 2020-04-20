package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConnectionRequestedEventArgs extends js.Object {
  var peerInformation: PeerInformation
}

object IConnectionRequestedEventArgs {
  @scala.inline
  def apply(peerInformation: PeerInformation): IConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionRequestedEventArgs]
  }
}

