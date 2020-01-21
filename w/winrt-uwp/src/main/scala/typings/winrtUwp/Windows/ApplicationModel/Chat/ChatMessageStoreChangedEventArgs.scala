package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for the ChatMessageStoreChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageStoreChangedEventArgs")
@js.native
abstract class ChatMessageStoreChangedEventArgs () extends js.Object {
  /** Gets the ID of the object that changed. */
  var id: String = js.native
  /** Gets the type of change that happened. */
  var kind: ChatStoreChangedEventKind = js.native
}

