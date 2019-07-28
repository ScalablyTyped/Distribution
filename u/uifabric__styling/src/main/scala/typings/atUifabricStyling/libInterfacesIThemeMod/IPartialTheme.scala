package typings.atUifabricStyling.libInterfacesIThemeMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IRawStyle
import typings.atUifabricStyling.libInterfacesIEffectsMod.IEffects
import typings.atUifabricStyling.libInterfacesIFontStylesMod.IFontStyles
import typings.atUifabricStyling.libInterfacesIPaletteMod.IPalette
import typings.atUifabricStyling.libInterfacesISemanticColorsMod.ISemanticColors
import typings.atUifabricStyling.libInterfacesISpacingMod.ISpacing
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartialTheme extends js.Object {
  /**
    * Use this property to specify font property defaults.
    */
  var defaultFontStyle: js.UndefOr[IRawStyle] = js.undefined
  var disableGlobalClassNames: js.UndefOr[Boolean] = js.undefined
  var effects: js.UndefOr[Partial[IEffects]] = js.undefined
  var fonts: js.UndefOr[Partial[IFontStyles]] = js.undefined
  var isInverted: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[Partial[IPalette]] = js.undefined
  var schemes: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ typings.atUifabricStyling.atUifabricStylingStrings.IPartialTheme with js.Any
  ] = js.undefined
  var semanticColors: js.UndefOr[Partial[ISemanticColors]] = js.undefined
  var spacing: js.UndefOr[Partial[ISpacing]] = js.undefined
}

object IPartialTheme {
  @scala.inline
  def apply(
    defaultFontStyle: IRawStyle = null,
    disableGlobalClassNames: js.UndefOr[Boolean] = js.undefined,
    effects: Partial[IEffects] = null,
    fonts: Partial[IFontStyles] = null,
    isInverted: js.UndefOr[Boolean] = js.undefined,
    palette: Partial[IPalette] = null,
    schemes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ typings.atUifabricStyling.atUifabricStylingStrings.IPartialTheme with js.Any = null,
    semanticColors: Partial[ISemanticColors] = null,
    spacing: Partial[ISpacing] = null
  ): IPartialTheme = {
    val __obj = js.Dynamic.literal()
    if (defaultFontStyle != null) __obj.updateDynamic("defaultFontStyle")(defaultFontStyle)
    if (!js.isUndefined(disableGlobalClassNames)) __obj.updateDynamic("disableGlobalClassNames")(disableGlobalClassNames)
    if (effects != null) __obj.updateDynamic("effects")(effects)
    if (fonts != null) __obj.updateDynamic("fonts")(fonts)
    if (!js.isUndefined(isInverted)) __obj.updateDynamic("isInverted")(isInverted)
    if (palette != null) __obj.updateDynamic("palette")(palette)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    if (semanticColors != null) __obj.updateDynamic("semanticColors")(semanticColors)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    __obj.asInstanceOf[IPartialTheme]
  }
}

