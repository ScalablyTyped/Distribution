package typings.winrtUwp.Windows.Media.Casting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the event arguments for the CastingDeviceSelected event on the CastingDevicePicker object. */
@JSGlobal("Windows.Media.Casting.CastingDeviceSelectedEventArgs")
@js.native
abstract class CastingDeviceSelectedEventArgs () extends js.Object {
  /** Represents the CastingDevice that has been selected by the user in a casting device picker. */
  var selectedCastingDevice: CastingDevice = js.native
}

