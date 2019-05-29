package typings
package atUifabricStylingLib.libInterfacesIThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPartialTheme extends js.Object {
  /**
    * Use this property to specify font property defaults.
    */
  var defaultFontStyle: js.UndefOr[atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle] = js.undefined
  var disableGlobalClassNames: js.UndefOr[scala.Boolean] = js.undefined
  var effects: js.UndefOr[stdLib.Partial[atUifabricStylingLib.libInterfacesIEffectsMod.IEffects]] = js.undefined
  var fonts: js.UndefOr[stdLib.Partial[atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles]] = js.undefined
  var isInverted: js.UndefOr[scala.Boolean] = js.undefined
  var palette: js.UndefOr[stdLib.Partial[atUifabricStylingLib.libInterfacesIPaletteMod.IPalette]] = js.undefined
  var schemes: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ atUifabricStylingLib.atUifabricStylingLibStrings.IPartialTheme with js.Any
  ] = js.undefined
  var semanticColors: js.UndefOr[
    stdLib.Partial[atUifabricStylingLib.libInterfacesISemanticColorsMod.ISemanticColors]
  ] = js.undefined
  var spacing: js.UndefOr[stdLib.Partial[atUifabricStylingLib.libInterfacesISpacingMod.ISpacing]] = js.undefined
}

object IPartialTheme {
  @scala.inline
  def apply(
    defaultFontStyle: atUifabricMergeDashStylesLib.libIStyleMod.IRawStyle = null,
    disableGlobalClassNames: js.UndefOr[scala.Boolean] = js.undefined,
    effects: stdLib.Partial[atUifabricStylingLib.libInterfacesIEffectsMod.IEffects] = null,
    fonts: stdLib.Partial[atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles] = null,
    isInverted: js.UndefOr[scala.Boolean] = js.undefined,
    palette: stdLib.Partial[atUifabricStylingLib.libInterfacesIPaletteMod.IPalette] = null,
    schemes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ atUifabricStylingLib.atUifabricStylingLibStrings.IPartialTheme with js.Any = null,
    semanticColors: stdLib.Partial[atUifabricStylingLib.libInterfacesISemanticColorsMod.ISemanticColors] = null,
    spacing: stdLib.Partial[atUifabricStylingLib.libInterfacesISpacingMod.ISpacing] = null
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

