package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait DisabledWarning extends StObject {
  
  var line: Double
  
  var rule: String
}
object DisabledWarning {
  
  inline def apply(line: Double, rule: String): DisabledWarning = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledWarning]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisabledWarning] (val x: Self) extends AnyVal {
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
  }
}
