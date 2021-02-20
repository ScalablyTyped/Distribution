package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.pivot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotTransform extends _Transforms {
  
  var field: FieldRef = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var key: js.UndefOr[String | TransformField] = js.native
  
  var limit: js.UndefOr[Double | SignalRef] = js.native
  
  var op: js.UndefOr[String | SignalRef] = js.native
  
  var `type`: pivot = js.native
  
  var value: FieldRef = js.native
}
object PivotTransform {
  
  @scala.inline
  def apply(field: FieldRef, `type`: pivot, value: FieldRef): PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotTransform]
  }
  
  @scala.inline
  implicit class PivotTransformMutableBuilder[Self <: PivotTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: String | TransformField): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setLimit(value: Double | SignalRef): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setOp(value: String | SignalRef): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    @scala.inline
    def setType(value: pivot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: FieldRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
