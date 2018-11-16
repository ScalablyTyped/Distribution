package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a content part of a multi-part transfer request. Each BackgroundTransferContentPart object can represent either a single string of text content or a single file payload, but not both. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferContentPart")
@js.native
class BackgroundTransferContentPart () extends js.Object {
  /**
                   * Creates a BackgroundTransferContentPart object that identifies the content it represents.
                   * @param name Identifies the content.
                   */
  def this(name: java.lang.String) = this()
  /**
                   * Creates a BackgroundTransferContentPart object that identifies the file content and the name of the file that it represents.
                   * @param name Identifies the content.
                   * @param fileName The fully qualified file name, including the local path.
                   */
  def this(name: java.lang.String, fileName: java.lang.String) = this()
  /**
                   * Sets the source file for a BackgroundTransferContentPart containing the file for upload.
                   * @param value The source file.
                   */
  def setFile(value: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): scala.Unit = js.native
  /**
                   * Sets content disposition header values that indicate the nature of the information that this BackgroundTransferContentPart represents.
                   * @param headerName The header name.
                   * @param headerValue The header value.
                   */
  def setHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
  /**
                   * Use this method to set text information that the BackgroundTransferContentPart represents.
                   * @param value A string value used to represent text information. (e.g. api_sig, api_key, auth_token, etc...)
                   */
  def setText(value: java.lang.String): scala.Unit = js.native
}

