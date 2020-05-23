package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the RemoteParticipantComposingChanged event. */
trait RemoteParticipantComposingChangedEventArgs extends js.Object {
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  var isComposing: Boolean
  /** Gets the address of the remote chat participant. */
  var participantAddress: String
  /** Gets the ID for the message transport. */
  var transportId: String
}

object RemoteParticipantComposingChangedEventArgs {
  @scala.inline
  def apply(isComposing: Boolean, participantAddress: String, transportId: String): RemoteParticipantComposingChangedEventArgs = {
    val __obj = js.Dynamic.literal(isComposing = isComposing.asInstanceOf[js.Any], participantAddress = participantAddress.asInstanceOf[js.Any], transportId = transportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteParticipantComposingChangedEventArgs]
  }
}

