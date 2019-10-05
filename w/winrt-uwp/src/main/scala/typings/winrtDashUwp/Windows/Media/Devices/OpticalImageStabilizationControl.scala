package typings.winrtDashUwp.Windows.Media.Devices

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable optical image stabilization on the capture device. */
@JSGlobal("Windows.Media.Devices.OpticalImageStabilizationControl")
@js.native
abstract class OpticalImageStabilizationControl () extends js.Object {
  /** Gets or sets a value indicating the current optical image stabilization mode of the capture device. */
  var mode: OpticalImageStabilizationMode = js.native
  /** Gets a value that indicates if the capture device supports the OpticalImageStabilizationControl . */
  var supported: Boolean = js.native
  /** Gets the list of OpticalImageStabilizationMode values indicating the modes supported by the capture device. */
  var supportedModes: IVectorView[OpticalImageStabilizationMode] = js.native
}

