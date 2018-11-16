package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CaptureNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Capture.CapturedFrameControlValues")
@js.native
abstract class CapturedFrameControlValues () extends js.Object {
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  var exposure: scala.Double = js.native
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  var exposureCompensation: scala.Double = js.native
  /** Gets the flash power used for a frame in a variable photo sequence. */
  var flashPowerPercent: scala.Double = js.native
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  var flashed: scala.Boolean = js.native
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  var focus: scala.Double = js.native
  /** Gets the focus state for a frame in a variable photo sequence. */
  var focusState: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.MediaCaptureFocusState = js.native
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  var isoAnalogGain: scala.Double = js.native
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  var isoDigitalGain: scala.Double = js.native
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  var isoSpeed: scala.Double = js.native
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  var sceneMode: winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CaptureSceneMode = js.native
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  var sensorFrameRate: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRatio = js.native
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  var whiteBalance: scala.Double = js.native
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  var whiteBalanceGain: WhiteBalanceGain = js.native
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  var zoomFactor: scala.Double = js.native
}

