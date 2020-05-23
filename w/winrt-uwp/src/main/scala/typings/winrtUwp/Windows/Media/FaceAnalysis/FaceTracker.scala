package typings.winrtUwp.Windows.Media.FaceAnalysis

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
trait FaceTracker extends js.Object {
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: BitmapSize
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: BitmapSize
  /**
    * Asynchronously processes a VideoFrame for face detection.
    * @param videoFrame The VideoFrame in which faces are detected or tracked.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def processNextFrameAsync(videoFrame: VideoFrame): IPromiseWithIAsyncOperation[IVector[_]]
}

object FaceTracker {
  @scala.inline
  def apply(
    maxDetectableFaceSize: BitmapSize,
    minDetectableFaceSize: BitmapSize,
    processNextFrameAsync: VideoFrame => IPromiseWithIAsyncOperation[IVector[_]]
  ): FaceTracker = {
    val __obj = js.Dynamic.literal(maxDetectableFaceSize = maxDetectableFaceSize.asInstanceOf[js.Any], minDetectableFaceSize = minDetectableFaceSize.asInstanceOf[js.Any], processNextFrameAsync = js.Any.fromFunction1(processNextFrameAsync))
    __obj.asInstanceOf[FaceTracker]
  }
}

