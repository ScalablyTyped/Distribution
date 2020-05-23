package typings.winrtUwp.global.Windows.Media.Capture

import typings.winrtUwp.Windows.Media.Capture.WhiteBalanceGain
import typings.winrtUwp.Windows.Media.Devices.CaptureSceneMode
import typings.winrtUwp.Windows.Media.Devices.MediaCaptureFocusState
import typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the capture device settings that were used for a frame in a variable photo sequence. */
@JSGlobal("Windows.Media.Capture.CapturedFrameControlValues")
@js.native
abstract class CapturedFrameControlValues ()
  extends typings.winrtUwp.Windows.Media.Capture.CapturedFrameControlValues {
  /** Gets the exposure time used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var exposure: Double = js.native
  /** Gets the exposure compensation value used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var exposureCompensation: Double = js.native
  /** Gets the flash power used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var flashPowerPercent: Double = js.native
  /** Gets a value indicating if the flash was used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var flashed: Boolean = js.native
  /** Gets the focus lens position used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var focus: Double = js.native
  /** Gets the focus state for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var focusState: MediaCaptureFocusState = js.native
  /** Gets the ISO analog gain used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var isoAnalogGain: Double = js.native
  /** Gets the ISO digital gain used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var isoDigitalGain: Double = js.native
  /** Gets the ISO speed used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var isoSpeed: Double = js.native
  /** Gets the scene mode used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var sceneMode: CaptureSceneMode = js.native
  /** Gets the sensor frame rate used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var sensorFrameRate: MediaRatio = js.native
  /** Gets the white balance setting used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var whiteBalance: Double = js.native
  /** Gets the white balance gain used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var whiteBalanceGain: WhiteBalanceGain = js.native
  /** Gets the zoom factor used for a frame in a variable photo sequence. */
  /* CompleteClass */
  override var zoomFactor: Double = js.native
}

