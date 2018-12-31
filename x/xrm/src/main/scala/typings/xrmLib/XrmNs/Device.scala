package typings
package xrmLib.XrmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for Xrm.Device API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
  */
trait Device extends js.Object {
  /**
    * Invokes the device microphone to record audio.
    * @returns On success, returns Base64 encoded file
    */
  def captureAudio(): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.DeviceNs.CaptureFileResponse]
  /**
    * Invokes the device camera to capture an image.
    * @returns On success, returns Base64 encoded file
    */
  def captureImage(imageOptions: xrmLib.XrmNs.DeviceNs.CaptureImageOptions): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.DeviceNs.CaptureFileResponse]
  /**
    * Invokes the device camera to capture video.
    * @returns On success, returns Base64 encoded file
    */
  def captureVideo(): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.DeviceNs.CaptureFileResponse]
  /**
    * Invokes the device camera to scan the barcode information, such as a product number.
    * @returns On success, Barcode value is returned as a String
    */
  def getBarcodeValue(): xrmLib.XrmNs.AsyncNs.PromiseLike[java.lang.String]
  /**
    * Returns the current location using the device geolocation capability.
    * @returns On success, returns current geolocation information
    */
  def getCurrentPosition(): xrmLib.XrmNs.AsyncNs.PromiseLike[xrmLib.XrmNs.DeviceNs.GetCurrentPositionResponse]
  /**
    * Opens a dialog box to select files from your computer (web client) or mobile device (mobile clients).
    * @returns On success, returns an array of files
    */
  def pickFile(pickFileOptions: xrmLib.XrmNs.DeviceNs.PickFileOptions): xrmLib.XrmNs.AsyncNs.PromiseLike[js.Array[xrmLib.XrmNs.DeviceNs.CaptureFileResponse]]
}

