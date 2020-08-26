package typings.trezorConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var address: String = js.native
  var path: js.Array[Double] = js.native
  var serializedPath: String = js.native
}

object Address {
  @scala.inline
  def apply(address: String, path: js.Array[Double], serializedPath: String): Address = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], serializedPath = serializedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: Double*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerializedPath(value: String): Self = this.set("serializedPath", value.asInstanceOf[js.Any])
  }
  
}

