package typings.vegaLite.transformMod

import typings.vegaLite.channeldefMod.FieldName
import typings.vegaLite.srcImputeMod.ImputeParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImputeTransform
  extends StObject
     with ImputeParams
     with Transform {
  
  /**
    * An optional array of fields by which to group the values.
    * Imputation will then be performed on a per-group basis.
    */
  var groupby: js.UndefOr[js.Array[FieldName]] = js.undefined
  
  /**
    * The data field for which the missing values should be imputed.
    */
  var impute: FieldName
  
  /**
    * A key field that uniquely identifies data objects within a group.
    * Missing key values (those occurring in the data but not in the current group) will be imputed.
    */
  var key: FieldName
}
object ImputeTransform {
  
  @scala.inline
  def apply(impute: FieldName, key: FieldName): ImputeTransform = {
    val __obj = js.Dynamic.literal(impute = impute.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeTransform]
  }
  
  @scala.inline
  implicit class ImputeTransformMutableBuilder[Self <: ImputeTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupby(value: js.Array[FieldName]): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldName*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setImpute(value: FieldName): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FieldName): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
