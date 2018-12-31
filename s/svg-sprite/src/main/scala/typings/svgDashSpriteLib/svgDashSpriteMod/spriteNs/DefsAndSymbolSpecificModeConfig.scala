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

