package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeType extends StObject {
  
  def checkbox(obj: js.Any, common: js.Any): String = js.native
  
  def folder(obj: js.Any, common: js.Any): String = js.native
  
  def icon(obj: js.Any, common: js.Any): String = js.native
  
  def space(obj: js.Any, common: js.Any): String = js.native
}
object TreeType {
  
  @JSImport("webix", "TreeType")
  @js.native
  val ^ : TreeType = js.native
  
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
