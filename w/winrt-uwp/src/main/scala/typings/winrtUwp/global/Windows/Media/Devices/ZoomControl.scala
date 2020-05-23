package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides functionality for controlling the zoom settings on a capture device. */
@JSGlobal("Windows.Media.Devices.ZoomControl")
@js.native
abstract class ZoomControl ()
  extends typings.winrtUwp.Windows.Media.Devices.ZoomControl {
  /** Gets the maximum zoom value supported by the capture device. */
  /* CompleteClass */
  override var max: Double = js.native
  /** Gets the minimum zoom value supported by the capture device. */
  /* CompleteClass */
  override var min: Double = js.native
  /** Gets a value indicating the current zoom transition mode. */
  /* CompleteClass */
  override var mode: typings.winrtUwp.Windows.Media.Devices.ZoomTransitionMode = js.native
  /** Gets the smallest zoom value increment supported by the capture device. */
  /* CompleteClass */
  override var step: Double = js.native
  /** Gets a value indicating whether zoom control is supported by the capture device. */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the list of ZoomTransitionMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  override var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.ZoomTransitionMode] = js.native
  /** Gets or sets the zoom value to be used by the capture device. */
  /* CompleteClass */
  override var value: Double = js.native
  /**
    * Configures the zoom control with the provided zoom settings.
    * @param settings The zoom settings.
    */
  /* CompleteClass */
  override def configure(settings: typings.winrtUwp.Windows.Media.Devices.ZoomSettings): Unit = js.native
}

