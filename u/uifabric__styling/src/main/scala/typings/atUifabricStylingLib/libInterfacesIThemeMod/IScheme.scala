package typings
package atUifabricStylingLib.libInterfacesIThemeMod

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
  var disableGlobalClassNames: scala.Boolean
  var effects: atUifabricStylingLib.libInterfacesIEffectsMod.IEffects
  var fonts: atUifabricStylingLib.libInterfacesIFontStylesMod.IFontStyles
  var isInverted: scala.Boolean
  var palette: atUifabricStylingLib.libInterfacesIPaletteMod.IPalette
  var semanticColors: atUifabricStylingLib.libInterfacesISemanticColorsMod.ISemanticColors
  /**
       * @internal
       * The spacing property is still in an experimental phase. The intent is to have it
       * be used for padding and margin sizes in a future release, but it is still undergoing review.
       * Avoid using it until it is finalized.
       */
  var spacing: atUifabricStylingLib.libInterfacesISpacingMod.ISpacing
}

