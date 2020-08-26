package typings.xrm.Xrm.Device

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Xrm.Device.captureAudio/captureImage/captureVideo response
  */
@js.native
trait CaptureFileResponse extends js.Object {
  /**
    * Base64 encoded contents of the file.
    */
  var fileContent: String = js.native
  /**
    * Name of the audio file.
    */
  var fileName: String = js.native
  /**
    * Size of the file in KB.
    */
  var fileSize: Double = js.native
  /**
    * File MIME type.
    */
  var mimeType: String = js.native
}

object CaptureFileResponse {
  @scala.inline
  def apply(fileContent: String, fileName: String, fileSize: Double, mimeType: String): CaptureFileResponse = {
    val __obj = js.Dynamic.literal(fileContent = fileContent.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureFileResponse]
  }
  @scala.inline
  implicit class CaptureFileResponseOps[Self <: CaptureFileResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFileContent(value: String): Self = this.set("fileContent", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMimeType(value: String): Self = this.set("mimeType", value.asInstanceOf[js.Any])
  }
  
}

