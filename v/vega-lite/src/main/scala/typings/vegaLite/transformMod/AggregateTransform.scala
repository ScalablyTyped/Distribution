package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
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
  
  @scala.inline
  def apply(aggregate: js.Array[AggregatedFieldDef]): AggregateTransform = {
    val __obj = js.Dynamic.literal(aggregate = aggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateTransform]
  }
  
  @scala.inline
  implicit class AggregateTransformMutableBuilder[Self <: AggregateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregate(value: js.Array[AggregatedFieldDef]): Self = StObject.set(x, "aggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregateVarargs(value: AggregatedFieldDef*): Self = StObject.set(x, "aggregate", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
  }
}
