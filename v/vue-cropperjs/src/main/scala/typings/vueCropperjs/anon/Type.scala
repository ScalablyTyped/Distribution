package typings.vueCropperjs.anon

import typings.vueCropperjs.vueCropperjsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Type extends js.Object {
  var default: `true` = js.native
  var `type`: Boolean = js.native
}

object Type {
  @scala.inline
  def apply(default: `true`, `type`: Boolean): Type = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  @scala.inline
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
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
    def setDefault(value: `true`): Self = this.set("default", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Boolean): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

