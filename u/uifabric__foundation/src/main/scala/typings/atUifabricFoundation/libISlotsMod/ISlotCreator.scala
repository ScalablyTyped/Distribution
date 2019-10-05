package typings.atUifabricFoundation.libISlotsMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import typings.react.reactMod.FunctionComponent
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.undefined
}

object ISlotCreator {
  @scala.inline
  def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](
    create: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle) => ReturnType[FunctionComponent[TProps]] = null
  ): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction4(create))
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
}

