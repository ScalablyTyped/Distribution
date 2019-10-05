package typings.winrtDashUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio graph. */
@JSGlobal("Windows.Media.Audio.CreateAudioGraphResult")
@js.native
abstract class CreateAudioGraphResult () extends js.Object {
  /** Gets the audio graph object. */
  var graph: AudioGraph = js.native
  /** Gets the status of audio graph creation. */
  var status: AudioGraphCreationStatus = js.native
}

