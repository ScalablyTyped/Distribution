package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.impute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImputeTransform extends _Transforms {
  var field: FieldRef = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var key: FieldRef = js.native
  var keyvals: js.UndefOr[js.Array[_] | SignalRef] = js.native
  var method: js.UndefOr[ImputeMethod | SignalRef] = js.native
  var `type`: impute = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object ImputeTransform {
  @scala.inline
  def apply(field: FieldRef, key: FieldRef, `type`: impute): ImputeTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImputeTransform]
  }
  @scala.inline
  implicit class ImputeTransformOps[Self <: ImputeTransform] (val x: Self) extends AnyVal {
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
    def setField(value: FieldRef): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: FieldRef): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: impute): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    @scala.inline
    def setKeyvalsVarargs(value: js.Any*): Self = this.set("keyvals", js.Array(value :_*))
    @scala.inline
    def setKeyvals(value: js.Array[_] | SignalRef): Self = this.set("keyvals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyvals: Self = this.set("keyvals", js.undefined)
    @scala.inline
    def setMethod(value: ImputeMethod | SignalRef): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

