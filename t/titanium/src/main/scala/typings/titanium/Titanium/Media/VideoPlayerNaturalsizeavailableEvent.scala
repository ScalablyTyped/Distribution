package typings.titanium.Titanium.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the natural size of the current movie is determined.
  */
@js.native
trait VideoPlayerNaturalsizeavailableEvent extends VideoPlayerBaseEvent {
  
  /**
    * Current value of the [naturalSize](Titanium.Media.VideoPlayer.naturalSize) property.
    */
  var naturalSize: Double = js.native
}
object VideoPlayerNaturalsizeavailableEvent {
  
  @scala.inline
  def apply(naturalSize: Double, source: VideoPlayer): VideoPlayerNaturalsizeavailableEvent = {
    val __obj = js.Dynamic.literal(naturalSize = naturalSize.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoPlayerNaturalsizeavailableEvent]
  }
  
  @scala.inline
  implicit class VideoPlayerNaturalsizeavailableEventOps[Self <: VideoPlayerNaturalsizeavailableEvent] (val x: Self) extends AnyVal {
    
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
    def setNaturalSize(value: Double): Self = this.set("naturalSize", value.asInstanceOf[js.Any])
  }
}
