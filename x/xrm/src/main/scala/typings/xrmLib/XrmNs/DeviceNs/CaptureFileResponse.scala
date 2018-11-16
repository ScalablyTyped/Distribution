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

