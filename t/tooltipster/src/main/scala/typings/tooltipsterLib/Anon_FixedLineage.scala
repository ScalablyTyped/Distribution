package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FixedLineage extends js.Object {
  /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
  var fixedLineage: scala.Boolean
  var offset: Anon_Bottom
  var size: Anon_Height
  /** if the origin is a map area, this will hold the associated image element */
  var usemapImage: stdLib.HTMLImageElement | scala.Null
  var windowOffset: Anon_Bottom
}

object Anon_FixedLineage {
  @scala.inline
  def apply(
    fixedLineage: scala.Boolean,
    offset: Anon_Bottom,
    size: Anon_Height,
    windowOffset: Anon_Bottom,
    usemapImage: stdLib.HTMLImageElement = null
  ): Anon_FixedLineage = {
    val __obj = js.Dynamic.literal(fixedLineage = fixedLineage, offset = offset, size = size, windowOffset = windowOffset)
    if (usemapImage != null) __obj.updateDynamic("usemapImage")(usemapImage)
    __obj.asInstanceOf[Anon_FixedLineage]
  }
}

