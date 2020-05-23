package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents app capture settings. */
@JSGlobal("Windows.Media.Capture.AppCaptureSettings")
@js.native
abstract class AppCaptureSettings ()
  extends typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings {
  /** Gets the alternate shortcut key settings. */
  /* CompleteClass */
  override var alternateShortcutKeys: typings.winrtUwp.Windows.Media.Capture.AppCaptureAlternateShortcutKeys = js.native
  /** Gets or sets the app capture destination folder. */
  /* CompleteClass */
  override var appCaptureDestinationFolder: StorageFolder = js.native
  /** Gets or sets the audio encoding bitrate. */
  /* CompleteClass */
  override var audioEncodingBitrate: Double = js.native
  /** Gets or sets the custom video encoding bitrate. */
  /* CompleteClass */
  override var customVideoEncodingBitrate: Double = js.native
  /** Gets or sets the custom video encoding height. */
  /* CompleteClass */
  override var customVideoEncodingHeight: Double = js.native
  /** Gets the custom video encoding width. */
  /* CompleteClass */
  override var customVideoEncodingWidth: Double = js.native
  /** Gets a value indicating if the device has a hardware encoder. */
  /* CompleteClass */
  override var hasHardwareEncoder: Boolean = js.native
  /** Gets or sets the historical buffer length. */
  /* CompleteClass */
  override var historicalBufferLength: Double = js.native
  /** Gets or sets the units of the historical buffer length. */
  /* CompleteClass */
  override var historicalBufferLengthUnit: typings.winrtUwp.Windows.Media.Capture.AppCaptureHistoricalBufferLengthUnit = js.native
  /** Gets or sets a value indicating if app capture is enabled. */
  /* CompleteClass */
  override var isAppCaptureEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether audio capture is enabled. */
  /* CompleteClass */
  override var isAudioCaptureEnabled: Boolean = js.native
  /** Gets a value indicating if app capture is CPU-constrained. */
  /* CompleteClass */
  override var isCpuConstrained: Boolean = js.native
  /** Gets a value indicating if app capture is disabled by policy. */
  /* CompleteClass */
  override var isDisabledByPolicy: Boolean = js.native
  /** Gets a value indicating if app capture is GPU-constrained. */
  /* CompleteClass */
  override var isGpuConstrained: Boolean = js.native
  /** Gets or sets a value indicating if historical capture is enabled. */
  /* CompleteClass */
  override var isHistoricalCaptureEnabled: Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  /* CompleteClass */
  override var isHistoricalCaptureOnBatteryAllowed: Boolean = js.native
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  /* CompleteClass */
  override var isHistoricalCaptureOnWirelessDisplayAllowed: Boolean = js.native
  /** Gets a value indicating whether the device is memory-constrained. */
  /* CompleteClass */
  override var isMemoryConstrained: Boolean = js.native
  /* CompleteClass */
  override var isMicrophoneCaptureEnabled: js.Any = js.native
   /* unmapped type */ /** Gets or sets the maximum recording length. */
  /* CompleteClass */
  override var maximumRecordLength: Double = js.native
  /** Gets or sets the screenshot destination folder. */
  /* CompleteClass */
  override var screenshotDestinationFolder: StorageFolder = js.native
  /** Gets or sets the video encoding bitrate. */
  /* CompleteClass */
  override var videoEncodingBitrateMode: typings.winrtUwp.Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode = js.native
  /** Gets or sets the video encoding resolution mode. */
  /* CompleteClass */
  override var videoEncodingResolutionMode: typings.winrtUwp.Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode = js.native
}

