package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
@js.native
/** Creates a BackgroundTransferContentPart object. */
class BackgroundTransferContentPart ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart {
  /**
    * Creates a BackgroundTransferContentPart object that identifies the content it represents.
    * @param name Identifies the content.
    */
  def this(name: String) = this()
  /**
    * Creates a BackgroundTransferContentPart object that identifies the file content and the name of the file that it represents.
    * @param name Identifies the content.
    * @param fileName The fully qualified file name, including the local path.
    */
  def this(name: String, fileName: String) = this()
  /**
    * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
    * @param value The source file.
    */
  /* CompleteClass */
  override def setFile(value: IStorageFile): Unit = js.native
  /**
    * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  /* CompleteClass */
  override def setHeader(headerName: String, headerValue: String): Unit = js.native
  /**
    * Use this method to set text information that the BackgroundTransferContentPart represents.
    * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
    */
  /* CompleteClass */
  override def setText(value: String): Unit = js.native
}

