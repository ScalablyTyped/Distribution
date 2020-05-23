package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Capture.MediaStreamType
import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import typings.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.anon.ReturnValueBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls device settings on the camera. */
@JSGlobal("Windows.Media.Devices.VideoDeviceController")
@js.native
abstract class VideoDeviceController ()
  extends typings.winrtUwp.Windows.Media.Devices.VideoDeviceController {
  /** Gets the advanced photo capture control for this video device. */
  /* CompleteClass */
  override var advancedPhotoControl: typings.winrtUwp.Windows.Media.Devices.AdvancedPhotoControl = js.native
  /** Specifies whether back-light compensation is enabled on the camera. */
  /* CompleteClass */
  override var backlightCompensation: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets or sets the brightness level on the camera. */
  /* CompleteClass */
  override var brightness: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets or sets the contrast level on the camera. */
  /* CompleteClass */
  override var contrast: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets or sets a value that indicates the optimizations the capture device should use to prioritize high quality picture, low latency, or low power consumption during video capture. */
  /* CompleteClass */
  override var desiredOptimization: typings.winrtUwp.Windows.Media.Devices.MediaCaptureOptimization = js.native
  /** Gets or sets the camera's exposure time. */
  /* CompleteClass */
  override var exposure: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the exposure compensation control for this video device. */
  /* CompleteClass */
  override var exposureCompensationControl: typings.winrtUwp.Windows.Media.Devices.ExposureCompensationControl = js.native
  /** Gets the exposure control for this video device. */
  /* CompleteClass */
  override var exposureControl: typings.winrtUwp.Windows.Media.Devices.ExposureControl = js.native
  /** Gets the ExposurePriorityVideoControl associated with the VideoDeviceController . */
  /* CompleteClass */
  override var exposurePriorityVideoControl: typings.winrtUwp.Windows.Media.Devices.ExposurePriorityVideoControl = js.native
  /** Gets the flash control for this video device. */
  /* CompleteClass */
  override var flashControl: typings.winrtUwp.Windows.Media.Devices.FlashControl = js.native
  /** Gets or sets the camera's focus setting. */
  /* CompleteClass */
  override var focus: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the focus control for this video device. */
  /* CompleteClass */
  override var focusControl: typings.winrtUwp.Windows.Media.Devices.FocusControl = js.native
  /** Gets the HdrVideoControl associated with the VideoDeviceController . */
  /* CompleteClass */
  override var hdrVideoControl: typings.winrtUwp.Windows.Media.Devices.HdrVideoControl = js.native
  /** Gets or sets the camera's hue setting. */
  /* CompleteClass */
  override var hue: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the ISO film speed control for this video device. */
  /* CompleteClass */
  override var isoSpeedControl: typings.winrtUwp.Windows.Media.Devices.IsoSpeedControl = js.native
  /** Gets the low shutter lag photo control for this video device. */
  /* CompleteClass */
  override var lowLagPhoto: typings.winrtUwp.Windows.Media.Devices.LowLagPhotoControl = js.native
  /** Gets the low shutter lag photo sequence control for this video device. */
  /* CompleteClass */
  override var lowLagPhotoSequence: typings.winrtUwp.Windows.Media.Devices.LowLagPhotoSequenceControl = js.native
  /** Gets the OpticalImageStabilizationControl associated with the VideoDeviceController . */
  /* CompleteClass */
  override var opticalImageStabilizationControl: typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationControl = js.native
  /** Gets or sets the camera's pan setting. */
  /* CompleteClass */
  override var pan: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the photo confirmation control for this video device. */
  /* CompleteClass */
  override var photoConfirmationControl: typings.winrtUwp.Windows.Media.Devices.PhotoConfirmationControl = js.native
  /** Gets or sets the primary use for the device. */
  /* CompleteClass */
  override var primaryUse: typings.winrtUwp.Windows.Media.Devices.CaptureUse = js.native
  /** Gets the regions of interest control for this video device. */
  /* CompleteClass */
  override var regionsOfInterestControl: typings.winrtUwp.Windows.Media.Devices.RegionsOfInterestControl = js.native
  /** Gets or sets the camera's roll setting. */
  /* CompleteClass */
  override var roll: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the scene mode control for this video device. */
  /* CompleteClass */
  override var sceneModeControl: typings.winrtUwp.Windows.Media.Devices.SceneModeControl = js.native
  /** Gets or sets the camera's tilt setting. */
  /* CompleteClass */
  override var tilt: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the torch control for this video device. */
  /* CompleteClass */
  override var torchControl: typings.winrtUwp.Windows.Media.Devices.TorchControl = js.native
  /** Gets the VariablePhotoSequenceController associated with the VideoDeviceController . */
  /* CompleteClass */
  override var variablePhotoSequenceController: VariablePhotoSequenceController = js.native
  /** Gets or sets the white balance on the camera. */
  /* CompleteClass */
  override var whiteBalance: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the white balance control for this video device. */
  /* CompleteClass */
  override var whiteBalanceControl: typings.winrtUwp.Windows.Media.Devices.WhiteBalanceControl = js.native
  /** Gets and sets the camera's zoom setting. */
  /* CompleteClass */
  override var zoom: typings.winrtUwp.Windows.Media.Devices.MediaDeviceControl = js.native
  /** Gets the ZoomControl associated with the VideoDeviceController . */
  /* CompleteClass */
  override var zoomControl: typings.winrtUwp.Windows.Media.Devices.ZoomControl = js.native
  /**
    * Gets a list of the supported encoding properties for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  /* CompleteClass */
  override def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /**
    * Gets a property on the camera. You can use this method to query properties that are specific to a particular camera.
    * @param propertyId The property identifier.
    * @return The property value.
    */
  /* CompleteClass */
  override def getDeviceProperty(propertyId: String): js.Any = js.native
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  /* CompleteClass */
  override def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  /* CompleteClass */
  override def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  /* CompleteClass */
  override def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the local power line frequency.
    */
  /* CompleteClass */
  override def tryGetPowerlineFrequency(): ReturnValueBoolean = js.native
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  /* CompleteClass */
  override def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
}

