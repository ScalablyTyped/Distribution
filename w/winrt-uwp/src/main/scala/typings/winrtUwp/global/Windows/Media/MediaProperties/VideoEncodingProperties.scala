package typings.winrtUwp.global.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
/** Creates a new instance of the VideoEncodingProperties class. */
class VideoEncodingProperties ()
  extends typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties

/* static members */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
object VideoEncodingProperties extends js.Object {
  /**
    * Creates an instance of VideoEncodingProperties for a H.263 video.
    * @return The video encoding properties.
    */
  def createH264(): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  /**
    * Creates an instance of VideoEncodingProperties for a MPEG-2 video.
    * @return The video encoding properties.
    */
  def createMpeg2(): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
  /**
    * Creates an instance of VideoEncodingProperties for a uncompressed video.
    * @param subtype The media subtype of the format.
    * @param width The video image width.
    * @param height The video image height.
    * @return The video encoding properties.
    */
  def createUncompressed(subtype: String, width: Double, height: Double): typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties = js.native
}

