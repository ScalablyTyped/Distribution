package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaTypings.transformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregatedFieldDef extends StObject {
  
  /**
    * The output field names to use for each aggregated field.
    */
  var as: FieldName = js.native
  
  /**
    * The data field for which to compute aggregate function. This is required for all aggregation operations except `"count"`.
    */
  var field: js.UndefOr[FieldName] = js.native
  
  /**
    * The aggregation operation to apply to the fields (e.g., `"sum"`, `"average"`, or `"count"`).
    * See the [full list of supported aggregation operations](https://vega.github.io/vega-lite/docs/aggregate.html#ops)
    * for more information.
    */
  var op: AggregateOp = js.native
}
object AggregatedFieldDef {
  
  @scala.inline
  def apply(as: FieldName, op: AggregateOp): AggregatedFieldDef = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedFieldDef]
  }
  
  @scala.inline
  implicit class AggregatedFieldDefMutableBuilder[Self <: AggregatedFieldDef] (val x: Self) extends AnyVal {
    
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
