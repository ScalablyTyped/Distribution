package typings.winrtDashUwp.Windows.ApplicationModel.Email

import typings.winrtDashUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email attachment. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachment")
@js.native
/** Initializes a new instance of the EmailAttachment class. */
class EmailAttachment () extends js.Object {
  /**
    * Initializes a new instance of the EmailAttachment class with the specified random access stream.
    * @param filename The file name to use for the attachment.
    * @param data A random access stream containing the data for the attachment.
    */
  def this(filename: String, data: IRandomAccessStreamReference) = this()
  /**
    * Initializes a new instance of the EmailAttachment class.
    * @param fileName The filename of the attachment.
    * @param data The stream to use to download the attachment.
    * @param mimeType The MIME type of the attachment.
    */
  def this(fileName: String, data: IRandomAccessStreamReference, mimeType: String) = this()
  /** Gets or sets a value that identifies the content of the attachment on a remote system. */
  var contentId: String = js.native
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  var contentLocation: String = js.native
  /** Gets or sets the email attachment's data. */
  var data: IRandomAccessStreamReference = js.native
  /** Gets or sets the download state of the email attachment. */
  var downloadState: EmailAttachmentDownloadState = js.native
  /** Gets or sets the estimated download size of the attachment. */
  var estimatedDownloadSizeInBytes: Double = js.native
  /** Gets or sets the displayed file name for the email attachment. */
  var fileName: String = js.native
  /** Gets the locally unique ID for the email attachment. */
  var id: String = js.native
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  var isFromBaseMessage: Boolean = js.native
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  var isInline: Boolean = js.native
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: String = js.native
}

