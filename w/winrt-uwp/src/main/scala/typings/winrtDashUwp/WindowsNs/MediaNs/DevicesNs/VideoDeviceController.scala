package typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs

import typings.winrtDashUwp.Anon_ReturnValueValueBoolean
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncAction
import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.MediaStreamType
import typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs.PowerlineFrequency
import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs.VariablePhotoSequenceController
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.IMediaEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Controls device settings on the camera. */
@JSGlobal("Windows.Media.Devices.VideoDeviceController")
@js.native
abstract class VideoDeviceController () extends js.Object {
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
  def tryGetPowerlineFrequency(): Anon_ReturnValueValueBoolean = js.native
  /**
    * Sets the local power line frequency.
    * @param value The power line frequency.
    * @return Returns true if the method succeeded, or false otherwise.
    */
  def trySetPowerlineFrequency(value: PowerlineFrequency): Boolean = js.native
}

