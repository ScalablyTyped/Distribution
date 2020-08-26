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
}

