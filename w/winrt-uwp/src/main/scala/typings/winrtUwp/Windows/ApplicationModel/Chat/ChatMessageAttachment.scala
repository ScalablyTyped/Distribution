package typings.winrtUwp.Windows.ApplicationModel.Chat

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an attachment to a chat message. */
trait ChatMessageAttachment extends js.Object {
  /** Gets or sets a stream reference for a message attachment. */
  var dataStreamReference: IRandomAccessStreamReference
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  var groupId: Double
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String
  /** Gets or sets the original file name of the attachment. */
  var originalFileName: String
  /** Gets or sets the text encoded representation of the attachment object. */
  var text: String
  /** Gets or sets the thumbnail image for the attachment. */
  var thumbnail: IRandomAccessStreamReference
  /** Gets or sets the progress of transferring the attachment. */
  var transferProgress: Double
}

object ChatMessageAttachment {
  @scala.inline
  def apply(
    dataStreamReference: IRandomAccessStreamReference,
    groupId: Double,
    mimeType: String,
    originalFileName: String,
    text: String,
    thumbnail: IRandomAccessStreamReference,
    transferProgress: Double
  ): ChatMessageAttachment = {
    val __obj = js.Dynamic.literal(dataStreamReference = dataStreamReference.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], originalFileName = originalFileName.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], transferProgress = transferProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatMessageAttachment]
  }
}

