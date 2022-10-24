package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checked extends StObject {
  
  var checked: Boolean
  
  def onChange(): Null
  
  var tabIndex: Double
}
object Checked {
  
  inline def apply(checked: Boolean, onChange: () => Null, tabIndex: Double): Checked = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), tabIndex = tabIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checked]
  }
  
  extension [Self <: Checked](x: Self) {
    
    inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    inline def setOnChange(value: () => Null): Self = StObject.set(x, "onChange", js.Any.fromFunction0(value))
    
    inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
  }
}
