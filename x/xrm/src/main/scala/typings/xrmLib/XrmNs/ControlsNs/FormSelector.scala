package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the form selector API.
  */
trait FormSelector extends js.Object {
  /**
    * A reference to the collection of available forms.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var items: xrmLib.XrmNs.CollectionNs.ItemCollection[FormItem]
  /**
    * Gets current form.
    * @returns The current item.
    * @remarks When only one form is available this method will return null.
    */
  def getCurrentItem(): FormItem
}

object FormSelector {
  @scala.inline
  def apply(getCurrentItem: js.Function0[FormItem], items: xrmLib.XrmNs.CollectionNs.ItemCollection[FormItem]): FormSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentItem")(getCurrentItem)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[FormSelector]
  }
}

