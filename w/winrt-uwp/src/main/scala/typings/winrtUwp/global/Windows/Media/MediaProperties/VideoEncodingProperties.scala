package typings.winrtUwp.global.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
@JSGlobal("Windows.Media.MediaProperties.VideoEncodingProperties")
@js.native
/** Creates a new instance of the VideoEncodingProperties class. */
class VideoEncodingProperties ()
  extends typings.winrtUwp.Windows.Media.MediaProperties.VideoEncodingProperties {
  /** Gets or sets the video bit rate. */
  /* CompleteClass */
  override var bitrate: Double = js.native
  /** Gets or sets the video frame rate. */
  /* CompleteClass */
  override var frameRate: typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio = js.native
  /** Gets or sets the video image height. */
  /* CompleteClass */
  override var height: Double = js.native
  /** Gets or sets the pixel aspect ratio. */
  /* CompleteClass */
  override var pixelAspectRatio: typings.winrtUwp.Windows.Media.MediaProperties.MediaRatio = js.native
  /** Gets or sets the media format profile. */
  /* CompleteClass */
  override var profileId: Double = js.native
  /** Gets additional format properties for the video stream. */
  /* CompleteClass */
  override var properties: typings.winrtUwp.Windows.Media.MediaProperties.MediaPropertySet = js.native
  /** Gets or sets the subtype of the format. */
  /* CompleteClass */
  override var subtype: String = js.native
  /** Gets the format type. */
  /* CompleteClass */
  override var `type`: String = js.native
  /** Gets or sets the video image width. */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  /* CompleteClass */
  override def getFormatUserData(): js.Array[Double] = js.native
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  /* CompleteClass */
  override def setFormatUserData(value: js.Array[Double]): Unit = js.native
}

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

