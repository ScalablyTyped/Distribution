package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeType extends StObject {
  
  def checkbox(obj: Any, common: Any): String
  
  def folder(obj: Any, common: Any): String
  
  def icon(obj: Any, common: Any): String
  
  def space(obj: Any, common: Any): String
}
object TreeType {
  
  inline def apply(
    checkbox: (Any, Any) => String,
    folder: (Any, Any) => String,
    icon: (Any, Any) => String,
    space: (Any, Any) => String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
    __obj.asInstanceOf[TreeType]
  }
  
  extension [Self <: TreeType](x: Self) {
    
    inline def setCheckbox(value: (Any, Any) => String): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    inline def setFolder(value: (Any, Any) => String): Self = StObject.set(x, "folder", js.Any.fromFunction2(value))
    
    inline def setIcon(value: (Any, Any) => String): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
    
    inline def setSpace(value: (Any, Any) => String): Self = StObject.set(x, "space", js.Any.fromFunction2(value))
  }
}
