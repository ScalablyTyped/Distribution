package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gets the capabilities of a camera setting. */
@JSGlobal("Windows.Media.Devices.MediaDeviceControlCapabilities")
@js.native
abstract class MediaDeviceControlCapabilities ()
  extends typings.winrtUwp.Windows.Media.Devices.MediaDeviceControlCapabilities {
  /** Queries whether the camera supports automatic adjustment of the setting. */
  /* CompleteClass */
  override var autoModeSupported: Boolean = js.native
  /** Gets the default value of the camera setting. */
  /* CompleteClass */
  override var default: Double = js.native
  /** Sets the maximum value of the camera setting. */
  /* CompleteClass */
  override var max: Double = js.native
  /** Gets the minimum value of the camera setting. */
  /* CompleteClass */
  override var min: Double = js.native
  /** Ges the step size for the setting. The step size is the smallest increment by which the property can change. */
  /* CompleteClass */
  override var step: Double = js.native
  /** Indicates whether the camera supports this camera setting. */
  /* CompleteClass */
  override var supported: Boolean = js.native
}

