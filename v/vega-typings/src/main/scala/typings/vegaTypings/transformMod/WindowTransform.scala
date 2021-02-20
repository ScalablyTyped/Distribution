package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowTransform extends _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.native
  
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.native
  
  var frame: js.UndefOr[(Vector2[Double | SignalRef | Null]) | SignalRef] = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var ignorePeers: js.UndefOr[Boolean | SignalRef] = js.native
  
  var ops: js.UndefOr[js.Array[AggregateOp | WindowOnlyOp | SignalRef]] = js.native
  
  var params: js.UndefOr[(js.Array[Double | SignalRef | Null]) | SignalRef] = js.native
  
  var sort: js.UndefOr[Compare] = js.native
  
  var `type`: window = js.native
}
object WindowTransform {
  
  @scala.inline
  def apply(`type`: window): WindowTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowTransform]
  }
  
  @scala.inline
  implicit class WindowTransformMutableBuilder[Self <: WindowTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (FieldRef | Null)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFrame(value: (Vector2[Double | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setIgnorePeers(value: Boolean | SignalRef): Self = StObject.set(x, "ignorePeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePeersUndefined: Self = StObject.set(x, "ignorePeers", js.undefined)
    
    @scala.inline
    def setOps(value: js.Array[AggregateOp | WindowOnlyOp | SignalRef]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    @scala.inline
    def setOpsVarargs(value: (AggregateOp | WindowOnlyOp | SignalRef)*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: (js.Array[Double | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: (Double | SignalRef | Null)*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: Compare): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    @scala.inline
    def setType(value: window): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
