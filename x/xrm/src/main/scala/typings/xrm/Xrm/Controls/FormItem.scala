package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an entity's form selector item.
  */
trait FormItem extends StObject {
  
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String
  
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String
  
  /**
    * Returns a value that indicates whether the form is currently visible.
    * @returns true if the form is visible; false otherwise.
    */
  def getVisible(): Boolean
  
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit
  
  /**
    * Sets a value that indicates whether the form is visible.
    * @param isVisible Specify true to show the form; false to hide the form.
    * @see {@link https://docs.microsoft.com/en-us/powerapps/developer/model-driven-apps/clientapi/reference/formcontext-ui-formselector/setvisible External Link: setVisible (Client API reference)}
    */
  def setVisible(isVisible: Boolean): Unit
}
object FormItem {
  
  inline def apply(
    getId: () => String,
    getLabel: () => String,
    getVisible: () => Boolean,
    navigate: () => Unit,
    setVisible: Boolean => Unit
  ): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), getVisible = js.Any.fromFunction0(getVisible), navigate = js.Any.fromFunction0(navigate), setVisible = js.Any.fromFunction1(setVisible))
    __obj.asInstanceOf[FormItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormItem] (val x: Self) extends AnyVal {
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setGetVisible(value: () => Boolean): Self = StObject.set(x, "getVisible", js.Any.fromFunction0(value))
    
    inline def setNavigate(value: () => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction0(value))
    
    inline def setSetVisible(value: Boolean => Unit): Self = StObject.set(x, "setVisible", js.Any.fromFunction1(value))
  }
}
