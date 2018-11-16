package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.EmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an email attachment. */
@JSGlobal("Windows.ApplicationModel.Email.EmailAttachment")
@js.native
class EmailAttachment () extends js.Object {
  /**
                   * Initializes a new instance of the EmailAttachment class with the specified random access stream.
                   * @param filename The file name to use for the attachment.
                   * @param data A random access stream containing the data for the attachment.
                   */
  def this(filename: java.lang.String, data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference) = this()
  /**
                   * Initializes a new instance of the EmailAttachment class.
                   * @param fileName The filename of the attachment.
                   * @param data The stream to use to download the attachment.
                   * @param mimeType The MIME type of the attachment.
                   */
  def this(fileName: java.lang.String, data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference, mimeType: java.lang.String) = this()
  /** Gets or sets a value that identifies the content of the attachment on a remote system. */
  var contentId: java.lang.String = js.native
  /** Gets or sets the location of an email attachment as a Uniform Resource Identifier (URI). */
  var contentLocation: java.lang.String = js.native
  /** Gets or sets the email attachment's data. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference = js.native
  /** Gets or sets the download state of the email attachment. */
  var downloadState: EmailAttachmentDownloadState = js.native
  /** Gets or sets the estimated download size of the attachment. */
  var estimatedDownloadSizeInBytes: scala.Double = js.native
  /** Gets or sets the displayed file name for the email attachment. */
  var fileName: java.lang.String = js.native
  /** Gets the locally unique ID for the email attachment. */
  var id: java.lang.String = js.native
  /** Gets a Boolean value indicating if the attachment came from the base message. */
  var isFromBaseMessage: scala.Boolean = js.native
  /** Gets or sets a Boolean property indicating if the attachment is included inline, in the body of the message. */
  var isInline: scala.Boolean = js.native
  /** Gets or sets the MIME type of the attachment. */
  var mimeType: java.lang.String = js.native
}

