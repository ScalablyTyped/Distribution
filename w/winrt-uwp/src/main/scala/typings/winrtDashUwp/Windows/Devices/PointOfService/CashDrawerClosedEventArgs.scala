package typings.winrtDashUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerClosedEventArgs")
@js.native
abstract class CashDrawerClosedEventArgs () extends js.Object {
  /** Gets the data associated with the DrawerClosed event. */
  var cashDrawer: CashDrawer = js.native
}

