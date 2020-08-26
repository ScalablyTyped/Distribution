package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the RemoteParticipantComposingChanged event. */
@js.native
trait RemoteParticipantComposingChangedEventArgs extends js.Object {
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  var isComposing: Boolean = js.native
  /** Gets the address of the remote chat participant. */
  var participantAddress: String = js.native
  /** Gets the ID for the message transport. */
  var transportId: String = js.native
}

object RemoteParticipantComposingChangedEventArgs {
  @scala.inline
  def apply(isComposing: Boolean, participantAddress: String, transportId: String): RemoteParticipantComposingChangedEventArgs = {
    val __obj = js.Dynamic.literal(isComposing = isComposing.asInstanceOf[js.Any], participantAddress = participantAddress.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteParticipantComposingChangedEventArgs]
  }
  @scala.inline
  implicit class RemoteParticipantComposingChangedEventArgsOps[Self <: RemoteParticipantComposingChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setIsComposing(value: Boolean): Self = this.set("isComposing", value.asInstanceOf[js.Any])
    @scala.inline
    def setParticipantAddress(value: String): Self = this.set("participantAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransportId(value: String): Self = this.set("transportId", value.asInstanceOf[js.Any])
  }
  
}

