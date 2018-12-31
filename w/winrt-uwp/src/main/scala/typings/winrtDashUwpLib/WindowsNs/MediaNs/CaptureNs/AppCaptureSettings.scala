package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

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
  var appCaptureDestinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets or sets the audio encoding bitrate. */
  var audioEncodingBitrate: scala.Double = js.native
  /** Gets or sets the custom video encoding bitrate. */
  var customVideoEncodingBitrate: scala.Double = js.native
  /** Gets or sets the custom video encoding height. */
  var customVideoEncodingHeight: scala.Double = js.native
  /** Gets the custom video encoding width. */
  var customVideoEncodingWidth: scala.Double = js.native
  /** Gets a value indicating if the device has a hardware encoder. */
  var hasHardwareEncoder: scala.Boolean = js.native
  /** Gets or sets the historical buffer length. */
  var historicalBufferLength: scala.Double = js.native
  /** Gets or sets the units of the historical buffer length. */
  var historicalBufferLengthUnit: AppCaptureHistoricalBufferLengthUnit = js.native
  /** Gets or sets a value indicating if app capture is enabled. */
  var isAppCaptureEnabled: scala.Boolean = js.native
  /** Gets or sets a value indicating whether audio capture is enabled. */
  var isAudioCaptureEnabled: scala.Boolean = js.native
  /** Gets a value indicating if app capture is CPU-constrained. */
  var isCpuConstrained: scala.Boolean = js.native
  /** Gets a value indicating if app capture is disabled by policy. */
  var isDisabledByPolicy: scala.Boolean = js.native
  /** Gets a value indicating if app capture is GPU-constrained. */
  var isGpuConstrained: scala.Boolean = js.native
  /** Gets or sets a value indicating if historical capture is enabled. */
  var isHistoricalCaptureEnabled: scala.Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  var isHistoricalCaptureOnBatteryAllowed: scala.Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  var isHistoricalCaptureOnWirelessDisplayAllowed: scala.Boolean = js.native
  /** Gets a value indicating whether the device is memory-constrained. */
  var isMemoryConstrained: scala.Boolean = js.native
  var isMicrophoneCaptureEnabled: js.Any = js.native
   /* unmapped type */ /** Gets or sets the maximum recording length. */
  var maximumRecordLength: scala.Double = js.native
  /** Gets or sets the screenshot destination folder. */
  var screenshotDestinationFolder: winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder = js.native
  /** Gets or sets the video encoding bitrate. */
  var videoEncodingBitrateMode: AppCaptureVideoEncodingBitrateMode = js.native
  /** Gets or sets the video encoding resolution mode. */
  var videoEncodingResolutionMode: AppCaptureVideoEncodingResolutionMode = js.native
}

