package typings
package xrmLib.XrmNs.PageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  * @deprecated Use {@link Xrm.Controls.Tab} instead.
  */
trait Tab
  extends xrmLib.XrmNs.ControlsNs.Tab

object Tab {
  @scala.inline
  def apply(
    getDisplayState: () => xrmLib.XrmNs.DisplayState,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.Ui,
    getVisible: () => scala.Boolean,
    sections: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Section],
    setDisplayState: xrmLib.XrmNs.DisplayState => scala.Unit,
    setFocus: () => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): Tab = {
    val __obj = js.Dynamic.literal(getDisplayState = js.Any.fromFunction0(getDisplayState), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), sections = sections, setDisplayState = js.Any.fromFunction1(setDisplayState), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Tab]
  }
}

