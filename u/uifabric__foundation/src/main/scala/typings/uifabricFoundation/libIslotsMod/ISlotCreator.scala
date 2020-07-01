package typings.uifabricFoundation.libIslotsMod

import typings.react.mod.FunctionComponent
import typings.std.ReturnType
import typings.uifabricMergeStyles.istyleMod.IStyle
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.undefined
}

object ISlotCreator {
  @scala.inline
  def apply[/* <: typings.uifabricFoundation.libIslotsMod.ValidProps */ TProps, /* <: typings.uifabricFoundation.libIslotsMod.ValidShorthand */ TShorthandProp](
    create: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle, /* theme */ js.UndefOr[ITheme]) => ReturnType[FunctionComponent[TProps]] = null
  ): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction5(create))
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
}

