package typings.winrtDashUwp.WindowsNs.DevicesNs.PointOfServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerOpenedEventArgs")
@js.native
abstract class CashDrawerOpenedEventArgs () extends js.Object {
  /** Gets the data associated with the DrawerOpened event. */
  var cashDrawer: CashDrawer = js.native
}

