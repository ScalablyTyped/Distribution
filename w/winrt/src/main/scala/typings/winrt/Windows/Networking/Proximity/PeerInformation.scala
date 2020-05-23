package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PeerInformation extends IPeerInformation

object PeerInformation {
  @scala.inline
  def apply(displayName: String): PeerInformation = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerInformation]
  }
}

