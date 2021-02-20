package typings.titanium.Titanium.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the device detects a single tap against the view.
  */
@js.native
trait VideoPlayerSingletapEvent extends VideoPlayerBaseEvent {
  
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double = js.native
  
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double = js.native
}
object VideoPlayerSingletapEvent {
  
  @scala.inline
  def apply(source: VideoPlayer, x: Double, y: Double): VideoPlayerSingletapEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerSingletapEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerSingletapEventMutableBuilder[Self <: VideoPlayerSingletapEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
