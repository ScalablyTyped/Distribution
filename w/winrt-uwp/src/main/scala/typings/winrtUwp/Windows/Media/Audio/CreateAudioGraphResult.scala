package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio graph. */
@js.native
trait CreateAudioGraphResult extends js.Object {
  
  /** Gets the audio graph object. */
  var graph: AudioGraph = js.native
  
  /** Gets the status of audio graph creation. */
  var status: AudioGraphCreationStatus = js.native
}
object CreateAudioGraphResult {
  
  @scala.inline
  def apply(graph: AudioGraph, status: AudioGraphCreationStatus): CreateAudioGraphResult = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioGraphResult]
  }
  
  @scala.inline
  implicit class CreateAudioGraphResultOps[Self <: CreateAudioGraphResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGraph(value: AudioGraph): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioGraphCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
