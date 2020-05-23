package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the RemoteParticipantComposingChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RemoteParticipantComposingChangedEventArgs")
@js.native
abstract class RemoteParticipantComposingChangedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RemoteParticipantComposingChangedEventArgs {
  /** Gets a Boolean value indicating if the remote participant is currently composing a message. */
  /* CompleteClass */
  override var isComposing: Boolean = js.native
  /** Gets the address of the remote chat participant. */
  /* CompleteClass */
  override var participantAddress: String = js.native
  /** Gets the ID for the message transport. */
  /* CompleteClass */
  override var transportId: String = js.native
}

