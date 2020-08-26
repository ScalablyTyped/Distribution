package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.voronoi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoronoiTransform extends _Transforms {
  var as: js.UndefOr[String | SignalRef] = js.native
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  var size: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var `type`: voronoi = js.native
  var x: FieldRef = js.native
  var y: FieldRef = js.native
}

object VoronoiTransform {
  @scala.inline
  def apply(`type`: voronoi, x: FieldRef, y: FieldRef): VoronoiTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoronoiTransform]
  }
  @scala.inline
  implicit class VoronoiTransformOps[Self <: VoronoiTransform] (val x: Self) extends AnyVal {
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
    def setType(value: voronoi): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: FieldRef): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: FieldRef): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setSize(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

