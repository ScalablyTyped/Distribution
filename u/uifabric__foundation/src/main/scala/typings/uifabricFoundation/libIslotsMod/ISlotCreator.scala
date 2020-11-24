package typings.uifabricFoundation.libIslotsMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.react.mod.FunctionComponent
import typings.std.ReturnType
import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlotCreator[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] extends js.Object {
  
  var create: js.UndefOr[ISlotFactory[TProps, TShorthandProp]] = js.native
}
object ISlotCreator {
  
  @scala.inline
  def apply[TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */](): ISlotCreator[TProps, TShorthandProp] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISlotCreator[TProps, TShorthandProp]]
  }
  
  @scala.inline
  implicit class ISlotCreatorOps[Self <: ISlotCreator[_, _], TProps /* <: ValidProps */, TShorthandProp /* <: ValidShorthand */] (val x: Self with (ISlotCreator[TProps, TShorthandProp])) extends AnyVal {
    
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
    def setCreate(
      value: (/* componentProps */ TProps with IProcessedSlotProps, /* userProps */ ISlotProp[TProps, TShorthandProp], /* slotOptions */ js.UndefOr[ISlotOptions[TProps]], /* defaultStyles */ IStyle, /* theme */ js.UndefOr[ITheme]) => ReturnType[FunctionComponent[TProps]]
    ): Self = this.set("create", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
  }
}
