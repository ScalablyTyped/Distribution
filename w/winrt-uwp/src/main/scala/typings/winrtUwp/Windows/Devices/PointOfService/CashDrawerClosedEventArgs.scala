package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
trait CashDrawerClosedEventArgs extends js.Object {
  /** Gets the data associated with the DrawerClosed event. */
  var cashDrawer: CashDrawer
}

object CashDrawerClosedEventArgs {
  @scala.inline
  def apply(cashDrawer: CashDrawer): CashDrawerClosedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerClosedEventArgs]
  }
}

