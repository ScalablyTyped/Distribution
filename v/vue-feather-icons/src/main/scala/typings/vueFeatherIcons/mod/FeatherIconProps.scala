package typings.vueFeatherIcons.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatherIconProps extends js.Object {
  var size: String = js.native
}

object FeatherIconProps {
  @scala.inline
  def apply(size: String): FeatherIconProps = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatherIconProps]
  }
  @scala.inline
  implicit class FeatherIconPropsOps[Self <: FeatherIconProps] (val x: Self) extends AnyVal {
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
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

