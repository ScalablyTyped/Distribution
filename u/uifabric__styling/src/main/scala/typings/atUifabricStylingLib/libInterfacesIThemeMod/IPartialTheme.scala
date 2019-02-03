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
  var schemes: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ js.UndefOr[
    /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.ISchemeNames ]:? @uifabric/styling.@uifabric/styling/lib/interfaces/ITheme.IScheme}
    */ atUifabricStylingLib.atUifabricStylingLibStrings.IPartialTheme with js.Any
  ] = js.undefined
  var semanticColors: js.UndefOr[
    stdLib.Partial[atUifabricStylingLib.libInterfacesISemanticColorsMod.ISemanticColors]
  ] = js.undefined
  var spacing: js.UndefOr[stdLib.Partial[atUifabricStylingLib.libInterfacesISpacingMod.ISpacing]] = js.undefined
}

