package typings.winrtUwp.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import typings.winrtUwp.Windows.Graphics.Imaging.SoftwareBitmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for face detection in bitmaps or video frames. */
object FaceAnalysis {
  
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  trait DetectedFace extends StObject {
    
    /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
    var faceBox: BitmapBounds
  }
  object DetectedFace {
    
    inline def apply(faceBox: BitmapBounds): DetectedFace = {
      val __obj = js.Dynamic.literal(faceBox = faceBox.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedFace]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DetectedFace] (val x: Self) extends AnyVal {
      
      inline def setFaceBox(value: BitmapBounds): Self = StObject.set(x, "faceBox", value.asInstanceOf[js.Any])
    }
  }
  
  /** Detects faces in a SoftwareBitmap . */
  @js.native
  trait FaceDetector extends StObject {
    
    /**
      * Asynchronously detects faces in the provided SoftwareBitmap .
      * @param image The image data to be processed for face detection.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    def detectFacesAsync(image: SoftwareBitmap): IPromiseWithIAsyncOperation[IVector[Any]] = js.native
    /**
      * Asynchronously detects faces in the provided SoftwareBitmap within the specified search area.
      * @param image The image data to be processed for face detection.
      * @param searchArea The bounds within the SoftwareBitmap in which face detection will be performed.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    def detectFacesAsync(image: SoftwareBitmap, searchArea: BitmapBounds): IPromiseWithIAsyncOperation[IVector[Any]] = js.native
    
    /** Gets or sets the maximum detectable face size, in pixels. */
    var maxDetectableFaceSize: BitmapSize = js.native
    
    /** Gets or sets the minimum detectable face size, in pixels. */
    var minDetectableFaceSize: BitmapSize = js.native
  }
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  trait FaceTracker extends StObject {
    
    /** Gets or sets the maximum detectable face size, in pixels. */
    var maxDetectableFaceSize: BitmapSize
    
    /** Gets or sets the minimum detectable face size, in pixels. */
    var minDetectableFaceSize: BitmapSize
    
    /**
      * Asynchronously processes a VideoFrame for face detection.
      * @param videoFrame The VideoFrame in which faces are detected or tracked.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    def processNextFrameAsync(videoFrame: VideoFrame): IPromiseWithIAsyncOperation[IVector[Any]]
  }
  object FaceTracker {
    
    inline def apply(
      maxDetectableFaceSize: BitmapSize,
      minDetectableFaceSize: BitmapSize,
      processNextFrameAsync: VideoFrame => IPromiseWithIAsyncOperation[IVector[Any]]
    ): FaceTracker = {
      val __obj = js.Dynamic.literal(maxDetectableFaceSize = maxDetectableFaceSize.asInstanceOf[js.Any], minDetectableFaceSize = minDetectableFaceSize.asInstanceOf[js.Any], processNextFrameAsync = js.Any.fromFunction1(processNextFrameAsync))
      __obj.asInstanceOf[FaceTracker]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FaceTracker] (val x: Self) extends AnyVal {
      
      inline def setMaxDetectableFaceSize(value: BitmapSize): Self = StObject.set(x, "maxDetectableFaceSize", value.asInstanceOf[js.Any])
      
      inline def setMinDetectableFaceSize(value: BitmapSize): Self = StObject.set(x, "minDetectableFaceSize", value.asInstanceOf[js.Any])
      
      inline def setProcessNextFrameAsync(value: VideoFrame => IPromiseWithIAsyncOperation[IVector[Any]]): Self = StObject.set(x, "processNextFrameAsync", js.Any.fromFunction1(value))
    }
  }
}
