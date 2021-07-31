package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines the interface implemented by all media cues. */
trait IMediaCue extends StObject {
  
  /** Gets or sets the duration of the media cue. */
  var duration: Double
  
  /** Gets or sets the identifier for the media cue. */
  var id: String
  
  /** Gets or sets the start time of the media cue. */
  var startTime: Double
}
object IMediaCue {
  
  @scala.inline
  def apply(duration: Double, id: String, startTime: Double): IMediaCue = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMediaCue]
  }
  
  @scala.inline
  implicit class IMediaCueMutableBuilder[Self <: IMediaCue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
  }
}
