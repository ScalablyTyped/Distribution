package typings.winrtDashUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the RemoteParticipantComposingChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RemoteParticipantComposingChangedEventArgs")
@js.native
abstract class RemoteParticipantComposingChangedEventArgs () extends js.Object {
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  var isComposing: Boolean = js.native
  /** Gets the address of the remote chat participant. */
  var participantAddress: String = js.native
  /** Gets the ID for the message transport. */
  var transportId: String = js.native
}

