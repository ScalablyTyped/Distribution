package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.crossfilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CrossFilterTransform extends _Transforms {
  
  var fields: (js.Array[String | TransformField]) | SignalRef = js.native
  
  var query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef = js.native
  
  var signal: js.UndefOr[SignalName] = js.native
  
  var `type`: crossfilter = js.native
}
object CrossFilterTransform {
  
  @scala.inline
  def apply(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef,
    `type`: crossfilter
  ): CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossFilterTransform]
  }
  
  @scala.inline
  implicit class CrossFilterTransformOps[Self <: CrossFilterTransform] (val x: Self) extends AnyVal {
    
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
    def setFieldsVarargs(value: (String | TransformField)*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: (js.Array[String | TransformField]) | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVarargs(value: ((Vector2[Double | SignalRef]) | SignalRef)*): Self = this.set("query", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: crossfilter): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignal(value: SignalName): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
}
