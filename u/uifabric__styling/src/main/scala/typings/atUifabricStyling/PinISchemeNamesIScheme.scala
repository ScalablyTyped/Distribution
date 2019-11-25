package typings.atUifabricStyling

import typings.atUifabricStyling.libInterfacesIThemeMod.IScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme} */
trait PinISchemeNamesIScheme extends js.Object {
  var default: js.UndefOr[IScheme] = js.undefined
  var neutral: js.UndefOr[IScheme] = js.undefined
  var soft: js.UndefOr[IScheme] = js.undefined
  var strong: js.UndefOr[IScheme] = js.undefined
}

object PinISchemeNamesIScheme {
  @scala.inline
  def apply(default: IScheme = null, neutral: IScheme = null, soft: IScheme = null, strong: IScheme = null): PinISchemeNamesIScheme = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (neutral != null) __obj.updateDynamic("neutral")(neutral.asInstanceOf[js.Any])
    if (soft != null) __obj.updateDynamic("soft")(soft.asInstanceOf[js.Any])
    if (strong != null) __obj.updateDynamic("strong")(strong.asInstanceOf[js.Any])
    __obj.asInstanceOf[PinISchemeNamesIScheme]
  }
}

