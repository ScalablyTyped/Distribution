package typings.viewportMercatorProject.anon

import typings.viewportMercatorProject.mod.Coordinates
import typings.viewportMercatorProject.mod.Padding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bounds extends js.Object {
  var bounds: typings.viewportMercatorProject.mod.Bounds = js.native
  var height: Double = js.native
  var offset: js.UndefOr[Coordinates] = js.native
  var padding: js.UndefOr[Padding] = js.native
  var width: Double = js.native
}

object Bounds {
  @scala.inline
  def apply(bounds: typings.viewportMercatorProject.mod.Bounds, height: Double, width: Double): Bounds = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounds]
  }
  @scala.inline
  implicit class BoundsOps[Self <: Bounds] (val x: Self) extends AnyVal {
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
    def setBounds(value: typings.viewportMercatorProject.mod.Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Coordinates): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
  }
  
}

