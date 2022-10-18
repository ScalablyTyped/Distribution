package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.aggregate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  
  var cross: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var drop: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var key: js.UndefOr[String | TransformField] = js.undefined
  
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.undefined
  
  var signal: js.UndefOr[String] = js.undefined
  
  var `type`: aggregate
}
object AggregateTransform {
  
  inline def apply(): AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("aggregate")
    __obj.asInstanceOf[AggregateTransform]
  }
  
  extension [Self <: AggregateTransform](x: Self) {
    
    inline def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setCross(value: Boolean | SignalRef): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    inline def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
    
    inline def setDrop(value: Boolean | SignalRef): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
    inline def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (FieldRef | Null)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setKey(value: String | TransformField): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOps(value: (js.Array[AggregateOp | SignalRef]) | SignalRef): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    inline def setOpsVarargs(value: (AggregateOp | SignalRef)*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setType(value: aggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
