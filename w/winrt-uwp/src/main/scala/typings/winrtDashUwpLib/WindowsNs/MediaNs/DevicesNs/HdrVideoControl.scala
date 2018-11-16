package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** When supported, allows an app to enable High Dynamic Range (HDR) video recording on the capture device. */
@JSGlobal("Windows.Media.Devices.HdrVideoControl")
@js.native
abstract class HdrVideoControl () extends js.Object {
  /** Gets or sets a value indicating the current High Dynamic Range (HDR) video recording mode of the capture device. */
  var mode: HdrVideoMode = js.native
  /** Gets a value that indicates if the capture device supports the HdrVideoControl . */
  var supported: scala.Boolean = js.native
  /** Gets the list of HdrVideoMode values indicating the modes supported by the capture device. */
  var supportedModes: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[HdrVideoMode] = js.native
}

