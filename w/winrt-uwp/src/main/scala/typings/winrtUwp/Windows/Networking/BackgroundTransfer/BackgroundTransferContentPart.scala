package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
trait BackgroundTransferContentPart extends js.Object {
  /**
    * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
    * @param value The source file.
    */
  def setFile(value: IStorageFile): Unit
  /**
    * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
    * @param headerName The header name.
    * @param headerValue The header value.
    */
  def setHeader(headerName: String, headerValue: String): Unit
  /**
    * Use this method to set text information that the BackgroundTransferContentPart represents.
    * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
    */
  def setText(value: String): Unit
}

object BackgroundTransferContentPart {
  @scala.inline
  def apply(setFile: IStorageFile => Unit, setHeader: (String, String) => Unit, setText: String => Unit): BackgroundTransferContentPart = {
    val __obj = js.Dynamic.literal(setFile = js.Any.fromFunction1(setFile), setHeader = js.Any.fromFunction2(setHeader), setText = js.Any.fromFunction1(setText))
    __obj.asInstanceOf[BackgroundTransferContentPart]
  }
}

