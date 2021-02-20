package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio graph. */
@js.native
trait CreateAudioGraphResult extends StObject {
  
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
  implicit class CreateAudioGraphResultMutableBuilder[Self <: CreateAudioGraphResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGraph(value: AudioGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: AudioGraphCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
