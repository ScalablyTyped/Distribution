package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents app capture settings. */
/* note: abstract class */ @JSGlobal("Windows.Media.Capture.AppCaptureSettings")
@js.native
open class AppCaptureSettings ()
  extends StObject
     with typings.winrtUwp.Windows.Media.Capture.AppCaptureSettings {
  
  /** Gets the alternate shortcut key settings. */
  /* CompleteClass */
  var alternateShortcutKeys: typings.winrtUwp.Windows.Media.Capture.AppCaptureAlternateShortcutKeys = js.native
  
  /** Gets or sets the app capture destination folder. */
  /* CompleteClass */
  var appCaptureDestinationFolder: StorageFolder = js.native
  
  /** Gets or sets the audio encoding bitrate. */
  /* CompleteClass */
  var audioEncodingBitrate: Double = js.native
  
  /** Gets or sets the custom video encoding bitrate. */
  /* CompleteClass */
  var customVideoEncodingBitrate: Double = js.native
  
  /** Gets or sets the custom video encoding height. */
  /* CompleteClass */
  var customVideoEncodingHeight: Double = js.native
  
  /** Gets the custom video encoding width. */
  /* CompleteClass */
  var customVideoEncodingWidth: Double = js.native
  
  /** Gets a value indicating if the device has a hardware encoder. */
  /* CompleteClass */
  var hasHardwareEncoder: Boolean = js.native
  
  /** Gets or sets the historical buffer length. */
  /* CompleteClass */
  var historicalBufferLength: Double = js.native
  
  /** Gets or sets the units of the historical buffer length. */
  /* CompleteClass */
  var historicalBufferLengthUnit: typings.winrtUwp.Windows.Media.Capture.AppCaptureHistoricalBufferLengthUnit = js.native
  
  /** Gets or sets a value indicating if app capture is enabled. */
  /* CompleteClass */
  var isAppCaptureEnabled: Boolean = js.native
  
  /** Gets or sets a value indicating whether audio capture is enabled. */
  /* CompleteClass */
  var isAudioCaptureEnabled: Boolean = js.native
  
  /** Gets a value indicating if app capture is CPU-constrained. */
  /* CompleteClass */
  var isCpuConstrained: Boolean = js.native
  
  /** Gets a value indicating if app capture is disabled by policy. */
  /* CompleteClass */
  var isDisabledByPolicy: Boolean = js.native
  
  /** Gets a value indicating if app capture is GPU-constrained. */
  /* CompleteClass */
  var isGpuConstrained: Boolean = js.native
  
  /** Gets or sets a value indicating if historical capture is enabled. */
  /* CompleteClass */
  var isHistoricalCaptureEnabled: Boolean = js.native
  
  /** Gets or sets a value indicating whether historical capture is allowed while the device is on battery power. */
  /* CompleteClass */
  var isHistoricalCaptureOnBatteryAllowed: Boolean = js.native
  
  /** Gets or sets a value indicating whether historical capture is allowed on wireless displays. */
  /* CompleteClass */
  var isHistoricalCaptureOnWirelessDisplayAllowed: Boolean = js.native
  
  /** Gets a value indicating whether the device is memory-constrained. */
  /* CompleteClass */
  var isMemoryConstrained: Boolean = js.native
  
  /* CompleteClass */
  var isMicrophoneCaptureEnabled: Any = js.native
  
  /* unmapped type */
  /** Gets or sets the maximum recording length. */
  /* CompleteClass */
  var maximumRecordLength: Double = js.native
  
  /** Gets or sets the screenshot destination folder. */
  /* CompleteClass */
  var screenshotDestinationFolder: StorageFolder = js.native
  
  /** Gets or sets the video encoding bitrate. */
  /* CompleteClass */
  var videoEncodingBitrateMode: typings.winrtUwp.Windows.Media.Capture.AppCaptureVideoEncodingBitrateMode = js.native
  
  /** Gets or sets the video encoding resolution mode. */
  /* CompleteClass */
  var videoEncodingResolutionMode: typings.winrtUwp.Windows.Media.Capture.AppCaptureVideoEncodingResolutionMode = js.native
}
