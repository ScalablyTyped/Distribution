package typings.atUifabricStyling.libInterfacesIThemeMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.atUifabricStyling.PartialIEffects
import typings.atUifabricStyling.PartialIFontStyles
import typings.atUifabricStyling.PartialIPalette
import typings.atUifabricStyling.PartialISemanticColors
import typings.atUifabricStyling.PartialISpacing
import typings.atUifabricStyling.PinISchemeNamesIScheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartialTheme extends js.Object {
  /**
    * Use this property to specify font property defaults.
    */
  var defaultFontStyle: js.UndefOr[IRawStyle] = js.undefined
  var disableGlobalClassNames: js.UndefOr[Boolean] = js.undefined
  var effects: js.UndefOr[PartialIEffects] = js.undefined
  var fonts: js.UndefOr[PartialIFontStyles] = js.undefined
  var isInverted: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[PartialIPalette] = js.undefined
  var rtl: js.UndefOr[Boolean] = js.undefined
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.undefined
  var semanticColors: js.UndefOr[PartialISemanticColors] = js.undefined
  var spacing: js.UndefOr[PartialISpacing] = js.undefined
}

object IPartialTheme {
  @scala.inline
  def apply(
    defaultFontStyle: IRawStyle = null,
    disableGlobalClassNames: js.UndefOr[Boolean] = js.undefined,
    effects: PartialIEffects = null,
    fonts: PartialIFontStyles = null,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    palette: PartialIPalette = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    schemes: PinISchemeNamesIScheme = null,
    semanticColors: PartialISemanticColors = null,
    spacing: PartialISpacing = null
  ): IPartialTheme = {
    val __obj = js.Dynamic.literal()
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle)
    if (!js.isUndefined(disableGlobalClassNames)) __obj.updateDynamic("disableGlobalClassNames")(disableGlobalClassNames)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (semanticColors != null) __obj.updateDynamic("semanticColors")(semanticColors)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    __obj.asInstanceOf[IPartialTheme]
  }
}

