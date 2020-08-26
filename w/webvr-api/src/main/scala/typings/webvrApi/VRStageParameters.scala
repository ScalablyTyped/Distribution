package typings.webvrApi

import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VRStageParameters extends js.Object {
  var sittingToStandingTransform: js.UndefOr[Float32Array] = js.native
  var sizeX: js.UndefOr[Double] = js.native
  var sizeY: js.UndefOr[Double] = js.native
}

object VRStageParameters {
  @scala.inline
  def apply(): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VRStageParameters]
  }
  @scala.inline
  implicit class VRStageParametersOps[Self <: VRStageParameters] (val x: Self) extends AnyVal {
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
    def setSittingToStandingTransform(value: Float32Array): Self = this.set("sittingToStandingTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSittingToStandingTransform: Self = this.set("sittingToStandingTransform", js.undefined)
    @scala.inline
    def setSizeX(value: Double): Self = this.set("sizeX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeX: Self = this.set("sizeX", js.undefined)
    @scala.inline
    def setSizeY(value: Double): Self = this.set("sizeY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSizeY: Self = this.set("sizeY", js.undefined)
  }
  
}

