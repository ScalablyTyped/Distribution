package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.threshold
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThresholdScale
  extends BaseScale
     with Scale {
  var nice: js.UndefOr[Boolean | Double | SignalRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var range: js.UndefOr[RangeScheme] = js.native
  @JSName("type")
  var type_ThresholdScale: js.UndefOr[threshold] = js.native
  var zero: js.UndefOr[Boolean | SignalRef] = js.native
}

object ThresholdScale {
  @scala.inline
  def apply(name: String): ThresholdScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThresholdScale]
  }
  @scala.inline
  implicit class ThresholdScaleOps[Self <: ThresholdScale] (val x: Self) extends AnyVal {
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
    def setNice(value: Boolean | Double | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
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
    @scala.inline
    def setType(value: threshold): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

