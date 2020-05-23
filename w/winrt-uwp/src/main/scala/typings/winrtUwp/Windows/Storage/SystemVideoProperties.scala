package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper object that provides indexing names for video file properties. */
trait SystemVideoProperties extends js.Object {
  /** Gets the name of the System.Video.Director property (one of the Windows video file properties). */
  var director: String
  /** Gets the name of the System.Video.FrameHeight property (one of the Windows video file properties). */
  var frameHeight: String
  /** Gets the name of the System.Video.FrameWidth property (one of the Windows video file properties). */
  var frameWidth: String
  /** Gets the name of the System.Video.Orientation property (one of the Windows video file properties). */
  var orientation: String
  /** Gets the name of the System.Video.TotalBitrate property (one of the Windows video file properties). */
  var totalBitrate: String
}

object SystemVideoProperties {
  @scala.inline
  def apply(
    director: String,
    frameHeight: String,
    frameWidth: String,
    orientation: String,
    totalBitrate: String
  ): SystemVideoProperties = {
    val __obj = js.Dynamic.literal(director = director.asInstanceOf[js.Any], frameHeight = frameHeight.asInstanceOf[js.Any], frameWidth = frameWidth.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], totalBitrate = totalBitrate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemVideoProperties]
  }
}

