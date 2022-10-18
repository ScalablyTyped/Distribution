package typings.vsoNodeApi.interfacesCommonFormInputInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputFilter extends StObject {
  
  /**
    * Groups of input filter expressions. This filter matches a set of inputs if any (one or more) of the groups evaluates to true.
    */
  var conditions: js.Array[InputFilterCondition]
}
object InputFilter {
  
  inline def apply(conditions: js.Array[InputFilterCondition]): InputFilter = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFilter]
  }
  
  extension [Self <: InputFilter](x: Self) {
    
    inline def setConditions(value: js.Array[InputFilterCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: InputFilterCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
  }
}
