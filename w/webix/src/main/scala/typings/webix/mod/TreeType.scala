package typings.webix.mod

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
  
  @JSImport("webix", "TreeType")
  @js.native
  val ^ : TreeType = js.native
  
  extension [Self <: TreeType](x: Self) {
    
    inline def setCheckbox(value: (obj, obj) => String): Self = StObject.set(x, "checkbox", js.Any.fromFunction2(value))
    
    inline def setFolder(value: (obj, obj) => String): Self = StObject.set(x, "folder", js.Any.fromFunction2(value))
    
    inline def setIcon(value: (obj, obj) => String): Self = StObject.set(x, "icon", js.Any.fromFunction2(value))
    
    inline def setSpace(value: (obj, obj) => String): Self = StObject.set(x, "space", js.Any.fromFunction2(value))
  }
}
