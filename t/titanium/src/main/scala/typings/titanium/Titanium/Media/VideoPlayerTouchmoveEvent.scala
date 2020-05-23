package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired as soon as the device detects movement of a touch.
  */
trait VideoPlayerTouchmoveEvent extends VideoPlayerBaseEvent {
  /**
    * X coordinate of the event from the `source` view's coordinate system.
    */
  var x: Double
  /**
    * Y coordinate of the event from the `source` view's coordinate system.
    */
  var y: Double
}

object VideoPlayerTouchmoveEvent {
  @scala.inline
  def apply(source: VideoPlayer, x: Double, y: Double): VideoPlayerTouchmoveEvent = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerTouchmoveEvent]
  }
}

