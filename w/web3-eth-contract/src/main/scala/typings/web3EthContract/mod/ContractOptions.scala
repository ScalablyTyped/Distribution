package typings.web3EthContract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContractOptions extends js.Object {
  // Contract code
  var data: js.UndefOr[String] = js.native
  // Sender to use for contract calls
  var from: js.UndefOr[String] = js.native
  // Gas to use for contract calls
  var gas: js.UndefOr[Double] = js.native
  // Gas price to use for contract calls
  var gasPrice: js.UndefOr[String] = js.native
}

object ContractOptions {
  @scala.inline
  def apply(): ContractOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContractOptions]
  }
  @scala.inline
  implicit class ContractOptionsOps[Self <: ContractOptions] (val x: Self) extends AnyVal {
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
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFrom(value: String): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setGas(value: Double): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGas: Self = this.set("gas", js.undefined)
    @scala.inline
    def setGasPrice(value: String): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGasPrice: Self = this.set("gasPrice", js.undefined)
  }
  
}

