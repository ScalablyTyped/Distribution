package typings
package xrmLib.XrmNs.DeviceNs

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
  var fileContent: java.lang.String
  /**
    * Name of the audio file.
    */
  var fileName: java.lang.String
  /**
    * Size of the file in KB.
    */
  var fileSize: scala.Double
  /**
    * File MIME type.
    */
  var mimeType: java.lang.String
}

object CaptureFileResponse {
  @scala.inline
  def apply(
    fileContent: java.lang.String,
    fileName: java.lang.String,
    fileSize: scala.Double,
    mimeType: java.lang.String
  ): CaptureFileResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileContent")(fileContent)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("fileSize")(fileSize)
    __obj.updateDynamic("mimeType")(mimeType)
    __obj.asInstanceOf[CaptureFileResponse]
  }
}

