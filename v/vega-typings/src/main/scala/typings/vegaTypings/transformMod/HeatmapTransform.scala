package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.heatmap
import typings.vegaTypings.vegaTypingsStrings.independent
import typings.vegaTypings.vegaTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeatmapTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var color: js.UndefOr[String | TransformField] = js.native
  var field: js.UndefOr[String | TransformField] = js.native
  var opacity: js.UndefOr[Double | TransformField] = js.native
  var resolve: js.UndefOr[independent | shared | SignalRef] = js.native
  var `type`: heatmap = js.native
}

object HeatmapTransform {
  @scala.inline
  def apply(`type`: heatmap): HeatmapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapTransform]
  }
  @scala.inline
  implicit class HeatmapTransformOps[Self <: HeatmapTransform] (val x: Self) extends AnyVal {
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
    def setType(value: heatmap): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setColor(value: String | TransformField): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setField(value: String | TransformField): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setOpacity(value: Double | TransformField): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    @scala.inline
    def setResolve(value: independent | shared | SignalRef): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
  }
  
}

