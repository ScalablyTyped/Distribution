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
    * Adds a function to be called when the TabStateChange event occurs.
    * @param handler The function to be executed on the TabStateChange event.
    */
  def addTabStateChange(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit
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
    * Removes a function to be called when the TabStateChange event occurs.
    * @param handler The function to be removed from the TabStateChange event.
    */
  def removeTabStateChange(handler: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler): scala.Unit
  /**
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    */
  def setDisplayState(displayState: xrmLib.XrmNs.DisplayState): scala.Unit
}

object Tab {
  @scala.inline
  def apply(
    addTabStateChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    getDisplayState: () => xrmLib.XrmNs.DisplayState,
    getLabel: () => java.lang.String,
    getName: () => java.lang.String,
    getParent: () => xrmLib.XrmNs.Ui,
    getVisible: () => scala.Boolean,
    removeTabStateChange: xrmLib.XrmNs.EventsNs.ContextSensitiveHandler => scala.Unit,
    sections: xrmLib.XrmNs.CollectionNs.ItemCollection[Section],
    setDisplayState: xrmLib.XrmNs.DisplayState => scala.Unit,
    setFocus: () => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setVisible: scala.Boolean => scala.Unit
  ): Tab = {
    val __obj = js.Dynamic.literal(addTabStateChange = js.Any.fromFunction1(addTabStateChange), getDisplayState = js.Any.fromFunction0(getDisplayState), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), removeTabStateChange = js.Any.fromFunction1(removeTabStateChange), sections = sections, setDisplayState = js.Any.fromFunction1(setDisplayState), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
  
    __obj.asInstanceOf[Tab]
  }
}

