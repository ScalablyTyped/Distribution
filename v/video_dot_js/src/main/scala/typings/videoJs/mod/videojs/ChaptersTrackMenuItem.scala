package typings.videoJs.mod.videojs

import typings.videoJs.mod.videojs.EventTarget.Event
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The chapter track menu item
  */
@js.native
trait ChaptersTrackMenuItem extends MenuItem {
  var cue: TextTrackCue = js.native
  var track: TextTrack = js.native
  /**
    * Update chapter menu item
    *
    * @param [event]
    *        The `cuechange` event that caused this function to run.
    *
    * @listens TextTrack#cuechange
    */
  def update(event: Event): Unit = js.native
}

