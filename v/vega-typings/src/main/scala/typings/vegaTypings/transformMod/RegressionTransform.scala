package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.regression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegressionTransform extends _Transforms {
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.native
  var extent: js.UndefOr[(js.Tuple2[Double, Double]) | SignalRef] = js.native
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  var method: js.UndefOr[RegressionMethod | SignalRef] = js.native
  var order: js.UndefOr[Double | SignalRef] = js.native
  var params: js.UndefOr[Boolean | SignalRef] = js.native
  var `type`: regression = js.native
  var x: FieldRef = js.native
  var y: FieldRef = js.native
}

object RegressionTransform {
  @scala.inline
  def apply(`type`: regression, x: FieldRef, y: FieldRef): RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegressionTransform]
  }
  @scala.inline
  implicit class RegressionTransformOps[Self <: RegressionTransform] (val x: Self) extends AnyVal {
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
    def setType(value: regression): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: FieldRef): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: FieldRef): Self = this.set("y", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setExtent(value: (js.Tuple2[Double, Double]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = this.set("groupby", js.Array(value :_*))
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = this.set("groupby", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupby: Self = this.set("groupby", js.undefined)
    @scala.inline
    def setMethod(value: RegressionMethod | SignalRef): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setOrder(value: Double | SignalRef): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setParams(value: Boolean | SignalRef): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
  
}

