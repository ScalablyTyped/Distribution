package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a media track list that allows a single item to be selected at a time. */
trait ISingleSelectMediaTrackList extends js.Object {
  /** Gets or set the currently selected media track in the list. */
  var selectedIndex: scala.Double
}

object ISingleSelectMediaTrackList {
  @scala.inline
  def apply(selectedIndex: scala.Double): ISingleSelectMediaTrackList = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("selectedIndex")(selectedIndex)
    __obj.asInstanceOf[ISingleSelectMediaTrackList]
  }
}

