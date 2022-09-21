package typings.videoJs.mod.videojs

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions extends StObject {
  
  var children: js.UndefOr[js.Array[Child]] = js.undefined
  
  var createEl: js.UndefOr[Boolean] = js.undefined
  
  var el: js.UndefOr[HTMLElement] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
}
object ComponentOptions {
  
  inline def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  
  extension [Self <: ComponentOptions](x: Self) {
    
    inline def setChildren(value: js.Array[Child]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Child*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setCreateEl(value: Boolean): Self = StObject.set(x, "createEl", value.asInstanceOf[js.Any])
    
    inline def setCreateElUndefined: Self = StObject.set(x, "createEl", js.undefined)
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
