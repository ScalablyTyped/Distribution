package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransform
  extends StObject
     with Transform {
  
  /**
    * The optional data fields to group by. If not specified, a single group containing all data objects will be used.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * An optional parameter indicating the maximum number of pivoted fields to generate.
    * The default (`0`) applies no limit. The pivoted `pivot` names are sorted in ascending order prior to enforcing the limit.
    * __Default value:__ `0`
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * The aggregation operation to apply to grouped `value` field values.
    * __Default value:__ `sum`
    */
  var op: js.UndefOr[String] = js.undefined
  
  /**
    * The data field to pivot on. The unique values of this field become new field names in the output stream.
    */
  var pivot: FieldName
  
  /**
    * The data field to populate pivoted fields. The aggregate values of this field become the values of the new pivoted fields.
    */
  var value: FieldName
}
object PivotTransform {
  
  inline def apply(pivot: FieldName, value: FieldName): PivotTransform = {
    val __obj = js.Dynamic.literal(pivot = pivot.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransform]
  }
  
  extension [Self <: PivotTransform](x: Self) {
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOp(value: String): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setPivot(value: FieldName): Self = StObject.set(x, "pivot", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldName): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
