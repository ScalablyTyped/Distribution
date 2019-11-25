package typings.atUifabricStyling.libInterfacesIThemeMod

import typings.atUifabricStyling.libInterfacesIEffectsMod.IEffects
import typings.atUifabricStyling.libInterfacesIFontStylesMod.IFontStyles
import typings.atUifabricStyling.libInterfacesIPaletteMod.IPalette
import typings.atUifabricStyling.libInterfacesISemanticColorsMod.ISemanticColors
import typings.atUifabricStyling.libInterfacesISpacingMod.ISpacing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScheme extends js.Object {
  /**
    * This setting is for a very narrow use case and you probably don't need to worry about,
    * unless you share a environment with others that also use fabric.
    * It is used for disabling global styles on fabric components. This will prevent global
    * overrides that might have been set by other fabric users from applying to your components.
    * When you set this setting to `true` on your theme the components in the subtree of your
    * Customizer will not get the global styles applied to them.
    */
  var disableGlobalClassNames: Boolean
  var effects: IEffects
  var fonts: IFontStyles
  var isInverted: Boolean
  var palette: IPalette
  var rtl: js.UndefOr[Boolean] = js.undefined
  var semanticColors: ISemanticColors
  /**
    * @internal
    * The spacing property is still in an experimental phase. The intent is to have it
    * be used for padding and margin sizes in a future release, but it is still undergoing review.
    * Avoid using it until it is finalized.
    */
  var spacing: ISpacing
}

object IScheme {
  @scala.inline
  def apply(
    disableGlobalClassNames: Boolean,
    effects: IEffects,
    fonts: IFontStyles,
    isInverted: Boolean,
    palette: IPalette,
    semanticColors: ISemanticColors,
    spacing: ISpacing,
    rtl: js.UndefOr[Boolean] = js.undefined
  ): IScheme = {
    val __obj = js.Dynamic.literal(disableGlobalClassNames = disableGlobalClassNames.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], isInverted = isInverted.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], semanticColors = semanticColors.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScheme]
  }
}

