package typings
package xrmLib.XrmNs.DeviceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Xrm.Device.captureImage
  */
trait CaptureImageOptions extends js.Object {
  /**
    * Indicates whether to edit the image before saving.
    */
  var allowEdit: scala.Boolean
  /**
    * Height of the image to capture.
    */
  var height: scala.Double
  /**
    * Indicates whether to capture image using the front camera of the device.
    */
  var preferFrontCamera: scala.Boolean
  /**
    * Quality of the image file in percentage. Number.
    */
  var quality: scala.Double
  /**
    * Width of the image to capture
    */
  var width: scala.Double
}

