package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for face detection in bitmaps or video frames. */
object FaceAnalysis {
  
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  @JSGlobal("Windows.Media.FaceAnalysis.DetectedFace")
  @js.native
  abstract class DetectedFace ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace
  
  /** Detects faces in a SoftwareBitmap . */
  @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
  @js.native
  abstract class FaceDetector ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector
  object FaceDetector {
    
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the FaceDetector class.
      * @return An asynchronous operation that returns a FaceDetector instance upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector.createAsync")
    @js.native
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector] = js.native
    
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceDetector on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceDetector on the current device.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector.getSupportedBitmapPixelFormats")
    @js.native
    def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = js.native
    
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceDetector on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector.isBitmapPixelFormatSupported")
    @js.native
    def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = js.native
    
    /** Gets a value indicating whether the FaceDetector class is supported on the current device. */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    @scala.inline
    def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
  }
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
  @js.native
  abstract class FaceTracker ()
    extends typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker
  object FaceTracker {
    
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the FaceTracker class.
      * @return An asynchronous operation that returns a FaceTracker instance upon successful completion.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker.createAsync")
    @js.native
    def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker] = js.native
    
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceTracker on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceTracker on the current device.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker.getSupportedBitmapPixelFormats")
    @js.native
    def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = js.native
    
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceTracker on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker.isBitmapPixelFormatSupported")
    @js.native
    def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = js.native
    
    /** Gets a value indicating whether the FaceTracker class is supported on the current device. */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    @scala.inline
    def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
  }
}
