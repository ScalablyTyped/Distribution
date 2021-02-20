package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an attachment to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageAttachment")
@js.native
class ChatMessageAttachment protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.ChatMessageAttachment {
  /**
    * Initializes a new instance of the ChatMessageAttachment class.
    * @param mimeType The MIME type of the attachment.
    * @param dataStreamReference A stream containing the attachment data.
    */
  def this(mimeType: String, dataStreamReference: IRandomAccessStreamReference) = this()
}
