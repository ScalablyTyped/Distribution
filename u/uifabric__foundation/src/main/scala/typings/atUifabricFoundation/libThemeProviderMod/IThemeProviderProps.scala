package typings.atUifabricFoundation.libThemeProviderMod

import typings.atUifabricStyling.libInterfacesIThemeMod.ISchemeNames
import typings.atUifabricStyling.libInterfacesIThemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThemeProviderProps extends js.Object {
  var scheme: js.UndefOr[ISchemeNames] = js.undefined
  var theme: js.UndefOr[ITheme] = js.undefined
}

object IThemeProviderProps {
  @scala.inline
  def apply(scheme: ISchemeNames = null, theme: ITheme = null): IThemeProviderProps = {
    val __obj = js.Dynamic.literal()
    if (scheme != null) __obj.updateDynamic("scheme")(scheme.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThemeProviderProps]
  }
}

