package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Media.Devices.Core.FrameController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
@JSGlobal("Windows.Media.Core.HighDynamicRangeOutput")
@js.native
abstract class HighDynamicRangeOutput ()
  extends typings.winrtUwp.Windows.Media.Core.HighDynamicRangeOutput {
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  /* CompleteClass */
  override var certainty: Double = js.native
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  /* CompleteClass */
  override var frameControllers: IVectorView[FrameController] = js.native
}

