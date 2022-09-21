package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeClick extends StObject {
  
  def webix_tree_checkbox(obj: Any, common: StringDictionary[Any]): String
  
  def webix_tree_close(obj: Any, common: StringDictionary[Any]): String
  
  def webix_tree_open(obj: Any, common: StringDictionary[Any]): String
}
object TreeClick {
  
  inline def apply(
    webix_tree_checkbox: (Any, StringDictionary[Any]) => String,
    webix_tree_close: (Any, StringDictionary[Any]) => String,
    webix_tree_open: (Any, StringDictionary[Any]) => String
  ): TreeClick = {
    val __obj = js.Dynamic.literal(webix_tree_checkbox = js.Any.fromFunction2(webix_tree_checkbox), webix_tree_close = js.Any.fromFunction2(webix_tree_close), webix_tree_open = js.Any.fromFunction2(webix_tree_open))
    __obj.asInstanceOf[TreeClick]
  }
  
  extension [Self <: TreeClick](x: Self) {
    
    inline def setWebix_tree_checkbox(value: (Any, StringDictionary[Any]) => String): Self = StObject.set(x, "webix_tree_checkbox", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_close(value: (Any, StringDictionary[Any]) => String): Self = StObject.set(x, "webix_tree_close", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_open(value: (Any, StringDictionary[Any]) => String): Self = StObject.set(x, "webix_tree_open", js.Any.fromFunction2(value))
  }
}
