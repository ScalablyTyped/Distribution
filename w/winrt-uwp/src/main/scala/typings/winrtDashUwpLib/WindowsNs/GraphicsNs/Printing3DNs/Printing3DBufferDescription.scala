package typings
package winrtDashUwpLib.WindowsNs.GraphicsNs.Printing3DNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies how to parse data in the buffer. */
trait Printing3DBufferDescription extends js.Object {
  /** Specifies the format used by the buffer. */
  var format: Printing3DBufferFormat
  /** Specifies how far to move the pointer forward to find the next unit of data. */
  var stride: scala.Double
}

object Printing3DBufferDescription {
  @scala.inline
  def apply(format: Printing3DBufferFormat, stride: scala.Double): Printing3DBufferDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("stride")(stride)
    __obj.asInstanceOf[Printing3DBufferDescription]
  }
}

