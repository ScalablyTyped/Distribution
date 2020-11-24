package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.quantile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuantileScale
  extends BaseScale
     with Scale {
  
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  
  var range: js.UndefOr[RangeScheme] = js.native
  
  @JSName("type")
  var type_QuantileScale: js.UndefOr[quantile] = js.native
}
object QuantileScale {
  
  @scala.inline
  def apply(name: String): QuantileScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantileScale]
  }
  
  @scala.inline
  implicit class QuantileScaleOps[Self <: QuantileScale] (val x: Self) extends AnyVal {
    
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
    def setInterpolate(value: ScaleInterpolate): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = this.set("range", js.Array(value :_*))
    
    @scala.inline
    def setRange(value: RangeScheme): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setType(value: quantile): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
