package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.crossfilter
import org.scalablytyped.runtime.StObject
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
  implicit class CrossFilterTransformMutableBuilder[Self <: CrossFilterTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: (js.Array[String | TransformField]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: (String | TransformField)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setQuery(value: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryVarargs(value: ((Vector2[Double | SignalRef]) | SignalRef)*): Self = StObject.set(x, "query", js.Array(value :_*))
    
    @scala.inline
    def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setType(value: crossfilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
