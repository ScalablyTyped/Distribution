package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  /**
    * Main output directory
    * @default '.'
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Logging verbosity or custom logger
    */
  var log: js.UndefOr[java.lang.String | winstonLib.winstonMod.winstonNs.Logger] = js.undefined
  /**
    * Output mode configurations
    */
  var mode: js.UndefOr[Mode] = js.undefined
  /**
    * SVG shape configuration
    */
  var shape: js.UndefOr[Shape] = js.undefined
  /**
    * Sprite SVG options
    */
  var svg: js.UndefOr[Svg] = js.undefined
  /**
    * Custom templating variables
    */
  var variables: js.UndefOr[js.Any] = js.undefined
}

