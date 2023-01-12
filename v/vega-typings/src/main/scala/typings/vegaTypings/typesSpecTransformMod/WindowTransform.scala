package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecMarkMod.Compare
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  
  var frame: js.UndefOr[(Vector2[Double | SignalRef | Null]) | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var ignorePeers: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var ops: js.UndefOr[js.Array[AggregateOp | WindowOnlyOp | SignalRef]] = js.undefined
  
  var params: js.UndefOr[(js.Array[Double | SignalRef | Null]) | SignalRef] = js.undefined
  
  var sort: js.UndefOr[Compare] = js.undefined
  
  var `type`: window
}
object WindowTransform {
  
  inline def apply(): WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("window")
    __obj.asInstanceOf[WindowTransform]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WindowTransform] (val x: Self) extends AnyVal {
    
    inline def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value*))
    
    inline def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (FieldRef | Null)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFrame(value: (Vector2[Double | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setIgnorePeers(value: Boolean | SignalRef): Self = StObject.set(x, "ignorePeers", value.asInstanceOf[js.Any])
    
    inline def setIgnorePeersUndefined: Self = StObject.set(x, "ignorePeers", js.undefined)
    
    inline def setOps(value: js.Array[AggregateOp | WindowOnlyOp | SignalRef]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    inline def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    inline def setOpsVarargs(value: (AggregateOp | WindowOnlyOp | SignalRef)*): Self = StObject.set(x, "ops", js.Array(value*))
    
    inline def setParams(value: (js.Array[Double | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: (Double | SignalRef | Null)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setType(value: window): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
