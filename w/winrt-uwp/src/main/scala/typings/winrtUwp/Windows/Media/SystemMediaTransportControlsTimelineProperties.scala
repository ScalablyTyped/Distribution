package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents timeline properties of the SystemMediaTransportControls . Pass an instance of this class to the UpdateTimelineProperties method to update the properties. */
trait SystemMediaTransportControlsTimelineProperties extends js.Object {
  /** Gets or sets a value representing the end time of the currently playing media item. */
  var endTime: Double
  /** Gets or sets a value indicating the latest time within the currently playing media item to which the user can seek. */
  var maxSeekTime: Double
  /** Gets or sets a value indicating the earliest time within the currently playing media item to which the user can seek. */
  var minSeekTime: Double
  /** Gets or sets a value representing the current playback position within the currently playing media item. */
  var position: Double
  /** Gets or sets a value representing the start time of the currently playing media item. */
  var startTime: Double
}

object SystemMediaTransportControlsTimelineProperties {
  @scala.inline
  def apply(endTime: Double, maxSeekTime: Double, minSeekTime: Double, position: Double, startTime: Double): SystemMediaTransportControlsTimelineProperties = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], maxSeekTime = maxSeekTime.asInstanceOf[js.Any], minSeekTime = minSeekTime.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaTransportControlsTimelineProperties]
  }
}

