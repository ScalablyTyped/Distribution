package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of creating an audio graph. */
trait CreateAudioGraphResult extends StObject {
  
  /** Gets the audio graph object. */
  var graph: AudioGraph
  
  /** Gets the status of audio graph creation. */
  var status: AudioGraphCreationStatus
}
object CreateAudioGraphResult {
  
  inline def apply(graph: AudioGraph, status: AudioGraphCreationStatus): CreateAudioGraphResult = {
    val __obj = js.Dynamic.literal(graph = graph.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAudioGraphResult]
  }
  
  extension [Self <: CreateAudioGraphResult](x: Self) {
    
    inline def setGraph(value: AudioGraph): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: AudioGraphCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
