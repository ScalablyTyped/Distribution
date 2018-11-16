package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
class VideoEncodingProperties () extends js.Object {
  /** Gets or sets the video bit rate. */
  var bitrate: scala.Double = js.native
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio = js.native
  /** Gets or sets the video image height. */
  var height: scala.Double = js.native
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio = js.native
  /** Gets or sets the media format profile. */
  var profileId: scala.Double = js.native
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: java.lang.String = js.native
  /** Gets the format type. */
  var `type`: java.lang.String = js.native
  /** Gets or sets the video image width. */
  var width: scala.Double = js.native
  /**
                   * Gets the media format user data.
                   * @return Receives the media format data.
                   */
  def getFormatUserData(): js.Array[scala.Double] = js.native
  /**
                   * Sets the media format user data.
                   * @param value The media data to set.
                   */
  def setFormatUserData(value: js.Array[scala.Double]): scala.Unit = js.native
}

/** Describes the format of a video stream. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
object VideoEncodingProperties extends js.Object {
  /**
                   * Creates an instance of VideoEncodingProperties for a H.263 video.
                   * @return The video encoding properties.
                   */
  def createH264(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
  /**
                   * Creates an instance of VideoEncodingProperties for a MPEG-2 video.
                   * @return The video encoding properties.
                   */
  def createMpeg2(): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
  /**
                   * Creates an instance of VideoEncodingProperties for a uncompressed video.
                   * @param subtype The media subtype of the format.
                   * @param width The video image width.
                   * @param height The video image height.
                   * @return The video encoding properties.
                   */
  def createUncompressed(subtype: java.lang.String, width: scala.Double, height: scala.Double): winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.VideoEncodingProperties = js.native
}

