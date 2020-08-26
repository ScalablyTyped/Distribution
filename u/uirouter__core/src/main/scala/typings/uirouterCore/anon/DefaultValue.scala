package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultValue extends js.Object {
  var defaultValue: js.Any = js.native
}

object DefaultValue {
  @scala.inline
  def apply(defaultValue: js.Any): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  @scala.inline
  implicit class DefaultValueOps[Self <: DefaultValue] (val x: Self) extends AnyVal {
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
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
  }
  
}

