package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsAndSymbolSpecificModeConfig extends ModeConfig {
  /**
    * If you want to embed the sprite into your HTML source, you will want to set this to true
    * in order to prevent the creation of SVG namespace declarations and to set some other attributes for effectively hiding the library sprite.
    * @default false
    */
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
}

object DefsAndSymbolSpecificModeConfig {
  @scala.inline
  def apply(
    bust: js.UndefOr[scala.Boolean] = js.undefined,
    dest: java.lang.String = null,
    dimensions: java.lang.String | scala.Boolean = null,
    example: RenderingConfiguration | scala.Boolean = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    mode: java.lang.String = null,
    prefix: java.lang.String = null,
    render: org.scalablytyped.runtime.StringDictionary[RenderingConfiguration | scala.Boolean] = null,
    sprite: java.lang.String = null
  ): DefsAndSymbolSpecificModeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bust)) __obj.updateDynamic("bust")(bust)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (render != null) __obj.updateDynamic("render")(render)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    __obj.asInstanceOf[DefsAndSymbolSpecificModeConfig]
  }
}

