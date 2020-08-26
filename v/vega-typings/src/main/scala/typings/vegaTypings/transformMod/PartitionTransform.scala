package typings.vegaTypings.transformMod

import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.utilMod.Vector6
import typings.vegaTypings.vegaTypingsStrings.partition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartitionTransform extends _Transforms {
  var as: js.UndefOr[(Vector6[String | SignalRef]) | SignalRef] = js.native
  var field: js.UndefOr[FieldRef] = js.native
  var padding: js.UndefOr[Double | SignalRef] = js.native
  var round: js.UndefOr[Boolean | SignalRef] = js.native
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var sort: js.UndefOr[Compare] = js.native
  var `type`: partition = js.native
}

object PartitionTransform {
  @scala.inline
  def apply(`type`: partition): PartitionTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartitionTransform]
  }
  @scala.inline
  implicit class PartitionTransformOps[Self <: PartitionTransform] (val x: Self) extends AnyVal {
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
    def setType(value: partition): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector6[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setPadding(value: Double | SignalRef): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
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

