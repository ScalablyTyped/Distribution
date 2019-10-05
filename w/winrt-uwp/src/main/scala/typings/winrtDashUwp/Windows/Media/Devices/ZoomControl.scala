package typings.winrtDashUwp.Windows.Media.Devices

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the zoom settings on a capture device. */
@JSGlobal("Windows.Media.Devices.ZoomControl")
@js.native
abstract class ZoomControl () extends js.Object {
  /** Gets the maximum zoom value supported by the capture device. */
  var max: Double = js.native
  /** Gets the minimum zoom value supported by the capture device. */
  var min: Double = js.native
  /** Gets a value indicating the current zoom transition mode. */
  var mode: ZoomTransitionMode = js.native
  /** Gets the smallest zoom value increment supported by the capture device. */
  var step: Double = js.native
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  var supported: Boolean = js.native
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[ZoomTransitionMode] = js.native
  /** Gets or sets the zoom value to be used by the capture device. */
  var value: Double = js.native
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  def configure(settings: ZoomSettings): Unit = js.native
}

