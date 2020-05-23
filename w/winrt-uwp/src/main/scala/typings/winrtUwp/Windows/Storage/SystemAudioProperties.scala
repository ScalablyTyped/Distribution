package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for Windows audio file properties. */
trait SystemAudioProperties extends js.Object {
  /** Gets the name of the System.Audio.EncodingBitrate property (one of the Windows audio file properties). */
  var encodingBitrate: String
}

object SystemAudioProperties {
  @scala.inline
  def apply(encodingBitrate: String): SystemAudioProperties = {
    val __obj = js.Dynamic.literal(encodingBitrate = encodingBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemAudioProperties]
  }
}

