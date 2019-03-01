package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CssAndViewSpecificModeConfig extends ModeConfig {
  /**
    * If given and not empty, this will be the selector name of a CSS rule commonly specifying the background-image
    * and background-repeat properties for all the shapes in the sprite (thus saving some bytes by not unnecessarily repeating them for each shape)
    */
  var common: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The arrangement of the shapes within the sprite. Might be "vertical", "horizontal", "diagonal" or "packed"
    * (with the latter being the most compact type). It depends on your project which layout is best for you.
    * @default "packed"
    */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
    * If given and not empty, a mixin with this name will be added to supporting output formats (e.g. Sass, LESS, Stylus),
    * specifying the background-image and background-repeat properties for all the shapes in the sprite.
    * You may use it for creating custom CSS within @media rules. The mixin acts much like the common rule.
    * In fact, you can even combine the two - if both are enabled, the common rule will use the mixin internally.
    */
  var mixin: js.UndefOr[java.lang.String] = js.undefined
}

object CssAndViewSpecificModeConfig {
  @scala.inline
  def apply(
    bust: js.UndefOr[scala.Boolean] = js.undefined,
    common: java.lang.String = null,
    dest: java.lang.String = null,
    dimensions: java.lang.String | scala.Boolean = null,
    example: RenderingConfiguration | scala.Boolean = null,
    layout: java.lang.String = null,
    mixin: java.lang.String = null,
    mode: java.lang.String = null,
    prefix: java.lang.String = null,
    render: org.scalablytyped.runtime.StringDictionary[RenderingConfiguration | scala.Boolean] = null,
    sprite: java.lang.String = null
  ): CssAndViewSpecificModeConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bust)) __obj.updateDynamic("bust")(bust)
    if (common != null) __obj.updateDynamic("common")(common)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (example != null) __obj.updateDynamic("example")(example.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (mixin != null) __obj.updateDynamic("mixin")(mixin)
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (render != null) __obj.updateDynamic("render")(render)
    if (sprite != null) __obj.updateDynamic("sprite")(sprite)
    __obj.asInstanceOf[CssAndViewSpecificModeConfig]
  }
}

