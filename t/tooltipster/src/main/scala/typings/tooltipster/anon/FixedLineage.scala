package typings.tooltipster.anon

import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FixedLineage extends js.Object {
  /** the origin has a fixed lineage if itself or one of its ancestors has a fixed position */
  var fixedLineage: Boolean = js.native
  var offset: Bottom = js.native
  var size: Height = js.native
  /** if the origin is a map area, this will hold the associated image element */
  var usemapImage: HTMLImageElement | Null = js.native
  var windowOffset: Bottom = js.native
}

object FixedLineage {
  @scala.inline
  def apply(fixedLineage: Boolean, offset: Bottom, size: Height, windowOffset: Bottom): FixedLineage = {
    val __obj = js.Dynamic.literal(fixedLineage = fixedLineage.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], windowOffset = windowOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[FixedLineage]
  }
  @scala.inline
  implicit class FixedLineageOps[Self <: FixedLineage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFixedLineage(value: Boolean): Self = this.set("fixedLineage", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Bottom): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Height): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWindowOffset(value: Bottom): Self = this.set("windowOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsemapImage(value: HTMLImageElement): Self = this.set("usemapImage", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsemapImageNull: Self = this.set("usemapImage", null)
  }
  
}

