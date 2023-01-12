package typings.vegaLite.buildSrcTransformMod

import typings.vegaLite.buildSrcChanneldefMod.FieldName
import typings.vegaLite.buildSrcSortMod.SortField
import typings.vegaLite.vegaLiteStrings.center
import typings.vegaLite.vegaLiteStrings.normalize
import typings.vegaLite.vegaLiteStrings.zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackTransform
  extends StObject
     with Transform {
  
  /**
    * Output field names. This can be either a string or an array of strings with two elements denoting the name for the fields for stack start and stack end respectively.
    * If a single string(e.g., `"val"`) is provided, the end field will be `"val_end"`.
    */
  var as: FieldName | (js.Tuple2[FieldName, FieldName])
  
  /**
    * The data fields to group by.
    */
  var groupby: js.Array[FieldName]
  
  /**
    * Mode for stacking marks. One of `"zero"` (default), `"center"`, or `"normalize"`.
    * The `"zero"` offset will stack starting at `0`. The `"center"` offset will center the stacks. The `"normalize"` offset will compute percentage values for each stack point, with output values in the range `[0,1]`.
    *
    * __Default value:__ `"zero"`
    */
  var offset: js.UndefOr[zero | center | normalize] = js.undefined
  
  /**
    * Field that determines the order of leaves in the stacked charts.
    */
  var sort: js.UndefOr[js.Array[SortField]] = js.undefined
  
  /**
    * The field which is stacked.
    */
  var stack: FieldName
}
object StackTransform {
  
  inline def apply(as: FieldName | (js.Tuple2[FieldName, FieldName]), groupby: js.Array[FieldName], stack: FieldName): StackTransform = {
    val __obj = js.Dynamic.literal(as = as.asInstanceOf[js.Any], groupby = groupby.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StackTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: FieldName | (js.Tuple2[FieldName, FieldName])): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setOffset(value: zero | center | normalize): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setSort(value: js.Array[SortField]): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortField*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setStack(value: FieldName): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
