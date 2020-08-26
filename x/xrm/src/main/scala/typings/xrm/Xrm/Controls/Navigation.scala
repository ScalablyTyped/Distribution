package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for {@link Ui.navigation formContext.ui.navigation}.
  */
@js.native
trait Navigation extends js.Object {
  /**
    * A reference to the collection of available navigation items.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var items: ItemCollection[NavigationItem] = js.native
}

object Navigation {
  @scala.inline
  def apply(items: ItemCollection[NavigationItem]): Navigation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  @scala.inline
  implicit class NavigationOps[Self <: Navigation] (val x: Self) extends AnyVal {
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
    def setItems(value: ItemCollection[NavigationItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

