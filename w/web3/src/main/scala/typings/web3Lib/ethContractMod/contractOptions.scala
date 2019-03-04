package typings
package web3Lib.ethContractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait contractOptions extends js.Object {
  var address: java.lang.String
  var data: java.lang.String
  var from: java.lang.String
  var gas: scala.Double
  var gasPrice: java.lang.String
  var jsonInterface: js.Array[web3Lib.ethAbiMod.ABIDefinition]
}

object contractOptions {
  @scala.inline
  def apply(
    address: java.lang.String,
    data: java.lang.String,
    from: java.lang.String,
    gas: scala.Double,
    gasPrice: java.lang.String,
    jsonInterface: js.Array[web3Lib.ethAbiMod.ABIDefinition]
  ): contractOptions = {
    val __obj = js.Dynamic.literal(address = address, data = data, from = from, gas = gas, gasPrice = gasPrice, jsonInterface = jsonInterface)
  
    __obj.asInstanceOf[contractOptions]
  }
}

