package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the TimedMetadataTrack::CueEntered and TimedMetadataTrack::CueExited events. */
@JSGlobal("Windows.Media.Core.MediaCueEventArgs")
@js.native
abstract class MediaCueEventArgs () extends js.Object {
  /** Gets the cue that triggered the event. */
  var cue: IMediaCue = js.native
}

