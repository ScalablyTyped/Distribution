package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIPInformation extends js.Object {
  var networkAdapter: NetworkAdapter = js.native
  var prefixLength: Double = js.native
}

object IIPInformation {
  @scala.inline
  def apply(networkAdapter: NetworkAdapter, prefixLength: Double): IIPInformation = {
    val __obj = js.Dynamic.literal(networkAdapter = networkAdapter.asInstanceOf[js.Any], prefixLength = prefixLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIPInformation]
  }
  @scala.inline
  implicit class IIPInformationOps[Self <: IIPInformation] (val x: Self) extends AnyVal {
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
    def setNetworkAdapter(value: NetworkAdapter): Self = this.set("networkAdapter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixLength(value: Double): Self = this.set("prefixLength", value.asInstanceOf[js.Any])
  }
  
}

