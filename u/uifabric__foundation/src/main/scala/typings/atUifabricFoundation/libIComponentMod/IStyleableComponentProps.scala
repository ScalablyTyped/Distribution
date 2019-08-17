package typings.atUifabricFoundation.libIComponentMod

import typings.atUifabricMergeDashStyles.libIStyleSetMod.IStyleSet
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
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
  def apply[TViewProps, TTokens, TStyleSet /* <: IStyleSet[TStyleSet] */](
    className: String = null,
    styles: IStylesFunctionOrObject[TViewProps, TTokens, TStyleSet] = null,
    theme: ITheme = null,
    tokens: ITokenFunctionOrObject[TViewProps, TTokens] = null
  ): IStyleableComponentProps[TViewProps, TTokens, TStyleSet] = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleableComponentProps[TViewProps, TTokens, TStyleSet]]
  }
}

