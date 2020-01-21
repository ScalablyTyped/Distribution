package typings.uifabricFoundation.libIslotsMod

import typings.react.mod.ComponentType
import typings.react.mod.ElementType
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotOptions[TProps] extends js.Object {
  var component: js.UndefOr[ElementType[TProps]] = js.undefined
  var render: js.UndefOr[ISlotRender[TProps]] = js.undefined
}

object ISlotOptions {
  @scala.inline
  def apply[TProps](
    component: ElementType[TProps] = null,
    render: (/* props */ PropsWithChildren[TProps], /* defaultComponent */ ComponentType[TProps]) => ReturnType[FunctionComponent[TProps]] = null
  ): ISlotOptions[TProps] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    __obj.asInstanceOf[ISlotOptions[TProps]]
  }
}

