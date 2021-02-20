package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when there's an error.
  */
@js.native
trait AudioPlayerErrorEvent extends AudioPlayerBaseEvent {
  
  /**
    * Error code. Different between android and iOS.
    */
  var code: Double = js.native
  
  /**
    * Error message.
    */
  var error: String = js.native
}
object AudioPlayerErrorEvent {
  
  @scala.inline
  def apply(code: Double, error: String, source: AudioPlayer): AudioPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerErrorEvent]
  }
  
  @scala.inline
  implicit class AudioPlayerErrorEventMutableBuilder[Self <: AudioPlayerErrorEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
