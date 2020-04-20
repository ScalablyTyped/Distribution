package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media track list that allows a single item to be selected at a time. */
trait ISingleSelectMediaTrackList extends js.Object {
  /** Gets or set the currently selected media track in the list. */
  var selectedIndex: Double
}

object ISingleSelectMediaTrackList {
  @scala.inline
  def apply(selectedIndex: Double): ISingleSelectMediaTrackList = {
    val __obj = js.Dynamic.literal(selectedIndex = selectedIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISingleSelectMediaTrackList]
  }
}

