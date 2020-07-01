package typings.webBluetooth

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDataFilter extends js.Object {
  val dataPrefix: DataView
  val mask: DataView
}

object BluetoothDataFilter {
  @scala.inline
  def apply(dataPrefix: DataView, mask: DataView): BluetoothDataFilter = {
    val __obj = js.Dynamic.literal(dataPrefix = dataPrefix.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDataFilter]
  }
}

