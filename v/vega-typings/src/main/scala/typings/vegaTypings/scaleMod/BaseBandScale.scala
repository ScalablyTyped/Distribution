package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseBandScale extends BaseScale {
  var align: js.UndefOr[Double | SignalRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.native
  var range: js.UndefOr[RangeBand] = js.native
}

object BaseBandScale {
  @scala.inline
  def apply(name: String): BaseBandScale = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseBandScale]
  }
  @scala.inline
  implicit class BaseBandScaleOps[Self <: BaseBandScale] (val x: Self) extends AnyVal {
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
    def setAlign(value: Double | SignalRef): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingOuter(value: Double | SignalRef): Self = this.set("paddingOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingOuter: Self = this.set("paddingOuter", js.undefined)
    @scala.inline
    def setRangeVarargs(value: (Null | Boolean | String | Double | SignalRef | RangeRawArray)*): Self = this.set("range", js.Array(value :_*))
    @scala.inline
    def setRange(value: RangeBand): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

