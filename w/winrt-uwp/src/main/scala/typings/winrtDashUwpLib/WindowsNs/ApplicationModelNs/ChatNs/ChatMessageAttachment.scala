package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

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
  def this(mimeType: java.lang.String, dataStreamReference: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) = this()
  /** Gets or sets a stream reference for a message attachment. */
  var dataStreamReference: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the identifier for the attachment group to which this attachment belongs. */
  var groupId: scala.Double = js.native
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: java.lang.String = js.native
  /** Gets or sets the original file name of the attachment. */
  var originalFileName: java.lang.String = js.native
  /** Gets or sets the text encoded representation of the attachment object. */
  var text: java.lang.String = js.native
  /** Gets or sets the thumbnail image for the attachment. */
  var thumbnail: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the progress of transferring the attachment. */
  var transferProgress: scala.Double = js.native
}

