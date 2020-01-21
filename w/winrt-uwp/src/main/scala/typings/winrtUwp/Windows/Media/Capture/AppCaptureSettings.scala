package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureSettings")
@js.native
abstract class AppCaptureSettings () extends js.Object {
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
   /* unmapped type */ /** Gets or sets the maximum recording length. */
  var maximumRecordLength: Double = js.native
  /** Gets or sets the screenshot destination folder. */
  var screenshotDestinationFolder: StorageFolder = js.native
  /** Gets or sets the video encoding bitrate. */
  var videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode = js.native
  /** Gets or sets the video encoding resolution mode. */
  var videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode = js.native
}

