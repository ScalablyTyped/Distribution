package typings.xrm.Xrm

import typings.xrm.Xrm.Async.PromiseLike
import typings.xrm.Xrm.Device.CaptureFileResponse
import typings.xrm.Xrm.Device.CaptureImageOptions
import typings.xrm.Xrm.Device.GetCurrentPositionResponse
import typings.xrm.Xrm.Device.PickFileOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for Xrm.Device API
  * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/xrm-device External Link: Xrm.Device (Client API reference)}
  */
@js.native
trait Device_ extends js.Object {
  
  /**
    * Invokes the device microphone to record audio.
    * @returns On success, returns Base64 encoded file
    */
  def captureAudio(): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to capture an image.
    * @returns On success, returns Base64 encoded file
    */
  def captureImage(): PromiseLike[CaptureFileResponse] = js.native
  def captureImage(imageOptions: CaptureImageOptions): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to capture video.
    * @returns On success, returns Base64 encoded file
    */
  def captureVideo(): PromiseLike[CaptureFileResponse] = js.native
  
  /**
    * Invokes the device camera to scan the barcode information, such as a product number.
    * @returns On success, Barcode value is returned as a String
    */
  def getBarcodeValue(): PromiseLike[String] = js.native
  
  /**
    * Returns the current location using the device geolocation capability.
    * @returns On success, returns current geolocation information
    */
  def getCurrentPosition(): PromiseLike[GetCurrentPositionResponse] = js.native
  
  /**
    * Opens a dialog box to select files from your computer (web client) or mobile device (mobile clients).
    * @returns On success, returns an array of files
    */
  def pickFile(): PromiseLike[js.Array[CaptureFileResponse]] = js.native
  def pickFile(pickFileOptions: PickFileOptions): PromiseLike[js.Array[CaptureFileResponse]] = js.native
}
