package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a form section.
  * @see {@link UiElement}
  */
trait Section
  extends StObject
     with UiStandardElement {
  
  /**
    * A reference to the collection of controls within this tab.
    * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var controls: ItemCollection[Control]
  
  /**
    * Gets the name of the section.
    * @returns The name.
    */
  def getName(): String
  
  /**
    * Gets a reference to the parent {@link Tab}.
    * @returns The parent.
    */
  def getParent(): Tab
}
object Section {
  
  inline def apply(
    controls: ItemCollection[Control],
    getLabel: () => String,
    getName: () => String,
    getParent: () => Tab,
    getVisible: () => Boolean,
    setLabel: String => Unit,
    setVisible: Boolean => Unit
  ): Section = {
    val __obj = js.Dynamic.literal(controls = controls.asInstanceOf[js.Any], getLabel = js.Any.fromFunction0(getLabel), getName = js.Any.fromFunction0(getName), getParent = js.Any.fromFunction0(getParent), getVisible = js.Any.fromFunction0(getVisible), setLabel = js.Any.fromFunction1(setLabel), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[Section]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Section] (val x: Self) extends AnyVal {
    
    inline def setControls(value: ItemCollection[Control]): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setGetName(value: () => String): Self = StObject.set(x, "getName", js.Any.fromFunction0(value))
    
    inline def setGetParent(value: () => Tab): Self = StObject.set(x, "getParent", js.Any.fromFunction0(value))
  }
}
