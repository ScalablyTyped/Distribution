package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Xrm.Device.captureAudio/captureImage/captureVideo response
  */
trait CaptureFileResponse extends js.Object {
  /**
    * Base64 encoded contents of the file.
    */
  var fileContent: String
  /**
    * Name of the audio file.
    */
  var fileName: String
  /**
    * Size of the file in KB.
    */
  var fileSize: Double
  /**
    * File MIME type.
    */
  var mimeType: String
}

object CaptureFileResponse {
  @scala.inline
  def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): CaptureFileResponse = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CaptureFileResponse]
  }
}

