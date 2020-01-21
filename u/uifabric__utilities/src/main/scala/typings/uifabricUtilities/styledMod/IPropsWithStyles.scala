package typings.uifabricUtilities.styledMod

import typings.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropsWithStyles[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  var styles: js.UndefOr[IStyleFunctionOrObject[TStyleProps, TStyleSet]] = js.undefined
}

object IPropsWithStyles {
  @scala.inline
  def apply[TStyleProps, TStyleSet /* <: IStyleSet[TStyleSet] */](styles: IStyleFunctionOrObject[TStyleProps, TStyleSet] = null): IPropsWithStyles[TStyleProps, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropsWithStyles[TStyleProps, TStyleSet]]
  }
}

