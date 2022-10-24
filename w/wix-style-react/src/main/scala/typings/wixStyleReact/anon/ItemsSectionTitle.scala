package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsSectionTitle extends StObject {
  
  var items: Any
  
  var sectionTitle: Any
}
object ItemsSectionTitle {
  
  inline def apply(items: Any, sectionTitle: Any): ItemsSectionTitle = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sectionTitle = sectionTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsSectionTitle]
  }
  
  extension [Self <: ItemsSectionTitle](x: Self) {
    
    inline def setItems(value: Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setSectionTitle(value: Any): Self = StObject.set(x, "sectionTitle", value.asInstanceOf[js.Any])
  }
}
