package typings
package winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
@JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
@js.native
abstract class FaceTracker () extends js.Object {
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapSize = js.native
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapSize = js.native
  /**
    * Asynchronously processes a VideoFrame for face detection.
    * @param videoFrame The VideoFrame in which faces are detected or tracked.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def processNextFrameAsync(videoFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
}

/* static members */
@JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
@js.native
object FaceTracker extends js.Object {
  /** Gets a value indicating whether the FaceTracker class is supported on the current device. */
  var isSupported: scala.Boolean = js.native
  /**
    * Creates a new instance of the FaceTracker class.
    * @return An asynchronous operation that returns a FaceTracker instance upon successful completion.
    */
  def createAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.MediaNs.FaceAnalysisNs.FaceTracker] = js.native
  /**
    * Returns a list of the bitmap pixels formats supported by the FaceTracker on the current device.
    * @return A list of the bitmap pixels formats supported by the FaceTracker on the current device.
    */
  def getSupportedBitmapPixelFormats(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat] = js.native
  /**
    * Queries whether the specified bitmap pixel format is supported by the FaceTracker on the current device.
    * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
    * @return True if the specified bitmap pixel format is supported; otherwise, false.
    */
  def isBitmapPixelFormatSupported(bitmapPixelFormat: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat): scala.Boolean = js.native
}

