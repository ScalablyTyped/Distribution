package typings.svgDashSprite.svgDashSpriteMod

import typings.svgDashSprite.Anon_Attributes
import typings.svgDashSprite.Anon_Box
import typings.svgDashSprite.Anon_Generator
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
  var align: js.UndefOr[String] = js.undefined
  /**
    * Output directory for optimized intermediate SVG shapes
    */
  var dest: js.UndefOr[String] = js.undefined
  /**
    * Dimension related options
    */
  var dimension: js.UndefOr[Anon_Attributes] = js.undefined
  /**
    * SVG shape ID related options
    */
  var id: js.UndefOr[Anon_Generator] = js.undefined
  /**
    * Path to YAML file with meta / accessibility data
    */
  var meta: js.UndefOr[String] = js.undefined
  /**
    * Spacing related options
    */
  var spacing: js.UndefOr[Anon_Box] = js.undefined
  /**
    * List of transformations / optimizations
    */
  var transform: js.UndefOr[js.Array[String | CustomConfigurationTransform | CustomCallbackTransform]] = js.undefined
}

object Shape {
  @scala.inline
  def apply(
    align: String = null,
    dest: String = null,
    dimension: Anon_Attributes = null,
    id: Anon_Generator = null,
    meta: String = null,
    spacing: Anon_Box = null,
    transform: js.Array[String | CustomConfigurationTransform | CustomCallbackTransform] = null
  ): Shape = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (dest != null) __obj.updateDynamic("dest")(dest.asInstanceOf[js.Any])
    if (dimension != null) __obj.updateDynamic("dimension")(dimension.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

