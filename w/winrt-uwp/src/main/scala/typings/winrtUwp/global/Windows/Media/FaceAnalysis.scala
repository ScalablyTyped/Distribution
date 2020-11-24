package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for face detection in bitmaps or video frames. */
@JSGlobal("Windows.Media.FaceAnalysis")
@js.native
object FaceAnalysis extends js.Object {
  
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  @js.native
  abstract class DetectedFace ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
  
  /** Detects faces in a SoftwareBitmap . */
  @js.native
  abstract class FaceDetector ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector
  /* static members */
  @js.native
  object FaceDetector extends js.Object {
    
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
    
    /** Gets a value indicating whether the FaceDetector class is supported on the current device. */
    var isSupported: Boolean = js.native
  }
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  @js.native
  abstract class FaceTracker ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker
  /* static members */
  @js.native
  object FaceTracker extends js.Object {
    
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
    
    /** Gets a value indicating whether the FaceTracker class is supported on the current device. */
    var isSupported: Boolean = js.native
  }
}
