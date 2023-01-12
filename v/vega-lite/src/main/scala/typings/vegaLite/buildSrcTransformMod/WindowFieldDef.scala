package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaTypings.typesSpecTransformMod.AggregateOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowFieldDef extends StObject {
  
  /**
    * The output name for the window operation.
    */
  var as: FieldName
  
  /**
    * The data field for which to compute the aggregate or window function. This can be omitted for window functions that do not operate over a field such as `"count"`, `"rank"`, `"dense_rank"`.
    */
  var field: js.UndefOr[FieldName] = js.undefined
  
  /**
    * The window or aggregation operation to apply within a window (e.g., `"rank"`, `"lead"`, `"sum"`, `"average"` or `"count"`). See the list of all supported operations [here](https://vega.github.io/vega-lite/docs/window.html#ops).
    */
  var op: AggregateOp | WindowOnlyOp
  
  /**
    * Parameter values for the window functions. Parameter values can be omitted for operations that do not accept a parameter.
    *
    * See the list of all supported operations and their parameters [here](https://vega.github.io/vega-lite/docs/transforms/window.html).
    */
  var param: js.UndefOr[Double] = js.undefined
}
object WindowFieldDef {
  
  inline def apply(as: FieldName, op: AggregateOp | WindowOnlyOp): WindowFieldDef = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowFieldDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowFieldDef] (val x: Self) extends AnyVal {
    
    inline def setAs(value: FieldName): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setField(value: FieldName): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setOp(value: AggregateOp | WindowOnlyOp): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setParam(value: Double): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
    
    inline def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
  }
}
