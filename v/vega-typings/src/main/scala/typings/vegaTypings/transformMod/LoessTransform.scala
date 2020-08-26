package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.loess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoessTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var bandwidth: js.UndefOr[Double | SignalRef] = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var `type`: loess = js.native
  var x: FieldRef = js.native
  var y: FieldRef = js.native
}

object LoessTransform {
  @scala.inline
  def apply(`type`: loess, x: FieldRef, y: FieldRef): LoessTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoessTransform]
  }
  @scala.inline
  implicit class LoessTransformOps[Self <: LoessTransform] (val x: Self) extends AnyVal {
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
    def setType(value: loess): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: FieldRef): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: FieldRef): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBandwidth(value: Double | SignalRef): Self = this.set("bandwidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBandwidth: Self = this.set("bandwidth", js.undefined)
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
  }
  
}

