package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapBounds
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for face detection in bitmaps or video frames. */
object FaceAnalysis {
  
  /** Represents a face that was detected in a SoftwareBitmap or a VideoFrame . */
  @JSGlobal("Windows.Media.FaceAnalysis.DetectedFace")
  @js.native
  abstract class DetectedFace ()
    extends StObject
       with typings.winrtUwp.Windows.Media.FaceAnalysis.DetectedFace {
    
    /** Gets the bounds the detected face occupies in the SoftwareBitmap or VideoFrame . */
    /* CompleteClass */
    var faceBox: BitmapBounds = js.native
  }
  
  /** Detects faces in a SoftwareBitmap . */
  @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
  @js.native
  abstract class FaceDetector ()
    extends StObject
       with typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector
  object FaceDetector {
    
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the FaceDetector class.
      * @return An asynchronous operation that returns a FaceDetector instance upon successful completion.
      */
    /* static member */
    inline def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceDetector]]
    
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceDetector on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceDetector on the current device.
      */
    /* static member */
    inline def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedBitmapPixelFormats")().asInstanceOf[IVectorView[BitmapPixelFormat]]
    
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceDetector on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    /* static member */
    inline def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBitmapPixelFormatSupported")(bitmapPixelFormat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Gets a value indicating whether the FaceDetector class is supported on the current device. */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceDetector.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    inline def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
  }
  
  /** Detects faces in VideoFrame objects and tracks faces across subsequent video frames. */
  @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
  @js.native
  abstract class FaceTracker ()
    extends StObject
       with typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker {
    
    /** Gets or sets the maximum detectable face size, in pixels. */
    /* CompleteClass */
    var maxDetectableFaceSize: BitmapSize = js.native
    
    /** Gets or sets the minimum detectable face size, in pixels. */
    /* CompleteClass */
    var minDetectableFaceSize: BitmapSize = js.native
    
    /**
      * Asynchronously processes a VideoFrame for face detection.
      * @param videoFrame The VideoFrame in which faces are detected or tracked.
      * @return An asynchronous operation that returns a list of DetectedFace objects upon successful completion.
      */
    /* CompleteClass */
    override def processNextFrameAsync(videoFrame: typings.winrtUwp.Windows.Media.VideoFrame): IPromiseWithIAsyncOperation[IVector[Any]] = js.native
  }
  object FaceTracker {
    
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the FaceTracker class.
      * @return An asynchronous operation that returns a FaceTracker instance upon successful completion.
      */
    /* static member */
    inline def createAsync(): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker] = ^.asInstanceOf[js.Dynamic].applyDynamic("createAsync")().asInstanceOf[IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Media.FaceAnalysis.FaceTracker]]
    
    /**
      * Returns a list of the bitmap pixels formats supported by the FaceTracker on the current device.
      * @return A list of the bitmap pixels formats supported by the FaceTracker on the current device.
      */
    /* static member */
    inline def getSupportedBitmapPixelFormats(): IVectorView[BitmapPixelFormat] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSupportedBitmapPixelFormats")().asInstanceOf[IVectorView[BitmapPixelFormat]]
    
    /**
      * Queries whether the specified bitmap pixel format is supported by the FaceTracker on the current device.
      * @param bitmapPixelFormat The bitmap pixel format for which support is queried.
      * @return True if the specified bitmap pixel format is supported; otherwise, false.
      */
    /* static member */
    inline def isBitmapPixelFormatSupported(bitmapPixelFormat: BitmapPixelFormat): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBitmapPixelFormatSupported")(bitmapPixelFormat.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Gets a value indicating whether the FaceTracker class is supported on the current device. */
    /* static member */
    @JSGlobal("Windows.Media.FaceAnalysis.FaceTracker.isSupported")
    @js.native
    def isSupported: Boolean = js.native
    inline def isSupported_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSupported")(x.asInstanceOf[js.Any])
  }
}
