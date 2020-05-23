package typings.winrtUwp.Windows.Media.Devices

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
trait VideoDeviceController extends js.Object {
  /** Gets the advanced photo capture control for this video device. */
  var advancedPhotoControl: AdvancedPhotoControl
  /** Specifies whether back-light compensation is enabled on the camera. */
  var backlightCompensation: MediaDeviceControl
  /** Gets or sets the brightness level on the camera. */
  var brightness: MediaDeviceControl
  /** Gets or sets the contrast level on the camera. */
  var contrast: MediaDeviceControl
  /** Gets or sets a value that indicates the optimizations the capture device should use to prioritize high quality picture, low latency, or low power consumption during video capture. */
  var desiredOptimization: MediaCaptureOptimization
  /** Gets or sets the camera's exposure time. */
  var exposure: MediaDeviceControl
  /** Gets the exposure compensation control for this video device. */
  var exposureCompensationControl: ExposureCompensationControl
  /** Gets the exposure control for this video device. */
  var exposureControl: ExposureControl
  /** Gets the ExposurePriorityVideoControl associated with the VideoDeviceController . */
  var exposurePriorityVideoControl: ExposurePriorityVideoControl
  /** Gets the flash control for this video device. */
  var flashControl: FlashControl
  /** Gets or sets the camera's focus setting. */
  var focus: MediaDeviceControl
  /** Gets the focus control for this video device. */
  var focusControl: FocusControl
  /** Gets the HdrVideoControl associated with the VideoDeviceController . */
  var hdrVideoControl: HdrVideoControl
  /** Gets or sets the camera's hue setting. */
  var hue: MediaDeviceControl
  /** Gets the ISO film speed control for this video device. */
  var isoSpeedControl: IsoSpeedControl
  /** Gets the low shutter lag photo control for this video device. */
  var lowLagPhoto: LowLagPhotoControl
  /** Gets the low shutter lag photo sequence control for this video device. */
  var lowLagPhotoSequence: LowLagPhotoSequenceControl
  /** Gets the OpticalImageStabilizationControl associated with the VideoDeviceController . */
  var opticalImageStabilizationControl: OpticalImageStabilizationControl
  /** Gets or sets the camera's pan setting. */
  var pan: MediaDeviceControl
  /** Gets the photo confirmation control for this video device. */
  var photoConfirmationControl: PhotoConfirmationControl
  /** Gets or sets the primary use for the device. */
  var primaryUse: CaptureUse
  /** Gets the regions of interest control for this video device. */
  var regionsOfInterestControl: RegionsOfInterestControl
  /** Gets or sets the camera's roll setting. */
  var roll: MediaDeviceControl
  /** Gets the scene mode control for this video device. */
  var sceneModeControl: SceneModeControl
  /** Gets or sets the camera's tilt setting. */
  var tilt: MediaDeviceControl
  /** Gets the torch control for this video device. */
  var torchControl: TorchControl
  /** Gets the VariablePhotoSequenceController associated with the VideoDeviceController . */
  var variablePhotoSequenceController: VariablePhotoSequenceController
  /** Gets or sets the white balance on the camera. */
  var whiteBalance: MediaDeviceControl
  /** Gets the white balance control for this video device. */
  var whiteBalanceControl: WhiteBalanceControl
  /** Gets and sets the camera's zoom setting. */
  var zoom: MediaDeviceControl
  /** Gets the ZoomControl associated with the VideoDeviceController . */
  var zoomControl: ZoomControl
  /**
    * Gets a list of the supported encoding properties for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties]
  /**
    * Gets a property on the camera. You can use this method to query properties that are specific to a particular camera.
    * @param propertyId The property identifier.
    * @return The property value.
    */
  def getDeviceProperty(propertyId: String): js.Any
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction
  /**
    * Gets the local power line frequency.
    */
  def tryGetPowerlineFrequency(): ReturnValueBoolean
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean
}

object VideoDeviceController {
  @scala.inline
  def apply(
    advancedPhotoControl: AdvancedPhotoControl,
    backlightCompensation: MediaDeviceControl,
    brightness: MediaDeviceControl,
    contrast: MediaDeviceControl,
    desiredOptimization: MediaCaptureOptimization,
    exposure: MediaDeviceControl,
    exposureCompensationControl: ExposureCompensationControl,
    exposureControl: ExposureControl,
    exposurePriorityVideoControl: ExposurePriorityVideoControl,
    flashControl: FlashControl,
    focus: MediaDeviceControl,
    focusControl: FocusControl,
    getAvailableMediaStreamProperties: MediaStreamType => IVectorView[IMediaEncodingProperties],
    getDeviceProperty: String => js.Any,
    getMediaStreamProperties: MediaStreamType => IMediaEncodingProperties,
    hdrVideoControl: HdrVideoControl,
    hue: MediaDeviceControl,
    isoSpeedControl: IsoSpeedControl,
    lowLagPhoto: LowLagPhotoControl,
    lowLagPhotoSequence: LowLagPhotoSequenceControl,
    opticalImageStabilizationControl: OpticalImageStabilizationControl,
    pan: MediaDeviceControl,
    photoConfirmationControl: PhotoConfirmationControl,
    primaryUse: CaptureUse,
    regionsOfInterestControl: RegionsOfInterestControl,
    roll: MediaDeviceControl,
    sceneModeControl: SceneModeControl,
    setDeviceProperty: (String, js.Any) => Unit,
    setMediaStreamPropertiesAsync: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction,
    tilt: MediaDeviceControl,
    torchControl: TorchControl,
    tryGetPowerlineFrequency: () => ReturnValueBoolean,
    trySetPowerlineFrequency: PowerlineFrequency => Boolean,
    variablePhotoSequenceController: VariablePhotoSequenceController,
    whiteBalance: MediaDeviceControl,
    whiteBalanceControl: WhiteBalanceControl,
    zoom: MediaDeviceControl,
    zoomControl: ZoomControl
  ): VideoDeviceController = {
    val __obj = js.Dynamic.literal(advancedPhotoControl = advancedPhotoControl.asInstanceOf[js.Any], backlightCompensation = backlightCompensation.asInstanceOf[js.Any], brightness = brightness.asInstanceOf[js.Any], contrast = contrast.asInstanceOf[js.Any], desiredOptimization = desiredOptimization.asInstanceOf[js.Any], exposure = exposure.asInstanceOf[js.Any], exposureCompensationControl = exposureCompensationControl.asInstanceOf[js.Any], exposureControl = exposureControl.asInstanceOf[js.Any], exposurePriorityVideoControl = exposurePriorityVideoControl.asInstanceOf[js.Any], flashControl = flashControl.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusControl = focusControl.asInstanceOf[js.Any], getAvailableMediaStreamProperties = js.Any.fromFunction1(getAvailableMediaStreamProperties), getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), getMediaStreamProperties = js.Any.fromFunction1(getMediaStreamProperties), hdrVideoControl = hdrVideoControl.asInstanceOf[js.Any], hue = hue.asInstanceOf[js.Any], isoSpeedControl = isoSpeedControl.asInstanceOf[js.Any], lowLagPhoto = lowLagPhoto.asInstanceOf[js.Any], lowLagPhotoSequence = lowLagPhotoSequence.asInstanceOf[js.Any], opticalImageStabilizationControl = opticalImageStabilizationControl.asInstanceOf[js.Any], pan = pan.asInstanceOf[js.Any], photoConfirmationControl = photoConfirmationControl.asInstanceOf[js.Any], primaryUse = primaryUse.asInstanceOf[js.Any], regionsOfInterestControl = regionsOfInterestControl.asInstanceOf[js.Any], roll = roll.asInstanceOf[js.Any], sceneModeControl = sceneModeControl.asInstanceOf[js.Any], setDeviceProperty = js.Any.fromFunction2(setDeviceProperty), setMediaStreamPropertiesAsync = js.Any.fromFunction2(setMediaStreamPropertiesAsync), tilt = tilt.asInstanceOf[js.Any], torchControl = torchControl.asInstanceOf[js.Any], tryGetPowerlineFrequency = js.Any.fromFunction0(tryGetPowerlineFrequency), trySetPowerlineFrequency = js.Any.fromFunction1(trySetPowerlineFrequency), variablePhotoSequenceController = variablePhotoSequenceController.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], whiteBalanceControl = whiteBalanceControl.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any], zoomControl = zoomControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoDeviceController]
  }
}

