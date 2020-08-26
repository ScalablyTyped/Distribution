package typings.uifabricUtilities.styledMod

import typings.uifabricMergeStyles.deepPartialMod.DeepPartial
import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPropsWithStyles[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  var styles: js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]] = js.native
}

object IPropsWithStyles {
  @scala.inline
  def apply[TStyleProps, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet](): IPropsWithStyles[TStyleProps, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPropsWithStyles[TStyleProps, TStyleSet]]
  }
  @scala.inline
  implicit class IPropsWithStylesOps[Self <: IPropsWithStyles[_, _], TStyleProps, /* <: typings.uifabricMergeStyles.istylesetMod.IStyleSet[TStyleSet] */ TStyleSet] (val x: Self with (IPropsWithStyles[TStyleProps, TStyleSet])) extends AnyVal {
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
    def setStylesFunction1(value: TStyleProps => DeepPartial[TStyleSet]): Self = this.set("styles", js.Any.fromFunction1(value))
    @scala.inline
    def setStyles(value: IStyleFunctionOrObject[TStyleProps, TStyleSet]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

