package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FoldTransform
  extends StObject
     with Transform {
  
  /**
    * The output field names for the key and value properties produced by the fold transform.
    * __Default value:__ `["key", "value"]`
    */
  var as: js.UndefOr[js.Tuple2[FieldName, FieldName]] = js.undefined
  
  /**
    * An array of data fields indicating the properties to fold.
    */
  var fold: js.Array[FieldName]
}
object FoldTransform {
  
  @scala.inline
  def apply(fold: js.Array[FieldName]): FoldTransform = {
    val __obj = js.Dynamic.literal(fold = fold.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldTransform]
  }
  
  @scala.inline
  implicit class FoldTransformMutableBuilder[Self <: FoldTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: js.Tuple2[FieldName, FieldName]): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setFold(value: js.Array[FieldName]): Self = StObject.set(x, "fold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldVarargs(value: FieldName*): Self = StObject.set(x, "fold", js.Array(value :_*))
  }
}
