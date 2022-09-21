package typings.vegaTypings.runtimeRuntimeMod

import typings.vegaTypings.anon.As
import typings.vegaTypings.vegaTypingsStrings.aggregate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateOperator
  extends StObject
     with BaseOperator
     with DefinedOperator {
  
  @JSName("params")
  var params_AggregateOperator: As
  
  @JSName("type")
  var type_AggregateOperator: aggregate
}
object AggregateOperator {
  
  inline def apply(id: ID, params: As): AggregateOperator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[AggregateOperator]
  }
  
  extension [Self <: AggregateOperator](x: Self) {
    
    inline def setParams(value: As): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setType(value: aggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
