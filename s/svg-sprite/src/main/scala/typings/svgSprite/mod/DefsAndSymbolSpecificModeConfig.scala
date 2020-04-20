package typings.svgSprite.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefsAndSymbolSpecificModeConfig extends ModeConfig {
  /**
    * If you want to embed the sprite into your HTML source, you will want to set this to true
    * in order to prevent the creation of SVG namespace declarations and to set some other attributes for effectively hiding the library sprite.
    * @default false
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
}

object DefsAndSymbolSpecificModeConfig {
  @scala.inline
  def apply(
    bust: js.UndefOr[Boolean] = js.undefined,
    dest: String = null,
    dimensions: String | Boolean = null,
    example: RenderingConfiguration | Boolean = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    mode: String = null,
    prefix: String = null,
    render: StringDictionary[RenderingConfiguration | Boolean] = null,
    sprite: String = null
  ): DefsAndSymbolSpecificModeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bust)) __obj.updateDynamic("bust")(bust.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(render.asInstanceOf[js.Any])
    if (sprite != null) __obj.updateDynamic("sprite")(sprite.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefsAndSymbolSpecificModeConfig]
  }
}

