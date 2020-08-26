package typings.tensorflowTfjsConverter.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Required extends js.Object {
  var additionalProperties: Boolean = js.native
  var properties: Name = js.native
  var required: js.Array[String] = js.native
  var `type`: String = js.native
}

object Required {
  @scala.inline
  def apply(additionalProperties: Boolean, properties: Name, required: js.Array[String], `type`: String): Required = {
    val __obj = js.Dynamic.literal(additionalProperties = additionalProperties.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
    def setAdditionalProperties(value: Boolean): Self = this.set("additionalProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: Name): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequiredVarargs(value: String*): Self = this.set("required", js.Array(value :_*))
    @scala.inline
    def setRequired(value: js.Array[String]): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

