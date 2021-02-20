package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JoinAggregateFieldDef extends StObject {
  
  /**
    * The output name for the join aggregate operation.
    */
  var as: FieldName = js.native
  
  /**
    * The data field for which to compute the aggregate function. This can be omitted for functions that do not operate over a field such as `"count"`.
    */
  var field: js.UndefOr[FieldName] = js.native
  
  /**
    * The aggregation operation to apply (e.g., `"sum"`, `"average"` or `"count"`). See the list of all supported operations [here](https://vega.github.io/vega-lite/docs/aggregate.html#ops).
    */
  var op: AggregateOp = js.native
}
object JoinAggregateFieldDef {
  
  @scala.inline
  def apply(as: FieldName, op: AggregateOp): JoinAggregateFieldDef = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[JoinAggregateFieldDef]
  }
  
  @scala.inline
  implicit class JoinAggregateFieldDefMutableBuilder[Self <: JoinAggregateFieldDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOp(value: AggregateOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
  }
}
