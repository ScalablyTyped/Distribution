package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions extends StObject {
  
  var children: js.UndefOr[js.Array[Child]] = js.undefined
}
object ComponentOptions {
  
  inline def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  
  extension [Self <: ComponentOptions](x: Self) {
    
    inline def setChildren(value: js.Array[Child]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: Child*): Self = StObject.set(x, "children", js.Array(value :_*))
  }
}
