package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.kde
import org.scalablytyped.runtime.StObject
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
  implicit class KDETransformMutableBuilder[Self <: KDETransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    @scala.inline
    def setCounts(value: Boolean | SignalRef): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    @scala.inline
    def setCumulative(value: Boolean | SignalRef): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    @scala.inline
    def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setMaxsteps(value: Double | SignalRef): Self = StObject.set(x, "maxsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxstepsUndefined: Self = StObject.set(x, "maxsteps", js.undefined)
    
    @scala.inline
    def setMinsteps(value: Double | SignalRef): Self = StObject.set(x, "minsteps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinstepsUndefined: Self = StObject.set(x, "minsteps", js.undefined)
    
    @scala.inline
    def setResolve(value: KDEResolve | SignalRef): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    @scala.inline
    def setSteps(value: Double | SignalRef): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setType(value: kde): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
