package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.lookup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LookupTransform extends _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef]) | SignalRef] = js.native
  
  var default: js.UndefOr[js.Any] = js.native
  
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
  implicit class LookupTransformOps[Self <: LookupTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFieldsVarargs(value: FieldRef*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[FieldRef] | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrom(value: DataName): Self = this.set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: FieldRef): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: lookup): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef)*): Self = this.set("as", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setDefault(value: js.Any): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: FieldRef*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[FieldRef] | SignalRef): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
