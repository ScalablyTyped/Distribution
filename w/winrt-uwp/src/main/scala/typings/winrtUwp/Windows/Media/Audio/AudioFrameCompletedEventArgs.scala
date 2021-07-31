package typings.winrtUwp.Windows.Media.Audio

import typings.winrtUwp.Windows.Media.AudioFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents arguments for an AudioFrameCompleted event. */
trait AudioFrameCompletedEventArgs extends StObject {
  
  /** Gets the audio frame that was just completed by the AudioFrameInputNode . A frame is completed when all of the audio in the frame has been consumed by the audio graph. */
  var frame: AudioFrame
}
object AudioFrameCompletedEventArgs {
  
  @scala.inline
  def apply(frame: AudioFrame): AudioFrameCompletedEventArgs = {
    val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioFrameCompletedEventArgs]
  }
  
  @scala.inline
  implicit class AudioFrameCompletedEventArgsMutableBuilder[Self <: AudioFrameCompletedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFrame(value: AudioFrame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
  }
}
