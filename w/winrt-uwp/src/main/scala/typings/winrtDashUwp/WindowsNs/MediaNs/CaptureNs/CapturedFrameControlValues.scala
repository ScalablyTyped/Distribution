package typings.winrtDashUwp.WindowsNs.MediaNs.CaptureNs

import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode
import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState
import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Capture.CapturedFrameControlValues")
@js.native
abstract class CapturedFrameControlValues () extends js.Object {
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  var exposure: Double = js.native
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  var exposureCompensation: Double = js.native
  /** Gets the flash power used for a frame in a variable photo sequence. */
  var flashPowerPercent: Double = js.native
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  var flashed: Boolean = js.native
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  var focus: Double = js.native
  /** Gets the focus state for a frame in a variable photo sequence. */
  var focusState: MediaCaptureFocusState = js.native
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  var isoAnalogGain: Double = js.native
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  var isoDigitalGain: Double = js.native
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  var isoSpeed: Double = js.native
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  var sceneMode: CaptureSceneMode = js.native
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  var sensorFrameRate: MediaRatio = js.native
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  var whiteBalance: Double = js.native
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  var whiteBalanceGain: WhiteBalanceGain = js.native
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  var zoomFactor: Double = js.native
}

