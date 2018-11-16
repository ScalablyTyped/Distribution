package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an audio media stream. */
@JSGlobal("Windows.Media.Core.AudioStreamDescriptor")
@js.native
class AudioStreamDescriptor protected () extends js.Object {
  /**
                   * Creates an instance of AudioStreamDescriptor class using the specified AudioEncodingProperties .
                   * @param encodingProperties The encoding properties for the audio stream.
                   */
  def this(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties) = this()
  /** The encoding properties of the stream. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.AudioEncodingProperties = js.native
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: scala.Boolean = js.native
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: java.lang.String = js.native
  /** Gets or sets the name of the stream. */
  var name: java.lang.String = js.native
}

