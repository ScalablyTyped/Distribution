package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AudioFrameInputNode::QuantumStarted event. This event is raised when the audio graph containing the audio frame input node is ready to begin processing a new quantum of data. */
@JSGlobal("Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs")
@js.native
abstract class FrameInputNodeQuantumStartedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Audio.FrameInputNodeQuantumStartedEventArgs {
  /** Gets the number of samples that the audio graph requires to fill the quantum with data. */
  /* CompleteClass */
  override var requiredSamples: Double = js.native
}

