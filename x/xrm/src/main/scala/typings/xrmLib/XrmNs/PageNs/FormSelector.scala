package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for the form selector API.
  * @deprecated Use {@link Xrm.Controls.FormSelector} instead.
  */
trait FormSelector
  extends xrmLib.XrmNs.ControlsNs.FormSelector

object FormSelector {
  @scala.inline
  def apply(
    getCurrentItem: js.Function0[xrmLib.XrmNs.ControlsNs.FormItem],
    items: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.FormItem]
  ): FormSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCurrentItem")(getCurrentItem)
    __obj.updateDynamic("items")(items)
    __obj.asInstanceOf[FormSelector]
  }
}

