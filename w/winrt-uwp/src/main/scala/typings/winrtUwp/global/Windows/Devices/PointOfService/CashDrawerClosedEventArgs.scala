package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerClosedEventArgs")
@js.native
abstract class CashDrawerClosedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerClosedEventArgs {
  /** Gets the data associated with the DrawerClosed event. */
  /* CompleteClass */
  override var cashDrawer: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer = js.native
}

