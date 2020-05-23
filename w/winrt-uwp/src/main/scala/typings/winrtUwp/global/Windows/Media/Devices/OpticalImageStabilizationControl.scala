package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable optical image stabilization on the capture device. */
@JSGlobal("Windows.Media.Devices.OpticalImageStabilizationControl")
@js.native
abstract class OpticalImageStabilizationControl ()
  extends typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationControl {
  /** Gets or sets a value indicating the current optical image stabilization mode of the capture device. */
  /* CompleteClass */
  override var mode: typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationMode = js.native
  /** Gets a value that indicates if the capture device supports the OpticalImageStabilizationControl . */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the list of OpticalImageStabilizationMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  override var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.OpticalImageStabilizationMode] = js.native
}

