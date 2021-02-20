package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.impute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImputeTransform extends _Transforms {
  
  var field: FieldRef = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var key: FieldRef = js.native
  
  var keyvals: js.UndefOr[js.Array[_] | SignalRef] = js.native
  
  var method: js.UndefOr[ImputeMethod | SignalRef] = js.native
  
  var `type`: impute = js.native
  
  var value: js.UndefOr[js.Any] = js.native
}
object ImputeTransform {
  
  @scala.inline
  def apply(field: FieldRef, key: FieldRef, `type`: impute): ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeTransform]
  }
  
  @scala.inline
  implicit class ImputeTransformMutableBuilder[Self <: ImputeTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyvals(value: js.Array[_] | SignalRef): Self = StObject.set(x, "keyvals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyvalsUndefined: Self = StObject.set(x, "keyvals", js.undefined)
    
    @scala.inline
    def setKeyvalsVarargs(value: js.Any*): Self = StObject.set(x, "keyvals", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: ImputeMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setType(value: impute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
