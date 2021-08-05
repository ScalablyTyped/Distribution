package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.flatten
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  
  var fields: js.Array[FieldRef] | SignalRef
  
  var index: js.UndefOr[String | SignalRef] = js.undefined
  
  var `type`: flatten
}
object FlattenTransform {
  
  inline def apply(fields: js.Array[FieldRef] | SignalRef): FlattenTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("flatten")
    __obj.asInstanceOf[FlattenTransform]
  }
  
  extension [Self <: FlattenTransform](x: Self) {
    
    inline def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    inline def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setIndex(value: String | SignalRef): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setType(value: flatten): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
