package typings
package xrmLib.XrmNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  */
trait Tab
  extends UiStandardElement
     with UiFocusable {
  /**
    * A reference to the collection of form sections within this tab.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: xrmLib.XrmNs.CollectionNs.ItemCollection[Section]
  /**
    * Gets display state of the tab.
    * @returns The display state, as either "expanded" or "collapsed"
    */
  def getDisplayState(): xrmLib.XrmNs.DisplayState
  /**
    * Gets the name of the tab.
    * @returns The name.
    */
  def getName(): java.lang.String
  /**
    * Gets a reference to the {@link FormContext.ui formContext.ui} parent of the tab.
    * @returns The parent.
    */
  def getParent(): xrmLib.XrmNs.Ui
  /**
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: xrmLib.XrmNs.DisplayState): scala.Unit
}

object Tab {
  @scala.inline
  def apply(
    getDisplayState: js.Function0[xrmLib.XrmNs.DisplayState],
    getLabel: js.Function0[java.lang.String],
    getName: js.Function0[java.lang.String],
    getParent: js.Function0[xrmLib.XrmNs.Ui],
    getVisible: js.Function0[scala.Boolean],
    sections: xrmLib.XrmNs.CollectionNs.ItemCollection[Section],
    setDisplayState: js.Function1[xrmLib.XrmNs.DisplayState, scala.Unit],
    setFocus: js.Function0[scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setVisible: js.Function1[scala.Boolean, scala.Unit]
  ): Tab = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDisplayState")(getDisplayState)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getName")(getName)
    __obj.updateDynamic("getParent")(getParent)
    __obj.updateDynamic("getVisible")(getVisible)
    __obj.updateDynamic("sections")(sections)
    __obj.updateDynamic("setDisplayState")(setDisplayState)
    __obj.updateDynamic("setFocus")(setFocus)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setVisible")(setVisible)
    __obj.asInstanceOf[Tab]
  }
}

