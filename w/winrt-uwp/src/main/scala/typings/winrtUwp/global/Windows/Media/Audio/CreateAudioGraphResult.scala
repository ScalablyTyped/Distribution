package typings.winrtUwp.global.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio graph. */
@JSGlobal("Windows.Media.Audio.CreateAudioGraphResult")
@js.native
abstract class CreateAudioGraphResult ()
  extends typings.winrtUwp.Windows.Media.Audio.CreateAudioGraphResult {
  /** Gets the audio graph object. */
  /* CompleteClass */
  override var graph: typings.winrtUwp.Windows.Media.Audio.AudioGraph = js.native
  /** Gets the status of audio graph creation. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Media.Audio.AudioGraphCreationStatus = js.native
}

