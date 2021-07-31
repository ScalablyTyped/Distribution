package typings.webix.webix

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
  
  @scala.inline
  def apply(
    checkbox: (js.Any, js.Any) => String,
    folder: (js.Any, js.Any) => String,
    icon: (js.Any, js.Any) => String,
    space: (js.Any, js.Any) => String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
    __obj.asInstanceOf[TreeType]
  }
  
  @scala.inline
  implicit class TreeTypeMutableBuilder[Self <: TreeType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: (js.Any, js.Any) => String): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFolder(value: (js.Any, js.Any) => String): Self = StObject.set(x, "folder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIcon(value: (js.Any, js.Any) => String): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSpace(value: (js.Any, js.Any) => String): Self = StObject.set(x, "space", js.Any.fromFunction2(value))
  }
}
