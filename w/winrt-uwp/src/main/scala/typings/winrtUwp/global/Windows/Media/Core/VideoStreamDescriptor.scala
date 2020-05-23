package typings.winrtUwp.global.Windows.Media.Core

import typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines an video media stream. */
@JSGlobal("Windows.Media.Core.VideoStreamDescriptor")
@js.native
class VideoStreamDescriptor protected ()
  extends typings.winrtUwp.Windows.Media.Core.VideoStreamDescriptor {
  /**
    * Creates an instance of the VideoEncodingProperties class using the specified video encoding.
    * @param encodingProperties The encoding properties for the video stream.
    */
  def this(encodingProperties: VideoEncodingProperties) = this()
  /** Gets the encoding properties on the video stream. */
  /* CompleteClass */
  override var encodingProperties: VideoEncodingProperties = js.native
  /** Specifies whether the stream is currently in use by the MediaStreamSource . */
  /* CompleteClass */
  override var isSelected: Boolean = js.native
  /** Gets or sets the RFC-1766 language code for the stream. */
  /* CompleteClass */
  override var language: String = js.native
  /** Gets or sets the name of the stream. */
  /* CompleteClass */
  override var name: String = js.native
}

