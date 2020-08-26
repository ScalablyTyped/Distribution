package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.independent
import typings.vegaTypings.vegaTypingsStrings.isocontour
import typings.vegaTypings.vegaTypingsStrings.shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsocontourTransform extends _Transforms {
  var as: js.UndefOr[String | Null | SignalRef] = js.native
  var field: js.UndefOr[String | TransformField] = js.native
  var levels: js.UndefOr[Double | SignalRef] = js.native
  var nice: js.UndefOr[Boolean | SignalRef] = js.native
  var resolve: js.UndefOr[shared | independent | SignalRef] = js.native
  var scale: js.UndefOr[Double | TransformField] = js.native
  var smooth: js.UndefOr[Boolean | SignalRef] = js.native
  var thresholds: js.UndefOr[(js.Array[Double | SignalRef]) | SignalRef] = js.native
  var translate: js.UndefOr[js.Array[Double] | TransformField] = js.native
  var `type`: isocontour = js.native
  var zero: js.UndefOr[Boolean | SignalRef] = js.native
}

object IsocontourTransform {
  @scala.inline
  def apply(`type`: isocontour): IsocontourTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsocontourTransform]
  }
  @scala.inline
  implicit class IsocontourTransformOps[Self <: IsocontourTransform] (val x: Self) extends AnyVal {
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
    def setType(value: isocontour): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setAs(value: String | SignalRef): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setAsNull: Self = this.set("as", null)
    @scala.inline
    def setField(value: String | TransformField): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setLevels(value: Double | SignalRef): Self = this.set("levels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLevels: Self = this.set("levels", js.undefined)
    @scala.inline
    def setNice(value: Boolean | SignalRef): Self = this.set("nice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNice: Self = this.set("nice", js.undefined)
    @scala.inline
    def setResolve(value: shared | independent | SignalRef): Self = this.set("resolve", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setScale(value: Double | TransformField): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setSmooth(value: Boolean | SignalRef): Self = this.set("smooth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    @scala.inline
    def setThresholdsVarargs(value: (Double | SignalRef)*): Self = this.set("thresholds", js.Array(value :_*))
    @scala.inline
    def setThresholds(value: (js.Array[Double | SignalRef]) | SignalRef): Self = this.set("thresholds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThresholds: Self = this.set("thresholds", js.undefined)
    @scala.inline
    def setTranslateVarargs(value: Double*): Self = this.set("translate", js.Array(value :_*))
    @scala.inline
    def setTranslate(value: js.Array[Double] | TransformField): Self = this.set("translate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslate: Self = this.set("translate", js.undefined)
    @scala.inline
    def setZero(value: Boolean | SignalRef): Self = this.set("zero", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZero: Self = this.set("zero", js.undefined)
  }
  
}

