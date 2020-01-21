package typings.winrtUwp.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Windows.Devices.Perception video profile. */
@JSGlobal("Windows.Devices.Perception.PerceptionVideoProfile")
@js.native
abstract class PerceptionVideoProfile () extends js.Object {
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

