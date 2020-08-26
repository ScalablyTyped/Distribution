package typings.vegaTypings.transformMod

import typings.vegaTypings.vegaTypingsStrings.extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtentTransform extends _Transforms {
  var field: FieldRef = js.native
  var signal: js.UndefOr[String] = js.native
  var `type`: extent = js.native
}

object ExtentTransform {
  @scala.inline
  def apply(field: FieldRef, `type`: extent): ExtentTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtentTransform]
  }
  @scala.inline
  implicit class ExtentTransformOps[Self <: ExtentTransform] (val x: Self) extends AnyVal {
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
    def setType(value: extent): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignal(value: String): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
  }
  
}

