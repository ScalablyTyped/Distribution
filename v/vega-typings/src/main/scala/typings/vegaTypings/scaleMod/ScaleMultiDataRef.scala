package typings.vegaTypings.scaleMod

import typings.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScaleMultiDataRef extends js.Object {
  var fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef] = js.native
}

object ScaleMultiDataRef {
  @scala.inline
  def apply(fields: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): ScaleMultiDataRef = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiDataRef]
  }
  @scala.inline
  implicit class ScaleMultiDataRefOps[Self <: ScaleMultiDataRef] (val x: Self) extends AnyVal {
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
    def setFieldsVarargs(value: ((js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef)*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[(js.Array[String | Double | Boolean]) | ScaleDataRef | SignalRef]): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
  
}

