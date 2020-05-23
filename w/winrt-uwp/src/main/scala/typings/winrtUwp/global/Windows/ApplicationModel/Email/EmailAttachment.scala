package typings.winrtUwp.global.Windows.ApplicationModel.Email

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email attachment. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachment")
@js.native
/** Initializes a new instance of the EmailAttachment class. */
class EmailAttachment ()
  extends typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachment {
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
  /* CompleteClass */
  override var contentId: String = js.native
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  /* CompleteClass */
  override var contentLocation: String = js.native
  /** Gets or sets the email attachment's data. */
  /* CompleteClass */
  override var data: IRandomAccessStreamReference = js.native
  /** Gets or sets the download state of the email attachment. */
  /* CompleteClass */
  override var downloadState: typings.winrtUwp.Windows.ApplicationModel.Email.EmailAttachmentDownloadState = js.native
  /** Gets or sets the estimated download size of the attachment. */
  /* CompleteClass */
  override var estimatedDownloadSizeInBytes: Double = js.native
  /** Gets or sets the displayed file name for the email attachment. */
  /* CompleteClass */
  override var fileName: String = js.native
  /** Gets the locally unique ID for the email attachment. */
  /* CompleteClass */
  override var id: String = js.native
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  /* CompleteClass */
  override var isFromBaseMessage: Boolean = js.native
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  /* CompleteClass */
  override var isInline: Boolean = js.native
  /** Gets or sets the MIME type of the attachment. */
  /* CompleteClass */
  override var mimeType: String = js.native
}

