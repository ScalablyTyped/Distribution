package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeClick extends StObject {
  
  def webix_tree_checkbox(obj: obj, common: obj): String
  
  def webix_tree_close(obj: obj, common: obj): String
  
  def webix_tree_open(obj: obj, common: obj): String
}
object TreeClick {
  
  inline def apply(
    webix_tree_checkbox: (obj, obj) => String,
    webix_tree_close: (obj, obj) => String,
    webix_tree_open: (obj, obj) => String
  ): TreeClick = {
    val __obj = js.Dynamic.literal(webix_tree_checkbox = js.Any.fromFunction2(webix_tree_checkbox), webix_tree_close = js.Any.fromFunction2(webix_tree_close), webix_tree_open = js.Any.fromFunction2(webix_tree_open))
    __obj.asInstanceOf[TreeClick]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeClick] (val x: Self) extends AnyVal {
    
    inline def setWebix_tree_checkbox(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_checkbox", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_close(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_close", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_open(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_open", js.Any.fromFunction2(value))
  }
}
