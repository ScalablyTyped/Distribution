package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.lookup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupTransform extends _Transforms {
  
  var default: js.UndefOr[js.Any] = js.native
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  
  var fields: js.Array[FieldRef] | SignalRef = js.native
  
  var from: DataName = js.native
  
  var key: FieldRef = js.native
  
  var `type`: lookup = js.native
  
  var values: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
}
object LookupTransform {
  
  @scala.inline
  def apply(fields: js.Array[FieldRef] | SignalRef, from: DataName, key: FieldRef, `type`: lookup): LookupTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupTransform]
  }
  
  @scala.inline
  implicit class LookupTransformMutableBuilder[Self <: LookupTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: FieldRef*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFrom(value: DataName): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FieldRef): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: lookup): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: FieldRef*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
