package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerOpened event. */
@js.native
trait CashDrawerOpenedEventArgs extends js.Object {
  
  /** Gets the data associated with the DrawerOpened event. */
  var cashDrawer: CashDrawer = js.native
}
object CashDrawerOpenedEventArgs {
  
  @scala.inline
  def apply(cashDrawer: CashDrawer): CashDrawerOpenedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerOpenedEventArgs]
  }
  
  @scala.inline
  implicit class CashDrawerOpenedEventArgsOps[Self <: CashDrawerOpenedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCashDrawer(value: CashDrawer): Self = this.set("cashDrawer", value.asInstanceOf[js.Any])
  }
}
