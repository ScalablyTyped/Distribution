package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Style extends StObject {
  
  var default: StyleRule
  
  var breakPoint: Double
  
  var rules: js.Array[TypedStyleRule]
}
object Style {
  
  inline def apply(breakPoint: Double, default: StyleRule, rules: js.Array[TypedStyleRule]): Style = {
    val __obj = js.Dynamic.literal(breakPoint = breakPoint.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Style]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
    
    inline def setBreakPoint(value: Double): Self = StObject.set(x, "breakPoint", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: StyleRule): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setRules(value: js.Array[TypedStyleRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: TypedStyleRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
