package typings.typedoc.componentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentOptions extends js.Object {
  var childClass: js.UndefOr[js.Function] = js.native
  var internal: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object ComponentOptions {
  @scala.inline
  def apply(): ComponentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentOptions]
  }
  @scala.inline
  implicit class ComponentOptionsOps[Self <: ComponentOptions] (val x: Self) extends AnyVal {
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
    def setChildClass(value: js.Function): Self = this.set("childClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildClass: Self = this.set("childClass", js.undefined)
    @scala.inline
    def setInternal(value: Boolean): Self = this.set("internal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInternal: Self = this.set("internal", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

