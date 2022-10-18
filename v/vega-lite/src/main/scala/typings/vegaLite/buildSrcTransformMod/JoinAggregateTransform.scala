package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinAggregateTransform
  extends StObject
     with Transform {
  
  /**
    * The data fields for partitioning the data objects into separate groups. If unspecified, all data points will be in a single group.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * The definition of the fields in the join aggregate, and what calculations to use.
    */
  var joinaggregate: js.Array[JoinAggregateFieldDef]
}
object JoinAggregateTransform {
  
  inline def apply(joinaggregate: js.Array[JoinAggregateFieldDef]): JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinAggregateTransform]
  }
  
  extension [Self <: JoinAggregateTransform](x: Self) {
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setJoinaggregate(value: js.Array[JoinAggregateFieldDef]): Self = StObject.set(x, "joinaggregate", value.asInstanceOf[js.Any])
    
    inline def setJoinaggregateVarargs(value: JoinAggregateFieldDef*): Self = StObject.set(x, "joinaggregate", js.Array(value*))
  }
}
