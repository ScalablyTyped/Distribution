package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EffectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom video effect operation within the ProcessFrame method. */
@JSGlobal("Windows.Media.Effects.ProcessVideoFrameContext")
@js.native
abstract class ProcessVideoFrameContext () extends js.Object {
  /** Gets the input frame for a video effect operation. */
  var inputFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame = js.native
  /** Gets the output frame for a video effect operation. */
  var outputFrame: winrtDashUwpLib.WindowsNs.MediaNs.VideoFrame = js.native
}

