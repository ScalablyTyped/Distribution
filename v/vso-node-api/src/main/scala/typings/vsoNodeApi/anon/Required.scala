package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Required extends js.Object {
  var required: scala.Double = js.native
  var supported: scala.Double = js.native
  var unsupported: scala.Double = js.native
}

object Required {
  @scala.inline
  def apply(required: scala.Double, supported: scala.Double, unsupported: scala.Double): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], unsupported = unsupported.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
  @scala.inline
  implicit class RequiredOps[Self <: Required] (val x: Self) extends AnyVal {
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
    def setRequired(value: scala.Double): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: scala.Double): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnsupported(value: scala.Double): Self = this.set("unsupported", value.asInstanceOf[js.Any])
  }
  
}

