package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
/** Creates a new instance of the VideoEncodingProperties class. */
class VideoEncodingProperties () extends js.Object {
  /** Gets or sets the video bit rate. */
  var bitrate: Double = js.native
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio = js.native
  /** Gets or sets the video image height. */
  var height: Double = js.native
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio = js.native
  /** Gets or sets the media format profile. */
  var profileId: Double = js.native
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  var subtype: String = js.native
  /** Gets the format type. */
  var `type`: String = js.native
  /** Gets or sets the video image width. */
  var width: Double = js.native
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double] = js.native
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
object VideoEncodingProperties extends js.Object {
  /**
    * Creates an instance of VideoEncodingProperties for a H.263 video.
    * @return The video encoding properties.
    */
  def createH264(): VideoEncodingProperties = js.native
  /**
    * Creates an instance of VideoEncodingProperties for a MPEG-2 video.
    * @return The video encoding properties.
    */
  def createMpeg2(): VideoEncodingProperties = js.native
  /**
    * Creates an instance of VideoEncodingProperties for a uncompressed video.
    * @param subtype The media subtype of the format.
    * @param width The video image width.
    * @param height The video image height.
    * @return The video encoding properties.
    */
  def createUncompressed(subtype: String, width: Double, height: Double): VideoEncodingProperties = js.native
}

