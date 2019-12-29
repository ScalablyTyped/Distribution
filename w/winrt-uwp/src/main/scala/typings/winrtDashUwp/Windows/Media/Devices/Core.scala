package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Foundation.Numerics.Vector2
import typings.winrtDashUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtDashUwp.Windows.Foundation.Point
import typings.winrtDashUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtDashUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Accesses and controls the device for variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core")
@js.native
object Core extends js.Object {
  /** Represents the intrinsics that describe the camera distortion model. */
  @js.native
  class CameraIntrinsics protected () extends js.Object {
    /**
      * Initializes a new instance of the CameraIntrinsics class.
      * @param focalLength The focal length of the camera.
      * @param principalPoint The principal point of the camera.
      * @param radialDistortion The radial distortion coefficient of the camera.
      * @param tangentialDistortion The tangential distortion coefficient of the camera.
      * @param imageWidth The image width of the camera, in pixels.
      * @param imageHeight The image height of the camera, in pixels.
      */
    def this(
      focalLength: Vector2,
      principalPoint: Vector2,
      radialDistortion: Vector3,
      tangentialDistortion: Vector2,
      imageWidth: Double,
      imageHeight: Double
    ) = this()
    /** Gets the focal length of the camera. */
    var focalLength: Vector2 = js.native
    /** Gets the image height of the camera, in pixels. */
    var imageHeight: Double = js.native
    /** Gets the image width of the camera, in pixels. */
    var imageWidth: Double = js.native
    /** Gets the principal point of the camera. */
    var principalPoint: Vector2 = js.native
    /** Gets the radial distortion coefficient of the camera. */
    var radialDistortion: Vector3 = js.native
    /** Gets the tangential distortion coefficient of the camera. */
    var tangentialDistortion: Vector2 = js.native
    /**
      * Projects an array of camera space points into screen space pixel coordinates.
      * @param coordinates The array of camera space points to project into screen space.
      * @return The array of screen space pixel coordinates.
      */
    def projectManyOntoFrame(coordinates: Vector3): Point = js.native
    /**
      * Projects a camera space point into screen space pixel coordinates.
      * @param coordinate The camera space point to project into screen space.
      * @return The screen space pixel coordinates.
      */
    def projectOntoFrame(coordinate: Vector3): Point = js.native
    /**
      * Unprojects pixel coordinates into a camera space ray from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
      * @param pixelCoordinate The pixel coordinates to unproject into camera space.
      * @return The X, Y coordinates of the unprojected pixel on the plane at Z = 1.0.
      */
    def unprojectAtUnitDepth(pixelCoordinate: Point): Vector2 = js.native
    /**
      * Unprojects an array pixel coordinates into a camera space rays from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
      * @param pixelCoordinates The array of pixel coordinates to unproject into camera space.
      * @return The array of X, Y coordinates of the unprojected pixels on the plane at Z = 1.0.
      */
    def unprojectPixelsAtUnitDepth(pixelCoordinates: Point): Vector2 = js.native
  }
  
  /** Provides information about the variable photo sequence capabilities of the capture device. */
  @js.native
  abstract class FrameControlCapabilities () extends js.Object {
    /** Gets the exposure capabilities of the capture device for variable photo sequences. */
    var exposure: FrameExposureCapabilities = js.native
    /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
    var exposureCompensation: FrameExposureCompensationCapabilities = js.native
    /** Gets the flash capabilities of the capture device for variable photo sequences. */
    var flash: FrameFlashCapabilities = js.native
    /** Gets the focus capabilities of the capture device for variable photo sequences. */
    var focus: FrameFocusCapabilities = js.native
    /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
    var isoSpeed: FrameIsoSpeedCapabilities = js.native
    /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
    var photoConfirmationSupported: Boolean = js.native
  }
  
  /** Represents the settings for a frame in a variable photo sequence. */
  @js.native
  /** Initializes a new instance of the FrameController class. */
  class FrameController () extends js.Object {
    /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
    var exposureCompensationControl: FrameExposureCompensationControl = js.native
    /** Gets the exposure settings for a frame in a variable photo sequence. */
    var exposureControl: FrameExposureControl = js.native
    /** Gets the flash settings for a frame in a variable photo sequence. */
    var flashControl: FrameFlashControl = js.native
    /** Gets the focus settings for a frame in a variable photo sequence. */
    var focusControl: FrameFocusControl = js.native
    /** Gets the ISO speed settings for a frame in a variable photo sequence. */
    var isoSpeedControl: FrameIsoSpeedControl = js.native
    /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
    var photoConfirmationEnabled: Boolean = js.native
  }
  
  /** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCapabilities () extends js.Object {
    /** Gets the maximum exposure time supported by the capture device. */
    var max: Double = js.native
    /** Gets the minimum exposure time supported by the capture device. */
    var min: Double = js.native
    /** Gets the smallest exposure time increment supported by the capture device. */
    var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the exposure control for variable photo sequences. */
    var supported: Boolean = js.native
  }
  
  /** Provides information about the exposure compensation capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCompensationCapabilities () extends js.Object {
    /** Gets the maximum exposure compensation supported by the capture device. */
    var max: Double = js.native
    /** Gets the minimum exposure compensation supported by the capture device. */
    var min: Double = js.native
    /** Gets the smallest exposure time compensation increment supported by the capture device. */
    var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the frame exposure compensation control for frames in a variable photo sequence. */
    var supported: Boolean = js.native
  }
  
  /** Represents the exposure compensation settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureCompensationControl () extends js.Object {
    /** Gets or sets the exposure compensation time for a frame in a variable photo sequence. */
    var value: Double = js.native
  }
  
  /** Represents the exposure time settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureControl () extends js.Object {
    /** Gets or sets a value indicating whether auto exposure is enabled for a frame in a variable photo sequence. */
    var auto: Boolean = js.native
    /** Gets or sets the exposure time for a frame in a variable photo sequence. */
    var value: Double = js.native
  }
  
  /** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFlashCapabilities () extends js.Object {
    /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
    var powerSupported: Boolean = js.native
    /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
    var redEyeReductionSupported: Boolean = js.native
    /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
    var supported: Boolean = js.native
  }
  
  /** Represents the flash settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFlashControl () extends js.Object {
    /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
    var auto: Boolean = js.native
    /** Gets or sets the flash mode for a frame in a variable photo sequence. */
    var mode: FrameFlashMode = js.native
    /** Gets or sets the flash power for a frame in a variable photo sequence. */
    var powerPercent: Double = js.native
    /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
    var redEyeReduction: Boolean = js.native
  }
  
  @js.native
  sealed trait FrameFlashMode extends js.Object
  
  /** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFocusCapabilities () extends js.Object {
    /** Gets the maximum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    var max: Double = js.native
    /** Gets the minimum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    var min: Double = js.native
    /** Gets the smallest focus increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the focus control for frames in a variable photo sequence. */
    var supported: Boolean = js.native
  }
  
  /** Represents the focus settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFocusControl () extends js.Object {
    /** Gets or sets the focus value for a frame in a variable photo sequence. */
    var value: Double = js.native
  }
  
  /** Provides information about the ISO speed capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameIsoSpeedCapabilities () extends js.Object {
    /** Gets the maximum ISO speed supported by the capture device for a frame in a variable photo sequence. */
    var max: Double = js.native
    /** The minimum ISO speed supported by the capture device for a frame in a variable photo sequence. */
    var min: Double = js.native
    /** Gets the smallest ISO speed increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the ISO speed control for frames in a variable photo sequence. */
    var supported: Boolean = js.native
  }
  
  /** Represents the ISO speed settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameIsoSpeedControl () extends js.Object {
    /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
    var auto: Boolean = js.native
    /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
    var value: Double = js.native
  }
  
  /** Represents the settings for a variable photo sequence. */
  @js.native
  abstract class VariablePhotoSequenceController () extends js.Object {
    /** Gets the list of FrameController objects that determine the settings for each frame in a variable photo sequence. */
    var desiredFrameControllers: IVector[FrameController] = js.native
    /** Gets a FrameControlCapabilities object that provides information about the variable photo sequence capabilities of the capture device. */
    var frameCapabilities: FrameControlCapabilities = js.native
    /** Gets the maximum number of photos that can be taken per second in a variable photo sequence. */
    var maxPhotosPerSecond: Double = js.native
    /** Gets or sets the number of photos that are taken per second in a variable photo sequence. */
    var photosPerSecondLimit: Double = js.native
    /** Gets a value that indicates whether variable photo sequences are supported by the capture device. */
    var supported: Boolean = js.native
    /**
      * Gets the current frame rate at which pictures can be taken in a variable photo sequence.
      * @return The current frame rate at which pictures can be taken in a variable photo sequence.
      */
    def getCurrentFrameRate(): MediaRatio = js.native
    /**
      * Gets the highest frame rate supported when video and a variable photo sequence are being captured concurrently.
      * @param captureProperties The media encoding properties.
      * @return The highest supported concurrent frame rate.
      */
    def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
  }
  
  /** Specifies the flash mode for a frame in a variable photo sequence. */
  @js.native
  object FrameFlashMode extends js.Object {
    /** The flash is disabled. */
    @js.native
    sealed trait disable extends FrameFlashMode
    
    /** The flash is enabled. */
    @js.native
    sealed trait enable extends FrameFlashMode
    
    /** The flash uses the global flash mode. */
    @js.native
    sealed trait global extends FrameFlashMode
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FrameFlashMode with Double] = js.native
    /* 0 */ @js.native
    object disable extends TopLevel[disable with Double]
    
    /* 1 */ @js.native
    object enable extends TopLevel[enable with Double]
    
    /* 2 */ @js.native
    object global extends TopLevel[global with Double]
    
  }
  
}

