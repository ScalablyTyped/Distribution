package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Container extends StObject {
  
  var columnsLayout: String
  
  var container: String
  
  var gridLayout: String
  
  var item: String
  
  var itemLink: String
  
  var navigation: String
}
object Container {
  
  inline def apply(
    columnsLayout: String,
    container: String,
    gridLayout: String,
    item: String,
    itemLink: String,
    navigation: String
  ): Container = {
    val __obj = js.Dynamic.literal(columnsLayout = columnsLayout.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], gridLayout = gridLayout.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemLink = itemLink.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
  
  extension [Self <: Container](x: Self) {
    
    inline def setColumnsLayout(value: String): Self = StObject.set(x, "columnsLayout", value.asInstanceOf[js.Any])
    
    inline def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setGridLayout(value: String): Self = StObject.set(x, "gridLayout", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemLink(value: String): Self = StObject.set(x, "itemLink", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: String): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
  }
}
