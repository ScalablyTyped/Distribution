package typings.winrtUwp.Windows.Media.MediaProperties

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the format of a video stream. */
trait VideoEncodingProperties extends js.Object {
  /** Gets or sets the video bit rate. */
  var bitrate: Double
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio
  /** Gets or sets the video image height. */
  var height: Double
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio
  /** Gets or sets the media format profile. */
  var profileId: Double
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet
  /** Gets or sets the subtype of the format. */
  var subtype: String
  /** Gets the format type. */
  var `type`: String
  /** Gets or sets the video image width. */
  var width: Double
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double]
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit
}

object VideoEncodingProperties {
  @scala.inline
  def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    getFormatUserData: () => js.Array[Double],
    height: Double,
    pixelAspectRatio: MediaRatio,
    profileId: Double,
    properties: MediaPropertySet,
    setFormatUserData: js.Array[Double] => Unit,
    subtype: String,
    `type`: String,
    width: Double
  ): VideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], getFormatUserData = js.Any.fromFunction0(getFormatUserData), height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1(setFormatUserData), subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncodingProperties]
  }
}

