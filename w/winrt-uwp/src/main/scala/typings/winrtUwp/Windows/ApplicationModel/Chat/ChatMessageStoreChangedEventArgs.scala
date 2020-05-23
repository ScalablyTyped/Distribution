package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for the ChatMessageStoreChanged event. */
trait ChatMessageStoreChangedEventArgs extends js.Object {
  /** Gets the ID of the object that changed. */
  var id: String
  /** Gets the type of change that happened. */
  var kind: ChatStoreChangedEventKind
}

object ChatMessageStoreChangedEventArgs {
  @scala.inline
  def apply(id: String, kind: ChatStoreChangedEventKind): ChatMessageStoreChangedEventArgs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageStoreChangedEventArgs]
  }
}

