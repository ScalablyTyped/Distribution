package typings.winrtUwp.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the zoom settings on a capture device. */
trait ZoomControl extends js.Object {
  /** Gets the maximum zoom value supported by the capture device. */
  var max: Double
  /** Gets the minimum zoom value supported by the capture device. */
  var min: Double
  /** Gets a value indicating the current zoom transition mode. */
  var mode: ZoomTransitionMode
  /** Gets the smallest zoom value increment supported by the capture device. */
  var step: Double
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  var supported: Boolean
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[ZoomTransitionMode]
  /** Gets or sets the zoom value to be used by the capture device. */
  var value: Double
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  def configure(settings: ZoomSettings): Unit
}

object ZoomControl {
  @scala.inline
  def apply(
    configure: ZoomSettings => Unit,
    max: Double,
    min: Double,
    mode: ZoomTransitionMode,
    step: Double,
    supported: Boolean,
    supportedModes: IVectorView[ZoomTransitionMode],
    value: Double
  ): ZoomControl = {
    val __obj = js.Dynamic.literal(configure = js.Any.fromFunction1(configure), max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], supportedModes = supportedModes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControl]
  }
}

