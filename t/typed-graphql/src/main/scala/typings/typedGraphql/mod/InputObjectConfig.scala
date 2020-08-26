package typings.typedGraphql.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputObjectConfig extends js.Object {
  var description: js.UndefOr[String] = js.native
  var fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap = js.native
  var name: String = js.native
}

object InputObjectConfig {
  @scala.inline
  def apply(fields: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap, name: String): InputObjectConfig = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputObjectConfig]
  }
  @scala.inline
  implicit class InputObjectConfigOps[Self <: InputObjectConfig] (val x: Self) extends AnyVal {
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
    def setFieldsFunction0(value: () => InputObjectConfigFieldMap): Self = this.set("fields", js.Any.fromFunction0(value))
    @scala.inline
    def setFields(value: InputObjectConfigFieldMapThunk | InputObjectConfigFieldMap): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

