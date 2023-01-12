package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Media.Capture.MediaStreamType
import typings.winrtUwp.Windows.Media.Capture.PowerlineFrequency
import typings.winrtUwp.Windows.Media.Devices.Core.VariablePhotoSequenceController
import typings.winrtUwp.Windows.Media.MediaProperties.IMediaEncodingProperties
import typings.winrtUwp.anon.ReturnValueBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Controls device settings on the camera. */
trait VideoDeviceController extends StObject {
  
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
  def getDeviceProperty(propertyId: String): Any
  
  /**
    * Gets the encoding properties for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to get the properties.
    * @return The encoding properties.
    */
  def getMediaStreamProperties(mediaStreamType: MediaStreamType): IMediaEncodingProperties
  
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
  
  /**
    * Sets a property on the device. You can use this method to set properties that are specific to a particular device.
    * @param propertyId The property identifier.
    * @param propertyValue The new value of the property.
    */
  def setDeviceProperty(propertyId: String, propertyValue: Any): Unit
  
  /**
    * Sets the encoding properties asynchronously for the specified media stream type for the video device.
    * @param mediaStreamType The type of media stream for which to set the properties.
    * @param mediaEncodingProperties The encoding properties to set.
    * @return An IAsyncAction object that is used to control the asynchronous operation.
    */
  def setMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType, mediaEncodingProperties: IMediaEncodingProperties): IPromiseWithIAsyncAction
  
  /** Gets or sets the camera's tilt setting. */
  var tilt: MediaDeviceControl
  
  /** Gets the torch control for this video device. */
  var torchControl: TorchControl
  
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
}
object VideoDeviceController {
  
  inline def apply(
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
    getDeviceProperty: String => Any,
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
    setDeviceProperty: (String, Any) => Unit,
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
  implicit open class MutableBuilder[Self <: VideoDeviceController] (val x: Self) extends AnyVal {
    
    inline def setAdvancedPhotoControl(value: AdvancedPhotoControl): Self = StObject.set(x, "advancedPhotoControl", value.asInstanceOf[js.Any])
    
    inline def setBacklightCompensation(value: MediaDeviceControl): Self = StObject.set(x, "backlightCompensation", value.asInstanceOf[js.Any])
    
    inline def setBrightness(value: MediaDeviceControl): Self = StObject.set(x, "brightness", value.asInstanceOf[js.Any])
    
    inline def setContrast(value: MediaDeviceControl): Self = StObject.set(x, "contrast", value.asInstanceOf[js.Any])
    
    inline def setDesiredOptimization(value: MediaCaptureOptimization): Self = StObject.set(x, "desiredOptimization", value.asInstanceOf[js.Any])
    
    inline def setExposure(value: MediaDeviceControl): Self = StObject.set(x, "exposure", value.asInstanceOf[js.Any])
    
    inline def setExposureCompensationControl(value: ExposureCompensationControl): Self = StObject.set(x, "exposureCompensationControl", value.asInstanceOf[js.Any])
    
    inline def setExposureControl(value: ExposureControl): Self = StObject.set(x, "exposureControl", value.asInstanceOf[js.Any])
    
    inline def setExposurePriorityVideoControl(value: ExposurePriorityVideoControl): Self = StObject.set(x, "exposurePriorityVideoControl", value.asInstanceOf[js.Any])
    
    inline def setFlashControl(value: FlashControl): Self = StObject.set(x, "flashControl", value.asInstanceOf[js.Any])
    
    inline def setFocus(value: MediaDeviceControl): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusControl(value: FocusControl): Self = StObject.set(x, "focusControl", value.asInstanceOf[js.Any])
    
    inline def setGetAvailableMediaStreamProperties(value: MediaStreamType => IVectorView[IMediaEncodingProperties]): Self = StObject.set(x, "getAvailableMediaStreamProperties", js.Any.fromFunction1(value))
    
    inline def setGetDeviceProperty(value: String => Any): Self = StObject.set(x, "getDeviceProperty", js.Any.fromFunction1(value))
    
    inline def setGetMediaStreamProperties(value: MediaStreamType => IMediaEncodingProperties): Self = StObject.set(x, "getMediaStreamProperties", js.Any.fromFunction1(value))
    
    inline def setHdrVideoControl(value: HdrVideoControl): Self = StObject.set(x, "hdrVideoControl", value.asInstanceOf[js.Any])
    
    inline def setHue(value: MediaDeviceControl): Self = StObject.set(x, "hue", value.asInstanceOf[js.Any])
    
    inline def setIsoSpeedControl(value: IsoSpeedControl): Self = StObject.set(x, "isoSpeedControl", value.asInstanceOf[js.Any])
    
    inline def setLowLagPhoto(value: LowLagPhotoControl): Self = StObject.set(x, "lowLagPhoto", value.asInstanceOf[js.Any])
    
    inline def setLowLagPhotoSequence(value: LowLagPhotoSequenceControl): Self = StObject.set(x, "lowLagPhotoSequence", value.asInstanceOf[js.Any])
    
    inline def setOpticalImageStabilizationControl(value: OpticalImageStabilizationControl): Self = StObject.set(x, "opticalImageStabilizationControl", value.asInstanceOf[js.Any])
    
    inline def setPan(value: MediaDeviceControl): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
    
    inline def setPhotoConfirmationControl(value: PhotoConfirmationControl): Self = StObject.set(x, "photoConfirmationControl", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUse(value: CaptureUse): Self = StObject.set(x, "primaryUse", value.asInstanceOf[js.Any])
    
    inline def setRegionsOfInterestControl(value: RegionsOfInterestControl): Self = StObject.set(x, "regionsOfInterestControl", value.asInstanceOf[js.Any])
    
    inline def setRoll(value: MediaDeviceControl): Self = StObject.set(x, "roll", value.asInstanceOf[js.Any])
    
    inline def setSceneModeControl(value: SceneModeControl): Self = StObject.set(x, "sceneModeControl", value.asInstanceOf[js.Any])
    
    inline def setSetDeviceProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setDeviceProperty", js.Any.fromFunction2(value))
    
    inline def setSetMediaStreamPropertiesAsync(value: (MediaStreamType, IMediaEncodingProperties) => IPromiseWithIAsyncAction): Self = StObject.set(x, "setMediaStreamPropertiesAsync", js.Any.fromFunction2(value))
    
    inline def setTilt(value: MediaDeviceControl): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTorchControl(value: TorchControl): Self = StObject.set(x, "torchControl", value.asInstanceOf[js.Any])
    
    inline def setTryGetPowerlineFrequency(value: () => ReturnValueBoolean): Self = StObject.set(x, "tryGetPowerlineFrequency", js.Any.fromFunction0(value))
    
    inline def setTrySetPowerlineFrequency(value: PowerlineFrequency => Boolean): Self = StObject.set(x, "trySetPowerlineFrequency", js.Any.fromFunction1(value))
    
    inline def setVariablePhotoSequenceController(value: VariablePhotoSequenceController): Self = StObject.set(x, "variablePhotoSequenceController", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalance(value: MediaDeviceControl): Self = StObject.set(x, "whiteBalance", value.asInstanceOf[js.Any])
    
    inline def setWhiteBalanceControl(value: WhiteBalanceControl): Self = StObject.set(x, "whiteBalanceControl", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: MediaDeviceControl): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomControl(value: ZoomControl): Self = StObject.set(x, "zoomControl", value.asInstanceOf[js.Any])
  }
}
