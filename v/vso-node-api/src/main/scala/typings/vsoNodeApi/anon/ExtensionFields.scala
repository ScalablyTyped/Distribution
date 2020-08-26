package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionFields extends js.Object {
  var extensionFields: scala.Double = js.native
  var none: scala.Double = js.native
}

object ExtensionFields {
  @scala.inline
  def apply(extensionFields: scala.Double, none: scala.Double): ExtensionFields = {
    val __obj = js.Dynamic.literal(extensionFields = extensionFields.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionFields]
  }
  @scala.inline
  implicit class ExtensionFieldsOps[Self <: ExtensionFields] (val x: Self) extends AnyVal {
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
    def setExtensionFields(value: scala.Double): Self = this.set("extensionFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
  }
  
}

