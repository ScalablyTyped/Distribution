package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.impute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImputeTransform
  extends StObject
     with _Transforms {
  
  var field: FieldRef
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var key: FieldRef
  
  var keyvals: js.UndefOr[js.Array[js.Any] | SignalRef] = js.undefined
  
  var method: js.UndefOr[ImputeMethod | SignalRef] = js.undefined
  
  var `type`: impute
  
  var value: js.UndefOr[js.Any] = js.undefined
}
object ImputeTransform {
  
  inline def apply(field: FieldRef, key: FieldRef): ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("impute")
    __obj.asInstanceOf[ImputeTransform]
  }
  
  extension [Self <: ImputeTransform](x: Self) {
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    inline def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyvals(value: js.Array[js.Any] | SignalRef): Self = StObject.set(x, "keyvals", value.asInstanceOf[js.Any])
    
    inline def setKeyvalsUndefined: Self = StObject.set(x, "keyvals", js.undefined)
    
    inline def setKeyvalsVarargs(value: js.Any*): Self = StObject.set(x, "keyvals", js.Array(value :_*))
    
    inline def setMethod(value: ImputeMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setType(value: impute): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
