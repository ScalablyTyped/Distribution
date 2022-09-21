package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkConfigure extends StObject {
  
  // please note, filter could be also a function. This case is not represented here
  var container: js.UndefOr[Any] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[String | js.Array[String] | Boolean] = js.undefined
  
  var showButton: js.UndefOr[Boolean] = js.undefined
}
object NetworkConfigure {
  
  inline def apply(): NetworkConfigure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkConfigure]
  }
  
  extension [Self <: NetworkConfigure](x: Self) {
    
    inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(value: String | js.Array[String] | Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: String*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
    
    inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
  }
}
