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
    * Navigates the user to this form.
    */
  def navigate(): Unit
}
object FormItem {
  
  inline def apply(getId: () => String, getLabel: () => String, navigate: () => Unit): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), navigate = js.Any.fromFunction0(navigate))
    __obj.asInstanceOf[FormItem]
  }
  
  extension [Self <: FormItem](x: Self) {
    
    inline def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    inline def setNavigate(value: () => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction0(value))
  }
}
