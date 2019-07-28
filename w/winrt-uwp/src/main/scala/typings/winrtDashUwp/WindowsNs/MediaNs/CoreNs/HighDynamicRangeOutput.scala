package typings.winrtDashUwp.WindowsNs.MediaNs.CoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrtDashUwp.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
@JSGlobal("Windows.Media.Core.HighDynamicRangeOutput")
@js.native
abstract class HighDynamicRangeOutput () extends js.Object {
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  var certainty: Double = js.native
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  var frameControllers: IVectorView[FrameController] = js.native
}

