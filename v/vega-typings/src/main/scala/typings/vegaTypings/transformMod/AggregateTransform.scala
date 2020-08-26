package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.aggregate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateTransform extends _Transforms {
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.native
  var cross: js.UndefOr[Boolean | SignalRef] = js.native
  var drop: js.UndefOr[Boolean | SignalRef] = js.native
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var key: js.UndefOr[String | TransformField] = js.native
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.native
  var signal: js.UndefOr[String] = js.native
  var `type`: aggregate = js.native
}

object AggregateTransform {
  @scala.inline
  def apply(`type`: aggregate): AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateTransform]
  }
  @scala.inline
  implicit class AggregateTransformOps[Self <: AggregateTransform] (val x: Self) extends AnyVal {
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
    def setType(value: aggregate): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = this.set("as", js.Array(value :_*))
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setCross(value: Boolean | SignalRef): Self = this.set("cross", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCross: Self = this.set("cross", js.undefined)
    @scala.inline
    def setDrop(value: Boolean | SignalRef): Self = this.set("drop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    @scala.inline
    def setFieldsVarargs(value: (FieldRef | Null)*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    @scala.inline
    def setKey(value: String | TransformField): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOpsVarargs(value: (AggregateOp | SignalRef)*): Self = this.set("ops", js.Array(value :_*))
    @scala.inline
    def setOps(value: (js.Array[AggregateOp | SignalRef]) | SignalRef): Self = this.set("ops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOps: Self = this.set("ops", js.undefined)
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

