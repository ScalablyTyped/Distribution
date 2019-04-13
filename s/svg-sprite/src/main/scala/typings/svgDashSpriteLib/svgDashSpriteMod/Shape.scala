package typings
package svgDashSpriteLib.svgDashSpriteMod

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
  var id: js.UndefOr[svgDashSpriteLib.Anon_Generator] = js.undefined
  /**
    * Path to YAML file with meta / accessibility data
    */
  var meta: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Spacing related options
    */
  var spacing: js.UndefOr[svgDashSpriteLib.Anon_Box] = js.undefined
  /**
    * List of transformations / optimizations
    */
  var transform: js.UndefOr[
    js.Array[java.lang.String | CustomConfigurationTransform | CustomCallbackTransform]
  ] = js.undefined
}

object Shape {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    dest: java.lang.String = null,
    dimension: svgDashSpriteLib.Anon_Attributes = null,
    id: svgDashSpriteLib.Anon_Generator = null,
    meta: java.lang.String = null,
    spacing: svgDashSpriteLib.Anon_Box = null,
    transform: js.Array[java.lang.String | CustomConfigurationTransform | CustomCallbackTransform] = null
  ): Shape = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (dest != null) __obj.updateDynamic("dest")(dest)
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (id != null) __obj.updateDynamic("id")(id)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (spacing != null) __obj.updateDynamic("spacing")(spacing)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    __obj.asInstanceOf[Shape]
  }
}

