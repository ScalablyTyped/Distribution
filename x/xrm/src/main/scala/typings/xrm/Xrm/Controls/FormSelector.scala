package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the form selector API.
  */
@js.native
trait FormSelector extends js.Object {
  /**
    * A reference to the collection of available forms.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var items: ItemCollection[FormItem] = js.native
  /**
    * Gets current form.
    * @returns The current item.
    * @remarks When only one form is available this method will return null.
    */
  def getCurrentItem(): FormItem = js.native
}

object FormSelector {
  @scala.inline
  def apply(getCurrentItem: () => FormItem, items: ItemCollection[FormItem]): FormSelector = {
    val __obj = js.Dynamic.literal(getCurrentItem = js.Any.fromFunction0(getCurrentItem), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelector]
  }
  @scala.inline
  implicit class FormSelectorOps[Self <: FormSelector] (val x: Self) extends AnyVal {
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
    def setGetCurrentItem(value: () => FormItem): Self = this.set("getCurrentItem", js.Any.fromFunction0(value))
    @scala.inline
    def setItems(value: ItemCollection[FormItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

