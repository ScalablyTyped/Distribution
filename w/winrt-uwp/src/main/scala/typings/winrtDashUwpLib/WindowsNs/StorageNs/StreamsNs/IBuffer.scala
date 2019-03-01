package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a referenced array of bytes used by byte stream read and write interfaces. Buffer is the class implementation of this interface. */
trait IBuffer extends js.Object {
  /** Gets the maximum number of bytes that the buffer can hold. */
  var capacity: scala.Double
  /** Gets the number of bytes currently in use in the buffer. */
  var length: scala.Double
}

object IBuffer {
  @scala.inline
  def apply(capacity: scala.Double, length: scala.Double): IBuffer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capacity")(capacity)
    __obj.updateDynamic("length")(length)
    __obj.asInstanceOf[IBuffer]
  }
}

