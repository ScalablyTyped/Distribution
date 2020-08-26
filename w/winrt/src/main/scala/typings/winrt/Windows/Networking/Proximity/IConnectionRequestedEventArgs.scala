package typings.winrt.Windows.Networking.Proximity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IConnectionRequestedEventArgs extends js.Object {
  var peerInformation: PeerInformation = js.native
}

object IConnectionRequestedEventArgs {
  @scala.inline
  def apply(peerInformation: PeerInformation): IConnectionRequestedEventArgs = {
    val __obj = js.Dynamic.literal(peerInformation = peerInformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConnectionRequestedEventArgs]
  }
  @scala.inline
  implicit class IConnectionRequestedEventArgsOps[Self <: IConnectionRequestedEventArgs] (val x: Self) extends AnyVal {
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
    def setPeerInformation(value: PeerInformation): Self = this.set("peerInformation", value.asInstanceOf[js.Any])
  }
  
}

