package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.treemap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreemapTransform extends _Transforms {
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.native
  var field: js.UndefOr[FieldRef] = js.native
  var method: js.UndefOr[TreemapMethod | SignalRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var paddingBottom: js.UndefOr[Double | SignalRef] = js.native
  var paddingInner: js.UndefOr[Double | SignalRef] = js.native
  var paddingLeft: js.UndefOr[Double | SignalRef] = js.native
  var paddingOuter: js.UndefOr[Double | SignalRef] = js.native
  var paddingRight: js.UndefOr[Double | SignalRef] = js.native
  var paddingTop: js.UndefOr[Double | SignalRef] = js.native
  var ratio: js.UndefOr[Double | SignalRef] = js.native
  var round: js.UndefOr[Boolean | SignalRef] = js.native
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: treemap = js.native
}

object TreemapTransform {
  @scala.inline
  def apply(`type`: treemap): TreemapTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreemapTransform]
  }
  @scala.inline
  implicit class TreemapTransformOps[Self <: TreemapTransform] (val x: Self) extends AnyVal {
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
    def setType(value: treemap): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector6[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setMethod(value: TreemapMethod | SignalRef): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPaddingBottom(value: Double | SignalRef): Self = this.set("paddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingBottom: Self = this.set("paddingBottom", js.undefined)
    @scala.inline
    def setPaddingInner(value: Double | SignalRef): Self = this.set("paddingInner", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingInner: Self = this.set("paddingInner", js.undefined)
    @scala.inline
    def setPaddingLeft(value: Double | SignalRef): Self = this.set("paddingLeft", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingLeft: Self = this.set("paddingLeft", js.undefined)
    @scala.inline
    def setPaddingOuter(value: Double | SignalRef): Self = this.set("paddingOuter", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingOuter: Self = this.set("paddingOuter", js.undefined)
    @scala.inline
    def setPaddingRight(value: Double | SignalRef): Self = this.set("paddingRight", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingRight: Self = this.set("paddingRight", js.undefined)
    @scala.inline
    def setPaddingTop(value: Double | SignalRef): Self = this.set("paddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaddingTop: Self = this.set("paddingTop", js.undefined)
    @scala.inline
    def setRatio(value: Double | SignalRef): Self = this.set("ratio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRatio: Self = this.set("ratio", js.undefined)
    @scala.inline
    def setRound(value: Boolean | SignalRef): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSort(value: Compare): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

