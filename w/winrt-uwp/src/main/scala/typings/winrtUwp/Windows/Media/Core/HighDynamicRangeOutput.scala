package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.Devices.Core.FrameController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
trait HighDynamicRangeOutput extends js.Object {
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  var certainty: Double
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  var frameControllers: IVectorView[FrameController]
}

object HighDynamicRangeOutput {
  @scala.inline
  def apply(certainty: Double, frameControllers: IVectorView[FrameController]): HighDynamicRangeOutput = {
    val __obj = js.Dynamic.literal(certainty = certainty.asInstanceOf[js.Any], frameControllers = frameControllers.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighDynamicRangeOutput]
  }
}

