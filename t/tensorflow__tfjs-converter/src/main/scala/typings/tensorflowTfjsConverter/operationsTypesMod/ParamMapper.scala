package typings.tensorflowTfjsConverter.operationsTypesMod

import typings.tensorflowTfjsCore.distTypesMod.Rank
import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamMapper extends js.Object {
  var defaultValue: js.UndefOr[ValueType] = js.native
  var name: String = js.native
  var notSupported: js.UndefOr[Boolean] = js.native
  var `type`: ParamType = js.native
}

object ParamMapper {
  @scala.inline
  def apply(name: String, `type`: ParamType): ParamMapper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamMapper]
  }
  @scala.inline
  implicit class ParamMapperOps[Self <: ParamMapper] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: ParamType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValueVarargs(value: (js.Array[Double] | Boolean | Double | String | Tensor[Rank])*): Self = this.set("defaultValue", js.Array(value :_*))
    @scala.inline
    def setDefaultValue(value: ValueType): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setNotSupported(value: Boolean): Self = this.set("notSupported", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotSupported: Self = this.set("notSupported", js.undefined)
  }
  
}

