package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeType extends StObject {
  
  def checkbox(obj: js.Any, common: js.Any): String
  
  def folder(obj: js.Any, common: js.Any): String
  
  def icon(obj: js.Any, common: js.Any): String
  
  def space(obj: js.Any, common: js.Any): String
}
object TreeType {
  
  @JSImport("webix", "TreeType")
  @js.native
  val ^ : TreeType = js.native
  
  extension [Self <: TreeType](x: Self) {
    
    inline def setCheckbox(value: (js.Any, js.Any) => String): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    inline def setFolder(value: (js.Any, js.Any) => String): Self = StObject.set(x, "folder", js.Any.fromFunction2(value))
    
    inline def setIcon(value: (js.Any, js.Any) => String): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
    
    inline def setSpace(value: (js.Any, js.Any) => String): Self = StObject.set(x, "space", js.Any.fromFunction2(value))
  }
}
