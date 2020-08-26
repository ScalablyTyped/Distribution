package typings.tensorflowTfjsConverter.operationsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputParamValue extends ParamValue {
  var inputIndexEnd: js.UndefOr[Double] = js.native
  var inputIndexStart: js.UndefOr[Double] = js.native
}

object InputParamValue {
  @scala.inline
  def apply(`type`: ParamType): InputParamValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParamValue]
  }
  @scala.inline
  implicit class InputParamValueOps[Self <: InputParamValue] (val x: Self) extends AnyVal {
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
    def setInputIndexEnd(value: Double): Self = this.set("inputIndexEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputIndexEnd: Self = this.set("inputIndexEnd", js.undefined)
    @scala.inline
    def setInputIndexStart(value: Double): Self = this.set("inputIndexStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputIndexStart: Self = this.set("inputIndexStart", js.undefined)
  }
  
}

