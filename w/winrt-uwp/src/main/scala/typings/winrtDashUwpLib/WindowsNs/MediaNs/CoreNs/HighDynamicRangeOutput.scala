package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the results of a High Dynamic Range (HDR) analysis operation from the SceneAnalysisEffect . */
@JSGlobal("Windows.Media.Core.HighDynamicRangeOutput")
@js.native
abstract class HighDynamicRangeOutput () extends js.Object {
  /** Gets a value indicating the certainty of the results of the HDR analysis. */
  var certainty: scala.Double = js.native
  /** Gets a set of FrameController objects representing the suggested frame controllers settings for capturing a variable photo sequence with the High Dynamic Range (HDR) technique. */
  var frameControllers: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.CoreNs.FrameController] = js.native
}

