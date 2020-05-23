package typings.winrtUwp.global.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
@JSGlobal("Windows.Devices.PointOfService.CashDrawerOpenedEventArgs")
@js.native
abstract class CashDrawerOpenedEventArgs ()
  extends typings.winrtUwp.Windows.Devices.PointOfService.CashDrawerOpenedEventArgs {
  /** Gets the data associated with the DrawerOpened event. */
  /* CompleteClass */
  override var cashDrawer: typings.winrtUwp.Windows.Devices.PointOfService.CashDrawer = js.native
}

