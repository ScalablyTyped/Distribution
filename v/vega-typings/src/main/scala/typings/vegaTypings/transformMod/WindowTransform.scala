package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.window
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
  implicit class WindowTransformOps[Self <: WindowTransform] (val x: Self) extends AnyVal {
    
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
    def setType(value: window): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = this.set("as", js.Array(value :_*))
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (FieldRef | Null)*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setFrame(value: (Vector2[Double | SignalRef | Null]) | SignalRef): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    
    @scala.inline
    def setIgnorePeers(value: Boolean | SignalRef): Self = this.set("ignorePeers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnorePeers: Self = this.set("ignorePeers", js.undefined)
    
    @scala.inline
    def setOpsVarargs(value: (AggregateOp | WindowOnlyOp | SignalRef)*): Self = this.set("ops", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: js.Array[AggregateOp | WindowOnlyOp | SignalRef]): Self = this.set("ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOps: Self = this.set("ops", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: (Double | SignalRef | Null)*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: (js.Array[Double | SignalRef | Null]) | SignalRef): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
}
