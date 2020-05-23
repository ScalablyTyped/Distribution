package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Windows.Devices.Perception video profile. */
trait PerceptionVideoProfile extends js.Object {
  /** Gets the bitmap alpha mode. */
  var bitmapAlphaMode: BitmapAlphaMode
  /** Gets the bitmap pixel format. */
  var bitmapPixelFormat: BitmapPixelFormat
  /** Gets the time duration of each frame. */
  var frameDuration: Double
  /** Gets the frame height, in pixels. */
  var height: Double
  /** Gets the frame width, in pixels. */
  var width: Double
  /**
    * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
    * @param other The IPerceptionVideoProfile object to compare to this one.
    * @return True if the two video profiles are equivalent, otherwise false.
    */
  def isEqual(other: PerceptionVideoProfile): Boolean
}

object PerceptionVideoProfile {
  @scala.inline
  def apply(
    bitmapAlphaMode: BitmapAlphaMode,
    bitmapPixelFormat: BitmapPixelFormat,
    frameDuration: Double,
    height: Double,
    isEqual: PerceptionVideoProfile => Boolean,
    width: Double
  ): PerceptionVideoProfile = {
    val __obj = js.Dynamic.literal(bitmapAlphaMode = bitmapAlphaMode.asInstanceOf[js.Any], bitmapPixelFormat = bitmapPixelFormat.asInstanceOf[js.Any], frameDuration = frameDuration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerceptionVideoProfile]
  }
}

