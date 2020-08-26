package typings.winrtUwp.Windows.Graphics.Printing.OptionDetails

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows apps to add a collection of enumerable options to the app print experience. */
@js.native
trait PrintCustomItemDetails extends js.Object {
  /** Gets or sets the display name of the custom print task option item. */
  var itemDisplayName: String = js.native
  /** Gets the ID of the custom print task option item. */
  var itemId: String = js.native
}

object PrintCustomItemDetails {
  @scala.inline
  def apply(itemDisplayName: String, itemId: String): PrintCustomItemDetails = {
    val __obj = js.Dynamic.literal(itemDisplayName = itemDisplayName.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintCustomItemDetails]
  }
  @scala.inline
  implicit class PrintCustomItemDetailsOps[Self <: PrintCustomItemDetails] (val x: Self) extends AnyVal {
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
    def setItemDisplayName(value: String): Self = this.set("itemDisplayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemId(value: String): Self = this.set("itemId", value.asInstanceOf[js.Any])
  }
  
}

