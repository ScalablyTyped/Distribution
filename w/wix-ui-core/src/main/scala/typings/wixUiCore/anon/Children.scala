package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  var children: String
  
  var `data-hook`: String
  
  var disabled: Boolean
}
object Children {
  
  @scala.inline
  def apply(children: String, `data-hook`: String, disabled: Boolean): Children = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.updateDynamic("data-hook")(`data-hook`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
  }
}
