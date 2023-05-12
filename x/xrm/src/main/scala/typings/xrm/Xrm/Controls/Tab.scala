package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import typings.xrm.Xrm.DisplayState
import typings.xrm.Xrm.Events.ContextSensitiveHandler
import typings.xrm.Xrm.Ui
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a form tab.
  * @see {@link UiElement}
  * @see {@link UiFocusable}
  */
trait Tab
  extends StObject
     with UiStandardElement
     with UiFocusable {
  
  /**
    * Adds a function to be called when the TabStateChange event occurs.
    * @param handler The function to be executed on the TabStateChange event.
    */
  def addTabStateChange(handler: ContextSensitiveHandler): Unit
  
  /**
    * Gets display state of the tab.
    * @returns The display state, as either "expanded" or "collapsed"
    */
  def getDisplayState(): DisplayState
  
  /**
    * Gets the name of the tab.
    * @returns The name.
    */
  def getName(): String
  
  /**
    * Gets a reference to the {@link FormContext.ui formContext.ui} parent of the tab.
    * @returns The parent.
    */
  def getParent(): Ui
  
  /**
    * Removes a function to be called when the TabStateChange event occurs.
    * @param handler The function to be removed from the TabStateChange event.
    */
  def removeTabStateChange(handler: ContextSensitiveHandler): Unit
  
  /**
    * A reference to the collection of form sections within this tab.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var sections: ItemCollection[Section]
  
  /**
    * Sets display state of the tab.
    * @param displayState Display state of the tab, as either "expanded" or "collapsed"
    * @deprecated Deprecated in the 2021 release wave 1 (April 2021). Use the setFocus method in Unified Interface to ensure the correct tab is opened on a form.
    */
  def setDisplayState(displayState: DisplayState): Unit
}
object Tab {
  
  inline def apply(
    addTabStateChange: ContextSensitiveHandler => Unit,
    getDisplayState: () => DisplayState,
    getLabel: () => String,
    getName: () => String,
    getParent: () => Ui,
    getVisible: () => Boolean,
    removeTabStateChange: ContextSensitiveHandler => Unit,
    sections: ItemCollection[Section],
    setDisplayState: DisplayState => Unit,
    setFocus: () => Unit,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): Tab = {
    val __obj = js.Dynamic.literal(addTabStateChange = js.Any.fromFunction1(addTabStateChange), getDisplayState = js.Any.fromFunction0(getDisplayState), getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), removeTabStateChange = js.Any.fromFunction1(removeTabStateChange), sections = sections.asInstanceOf[js.Any], setDisplayState = js.Any.fromFunction1(setDisplayState), setFocus = js.Any.fromFunction0(setFocus), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Tab]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Tab] (val x: Self) extends AnyVal {
    
    inline def setAddTabStateChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "addTabStateChange", js.Any.fromFunction1(value))
    
    inline def setGetDisplayState(value: () => DisplayState): Self = StObject.set(x, "getDisplayState", js.Any.fromFunction0(value))
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetParent(value: () => Ui): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
    
    inline def setRemoveTabStateChange(value: ContextSensitiveHandler => Unit): Self = StObject.set(x, "removeTabStateChange", js.Any.fromFunction1(value))
    
    inline def setSections(value: ItemCollection[Section]): Self = StObject.set(x, "sections", value.asInstanceOf[js.Any])
    
    inline def setSetDisplayState(value: DisplayState => Unit): Self = StObject.set(x, "setDisplayState", js.Any.fromFunction1(value))
  }
}
