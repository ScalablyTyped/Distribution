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
  def apply(getId: () => java.lang.String, getLabel: () => java.lang.String, navigate: () => scala.Unit): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), navigate = js.Any.fromFunction0(navigate))
  
    __obj.asInstanceOf[FormItem]
  }
}

