package typings.swaggerSchemaOfficial.anon

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialBooleans.`true`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait In extends js.Object {
  var in: path = js.native
  var required: `true` = js.native
}

object In {
  @scala.inline
  def apply(in: path, required: `true`): In = {
    val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[In]
  }
  @scala.inline
  implicit class InOps[Self <: In] (val x: Self) extends AnyVal {
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
    def setIn(value: path): Self = this.set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: `true`): Self = this.set("required", value.asInstanceOf[js.Any])
  }
  
}

