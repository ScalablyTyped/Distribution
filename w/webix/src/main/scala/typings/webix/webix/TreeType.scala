package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeType extends StObject {
  
  def checkbox(obj: obj, common: obj): String
  
  def folder(obj: obj, common: obj): String
  
  def icon(obj: obj, common: obj): String
  
  def space(obj: obj, common: obj): String
}
object TreeType {
  
  inline def apply(
    checkbox: (obj, obj) => String,
    folder: (obj, obj) => String,
    icon: (obj, obj) => String,
    space: (obj, obj) => String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
    __obj.asInstanceOf[TreeType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TreeType] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: (obj, obj) => String): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    inline def setFolder(value: (obj, obj) => String): Self = StObject.set(x, "folder", js.Any.fromFunction2(value))
    
    inline def setIcon(value: (obj, obj) => String): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
    
    inline def setSpace(value: (obj, obj) => String): Self = StObject.set(x, "space", js.Any.fromFunction2(value))
  }
}
