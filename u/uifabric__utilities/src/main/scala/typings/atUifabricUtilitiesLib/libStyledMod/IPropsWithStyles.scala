package typings
package atUifabricUtilitiesLib.libStyledMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropsWithStyles[TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */] extends js.Object {
  var styles: js.UndefOr[
    atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet]
  ] = js.undefined
}

object IPropsWithStyles {
  @scala.inline
  def apply[TStyleProps, TStyleSet /* <: atUifabricMergeDashStylesLib.libIStyleSetMod.IStyleSet[TStyleSet] */](
    styles: atUifabricMergeDashStylesLib.libIStyleFunctionMod.IStyleFunctionOrObject[TStyleProps, TStyleSet] = null
  ): IPropsWithStyles[TStyleProps, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropsWithStyles[TStyleProps, TStyleSet]]
  }
}

