package typings.web3.ethContractMod

import typings.web3.ethAbiMod.ABIDefinition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait contractOptions extends js.Object {
  var address: String
  var data: String
  var from: String
  var gas: Double
  var gasPrice: String
  var jsonInterface: js.Array[ABIDefinition]
}

object contractOptions {
  @scala.inline
  def apply(
    address: String,
    data: String,
    from: String,
    gas: Double,
    gasPrice: String,
    jsonInterface: js.Array[ABIDefinition]
  ): contractOptions = {
    val __obj = js.Dynamic.literal(address = address, data = data, from = from, gas = gas, gasPrice = gasPrice, jsonInterface = jsonInterface)
  
    __obj.asInstanceOf[contractOptions]
  }
}

