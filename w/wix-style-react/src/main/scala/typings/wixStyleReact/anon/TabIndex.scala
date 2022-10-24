package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabIndex extends StObject {
  
  var selectedId: Any
  
  var tabIndex: Double
  
  var value: Any
  
  var withArrow: Boolean
}
object TabIndex {
  
  inline def apply(selectedId: Any, tabIndex: Double, value: Any, withArrow: Boolean): TabIndex = {
    val __obj = js.Dynamic.literal(selectedId = selectedId.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], withArrow = withArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndex]
  }
  
  extension [Self <: TabIndex](x: Self) {
    
    inline def setSelectedId(value: Any): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
  }
}
