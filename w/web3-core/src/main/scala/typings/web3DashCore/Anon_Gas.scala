package typings.web3DashCore

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
    val __obj = js.Dynamic.literal(gas = gas.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Gas]
  }
}

