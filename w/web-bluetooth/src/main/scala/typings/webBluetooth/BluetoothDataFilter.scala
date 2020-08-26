package typings.webBluetooth

import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDataFilter extends js.Object {
  val dataPrefix: DataView = js.native
  val mask: DataView = js.native
}

object BluetoothDataFilter {
  @scala.inline
  def apply(dataPrefix: DataView, mask: DataView): BluetoothDataFilter = {
    val __obj = js.Dynamic.literal(dataPrefix = dataPrefix.asInstanceOf[js.Any], mask = mask.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDataFilter]
  }
  @scala.inline
  implicit class BluetoothDataFilterOps[Self <: BluetoothDataFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataPrefix(value: DataView): Self = this.set("dataPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def setMask(value: DataView): Self = this.set("mask", value.asInstanceOf[js.Any])
  }
  
}

