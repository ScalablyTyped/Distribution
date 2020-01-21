package typings.uifabricFoundation.libIslotsMod

import typings.uifabricFoundation.libIcomponentMod.IComponentStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDefaultSlotProps[TSlots] extends js.Object {
  var _defaultStyles: IComponentStyles[TSlots]
}

object IDefaultSlotProps {
  @scala.inline
  def apply[TSlots](_defaultStyles: IComponentStyles[TSlots]): IDefaultSlotProps[TSlots] = {
    val __obj = js.Dynamic.literal(_defaultStyles = _defaultStyles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDefaultSlotProps[TSlots]]
  }
}

