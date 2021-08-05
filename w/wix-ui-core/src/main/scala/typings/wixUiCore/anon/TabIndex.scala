package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TabIndex extends StObject {
  
  var checked: Boolean
  
  def onChange(): js.Any
  
  var tabIndex: Double
}
object TabIndex {
  
  inline def apply(checked: Boolean, onChange: () => js.Any, tabIndex: Double): TabIndex = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabIndex]
  }
  
  extension [Self <: TabIndex](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
