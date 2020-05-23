package typings.winrtUwp.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.AudioEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio media stream. */
trait AudioStreamDescriptor extends js.Object {
  /** The encoding properties of the stream. */
  var encodingProperties: AudioEncodingProperties
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: Boolean
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: String
  /** Gets or sets the name of the stream. */
  var name: String
}

object AudioStreamDescriptor {
  @scala.inline
  def apply(encodingProperties: AudioEncodingProperties, isSelected: Boolean, language: String, name: String): AudioStreamDescriptor = {
    val __obj = js.Dynamic.literal(encodingProperties = encodingProperties.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioStreamDescriptor]
  }
}

