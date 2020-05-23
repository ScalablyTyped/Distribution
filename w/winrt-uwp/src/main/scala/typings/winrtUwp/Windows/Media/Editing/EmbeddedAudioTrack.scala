package typings.winrtUwp.Windows.Media.Editing

import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an audio track embedded in the media clip. */
trait EmbeddedAudioTrack extends js.Object {
  /**
    * Gets the AudioEncodingProperties for the embedded audio track.
    * @return The AudioEncodingProperties for the embedded audio track.
    */
  def getAudioEncodingProperties(): AudioEncodingProperties
}

object EmbeddedAudioTrack {
  @scala.inline
  def apply(getAudioEncodingProperties: () => AudioEncodingProperties): EmbeddedAudioTrack = {
    val __obj = js.Dynamic.literal(getAudioEncodingProperties = js.Any.fromFunction0(getAudioEncodingProperties))
    __obj.asInstanceOf[EmbeddedAudioTrack]
  }
}

