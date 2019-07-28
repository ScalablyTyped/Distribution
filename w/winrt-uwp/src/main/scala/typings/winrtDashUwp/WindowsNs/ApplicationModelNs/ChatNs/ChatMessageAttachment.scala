package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an attachment to a chat message. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageAttachment")
@js.native
class ChatMessageAttachment protected () extends js.Object {
  /**
    * Initializes a new instance of the ChatMessageAttachment class.
    * @param mimeType The MIME type of the attachment.
    * @param dataStreamReference A stream containing the attachment data.
    */
  def this(mimeType: String, dataStreamReference: IRandomAccessStreamReference) = this()
  /** Gets or sets a stream reference for a message attachment. */
  var dataStreamReference: IRandomAccessStreamReference = js.native
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  var groupId: Double = js.native
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String = js.native
  /** Gets or sets the original file name of the attachment. */
  var originalFileName: String = js.native
  /** Gets or sets the text encoded representation of the attachment object. */
  var text: String = js.native
  /** Gets or sets the thumbnail image for the attachment. */
  var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets or sets the progress of transferring the attachment. */
  var transferProgress: Double = js.native
}

