package typings.web3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gas extends js.Object {
  var gas: String
  var gasPrice: String
  var hash: String
  var input: String
  var nonce: String
  var r: String
  var s: String
  var to: String
  var v: String
  var value: String
}

object Anon_Gas {
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
  ): Anon_Gas = {
    val __obj = js.Dynamic.literal(gas = gas, gasPrice = gasPrice, hash = hash, input = input, nonce = nonce, r = r, s = s, to = to, v = v, value = value)
  
    __obj.asInstanceOf[Anon_Gas]
  }
}

