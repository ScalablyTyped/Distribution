package typings
package tabrisLib.tabrisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents pixel data of a `Canvas` widget.
  */
trait ImageData extends js.Object {
  /**
    * A one-dimensional array containing the data in the RGBA order, with integer values between 0 and 255 (included).
    */
  val data: stdLib.Uint8ClampedArray
  /**
    * The actual height of the ImageData, in pixels.
    */
  val height: scala.Double
  /**
    * The actual height of the ImageData, in pixels.
    */
  val width: scala.Double
}

object ImageData {
  @scala.inline
  def apply(data: stdLib.Uint8ClampedArray, height: scala.Double, width: scala.Double): ImageData = {
    val __obj = js.Dynamic.literal(data = data, height = height, width = width)
  
    __obj.asInstanceOf[ImageData]
  }
}

