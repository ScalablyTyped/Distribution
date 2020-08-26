package typings.uifabricFoundation.libIslotsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IProcessedSlotProps extends js.Object {
  var className: js.UndefOr[String] = js.native
}

object IProcessedSlotProps {
  @scala.inline
  def apply(): IProcessedSlotProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IProcessedSlotProps]
  }
  @scala.inline
  implicit class IProcessedSlotPropsOps[Self <: IProcessedSlotProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
  }
  
}

