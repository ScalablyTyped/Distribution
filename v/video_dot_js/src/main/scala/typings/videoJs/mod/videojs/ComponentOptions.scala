package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentOptions extends StObject {
  
  var children: js.UndefOr[js.Array[Child]] = js.native
}
object ComponentOptions {
  
  @scala.inline
  def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  
  @scala.inline
  implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[Child]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: Child*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
