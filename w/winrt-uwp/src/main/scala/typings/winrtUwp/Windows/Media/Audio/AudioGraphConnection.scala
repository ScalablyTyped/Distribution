package typings.winrtUwp.Windows.Media.Audio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection within an audio graph. */
trait AudioGraphConnection extends StObject {
  
  /** Gets the destination node for the connection. */
  var destination: IAudioNode
  
  /** Gets the gain associated with the audio graph connection. */
  var gain: Double
}
object AudioGraphConnection {
  
  inline def apply(destination: IAudioNode, gain: Double): AudioGraphConnection = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphConnection]
  }
  
  extension [Self <: AudioGraphConnection](x: Self) {
    
    inline def setDestination(value: IAudioNode): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
  }
}
