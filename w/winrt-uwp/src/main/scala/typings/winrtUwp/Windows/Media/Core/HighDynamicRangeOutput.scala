package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.Devices.Core.FrameController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
@js.native
trait HighDynamicRangeOutput extends js.Object {
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  var certainty: Double = js.native
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  var frameControllers: IVectorView[FrameController] = js.native
}

object HighDynamicRangeOutput {
  @scala.inline
  def apply(certainty: Double, frameControllers: IVectorView[FrameController]): HighDynamicRangeOutput = {
    val __obj = js.Dynamic.literal(certainty = certainty.asInstanceOf[js.Any], frameControllers = frameControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeOutput]
  }
  @scala.inline
  implicit class HighDynamicRangeOutputOps[Self <: HighDynamicRangeOutput] (val x: Self) extends AnyVal {
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
    def setCertainty(value: Double): Self = this.set("certainty", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameControllers(value: IVectorView[FrameController]): Self = this.set("frameControllers", value.asInstanceOf[js.Any])
  }
  
}

