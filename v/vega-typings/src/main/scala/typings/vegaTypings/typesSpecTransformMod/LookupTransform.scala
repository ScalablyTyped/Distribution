package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LookupTransform
  extends StObject
     with Transforms {
  
  var default: js.UndefOr[Any] = js.undefined
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.undefined
  
  var fields: js.Array[FieldRef] | SignalRef
  
  var from: DataName
  
  var key: FieldRef
  
  var `type`: lookup
  
  var values: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
}
object LookupTransform {
  
  inline def apply(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef): LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("lookup")
    __obj.asInstanceOf[LookupTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LookupTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFrom(value: DataName): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setType(value: lookup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: FieldRef*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
