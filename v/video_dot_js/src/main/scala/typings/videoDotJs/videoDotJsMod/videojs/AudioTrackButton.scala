package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for buttons that toggle specific {@link AudioTrack} types.
  */
@js.native
trait AudioTrackButton extends MenuButton {
  def createItems(items: js.Array[AudioTrackMenuItem]): js.Array[AudioTrackMenuItem] = js.native
}

