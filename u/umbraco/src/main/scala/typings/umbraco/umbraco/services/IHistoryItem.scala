package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * History item
  */
@js.native
trait IHistoryItem extends StObject {
  
  //css class for the list, ex: "icon-image", "icon-doc"
  var icon: String = js.native
  
  //route to the editor, ex: "/content/edit/1234"
  var link: String = js.native
  
  //friendly name for the history listing
  var name: String = js.native
}
object IHistoryItem {
  
  @scala.inline
  def apply(icon: String, link: String, name: String): IHistoryItem = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryItem]
  }
  
  @scala.inline
  implicit class IHistoryItemMutableBuilder[Self <: IHistoryItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
