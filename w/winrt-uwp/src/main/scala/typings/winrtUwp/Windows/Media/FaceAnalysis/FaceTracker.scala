package typings.winrtUwp.Windows.Media.FaceAnalysis

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import typings.winrtUwp.Windows.Media.VideoFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
@js.native
trait FaceTracker extends js.Object {
  
  /** Gets or sets the maximum detectable face size, in pixels. */
  var maxDetectableFaceSize: BitmapSize = js.native
  
  /** Gets or sets the minimum detectable face size, in pixels. */
  var minDetectableFaceSize: BitmapSize = js.native
  
  /**
    * Asynchronously processes a VideoFrame for face detection.
    * @param videoFrame The VideoFrame in which faces are detected or tracked.
    * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
    */
  def processNextFrameAsync(videoFrame: VideoFrame): IPromiseWithIAsyncOperation[IVector[_]] = js.native
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
  
  @scala.inline
  implicit class FaceTrackerOps[Self <: FaceTracker] (val x: Self) extends AnyVal {
    
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
    def setMaxDetectableFaceSize(value: BitmapSize): Self = this.set("maxDetectableFaceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinDetectableFaceSize(value: BitmapSize): Self = this.set("minDetectableFaceSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessNextFrameAsync(value: VideoFrame => IPromiseWithIAsyncOperation[IVector[_]]): Self = this.set("processNextFrameAsync", js.Any.fromFunction1(value))
  }
}
