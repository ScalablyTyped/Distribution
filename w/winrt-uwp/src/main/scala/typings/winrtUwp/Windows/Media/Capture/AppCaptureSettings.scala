package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app capture settings. */
trait AppCaptureSettings extends js.Object {
  /** Gets the alternate shortcut key settings. */
  var alternateShortcutKeys: AppCaptureAlternateShortcutKeys
  /** Gets or sets the app capture destination folder. */
  var appCaptureDestinationFolder: StorageFolder
  /** Gets or sets the audio encoding bitrate. */
  var audioEncodingBitrate: Double
  /** Gets or sets the custom video encoding bitrate. */
  var customVideoEncodingBitrate: Double
  /** Gets or sets the custom video encoding height. */
  var customVideoEncodingHeight: Double
  /** Gets the custom video encoding width. */
  var customVideoEncodingWidth: Double
  /** Gets a value indicating if the device has a hardware encoder. */
  var hasHardwareEncoder: Boolean
  /** Gets or sets the historical buffer length. */
  var historicalBufferLength: Double
  /** Gets or sets the units of the historical buffer length. */
  var historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit
  /** Gets or sets a value indicating if app capture is enabled. */
  var isAppCaptureEnabled: Boolean
  /** Gets or sets a value indicating whether audio capture is enabled. */
  var isAudioCaptureEnabled: Boolean
  /** Gets a value indicating if app capture is CPU-constrained. */
  var isCpuConstrained: Boolean
  /** Gets a value indicating if app capture is disabled by policy. */
  var isDisabledByPolicy: Boolean
  /** Gets a value indicating if app capture is GPU-constrained. */
  var isGpuConstrained: Boolean
  /** Gets or sets a value indicating if historical capture is enabled. */
  var isHistoricalCaptureEnabled: Boolean
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  var isHistoricalCaptureOnBatteryAllowed: Boolean
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  var isHistoricalCaptureOnWirelessDisplayAllowed: Boolean
  /** Gets a value indicating whether the device is memory-constrained. */
  var isMemoryConstrained: Boolean
  var isMicrophoneCaptureEnabled: js.Any
   /* unmapped type */ /** Gets or sets the maximum recording length. */
  var maximumRecordLength: Double
  /** Gets or sets the screenshot destination folder. */
  var screenshotDestinationFolder: StorageFolder
  /** Gets or sets the video encoding bitrate. */
  var videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode
  /** Gets or sets the video encoding resolution mode. */
  var videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode
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
}

