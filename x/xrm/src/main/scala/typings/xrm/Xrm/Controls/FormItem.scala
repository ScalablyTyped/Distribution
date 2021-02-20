package typings.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for an entity's form selector item.
  */
@js.native
trait FormItem extends StObject {
  
  /**
    * Gets the unique identifier of the form.
    * @returns The identifier, in Guid format.
    */
  def getId(): String = js.native
  
  /**
    * Gets the label for the form.
    * @returns The label.
    */
  def getLabel(): String = js.native
  
  /**
    * Navigates the user to this form.
    */
  def navigate(): Unit = js.native
}
object FormItem {
  
  @scala.inline
  def apply(getId: () => String, getLabel: () => String, navigate: () => Unit): FormItem = {
    val __obj = js.Dynamic.literal(getId = js.Any.fromFunction0(getId), getLabel = js.Any.fromFunction0(getLabel), navigate = js.Any.fromFunction0(navigate))
    __obj.asInstanceOf[FormItem]
  }
  
  @scala.inline
  implicit class FormItemMutableBuilder[Self <: FormItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetId(value: () => String): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLabel(value: () => String): Self = StObject.set(x, "getLabel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNavigate(value: () => Unit): Self = StObject.set(x, "navigate", js.Any.fromFunction0(value))
  }
}
