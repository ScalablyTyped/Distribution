package typings.vsoNodeApi.interfacesGalleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCategory extends StObject {
  
  var children: js.Array[ProductCategory]
  
  /**
    * Indicator whether this is a leaf or there are children under this category
    */
  var hasChildren: Boolean
  
  /**
    * Individual Guid of the Category
    */
  var id: String
  
  /**
    * Category Title in the requested language
    */
  var title: String
}
object ProductCategory {
  
  inline def apply(children: js.Array[ProductCategory], hasChildren: Boolean, id: String, title: String): ProductCategory = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], hasChildren = hasChildren.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductCategory]
  }
  
  extension [Self <: ProductCategory](x: Self) {
    
    inline def setChildren(value: js.Array[ProductCategory]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: ProductCategory*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
