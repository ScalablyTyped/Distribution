package typings.uifabricFoundation.libIslotsMod

import typings.uifabricFoundation.libIcomponentMod.IComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDefaultSlotProps[TSlots] extends js.Object {
  var _defaultStyles: IComponentStyles[TSlots] = js.native
}

object IDefaultSlotProps {
  @scala.inline
  def apply[TSlots](_defaultStyles: IComponentStyles[TSlots]): IDefaultSlotProps[TSlots] = {
    val __obj = js.Dynamic.literal(_defaultStyles = _defaultStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDefaultSlotProps[TSlots]]
  }
  @scala.inline
  implicit class IDefaultSlotPropsOps[Self <: IDefaultSlotProps[_], TSlots] (val x: Self with IDefaultSlotProps[TSlots]) extends AnyVal {
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
    def set_defaultStyles(value: IComponentStyles[TSlots]): Self = this.set("_defaultStyles", value.asInstanceOf[js.Any])
  }
  
}

