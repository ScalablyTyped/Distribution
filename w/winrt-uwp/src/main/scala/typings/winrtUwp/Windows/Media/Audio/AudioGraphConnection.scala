package typings.winrtUwp.Windows.Media.Audio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a connection within an audio graph. */
@js.native
trait AudioGraphConnection extends js.Object {
  
  /** Gets the destination node for the connection. */
  var destination: IAudioNode = js.native
  
  /** Gets the gain associated with the audio graph connection. */
  var gain: Double = js.native
}
object AudioGraphConnection {
  
  @scala.inline
  def apply(destination: IAudioNode, gain: Double): AudioGraphConnection = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioGraphConnection]
  }
  
  @scala.inline
  implicit class AudioGraphConnectionOps[Self <: AudioGraphConnection] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: IAudioNode): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGain(value: Double): Self = this.set("gain", value.asInstanceOf[js.Any])
  }
}
