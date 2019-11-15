package typings.videoDotJs.videoDotJsMod.videojs

import typings.videoDotJs.videoDotJsMod.videojs.EventTarget.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The initial play button that shows before the video has played. The hiding of the
  * `BigPlayButton` get done via CSS and `Player` states.
  */
@js.native
trait BigPlayButton extends Button {
  /**
    * Called when this BigPlayButton gets mouse pressed down
    *
    * @param event
    *        The `keydown` event that caused this function to be called.
    *
    * @listens mousedown
    */
  def handleMouseDown(event: Event): Unit = js.native
}

