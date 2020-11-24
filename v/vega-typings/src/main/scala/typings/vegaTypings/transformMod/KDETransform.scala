package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.kde
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KDETransform extends _Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.native
  
  var counts: js.UndefOr[Boolean | SignalRef] = js.native
  
  var cumulative: js.UndefOr[Boolean | SignalRef] = js.native
  
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  
  var field: FieldRef = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var maxsteps: js.UndefOr[Double | SignalRef] = js.native
  
  var minsteps: js.UndefOr[Double | SignalRef] = js.native
  
  var resolve: js.UndefOr[KDEResolve | SignalRef] = js.native
  
  var steps: js.UndefOr[Double | SignalRef] = js.native
  
  var `type`: kde = js.native
}
object KDETransform {
  
  @scala.inline
  def apply(field: FieldRef, `type`: kde): KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KDETransform]
  }
  
  @scala.inline
  implicit class KDETransformOps[Self <: KDETransform] (val x: Self) extends AnyVal {
    
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
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: kde): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    
    @scala.inline
    def setCounts(value: Boolean | SignalRef): Self = this.set("counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCounts: Self = this.set("counts", js.undefined)
    
    @scala.inline
    def setCumulative(value: Boolean | SignalRef): Self = this.set("cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCumulative: Self = this.set("cumulative", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    
    @scala.inline
    def setMaxsteps(value: Double | SignalRef): Self = this.set("maxsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxsteps: Self = this.set("maxsteps", js.undefined)
    
    @scala.inline
    def setMinsteps(value: Double | SignalRef): Self = this.set("minsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinsteps: Self = this.set("minsteps", js.undefined)
    
    @scala.inline
    def setResolve(value: KDEResolve | SignalRef): Self = this.set("resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    
    @scala.inline
    def setSteps(value: Double | SignalRef): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
  }
}
