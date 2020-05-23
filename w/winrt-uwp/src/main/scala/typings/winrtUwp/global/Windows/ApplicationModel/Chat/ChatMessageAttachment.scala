package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  /** Gets or sets a stream reference for a message attachment. */
  /* CompleteClass */
  override var dataStreamReference: IRandomAccessStreamReference = js.native
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  /* CompleteClass */
  override var groupId: Double = js.native
  /** Gets or sets the MIME type of the attachment. */
  /* CompleteClass */
  override var mimeType: String = js.native
  /** Gets or sets the original file name of the attachment. */
  /* CompleteClass */
  override var originalFileName: String = js.native
  /** Gets or sets the text encoded representation of the attachment object. */
  /* CompleteClass */
  override var text: String = js.native
  /** Gets or sets the thumbnail image for the attachment. */
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /** Gets or sets the progress of transferring the attachment. */
  /* CompleteClass */
  override var transferProgress: Double = js.native
}

