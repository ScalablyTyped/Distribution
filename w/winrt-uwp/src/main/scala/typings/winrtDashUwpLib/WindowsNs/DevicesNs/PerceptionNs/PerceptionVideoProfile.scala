package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.PerceptionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Windows.Devices.Perception video profile. */
@JSGlobal("Windows.Devices.Perception.PerceptionVideoProfile")
@js.native
abstract class PerceptionVideoProfile () extends js.Object {
  /** Gets the bitmap alpha mode. */
  var bitmapAlphaMode: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapAlphaMode = js.native
  /** Gets the bitmap pixel format. */
  var bitmapPixelFormat: winrtDashUwpLib.WindowsNs.GraphicsNs.ImagingNs.BitmapPixelFormat = js.native
  /** Gets the time duration of each frame. */
  var frameDuration: scala.Double = js.native
  /** Gets the frame height, in pixels. */
  var height: scala.Double = js.native
  /** Gets the frame width, in pixels. */
  var width: scala.Double = js.native
  /**
                   * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
                   * @param other The IPerceptionVideoProfile object to compare to this one.
                   * @return True if the two video profiles are equivalent, otherwise false.
                   */
  def isEqual(other: PerceptionVideoProfile): scala.Boolean = js.native
}

