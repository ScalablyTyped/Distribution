package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for the form selector API.
  */
trait FormSelector extends StObject {
  
  /**
    * Gets current form.
    * @returns The current item.
    * @remarks When only one form is available this method will return null.
    */
  def getCurrentItem(): FormItem
  
  /**
    * A reference to the collection of available forms.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var items: ItemCollection[FormItem]
}
object FormSelector {
  
  inline def apply(getCurrentItem: () => FormItem, items: ItemCollection[FormItem]): FormSelector = {
    val __obj = js.Dynamic.literal(getCurrentItem = js.Any.fromFunction0(getCurrentItem), items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSelector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormSelector] (val x: Self) extends AnyVal {
    
    inline def setGetCurrentItem(value: () => FormItem): Self = StObject.set(x, "getCurrentItem", js.Any.fromFunction0(value))
    
    inline def setItems(value: ItemCollection[FormItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
