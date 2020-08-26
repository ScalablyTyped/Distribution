package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContinuousScale extends BaseScale {
  var bins: js.UndefOr[ScaleBins] = js.native
  var clamp: js.UndefOr[Boolean | SignalRef] = js.native
  var interpolate: js.UndefOr[ScaleInterpolate] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var range: js.UndefOr[RangeScheme] = js.native
}

object ContinuousScale {
  @scala.inline
  def apply(name: String): ContinuousScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousScale]
  }
  @scala.inline
  implicit class ContinuousScaleOps[Self <: ContinuousScale] (val x: Self) extends AnyVal {
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
    def setBinsVarargs(value: (Double | SignalRef)*): Self = this.set("bins", js.Array(value :_*))
    @scala.inline
    def setBins(value: ScaleBins): Self = this.set("bins", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBins: Self = this.set("bins", js.undefined)
    @scala.inline
    def setClamp(value: Boolean | SignalRef): Self = this.set("clamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClamp: Self = this.set("clamp", js.undefined)
    @scala.inline
    def setInterpolate(value: ScaleInterpolate): Self = this.set("interpolate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterpolate: Self = this.set("interpolate", js.undefined)
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: RangeScheme): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

