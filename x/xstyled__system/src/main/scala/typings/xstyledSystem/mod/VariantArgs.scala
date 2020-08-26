package typings.xstyledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VariantArgs extends js.Object {
  var default: js.UndefOr[String | Double] = js.native
  var key: js.UndefOr[String] = js.native
  var prop: js.UndefOr[String] = js.native
  var variants: js.UndefOr[js.Object] = js.native
}

object VariantArgs {
  @scala.inline
  def apply(): VariantArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariantArgs]
  }
  @scala.inline
  implicit class VariantArgsOps[Self <: VariantArgs] (val x: Self) extends AnyVal {
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
    def setDefault(value: String | Double): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setProp(value: String): Self = this.set("prop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProp: Self = this.set("prop", js.undefined)
    @scala.inline
    def setVariants(value: js.Object): Self = this.set("variants", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariants: Self = this.set("variants", js.undefined)
  }
  
}

