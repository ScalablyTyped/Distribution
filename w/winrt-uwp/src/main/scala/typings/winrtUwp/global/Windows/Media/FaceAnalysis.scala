package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for face detection in bitmaps or video frames. */
@JSGlobal("Windows.Media.FaceAnalysis")
@js.native
object FaceAnalysis extends js.Object {
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  @js.native
  abstract class DetectedFace ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace {
    /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
    /* CompleteClass */
    override var faceBox: BitmapBounds = js.native
  }
  
  /** Detects faces in a SoftwareBitmap . */
  @js.native
  abstract class FaceDetector ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  @js.native
  abstract class FaceTracker ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker {
    /** Gets or sets the maximum detectable face size, in pixels. */
    /* CompleteClass */
    override var maxDetectableFaceSize: BitmapSize = js.native
    /** Gets or sets the minimum detectable face size, in pixels. */
    /* CompleteClass */
    override var minDetectableFaceSize: BitmapSize = js.native
    /**
      * Asynchronously processes a VideoFrame for face detection.
      * @param videoFrame The VideoFrame in which faces are detected or tracked.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    /* CompleteClass */
    override def processNextFrameAsync(videoFrame: typings.winrtUwp.Windows.Media.VideoFrame): IPromiseWithIAsyncOperation[IVector[_]] = js.native
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
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector] = js.native
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
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker] = js.native
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

