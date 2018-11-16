package typings
package winrtDashUwpLib.WindowsNs.MediaNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an video media stream. */
@JSGlobal("Windows.Media.Core.VideoStreamDescriptor")
@js.native
class VideoStreamDescriptor protected () extends js.Object {
  /**
                   * Creates an instance of the VideoEncodingProperties class using the specified video encoding.
                   * @param encodingProperties The encoding properties for the video stream.
                   */
  def this(encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties) = this()
  /** Gets the encoding properties on the video stream. */
  var encodingProperties: winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  var isSelected: scala.Boolean = js.native
  /** Gets or sets the RFC-1766 language code for the stream. */
  var language: java.lang.String = js.native
  /** Gets or sets the name of the stream. */
  var name: java.lang.String = js.native
}

