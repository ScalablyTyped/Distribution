package typings.atUifabricStyling.libInterfacesIThemeMod

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
  var schemes: js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ typings.atUifabricStyling.atUifabricStylingStrings.ITheme with js.Any
  ] = js.undefined
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
    schemes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ typings.atUifabricStyling.atUifabricStylingStrings.ITheme with js.Any = null
  ): ITheme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames, effects = effects, fonts = fonts, isInverted = isInverted, palette = palette, semanticColors = semanticColors, spacing = spacing)
    if (schemes != null) __obj.updateDynamic("schemes")(schemes)
    __obj.asInstanceOf[ITheme]
  }
}

