package typings.tensorflowTfjsConverter.operationsTypesMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamValue extends js.Object {
  var `type`: ParamType = js.native
  var value: js.UndefOr[ValueType] = js.native
}

object ParamValue {
  @scala.inline
  def apply(`type`: ParamType): ParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamValue]
  }
  @scala.inline
  implicit class ParamValueOps[Self <: ParamValue] (val x: Self) extends AnyVal {
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
    def setType(value: ParamType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: ValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

