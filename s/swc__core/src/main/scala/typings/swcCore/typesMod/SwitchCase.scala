package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwitchCase
  extends StObject
     with Node
     with HasSpan {
  
  var consequent: js.Array[Statement]
  
  /**
    * Undefined for default case
    */
  var test: js.UndefOr[Expression] = js.undefined
  
  @JSName("type")
  var type_SwitchCase: typings.swcCore.swcCoreStrings.SwitchCase
}
object SwitchCase {
  
  inline def apply(consequent: js.Array[Statement], span: Span): SwitchCase = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("SwitchCase")
    __obj.asInstanceOf[SwitchCase]
  }
  
  extension [Self <: SwitchCase](x: Self) {
    
    inline def setConsequent(value: js.Array[Statement]): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
    
    inline def setConsequentVarargs(value: Statement*): Self = StObject.set(x, "consequent", js.Array(value*))
    
    inline def setTest(value: Expression): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.SwitchCase): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
