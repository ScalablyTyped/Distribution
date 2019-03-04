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
    getDisplayState: js.Function0[xrmLib.XrmNs.DisplayState],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Ui],
    getVisible: js.Function0[scala.Boolean],
    sections: xrmLib.XrmNs.CollectionNs.ItemCollection[xrmLib.XrmNs.ControlsNs.Section],
    setDisplayState: js.Function1[xrmLib.XrmNs.DisplayState, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): Tab = {
    val __obj = js.Dynamic.literal(getDisplayState = getDisplayState, getLabel = getLabel, getName = getName, getParent = getParent, getVisible = getVisible, sections = sections, setDisplayState = setDisplayState, setFocus = setFocus, setLabel = setLabel, setVisible = setVisible)
  
    __obj.asInstanceOf[Tab]
  }
}

