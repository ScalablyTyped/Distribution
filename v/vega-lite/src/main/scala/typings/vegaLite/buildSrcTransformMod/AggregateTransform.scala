package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateTransform
  extends StObject
     with Transform {
  
  /**
    * Array of objects that define fields to aggregate.
    */
  var aggregate: js.Array[AggregatedFieldDef]
  
  /**
    * The data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
}
object AggregateTransform {
  
  inline def apply(aggregate: js.Array[AggregatedFieldDef]): AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateTransform]
  }
  
  extension [Self <: AggregateTransform](x: Self) {
    
    inline def setAggregate(value: js.Array[AggregatedFieldDef]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    inline def setAggregateVarargs(value: AggregatedFieldDef*): Self = StObject.set(x, "aggregate", js.Array(value*))
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
  }
}
