package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContinuousScale
  extends StObject
     with BaseScale {
  
  var bins: js.UndefOr[ScaleBins] = js.undefined
  
  var clamp: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.undefined
  
  var padding: js.UndefOr[Double | SignalRef] = js.undefined
  
  var range: js.UndefOr[RangeScheme] = js.undefined
}
object ContinuousScale {
  
  @scala.inline
  def apply(name: String): ContinuousScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousScale]
  }
  
  @scala.inline
  implicit class ContinuousScaleMutableBuilder[Self <: ContinuousScale] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBins(value: ScaleBins): Self = StObject.set(x, "bins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinsUndefined: Self = StObject.set(x, "bins", js.undefined)
    
    @scala.inline
    def setBinsVarargs(value: (Double | SignalRef)*): Self = StObject.set(x, "bins", js.Array(value :_*))
    
    @scala.inline
    def setClamp(value: Boolean | SignalRef): Self = StObject.set(x, "clamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClampUndefined: Self = StObject.set(x, "clamp", js.undefined)
    
    @scala.inline
    def setInterpolate(value: ScaleInterpolate): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
    
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setRange(value: RangeScheme): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = StObject.set(x, "range", js.Array(value :_*))
  }
}
