package typings.winrtUwp.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Devices.CaptureSceneMode
import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
trait CapturedFrameControlValues extends js.Object {
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  var exposure: Double
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  var exposureCompensation: Double
  /** Gets the flash power used for a frame in a variable photo sequence. */
  var flashPowerPercent: Double
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  var flashed: Boolean
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  var focus: Double
  /** Gets the focus state for a frame in a variable photo sequence. */
  var focusState: MediaCaptureFocusState
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  var isoAnalogGain: Double
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  var isoDigitalGain: Double
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  var isoSpeed: Double
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  var sceneMode: CaptureSceneMode
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  var sensorFrameRate: MediaRatio
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  var whiteBalance: Double
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  var whiteBalanceGain: WhiteBalanceGain
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  var zoomFactor: Double
}

object CapturedFrameControlValues {
  @scala.inline
  def apply(
    exposure: Double,
    exposureCompensation: Double,
    flashPowerPercent: Double,
    flashed: Boolean,
    focus: Double,
    focusState: MediaCaptureFocusState,
    isoAnalogGain: Double,
    isoDigitalGain: Double,
    isoSpeed: Double,
    sceneMode: CaptureSceneMode,
    sensorFrameRate: MediaRatio,
    whiteBalance: Double,
    whiteBalanceGain: WhiteBalanceGain,
    zoomFactor: Double
  ): CapturedFrameControlValues = {
    val __obj = js.Dynamic.literal(exposure = exposure.asInstanceOf[js.Any], exposureCompensation = exposureCompensation.asInstanceOf[js.Any], flashPowerPercent = flashPowerPercent.asInstanceOf[js.Any], flashed = flashed.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], focusState = focusState.asInstanceOf[js.Any], isoAnalogGain = isoAnalogGain.asInstanceOf[js.Any], isoDigitalGain = isoDigitalGain.asInstanceOf[js.Any], isoSpeed = isoSpeed.asInstanceOf[js.Any], sceneMode = sceneMode.asInstanceOf[js.Any], sensorFrameRate = sensorFrameRate.asInstanceOf[js.Any], whiteBalance = whiteBalance.asInstanceOf[js.Any], whiteBalanceGain = whiteBalanceGain.asInstanceOf[js.Any], zoomFactor = zoomFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturedFrameControlValues]
  }
}

