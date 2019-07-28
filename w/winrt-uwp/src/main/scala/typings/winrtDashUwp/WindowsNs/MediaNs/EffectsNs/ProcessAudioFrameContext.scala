package typings.winrtDashUwp.WindowsNs.MediaNs.EffectsNs

import typings.winrtDashUwp.WindowsNs.MediaNs.AudioFrame
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides context for performing a custom audio effect operation within the ProcessFrame method. */
@JSGlobal("Windows.Media.Effects.ProcessAudioFrameContext")
@js.native
abstract class ProcessAudioFrameContext () extends js.Object {
  /** Gets the input frame for an audio effect operation. */
  var inputFrame: AudioFrame = js.native
  /** Gets the output frame for an audio effect operation. */
  var outputFrame: AudioFrame = js.native
}

