package typings
package winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Detects faces in a SoftwareBitmap . */
@JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
@js.native
abstract class FaceDetector () extends js.Object {
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapSize = js.native
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapSize = js.native
  /**
    * Asynchronously detects faces in the provided SoftwareBitmap .
    * @param image The image data to be processed for face detection.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def detectFacesAsync(image: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
    * Asynchronously detects faces in the provided SoftwareBitmap within the specified search area.
    * @param image The image data to be processed for face detection.
    * @param searchArea The bounds within the SoftwareBitmap in which face detection will be performed.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def detectFacesAsync(
    image: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.SoftwareBitmap,
    searchArea: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapBounds
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
}

/** Detects faces in a SoftwareBitmap . */
@JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
@js.native
object FaceDetector extends js.Object {
  /** Gets a value indicating whether the FaceDetector class is supported on the current device. */
  var isSupported: scala.Boolean = js.native
  /**
    * Creates a new instance of the FaceDetector class.
    * @return An asynchronous operation that returns a FaceDetector instance upon successful completion.
    */
  def createAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs.FaceDetector] = js.native
  /**
    * Returns a list of the bitmap pixels formats supported by the FaceDetector on the current device.
    * @return A list of the bitmap pixels formats supported by the FaceDetector on the current device.
    */
  def getSupportedBitmapPixelFormats(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat] = js.native
  /**
    * Queries whether the specified bitmap pixel format is supported by the FaceDetector on the current device.
    * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
    * @return True if the specified bitmap pixel format is supported; otherwise, false.
    */
  def isBitmapPixelFormatSupported(bitmapPixelFormat: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat): scala.Boolean = js.native
}

