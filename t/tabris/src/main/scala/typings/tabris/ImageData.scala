package typings.tabris

import typings.std.Uint8ClampedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents pixel data of a `Canvas` widget.
  */
@JSGlobal("ImageData")
@js.native
class ImageData protected () extends js.Object {
  def this(data: Uint8ClampedArray, width: Double) = this()
  def this(width: Double, height: Double) = this()
  def this(data: Uint8ClampedArray, width: Double, height: Double) = this()
  /**
    * A one-dimensional array containing the data in RGBA order, with integer values between 0 and 255 (inclusive).
    */
  val data: Uint8ClampedArray = js.native
  /**
    * The actual height of the ImageData, in pixels.
    */
  val height: Double = js.native
  /**
    * The actual height of the ImageData, in pixels.
    */
  val width: Double = js.native
}

