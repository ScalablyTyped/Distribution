package typings.winrtUwp.global.Windows.Devices.Perception

import typings.winrtUwp.Windows.Graphics.Imaging.BitmapAlphaMode
import typings.winrtUwp.Windows.Graphics.Imaging.BitmapPixelFormat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a Windows.Devices.Perception video profile. */
@JSGlobal("Windows.Devices.Perception.PerceptionVideoProfile")
@js.native
abstract class PerceptionVideoProfile ()
  extends typings.winrtUwp.Windows.Devices.Perception.PerceptionVideoProfile {
  /** Gets the bitmap alpha mode. */
  /* CompleteClass */
  override var bitmapAlphaMode: BitmapAlphaMode = js.native
  /** Gets the bitmap pixel format. */
  /* CompleteClass */
  override var bitmapPixelFormat: BitmapPixelFormat = js.native
  /** Gets the time duration of each frame. */
  /* CompleteClass */
  override var frameDuration: Double = js.native
  /** Gets the frame height, in pixels. */
  /* CompleteClass */
  override var height: Double = js.native
  /** Gets the frame width, in pixels. */
  /* CompleteClass */
  override var width: Double = js.native
  /**
    * A comparison function used to determine if two IPerceptionVideoProfile objects are equivalent.
    * @param other The IPerceptionVideoProfile object to compare to this one.
    * @return True if the two video profiles are equivalent, otherwise false.
    */
  /* CompleteClass */
  override def isEqual(other: typings.winrtUwp.Windows.Devices.Perception.PerceptionVideoProfile): Boolean = js.native
}

