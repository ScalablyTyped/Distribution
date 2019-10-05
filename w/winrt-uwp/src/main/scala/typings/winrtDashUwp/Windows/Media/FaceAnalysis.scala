package typings.winrtDashUwp.Windows.Media

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapBounds
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtDashUwp.Windows.Graphics.Imaging.BitmapSize
import typings.winrtDashUwp.Windows.Graphics.Imaging.SoftwareBitmap
import typings.winrtDashUwp.Windows.Media.FaceAnalysis.FaceDetector
import typings.winrtDashUwp.Windows.Media.FaceAnalysis.FaceTracker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for face detection in bitmaps or video frames. */
@JSGlobal("Windows.Media.FaceAnalysis")
@js.native
object FaceAnalysis extends js.Object {
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  @js.native
  abstract class DetectedFace () extends js.Object {
    /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
    var faceBox: BitmapBounds = js.native
  }
  
  /** Detects faces in a SoftwareBitmap . */
  @js.native
  abstract class FaceDetector () extends js.Object {
    /** Gets or sets the maximum detectable face size, in pixels. */
    var maxDetectableFaceSize: BitmapSize = js.native
    /** Gets or sets the minimum detectable face size, in pixels. */
    var minDetectableFaceSize: BitmapSize = js.native
    /**
      * Asynchronously detects faces in the provided SoftwareBitmap .
      * @param image The image data to be processed for face detection.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    def detectFacesAsync(image: SoftwareBitmap): IPromiseWithIAsyncOperation[IVector[_]] = js.native
    /**
      * Asynchronously detects faces in the provided SoftwareBitmap within the specified search area.
      * @param image The image data to be processed for face detection.
      * @param searchArea The bounds within the SoftwareBitmap in which face detection will be performed.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    def detectFacesAsync(image: SoftwareBitmap, searchArea: BitmapBounds): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  }
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  @js.native
  abstract class FaceTracker () extends js.Object {
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
  
  /* static members */
  @js.native
  object FaceDetector extends js.Object {
    /** Gets a value indicating whether the FaceDetector class is supported on the current device. */
    var isSupported: Boolean = js.native
    /**
      * Creates a new instance of the FaceDetector class.
      * @return An asynchronous operation that returns a FaceDetector instance upon successful completion.
      */
    def createAsync(): IPromiseWithIAsyncOperation[FaceDetector] = js.native
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceDetector on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceDetector on the current device.
      */
    def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = js.native
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceDetector on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FaceTracker extends js.Object {
    /** Gets a value indicating whether the FaceTracker class is supported on the current device. */
    var isSupported: Boolean = js.native
    /**
      * Creates a new instance of the FaceTracker class.
      * @return An asynchronous operation that returns a FaceTracker instance upon successful completion.
      */
    def createAsync(): IPromiseWithIAsyncOperation[FaceTracker] = js.native
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceTracker on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceTracker on the current device.
      */
    def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = js.native
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceTracker on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = js.native
  }
  
}

