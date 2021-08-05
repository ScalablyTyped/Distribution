package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.crossfilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrossFilterTransform
  extends StObject
     with _Transforms {
  
  var fields: (js.Array[String | TransformField]) | SignalRef
  
  var query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  
  var signal: js.UndefOr[SignalName] = js.undefined
  
  var `type`: crossfilter
}
object CrossFilterTransform {
  
  inline def apply(
    fields: (js.Array[String | TransformField]) | SignalRef,
    query: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef
  ): CrossFilterTransform = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("crossfilter")
    __obj.asInstanceOf[CrossFilterTransform]
  }
  
  extension [Self <: CrossFilterTransform](x: Self) {
    
    inline def setFields(value: (js.Array[String | TransformField]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: (String | TransformField)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setQuery(value: (js.Array[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryVarargs(value: ((Vector2[Double | SignalRef]) | SignalRef)*): Self = StObject.set(x, "query", js.Array(value :_*))
    
    inline def setSignal(value: SignalName): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setType(value: crossfilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
