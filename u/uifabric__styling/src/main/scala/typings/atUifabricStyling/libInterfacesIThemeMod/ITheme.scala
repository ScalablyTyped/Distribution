package typings.atUifabricStyling.libInterfacesIThemeMod

import typings.atUifabricStyling.PinISchemeNamesIScheme
import typings.atUifabricStyling.libInterfacesIEffectsMod.IEffects
import typings.atUifabricStyling.libInterfacesIFontStylesMod.IFontStyles
import typings.atUifabricStyling.libInterfacesIPaletteMod.IPalette
import typings.atUifabricStyling.libInterfacesISemanticColorsMod.ISemanticColors
import typings.atUifabricStyling.libInterfacesISpacingMod.ISpacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITheme extends IScheme {
  /**
    * @internal
    * The schemes property is still in an experimental phase. The intent is to have it work
    * in conjunction with new 'schemes' prop that any component making use of Foundation can use.
    * Alternative themes that can be referred to by name.
    */
  var schemes: js.UndefOr[PinISchemeNamesIScheme] = js.undefined
}

object ITheme {
  @scala.inline
  def apply(
    disableGlobalClassNames: Boolean,
    effects: IEffects,
    fonts: IFontStyles,
    isInverted: Boolean,
    palette: IPalette,
    semanticColors: ISemanticColors,
    spacing: ISpacing,
    rtl: js.UndefOr[Boolean] = js.undefined,
    schemes: PinISchemeNamesIScheme = null
  ): ITheme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (schemes != null) __obj.updateDynamic("schemes")(schemes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITheme]
  }
}

