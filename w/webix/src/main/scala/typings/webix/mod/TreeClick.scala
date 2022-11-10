package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeClick extends StObject {
  
  def webix_tree_checkbox(obj: obj, common: obj): String
  
  def webix_tree_close(obj: obj, common: obj): String
  
  def webix_tree_open(obj: obj, common: obj): String
}
object TreeClick {
  
  @JSImport("webix", "TreeClick")
  @js.native
  val ^ : TreeClick = js.native
  
  extension [Self <: TreeClick](x: Self) {
    
    inline def setWebix_tree_checkbox(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_checkbox", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_close(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_close", js.Any.fromFunction2(value))
    
    inline def setWebix_tree_open(value: (obj, obj) => String): Self = StObject.set(x, "webix_tree_open", js.Any.fromFunction2(value))
  }
}
