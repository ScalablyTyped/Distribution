package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents app capture settings. */
@js.native
trait AppCaptureSettings extends StObject {
  
  /** Gets the alternate shortcut key settings. */
  var alternateShortcutKeys: AppCaptureAlternateShortcutKeys = js.native
  
  /** Gets or sets the app capture destination folder. */
  var appCaptureDestinationFolder: StorageFolder = js.native
  
  /** Gets or sets the audio encoding bitrate. */
  var audioEncodingBitrate: Double = js.native
  
  /** Gets or sets the custom video encoding bitrate. */
  var customVideoEncodingBitrate: Double = js.native
  
  /** Gets or sets the custom video encoding height. */
  var customVideoEncodingHeight: Double = js.native
  
  /** Gets the custom video encoding width. */
  var customVideoEncodingWidth: Double = js.native
  
  /** Gets a value indicating if the device has a hardware encoder. */
  var hasHardwareEncoder: Boolean = js.native
  
  /** Gets or sets the historical buffer length. */
  var historicalBufferLength: Double = js.native
  
  /** Gets or sets the units of the historical buffer length. */
  var historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit = js.native
  
  /** Gets or sets a value indicating if app capture is enabled. */
  var isAppCaptureEnabled: Boolean = js.native
  
  /** Gets or sets a value indicating whether audio capture is enabled. */
  var isAudioCaptureEnabled: Boolean = js.native
  
  /** Gets a value indicating if app capture is CPU-constrained. */
  var isCpuConstrained: Boolean = js.native
  
  /** Gets a value indicating if app capture is disabled by policy. */
  var isDisabledByPolicy: Boolean = js.native
  
  /** Gets a value indicating if app capture is GPU-constrained. */
  var isGpuConstrained: Boolean = js.native
  
  /** Gets or sets a value indicating if historical capture is enabled. */
  var isHistoricalCaptureEnabled: Boolean = js.native
  
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  var isHistoricalCaptureOnBatteryAllowed: Boolean = js.native
  
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  var isHistoricalCaptureOnWirelessDisplayAllowed: Boolean = js.native
  
  /** Gets a value indicating whether the device is memory-constrained. */
  var isMemoryConstrained: Boolean = js.native
  
  var isMicrophoneCaptureEnabled: js.Any = js.native
  
  /* unmapped type */
  /** Gets or sets the maximum recording length. */
  var maximumRecordLength: Double = js.native
  
  /** Gets or sets the screenshot destination folder. */
  var screenshotDestinationFolder: StorageFolder = js.native
  
  /** Gets or sets the video encoding bitrate. */
  var videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode = js.native
  
  /** Gets or sets the video encoding resolution mode. */
  var videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode = js.native
}
object AppCaptureSettings {
  
  @scala.inline
  def apply(
    alternateShortcutKeys: AppCaptureAlternateShortcutKeys,
    appCaptureDestinationFolder: StorageFolder,
    audioEncodingBitrate: Double,
    customVideoEncodingBitrate: Double,
    customVideoEncodingHeight: Double,
    customVideoEncodingWidth: Double,
    hasHardwareEncoder: Boolean,
    historicalBufferLength: Double,
    historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit,
    isAppCaptureEnabled: Boolean,
    isAudioCaptureEnabled: Boolean,
    isCpuConstrained: Boolean,
    isDisabledByPolicy: Boolean,
    isGpuConstrained: Boolean,
    isHistoricalCaptureEnabled: Boolean,
    isHistoricalCaptureOnBatteryAllowed: Boolean,
    isHistoricalCaptureOnWirelessDisplayAllowed: Boolean,
    isMemoryConstrained: Boolean,
    isMicrophoneCaptureEnabled: js.Any,
    maximumRecordLength: Double,
    screenshotDestinationFolder: StorageFolder,
    videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode,
    videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode
  ): AppCaptureSettings = {
    val __obj = js.Dynamic.literal(alternateShortcutKeys = alternateShortcutKeys.asInstanceOf[js.Any], appCaptureDestinationFolder = appCaptureDestinationFolder.asInstanceOf[js.Any], audioEncodingBitrate = audioEncodingBitrate.asInstanceOf[js.Any], customVideoEncodingBitrate = customVideoEncodingBitrate.asInstanceOf[js.Any], customVideoEncodingHeight = customVideoEncodingHeight.asInstanceOf[js.Any], customVideoEncodingWidth = customVideoEncodingWidth.asInstanceOf[js.Any], hasHardwareEncoder = hasHardwareEncoder.asInstanceOf[js.Any], historicalBufferLength = historicalBufferLength.asInstanceOf[js.Any], historicalBufferLengthUnit = historicalBufferLengthUnit.asInstanceOf[js.Any], isAppCaptureEnabled = isAppCaptureEnabled.asInstanceOf[js.Any], isAudioCaptureEnabled = isAudioCaptureEnabled.asInstanceOf[js.Any], isCpuConstrained = isCpuConstrained.asInstanceOf[js.Any], isDisabledByPolicy = isDisabledByPolicy.asInstanceOf[js.Any], isGpuConstrained = isGpuConstrained.asInstanceOf[js.Any], isHistoricalCaptureEnabled = isHistoricalCaptureEnabled.asInstanceOf[js.Any], isHistoricalCaptureOnBatteryAllowed = isHistoricalCaptureOnBatteryAllowed.asInstanceOf[js.Any], isHistoricalCaptureOnWirelessDisplayAllowed = isHistoricalCaptureOnWirelessDisplayAllowed.asInstanceOf[js.Any], isMemoryConstrained = isMemoryConstrained.asInstanceOf[js.Any], isMicrophoneCaptureEnabled = isMicrophoneCaptureEnabled.asInstanceOf[js.Any], maximumRecordLength = maximumRecordLength.asInstanceOf[js.Any], screenshotDestinationFolder = screenshotDestinationFolder.asInstanceOf[js.Any], videoEncodingBitrateMode = videoEncodingBitrateMode.asInstanceOf[js.Any], videoEncodingResolutionMode = videoEncodingResolutionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppCaptureSettings]
  }
  
  @scala.inline
  implicit class AppCaptureSettingsMutableBuilder[Self <: AppCaptureSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternateShortcutKeys(value: AppCaptureAlternateShortcutKeys): Self = StObject.set(x, "alternateShortcutKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppCaptureDestinationFolder(value: StorageFolder): Self = StObject.set(x, "appCaptureDestinationFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioEncodingBitrate(value: Double): Self = StObject.set(x, "audioEncodingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomVideoEncodingBitrate(value: Double): Self = StObject.set(x, "customVideoEncodingBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomVideoEncodingHeight(value: Double): Self = StObject.set(x, "customVideoEncodingHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomVideoEncodingWidth(value: Double): Self = StObject.set(x, "customVideoEncodingWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasHardwareEncoder(value: Boolean): Self = StObject.set(x, "hasHardwareEncoder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoricalBufferLength(value: Double): Self = StObject.set(x, "historicalBufferLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistoricalBufferLengthUnit(value: AppCaptureHistoricalBufferLengthUnit): Self = StObject.set(x, "historicalBufferLengthUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAppCaptureEnabled(value: Boolean): Self = StObject.set(x, "isAppCaptureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAudioCaptureEnabled(value: Boolean): Self = StObject.set(x, "isAudioCaptureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCpuConstrained(value: Boolean): Self = StObject.set(x, "isCpuConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabledByPolicy(value: Boolean): Self = StObject.set(x, "isDisabledByPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsGpuConstrained(value: Boolean): Self = StObject.set(x, "isGpuConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHistoricalCaptureEnabled(value: Boolean): Self = StObject.set(x, "isHistoricalCaptureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHistoricalCaptureOnBatteryAllowed(value: Boolean): Self = StObject.set(x, "isHistoricalCaptureOnBatteryAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHistoricalCaptureOnWirelessDisplayAllowed(value: Boolean): Self = StObject.set(x, "isHistoricalCaptureOnWirelessDisplayAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMemoryConstrained(value: Boolean): Self = StObject.set(x, "isMemoryConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsMicrophoneCaptureEnabled(value: js.Any): Self = StObject.set(x, "isMicrophoneCaptureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumRecordLength(value: Double): Self = StObject.set(x, "maximumRecordLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenshotDestinationFolder(value: StorageFolder): Self = StObject.set(x, "screenshotDestinationFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEncodingBitrateMode(value: AppCaptureVideoEncodingBitrateMode): Self = StObject.set(x, "videoEncodingBitrateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoEncodingResolutionMode(value: AppCaptureVideoEncodingResolutionMode): Self = StObject.set(x, "videoEncodingResolutionMode", value.asInstanceOf[js.Any])
  }
}
