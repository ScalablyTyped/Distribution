package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenTransform extends Transform {
  
  /**
    * The output field names for extracted array values.
    *
    * __Default value:__ The field name of the corresponding array field
    */
  var as: js.UndefOr[js.Array[FieldName]] = js.native
  
  /**
    * An array of one or more data fields containing arrays to flatten.
    * If multiple fields are specified, their array values should have a parallel structure, ideally with the same length.
    * If the lengths of parallel arrays do not match,
    * the longest array will be used with `null` values added for missing entries.
    */
  var flatten: js.Array[FieldName] = js.native
}
object FlattenTransform {
  
  @scala.inline
  def apply(flatten: js.Array[FieldName]): FlattenTransform = {
    val __obj = js.Dynamic.literal(flatten = flatten.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenTransform]
  }
  
  @scala.inline
  implicit class FlattenTransformMutableBuilder[Self <: FlattenTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: js.Array[FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: FieldName*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setFlatten(value: js.Array[FieldName]): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlattenVarargs(value: FieldName*): Self = StObject.set(x, "flatten", js.Array(value :_*))
  }
}
