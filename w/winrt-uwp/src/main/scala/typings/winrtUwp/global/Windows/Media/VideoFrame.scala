package typings.winrtUwp.global.Windows.Media

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a single frame of video data. */
@JSGlobal("Windows.Media.VideoFrame")
@js.native
class VideoFrame protected ()
  extends typings.winrtUwp.Windows.Media.VideoFrame {
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double) = this()
  /**
    * Initializes a new instance of the VideoFrame class.
    * @param format The pixel format of the video frame.
    * @param width The width of the video frame, in pixels.
    * @param height The height of the video frame, in pixels.
    * @param alpha The alpha mode of the video frame.
    */
  def this(format: BitmapPixelFormat, width: Double, height: Double, alpha: BitmapAlphaMode) = this()
}

