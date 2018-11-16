package typings
package winrtDashUwpLib.WindowsNs.MediaNs.EditingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track embedded in the media clip. */
@JSGlobal("Windows.Media.Editing.EmbeddedAudioTrack")
@js.native
abstract class EmbeddedAudioTrack () extends js.Object {
  /**
                   * Gets the AudioEncodingProperties for the embedded audio track.
                   * @return The AudioEncodingProperties for the embedded audio track.
                   */
  def getAudioEncodingProperties(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
}

