package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsPerPage extends StObject {
  
  var data: Any
  
  var itemsPerPage: Any
}
object ItemsPerPage {
  
  inline def apply(data: Any, itemsPerPage: Any): ItemsPerPage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], itemsPerPage = itemsPerPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsPerPage]
  }
  
  extension [Self <: ItemsPerPage](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setItemsPerPage(value: Any): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
  }
}
