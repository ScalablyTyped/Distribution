package typings.web3EthContract.mod

import typings.web3Utils.mod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends ContractOptions {
  var address: String = js.native
  var jsonInterface: js.Array[AbiItem] = js.native
}

object Options {
  @scala.inline
  def apply(address: String, jsonInterface: js.Array[AbiItem]): Options = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], jsonInterface = jsonInterface.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setJsonInterfaceVarargs(value: AbiItem*): Self = this.set("jsonInterface", js.Array(value :_*))
    @scala.inline
    def setJsonInterface(value: js.Array[AbiItem]): Self = this.set("jsonInterface", value.asInstanceOf[js.Any])
  }
  
}

