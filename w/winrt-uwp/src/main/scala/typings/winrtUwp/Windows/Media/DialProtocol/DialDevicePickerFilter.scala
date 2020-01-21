package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the filter used to determine which devices to show in a DialDevicePicker . The filter parameters are OR-ed together to build the resulting filter. */
@JSGlobal("Windows.Media.DialProtocol.DialDevicePickerFilter")
@js.native
abstract class DialDevicePickerFilter () extends js.Object {
  /** Gets a list of DIAL apps supported by the remote devices. Defaults to an empty list (no filter). You can add one or more app names and filter the devices list to those that can launch one the supported apps. */
  var supportedAppNames: IVector[String] = js.native
}

