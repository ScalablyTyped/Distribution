package typings.winrtUwp.global.Windows.Media.Devices

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable High Dynamic Range (HDR) video recording on the capture device. */
@JSGlobal("Windows.Media.Devices.HdrVideoControl")
@js.native
abstract class HdrVideoControl ()
  extends typings.winrtUwp.Windows.Media.Devices.HdrVideoControl {
  /** Gets or sets a value indicating the current High Dynamic Range (HDR) video recording mode of the capture device. */
  /* CompleteClass */
  override var mode: typings.winrtUwp.Windows.Media.Devices.HdrVideoMode = js.native
  /** Gets a value that indicates if the capture device supports the HdrVideoControl . */
  /* CompleteClass */
  override var supported: Boolean = js.native
  /** Gets the list of HdrVideoMode values indicating the modes supported by the capture device. */
  /* CompleteClass */
  override var supportedModes: IVectorView[typings.winrtUwp.Windows.Media.Devices.HdrVideoMode] = js.native
}

