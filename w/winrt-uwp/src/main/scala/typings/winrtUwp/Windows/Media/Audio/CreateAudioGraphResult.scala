package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of creating an audio graph. */
trait CreateAudioGraphResult extends js.Object {
  /** Gets the audio graph object. */
  var graph: AudioGraph
  /** Gets the status of audio graph creation. */
  var status: AudioGraphCreationStatus
}

object CreateAudioGraphResult {
  @scala.inline
  def apply(graph: AudioGraph, status: AudioGraphCreationStatus): CreateAudioGraphResult = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioGraphResult]
  }
}

