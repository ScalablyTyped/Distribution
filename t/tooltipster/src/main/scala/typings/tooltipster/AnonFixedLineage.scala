package typings.tooltipster

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFixedLineage extends js.Object {
  /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
  var fixedLineage: Boolean
  var offset: AnonBottom
  var size: AnonHeight
  /** if the origin is a map area, this will hold the associated image element */
  var usemapImage: HTMLImageElement | Null
  var windowOffset: AnonBottom
}

object AnonFixedLineage {
  @scala.inline
  def apply(
    fixedLineage: Boolean,
    offset: AnonBottom,
    size: AnonHeight,
    windowOffset: AnonBottom,
    usemapImage: HTMLImageElement = null
  ): AnonFixedLineage = {
    val __obj = js.Dynamic.literal(fixedLineage = fixedLineage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], windowOffset = windowOffset.asInstanceOf[js.Any])
    if (usemapImage != null) __obj.updateDynamic("usemapImage")(usemapImage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFixedLineage]
  }
}

