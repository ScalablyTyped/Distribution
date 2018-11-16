package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a video track. */
@JSGlobal("Windows.Media.Core.VideoTrack")
@js.native
abstract class VideoTrack () extends js.Object {
  /** Gets or sets the identifier for the video track. */
  var id: java.lang.String = js.native
  /** Gets or sets the label for the video track. */
  var label: java.lang.String = js.native
  /** Gets or sets a string indicating the language of the video track. */
  var language: java.lang.String = js.native
  /** Gets a value indicating the type of data the track contains. For VideoTrack objects, this value is always MediaTrackKind::Video . */
  var trackKind: MediaTrackKind = js.native
}

