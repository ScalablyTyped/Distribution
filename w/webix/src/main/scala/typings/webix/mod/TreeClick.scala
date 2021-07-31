package typings.webix.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeClick extends StObject {
  
  def webix_tree_checkbox(obj: js.Any, common: StringDictionary[js.Any]): String
  
  def webix_tree_close(obj: js.Any, common: StringDictionary[js.Any]): String
  
  def webix_tree_open(obj: js.Any, common: StringDictionary[js.Any]): String
}
object TreeClick {
  
  @JSImport("webix", "TreeClick")
  @js.native
  val ^ : TreeClick = js.native
  
  @scala.inline
  implicit class TreeClickMutableBuilder[Self <: TreeClick] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWebix_tree_checkbox(value: (js.Any, StringDictionary[js.Any]) => String): Self = StObject.set(x, "webix_tree_checkbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWebix_tree_close(value: (js.Any, StringDictionary[js.Any]) => String): Self = StObject.set(x, "webix_tree_close", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWebix_tree_open(value: (js.Any, StringDictionary[js.Any]) => String): Self = StObject.set(x, "webix_tree_open", js.Any.fromFunction2(value))
  }
}
