package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for the ChatMessageStoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs")
@js.native
abstract class ChatMessageStoreChangedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs {
  /** Gets the ID of the object that changed. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets the type of change that happened. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Chat.ChatStoreChangedEventKind = js.native
}

