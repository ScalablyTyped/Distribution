package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form section.
  * @see {@link UiElement}
  * @deprecated Use {@link Xrm.Controls.Section} instead.
  */
trait Section
  extends xrmLib.XrmNs.ControlsNs.Section

object Section {
  @scala.inline
  def apply(
    controls: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Control],
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.ControlsNs.Tab,
    getVisible: () => scala.Boolean,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls, getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Section]
  }
}

