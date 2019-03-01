package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBuffer extends js.Object {
  var capacity: scala.Double
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

