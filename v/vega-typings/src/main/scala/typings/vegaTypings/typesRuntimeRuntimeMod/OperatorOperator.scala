package typings.vegaTypings.typesRuntimeRuntimeMod

import typings.vegaTypings.vegaTypingsStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperatorOperator
  extends StObject
     with BaseOperator
     with DefinedOperator {
  
  @JSName("type")
  var type_OperatorOperator: operator
  
  var update: js.UndefOr[expr] = js.undefined
}
object OperatorOperator {
  
  inline def apply(id: ID): OperatorOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[OperatorOperator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperatorOperator] (val x: Self) extends AnyVal {
    
    inline def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUpdate(value: expr): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
