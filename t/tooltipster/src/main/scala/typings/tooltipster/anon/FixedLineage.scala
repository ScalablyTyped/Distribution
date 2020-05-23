package typings.tooltipster.anon

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FixedLineage extends js.Object {
  /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
  var fixedLineage: Boolean
  var offset: Bottom
  var size: Height
  /** if the origin is a map area, this will hold the associated image element */
  var usemapImage: HTMLImageElement | Null
  var windowOffset: Bottom
}

object FixedLineage {
  @scala.inline
  def apply(
    fixedLineage: Boolean,
    offset: Bottom,
    size: Height,
    windowOffset: Bottom,
    usemapImage: HTMLImageElement = null
  ): FixedLineage = {
    val __obj = js.Dynamic.literal(fixedLineage = fixedLineage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], windowOffset = windowOffset.asInstanceOf[js.Any], usemapImage = usemapImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedLineage]
  }
}

