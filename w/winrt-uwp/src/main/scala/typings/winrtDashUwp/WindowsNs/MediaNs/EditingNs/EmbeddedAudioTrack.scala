package typings.winrtDashUwp.WindowsNs.MediaNs.EditingNs

import typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties
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
  def getAudioEncodingProperties(): AudioEncodingProperties = js.native
}

