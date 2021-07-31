package typings.xrm.Xrm.Controls

import typings.xrm.Xrm.Collection.ItemCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for {@link Ui.navigation formContext.ui.navigation}.
  */
trait Navigation extends StObject {
  
  /**
    * A reference to the collection of available navigation items.
    * @see {@link https://docs.microsoft.com/en-us/dynamics365/customer-engagement/developer/clientapi/reference/collections External Link: Collections (Client API reference)}
    */
  var items: ItemCollection[NavigationItem]
}
object Navigation {
  
  @scala.inline
  def apply(items: ItemCollection[NavigationItem]): Navigation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigation]
  }
  
  @scala.inline
  implicit class NavigationMutableBuilder[Self <: Navigation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: ItemCollection[NavigationItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
  }
}
