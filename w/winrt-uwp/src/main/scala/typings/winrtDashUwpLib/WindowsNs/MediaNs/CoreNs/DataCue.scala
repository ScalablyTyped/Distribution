package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a data cue that can be included in a TimedMetadataTrack . */
@JSGlobal("Windows.Media.Core.DataCue")
@js.native
/** Initializes a new instance of the DataCue class. */
class DataCue () extends js.Object {
  /** Gets the data associated with the cue. */
  var data: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer = js.native
  /** Gets or sets the duration of the cue. */
  var duration: scala.Double = js.native
  /** Gets the identifier for the timed metadata track. */
  var id: java.lang.String = js.native
  /** Gets the start time of the cue. */
  var startTime: scala.Double = js.native
}

