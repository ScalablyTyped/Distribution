package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Numerics.Vector2
import typings.winrtUwp.Windows.Foundation.Numerics.Vector3
import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Accesses and controls the device for variable photo sequences. */
@JSGlobal("Windows.Media.Devices.Core")
@js.native
object Core extends js.Object {
  /** Represents the intrinsics that describe the camera distortion model. */
  @js.native
  class CameraIntrinsics protected ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.CameraIntrinsics {
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
    /* CompleteClass */
    override var focalLength: Vector2 = js.native
    /** Gets the image height of the camera, in pixels. */
    /* CompleteClass */
    override var imageHeight: Double = js.native
    /** Gets the image width of the camera, in pixels. */
    /* CompleteClass */
    override var imageWidth: Double = js.native
    /** Gets the principal point of the camera. */
    /* CompleteClass */
    override var principalPoint: Vector2 = js.native
    /** Gets the radial distortion coefficient of the camera. */
    /* CompleteClass */
    override var radialDistortion: Vector3 = js.native
    /** Gets the tangential distortion coefficient of the camera. */
    /* CompleteClass */
    override var tangentialDistortion: Vector2 = js.native
    /**
      * Projects an array of camera space points into screen space pixel coordinates.
      * @param coordinates The array of camera space points to project into screen space.
      * @return The array of screen space pixel coordinates.
      */
    /* CompleteClass */
    override def projectManyOntoFrame(coordinates: Vector3): Point = js.native
    /**
      * Projects a camera space point into screen space pixel coordinates.
      * @param coordinate The camera space point to project into screen space.
      * @return The screen space pixel coordinates.
      */
    /* CompleteClass */
    override def projectOntoFrame(coordinate: Vector3): Point = js.native
    /**
      * Unprojects pixel coordinates into a camera space ray from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
      * @param pixelCoordinate The pixel coordinates to unproject into camera space.
      * @return The X, Y coordinates of the unprojected pixel on the plane at Z = 1.0.
      */
    /* CompleteClass */
    override def unprojectAtUnitDepth(pixelCoordinate: Point): Vector2 = js.native
    /**
      * Unprojects an array pixel coordinates into a camera space rays from the camera origin, expressed as a X, Y coordinates on the plane at Z = 1.0.
      * @param pixelCoordinates The array of pixel coordinates to unproject into camera space.
      * @return The array of X, Y coordinates of the unprojected pixels on the plane at Z = 1.0.
      */
    /* CompleteClass */
    override def unprojectPixelsAtUnitDepth(pixelCoordinates: Point): Vector2 = js.native
  }
  
  /** Provides information about the variable photo sequence capabilities of the capture device. */
  @js.native
  abstract class FrameControlCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameControlCapabilities {
    /** Gets the exposure capabilities of the capture device for variable photo sequences. */
    /* CompleteClass */
    override var exposure: typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCapabilities = js.native
    /** Gets the exposure compensation capabilities of the capture device for variable photo sequences. */
    /* CompleteClass */
    override var exposureCompensation: typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationCapabilities = js.native
    /** Gets the flash capabilities of the capture device for variable photo sequences. */
    /* CompleteClass */
    override var flash: typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashCapabilities = js.native
    /** Gets the focus capabilities of the capture device for variable photo sequences. */
    /* CompleteClass */
    override var focus: typings.winrtUwp.Windows.Media.Devices.Core.FrameFocusCapabilities = js.native
    /** Gets the ISO speed capabilities of the capture device for variable photo sequences. */
    /* CompleteClass */
    override var isoSpeed: typings.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedCapabilities = js.native
    /** Gets whether the capture device supports photo confirmation for variable photo sequences. */
    /* CompleteClass */
    override var photoConfirmationSupported: Boolean = js.native
  }
  
  /** Represents the settings for a frame in a variable photo sequence. */
  @js.native
  /** Initializes a new instance of the FrameController class. */
  class FrameController ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameController {
    /** Gets the exposure compensation settings for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var exposureCompensationControl: typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationControl = js.native
    /** Gets the exposure settings for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var exposureControl: typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureControl = js.native
    /** Gets the flash settings for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var flashControl: typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashControl = js.native
    /** Gets the focus settings for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var focusControl: typings.winrtUwp.Windows.Media.Devices.Core.FrameFocusControl = js.native
    /** Gets the ISO speed settings for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var isoSpeedControl: typings.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedControl = js.native
    /** Gets or sets whether photo confirmation is enabled for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var photoConfirmationEnabled: Boolean = js.native
  }
  
  /** Provides information about the exposure time capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCapabilities {
    /** Gets the maximum exposure time supported by the capture device. */
    /* CompleteClass */
    override var max: Double = js.native
    /** Gets the minimum exposure time supported by the capture device. */
    /* CompleteClass */
    override var min: Double = js.native
    /** Gets the smallest exposure time increment supported by the capture device. */
    /* CompleteClass */
    override var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the exposure control for variable photo sequences. */
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  /** Provides information about the exposure compensation capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameExposureCompensationCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationCapabilities {
    /** Gets the maximum exposure compensation supported by the capture device. */
    /* CompleteClass */
    override var max: Double = js.native
    /** Gets the minimum exposure compensation supported by the capture device. */
    /* CompleteClass */
    override var min: Double = js.native
    /** Gets the smallest exposure time compensation increment supported by the capture device. */
    /* CompleteClass */
    override var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the frame exposure compensation control for frames in a variable photo sequence. */
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  /** Represents the exposure compensation settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureCompensationControl ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureCompensationControl {
    /** Gets or sets the exposure compensation time for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  /** Represents the exposure time settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameExposureControl ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameExposureControl {
    /** Gets or sets a value indicating whether auto exposure is enabled for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var auto: Boolean = js.native
    /** Gets or sets the exposure time for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  /** Provides information about the flash capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFlashCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashCapabilities {
    /** Gets a value indicating whether flash power is supported for frames in a variable photo sequences. */
    /* CompleteClass */
    override var powerSupported: Boolean = js.native
    /** Gets a value indicating whether red eye reduction is supported for frames in a variable photo sequences. */
    /* CompleteClass */
    override var redEyeReductionSupported: Boolean = js.native
    /** Gets a value that indicates if the capture device supports the flash control for frames in a variable photo sequence. */
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  /** Represents the flash settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFlashControl ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashControl {
    /** Gets or sets a value indicating whether flash settings are automatically set for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var auto: Boolean = js.native
    /** Gets or sets the flash mode for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var mode: FrameFlashMode = js.native
    /** Gets or sets the flash power for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var powerPercent: Double = js.native
    /** Gets or sets a value indicating if red eye reduction is enabled for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var redEyeReduction: Boolean = js.native
  }
  
  /** Provides information about the focus capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameFocusCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameFocusCapabilities {
    /** Gets the maximum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    /* CompleteClass */
    override var max: Double = js.native
    /** Gets the minimum focus length supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    /* CompleteClass */
    override var min: Double = js.native
    /** Gets the smallest focus increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    /* CompleteClass */
    override var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the focus control for frames in a variable photo sequence. */
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  /** Represents the focus settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameFocusControl ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameFocusControl {
    /** Gets or sets the focus value for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  /** Provides information about the ISO speed capabilities of the capture device for frames in a variable photo sequences. */
  @js.native
  abstract class FrameIsoSpeedCapabilities ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedCapabilities {
    /** Gets the maximum ISO speed supported by the capture device for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var max: Double = js.native
    /** The minimum ISO speed supported by the capture device for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var min: Double = js.native
    /** Gets the smallest ISO speed increment supported by the capture device for a frame in a variable photo sequence, specified in millimeters. */
    /* CompleteClass */
    override var step: Double = js.native
    /** Gets a value that indicates if the capture device supports the ISO speed control for frames in a variable photo sequence. */
    /* CompleteClass */
    override var supported: Boolean = js.native
  }
  
  /** Represents the ISO speed settings for a frame in a variable photo sequence. */
  @js.native
  abstract class FrameIsoSpeedControl ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.FrameIsoSpeedControl {
    /** Gets or sets a value indicating whether ISO speed is automatically set for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var auto: Boolean = js.native
    /** Gets or sets the ISO speed for a frame in a variable photo sequence. */
    /* CompleteClass */
    override var value: Double = js.native
  }
  
  /** Represents the settings for a variable photo sequence. */
  @js.native
  abstract class VariablePhotoSequenceController ()
    extends typings.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController {
    /** Gets the list of FrameController objects that determine the settings for each frame in a variable photo sequence. */
    /* CompleteClass */
    override var desiredFrameControllers: IVector[typings.winrtUwp.Windows.Media.Devices.Core.FrameController] = js.native
    /** Gets a FrameControlCapabilities object that provides information about the variable photo sequence capabilities of the capture device. */
    /* CompleteClass */
    override var frameCapabilities: typings.winrtUwp.Windows.Media.Devices.Core.FrameControlCapabilities = js.native
    /** Gets the maximum number of photos that can be taken per second in a variable photo sequence. */
    /* CompleteClass */
    override var maxPhotosPerSecond: Double = js.native
    /** Gets or sets the number of photos that are taken per second in a variable photo sequence. */
    /* CompleteClass */
    override var photosPerSecondLimit: Double = js.native
    /** Gets a value that indicates whether variable photo sequences are supported by the capture device. */
    /* CompleteClass */
    override var supported: Boolean = js.native
    /**
      * Gets the current frame rate at which pictures can be taken in a variable photo sequence.
      * @return The current frame rate at which pictures can be taken in a variable photo sequence.
      */
    /* CompleteClass */
    override def getCurrentFrameRate(): MediaRatio = js.native
    /**
      * Gets the highest frame rate supported when video and a variable photo sequence are being captured concurrently.
      * @param captureProperties The media encoding properties.
      * @return The highest supported concurrent frame rate.
      */
    /* CompleteClass */
    override def getHighestConcurrentFrameRate(captureProperties: IMediaEncodingProperties): MediaRatio = js.native
  }
  
  /** Specifies the flash mode for a frame in a variable photo sequence. */
  @js.native
  object FrameFlashMode extends js.Object {
    /* 0 */ val disable: typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.disable with Double = js.native
    /* 1 */ val enable: typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.enable with Double = js.native
    /* 2 */ val global: typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode.global with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.Devices.Core.FrameFlashMode with Double] = js.native
  }
  
}

