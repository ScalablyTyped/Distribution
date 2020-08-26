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
@js.native
trait VideoDeviceController extends js.Object {
  /** Gets the advanced photo capture control for this video device. */
  var advancedPhotoControl: AdvancedPhotoControl = js.native
  /** Specifies whether back-light compensation is enabled on the camera. */
  var backlightCompensation: MediaDeviceControl = js.native
  /** Gets or sets the brightness level on the camera. */
  var brightness: MediaDeviceControl = js.native
  /** Gets or sets the contrast level on the camera. */
  var contrast: MediaDeviceControl = js.native
  /** Gets or sets a value that indicates the optimizations the capture device should use to prioritize high quality picture, low latency, or low power consumption during video capture. */
  var desiredOptimization: MediaCaptureOptimization = js.native
  /** Gets or sets the camera's exposure time. */
  var exposure: MediaDeviceControl = js.native
  /** Gets the exposure compensation control for this video device. */
  var exposureCompensationControl: ExposureCompensationControl = js.native
  /** Gets the exposure control for this video device. */
  var exposureControl: ExposureControl = js.native
  /** Gets the ExposurePriorityVideoControl associated with the VideoDeviceController . */
  var exposurePriorityVideoControl: ExposurePriorityVideoControl = js.native
  /** Gets the flash control for this video device. */
  var flashControl: FlashControl = js.native
  /** Gets or sets the camera's focus setting. */
  var focus: MediaDeviceControl = js.native
  /** Gets the focus control for this video device. */
  var focusControl: FocusControl = js.native
  /** Gets the HdrVideoControl associated with the VideoDeviceController . */
  var hdrVideoControl: HdrVideoControl = js.native
  /** Gets or sets the camera's hue setting. */
  var hue: MediaDeviceControl = js.native
  /** Gets the ISO film speed control for this video device. */
  var isoSpeedControl: IsoSpeedControl = js.native
  /** Gets the low shutter lag photo control for this video device. */
  var lowLagPhoto: LowLagPhotoControl = js.native
  /** Gets the low shutter lag photo sequence control for this video device. */
  var lowLagPhotoSequence: LowLagPhotoSequenceControl = js.native
  /** Gets the OpticalImageStabilizationControl associated with the VideoDeviceController . */
  var opticalImageStabilizationControl: OpticalImageStabilizationControl = js.native
  /** Gets or sets the camera's pan setting. */
  var pan: MediaDeviceControl = js.native
  /** Gets the photo confirmation control for this video device. */
  var photoConfirmationControl: PhotoConfirmationControl = js.native
  /** Gets or sets the primary use for the device. */
  var primaryUse: CaptureUse = js.native
  /** Gets the regions of interest control for this video device. */
  var regionsOfInterestControl: RegionsOfInterestControl = js.native
  /** Gets or sets the camera's roll setting. */
  var roll: MediaDeviceControl = js.native
  /** Gets the scene mode control for this video device. */
  var sceneModeControl: SceneModeControl = js.native
  /** Gets or sets the camera's tilt setting. */
  var tilt: MediaDeviceControl = js.native
  /** Gets the torch control for this video device. */
  var torchControl: TorchControl = js.native
  /** Gets the VariablePhotoSequenceController associated with the VideoDeviceController . */
  var variablePhotoSequenceController: VariablePhotoSequenceController = js.native
  /** Gets or sets the white balance on the camera. */
  var whiteBalance: MediaDeviceControl = js.native
  /** Gets the white balance control for this video device. */
  var whiteBalanceControl: WhiteBalanceControl = js.native
  /** Gets and sets the camera's zoom setting. */
  var zoom: MediaDeviceControl = js.native
  /** Gets the ZoomControl associated with the VideoDeviceController . */
  var zoomControl: ZoomControl = js.native
  /**
    * Gets a list of the supported encoding properties for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return A list of the supported encoding properties.
    */
  def getAvailableMediaStreamProperties(mediaStreamType: MediaStreamType): IVectorView[IMediaEncodingProperties] = js.native
  /**
    * Gets a property on the camera. You can use this method to query properties that are specific to a particular camera.
    * @param propertyId The property identifier.
    * @return The property value.
    */
  def getDeviceProperty(propertyId: String): js.Any = js.native
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties = js.native
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction = js.native
  /**
    * Gets the local power line frequency.
    */
  def tryGetPowerlineFrequency(): ReturnValueBoolean = js.native
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
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
  @scala.inline
  implicit class VideoDeviceControllerOps[Self <: VideoDeviceController] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdvancedPhotoControl(value: AdvancedPhotoControl): Self = this.set("advancedPhotoControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setBacklightCompensation(value: MediaDeviceControl): Self = this.set("backlightCompensation", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrightness(value: MediaDeviceControl): Self = this.set("brightness", value.asInstanceOf[js.Any])
    @scala.inline
    def setContrast(value: MediaDeviceControl): Self = this.set("contrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredOptimization(value: MediaCaptureOptimization): Self = this.set("desiredOptimization", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposure(value: MediaDeviceControl): Self = this.set("exposure", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureCompensationControl(value: ExposureCompensationControl): Self = this.set("exposureCompensationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposureControl(value: ExposureControl): Self = this.set("exposureControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setExposurePriorityVideoControl(value: ExposurePriorityVideoControl): Self = this.set("exposurePriorityVideoControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFlashControl(value: FlashControl): Self = this.set("flashControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocus(value: MediaDeviceControl): Self = this.set("focus", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusControl(value: FocusControl): Self = this.set("focusControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = this.set("getAvailableMediaStreamProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setGetDeviceProperty(value: String => js.Any): Self = this.set("getDeviceProperty", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = this.set("getMediaStreamProperties", js.Any.fromFunction1(value))
    @scala.inline
    def setHdrVideoControl(value: HdrVideoControl): Self = this.set("hdrVideoControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHue(value: MediaDeviceControl): Self = this.set("hue", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsoSpeedControl(value: IsoSpeedControl): Self = this.set("isoSpeedControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowLagPhoto(value: LowLagPhotoControl): Self = this.set("lowLagPhoto", value.asInstanceOf[js.Any])
    @scala.inline
    def setLowLagPhotoSequence(value: LowLagPhotoSequenceControl): Self = this.set("lowLagPhotoSequence", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpticalImageStabilizationControl(value: OpticalImageStabilizationControl): Self = this.set("opticalImageStabilizationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPan(value: MediaDeviceControl): Self = this.set("pan", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhotoConfirmationControl(value: PhotoConfirmationControl): Self = this.set("photoConfirmationControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimaryUse(value: CaptureUse): Self = this.set("primaryUse", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegionsOfInterestControl(value: RegionsOfInterestControl): Self = this.set("regionsOfInterestControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoll(value: MediaDeviceControl): Self = this.set("roll", value.asInstanceOf[js.Any])
    @scala.inline
    def setSceneModeControl(value: SceneModeControl): Self = this.set("sceneModeControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetDeviceProperty(value: (String, js.Any) => Unit): Self = this.set("setDeviceProperty", js.Any.fromFunction2(value))
    @scala.inline
    def setSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction): Self = this.set("setMediaStreamPropertiesAsync", js.Any.fromFunction2(value))
    @scala.inline
    def setTilt(value: MediaDeviceControl): Self = this.set("tilt", value.asInstanceOf[js.Any])
    @scala.inline
    def setTorchControl(value: TorchControl): Self = this.set("torchControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryGetPowerlineFrequency(value: () => ReturnValueBoolean): Self = this.set("tryGetPowerlineFrequency", js.Any.fromFunction0(value))
    @scala.inline
    def setTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = this.set("trySetPowerlineFrequency", js.Any.fromFunction1(value))
    @scala.inline
    def setVariablePhotoSequenceController(value: VariablePhotoSequenceController): Self = this.set("variablePhotoSequenceController", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteBalance(value: MediaDeviceControl): Self = this.set("whiteBalance", value.asInstanceOf[js.Any])
    @scala.inline
    def setWhiteBalanceControl(value: WhiteBalanceControl): Self = this.set("whiteBalanceControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoom(value: MediaDeviceControl): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def setZoomControl(value: ZoomControl): Self = this.set("zoomControl", value.asInstanceOf[js.Any])
  }
  
}

