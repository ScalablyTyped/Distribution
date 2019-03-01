package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBufferFactory extends js.Object {
  def create(capacity: scala.Double): Buffer
}

object IBufferFactory {
  @scala.inline
  def apply(create: js.Function1[scala.Double, Buffer]): IBufferFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(create)
    __obj.asInstanceOf[IBufferFactory]
  }
}

