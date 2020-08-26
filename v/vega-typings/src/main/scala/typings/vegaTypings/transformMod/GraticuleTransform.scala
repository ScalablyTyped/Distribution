package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.utilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.graticule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraticuleTransform extends _Transforms {
  var extent: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  var extentMajor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  var extentMinor: js.UndefOr[(Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef] = js.native
  var precision: js.UndefOr[Double | SignalRef] = js.native
  var signal: js.UndefOr[SignalName] = js.native
  var step: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var stepMajor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var stepMinor: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.native
  var `type`: graticule = js.native
}

object GraticuleTransform {
  @scala.inline
  def apply(`type`: graticule): GraticuleTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraticuleTransform]
  }
  @scala.inline
  implicit class GraticuleTransformOps[Self <: GraticuleTransform] (val x: Self) extends AnyVal {
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
    def setType(value: graticule): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtent(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setExtentMajor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = this.set("extentMajor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtentMajor: Self = this.set("extentMajor", js.undefined)
    @scala.inline
    def setExtentMinor(value: (Vector2[(Vector2[Double | SignalRef]) | SignalRef]) | SignalRef): Self = this.set("extentMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtentMinor: Self = this.set("extentMinor", js.undefined)
    @scala.inline
    def setPrecision(value: Double | SignalRef): Self = this.set("precision", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    @scala.inline
    def setSignal(value: SignalName): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setStep(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    @scala.inline
    def setStepMajor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("stepMajor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMajor: Self = this.set("stepMajor", js.undefined)
    @scala.inline
    def setStepMinor(value: (Vector2[Double | SignalRef]) | SignalRef): Self = this.set("stepMinor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStepMinor: Self = this.set("stepMinor", js.undefined)
  }
  
}

