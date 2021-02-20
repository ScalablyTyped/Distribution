package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinAggregateTransform extends Transform {
  
  /**
    * The data fields for partitioning the data objects into separate groups. If unspecified, all data points will be in a single group.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.native
  
  /**
    * The definition of the fields in the join aggregate, and what calculations to use.
    */
  var joinaggregate: js.Array[JoinAggregateFieldDef] = js.native
}
object JoinAggregateTransform {
  
  @scala.inline
  def apply(joinaggregate: js.Array[JoinAggregateFieldDef]): JoinAggregateTransform = {
    val __obj = js.Dynamic.literal(joinaggregate = joinaggregate.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinAggregateTransform]
  }
  
  @scala.inline
  implicit class JoinAggregateTransformMutableBuilder[Self <: JoinAggregateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setJoinaggregate(value: js.Array[JoinAggregateFieldDef]): Self = StObject.set(x, "joinaggregate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJoinaggregateVarargs(value: JoinAggregateFieldDef*): Self = StObject.set(x, "joinaggregate", js.Array(value :_*))
  }
}
