package typings.uifabricFoundation.libIcomponentMod

import typings.uifabricMergeStyles.istylesetMod.IStyleSet
import typings.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleableComponentProps[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */] extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet]] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
  var tokens: js.UndefOr[ITokenFunctionOrObject[TViewProps, TTokens]] = js.undefined
}

object IStyleableComponentProps {
  @scala.inline
  def apply[TViewProps, TTokens, TStyleSet](
    className: String = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null
  ): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
  }
}

