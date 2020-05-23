package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
trait CashDrawerOpenedEventArgs extends js.Object {
  /** Gets the data associated with the DrawerOpened event. */
  var cashDrawer: CashDrawer
}

object CashDrawerOpenedEventArgs {
  @scala.inline
  def apply(cashDrawer: CashDrawer): CashDrawerOpenedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerOpenedEventArgs]
  }
}

