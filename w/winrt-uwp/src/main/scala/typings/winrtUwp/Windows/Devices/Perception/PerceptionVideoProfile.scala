package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Windows.Devices.Perception video profile. */
@js.native
trait PerceptionVideoProfile extends js.Object {
  /** Gets the bitmap alpha mode. */
  var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** Gets the bitmap pixel format. */
  var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** Gets the time duration of each frame. */
  var frameDuration: Double = js.native
  /** Gets the frame height, in pixels. */
  var height: Double = js.native
  /** Gets the frame width, in pixels. */
  var width: Double = js.native
  /**
    * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
    * @param other The IPerceptionVideoProfile object to compare to this one.
    * @return True if the two video profiles are equivalent, otherwise false.
    */
  def isEqual(other: PerceptionVideoProfile): Boolean = js.native
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
  @scala.inline
  implicit class PerceptionVideoProfileOps[Self <: PerceptionVideoProfile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBitmapAlphaMode(value: BitmapAlphaMode): Self = this.set("bitmapAlphaMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setBitmapPixelFormat(value: BitmapPixelFormat): Self = this.set("bitmapPixelFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameDuration(value: Double): Self = this.set("frameDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEqual(value: PerceptionVideoProfile => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

