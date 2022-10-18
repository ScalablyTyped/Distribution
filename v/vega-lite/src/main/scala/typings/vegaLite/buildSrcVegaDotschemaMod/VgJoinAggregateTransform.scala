package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.vegaLiteStrings.joinaggregate
import typings.vegaTypings.typesSpecTransformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgJoinAggregateTransform extends StObject {
  
  var as: js.UndefOr[js.Array[String]] = js.undefined
  
  var fields: js.UndefOr[js.Array[String]] = js.undefined
  
  var groupby: js.UndefOr[js.Array[String]] = js.undefined
  
  var ops: js.UndefOr[js.Array[AggregateOp]] = js.undefined
  
  var `type`: joinaggregate
}
object VgJoinAggregateTransform {
  
  inline def apply(): VgJoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("joinaggregate")
    __obj.asInstanceOf[VgJoinAggregateTransform]
  }
  
  extension [Self <: VgJoinAggregateTransform](x: Self) {
    
    inline def setAs(value: js.Array[String]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: String*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setFields(value: js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGroupby(value: js.Array[String]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: String*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setOps(value: js.Array[AggregateOp]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    inline def setOpsVarargs(value: AggregateOp*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setType(value: joinaggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
