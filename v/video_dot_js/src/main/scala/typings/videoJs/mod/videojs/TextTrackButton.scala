package typings.videoJs.mod.videojs

import typings.videoJs.AnonInstantiableTextTrackMenuItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The base class for buttons that toggle specific text track types (e.g. subtitles)
  */
@js.native
trait TextTrackButton extends MenuButton {
  def createItems(items: js.Array[TextTrackMenuItem]): js.Array[TextTrackMenuItem] = js.native
  def createItems(items: js.Array[TextTrackMenuItem], TrackMenuItem: AnonInstantiableTextTrackMenuItem): js.Array[TextTrackMenuItem] = js.native
}

