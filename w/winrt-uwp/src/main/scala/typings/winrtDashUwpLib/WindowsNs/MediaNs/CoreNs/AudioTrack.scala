package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track. */
@JSGlobal("Windows.Media.Core.AudioTrack")
@js.native
abstract class AudioTrack () extends js.Object {
  /** Gets or sets the identifier for the audio track. */
  var id: java.lang.String = js.native
  /** Gets or sets the label for the audio track. */
  var label: java.lang.String = js.native
  /** Gets or sets a string indicating the language of the audio track. */
  var language: java.lang.String = js.native
  /** Gets a value indicating the type of data the track contains. For AudioTrack objects, this value is always MediaTrackKind::Audio . */
  var trackKind: MediaTrackKind = js.native
}

