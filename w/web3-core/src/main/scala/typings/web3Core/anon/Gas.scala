package typings.web3Core.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gas extends js.Object {
  var gas: String = js.native
  var gasPrice: String = js.native
  var hash: String = js.native
  var input: String = js.native
  var nonce: String = js.native
  var r: String = js.native
  var s: String = js.native
  var to: String = js.native
  var v: String = js.native
  var value: String = js.native
}

object Gas {
  @scala.inline
  def apply(
    gas: String,
    gasPrice: String,
    hash: String,
    input: String,
    nonce: String,
    r: String,
    s: String,
    to: String,
    v: String,
    value: String
  ): Gas = {
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gas]
  }
  @scala.inline
  implicit class GasOps[Self <: Gas] (val x: Self) extends AnyVal {
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
    def setGas(value: String): Self = this.set("gas", value.asInstanceOf[js.Any])
    @scala.inline
    def setGasPrice(value: String): Self = this.set("gasPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    @scala.inline
    def setInput(value: String): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def setNonce(value: String): Self = this.set("nonce", value.asInstanceOf[js.Any])
    @scala.inline
    def setR(value: String): Self = this.set("r", value.asInstanceOf[js.Any])
    @scala.inline
    def setS(value: String): Self = this.set("s", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: String): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

