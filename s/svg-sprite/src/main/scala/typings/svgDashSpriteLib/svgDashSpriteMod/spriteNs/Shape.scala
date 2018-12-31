package typings
package svgDashSpriteLib.svgDashSpriteMod.spriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All settings affecting the SVG shapes of the sprite
  */
trait Shape extends js.Object {
  /**
    * Path to YAML file with extended alignment data
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Output directory for optimized intermediate SVG shapes
    */
  var dest: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Dimension related options
    */
  var dimension: js.UndefOr[svgDashSpriteLib.Anon_Attributes] = js.undefined
  /**
    * SVG shape ID related options
    */
  var id: js.UndefOr[svgDashSpriteLib.Anon_Pseudo] = js.undefined
  /**
    * Path to YAML file with meta / accessibility data
    */
  var meta: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Spacing related options
    */
  var spacing: js.UndefOr[svgDashSpriteLib.Anon_Padding] = js.undefined
  /**
    * List of transformations / optimizations
    */
  var transform: js.UndefOr[
    js.Array[java.lang.String | CustomConfigurationTransform | CustomCallbackTransform]
  ] = js.undefined
}

