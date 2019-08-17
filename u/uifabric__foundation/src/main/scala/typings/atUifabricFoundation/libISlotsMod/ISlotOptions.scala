package typings.atUifabricFoundation.libISlotsMod

import typings.react.reactMod.ElementType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotOptions[TProps] extends js.Object {
  var component: js.UndefOr[ElementType[TProps]] = js.undefined
  var render: js.UndefOr[ISlotRender[TProps]] = js.undefined
}

object ISlotOptions {
  @scala.inline
  def apply[TProps](component: ElementType[TProps] = null, render: ISlotRender[TProps] = null): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render)
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
}

