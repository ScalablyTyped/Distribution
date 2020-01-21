package typings.uifabricStyling.ithemeMod

import typings.uifabricMergeStyles.istyleMod.IRawStyle
import typings.uifabricStyling.PartialIEffects
import typings.uifabricStyling.PartialIFontStyles
import typings.uifabricStyling.PartialIPalette
import typings.uifabricStyling.PartialISemanticColors
import typings.uifabricStyling.PartialISpacing
import typings.uifabricStyling.PinISchemeNamesIScheme
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
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableGlobalClassNames)) __obj.updateDynamic("disableGlobalClassNames")(disableGlobalClassNames.asInstanceOf[js.Any])
    if (effects != null) __obj.updateDynamic("effects")(effects.asInstanceOf[js.Any])
    if (fonts != null) __obj.updateDynamic("fonts")(fonts.asInstanceOf[js.Any])
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (schemes != null) __obj.updateDynamic("schemes")(schemes.asInstanceOf[js.Any])
    if (semanticColors != null) __obj.updateDynamic("semanticColors")(semanticColors.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPartialTheme]
  }
}

