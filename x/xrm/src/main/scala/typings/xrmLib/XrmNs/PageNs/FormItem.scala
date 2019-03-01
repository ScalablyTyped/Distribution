package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for an entity's form selector item.
  * @deprecated Use {@link Xrm.Controls.FormItem} instead.
  */
trait FormItem
  extends xrmLib.XrmNs.ControlsNs.FormItem

object FormItem {
  @scala.inline
  def apply(
    getId: js.Function0[java.lang.String],
    getLabel: js.Function0[java.lang.String],
    navigate: js.Function0[scala.Unit]
  ): FormItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("navigate")(navigate)
    __obj.asInstanceOf[FormItem]
  }
}

