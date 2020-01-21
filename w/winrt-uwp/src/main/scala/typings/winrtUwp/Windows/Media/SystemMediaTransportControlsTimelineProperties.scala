package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents timeline properties of the SystemMediaTransportControls . Pass an instance of this class to the UpdateTimelineProperties method to update the properties. */
@JSGlobal("Windows.Media.SystemMediaTransportControlsTimelineProperties")
@js.native
/** Initializes a new instance of the SystemMediaTransportControlsTimelineProperties class. */
class SystemMediaTransportControlsTimelineProperties () extends js.Object {
  /** Gets or sets a value representing the end time of the currently playing media item. */
  var endTime: Double = js.native
  /** Gets or sets a value indicating the latest time within the currently playing media item to which the user can seek. */
  var maxSeekTime: Double = js.native
  /** Gets or sets a value indicating the earliest time within the currently playing media item to which the user can seek. */
  var minSeekTime: Double = js.native
  /** Gets or sets a value representing the current playback position within the currently playing media item. */
  var position: Double = js.native
  /** Gets or sets a value representing the start time of the currently playing media item. */
  var startTime: Double = js.native
}

