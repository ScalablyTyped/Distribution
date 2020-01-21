package typings.web3Eth.mod

import typings.web3Eth.AnonAccountProof
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetProof extends js.Object {
  var id: Double
  var jsonrpc: String
  var result: AnonAccountProof
}

object GetProof {
  @scala.inline
  def apply(id: Double, jsonrpc: String, result: AnonAccountProof): GetProof = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], jsonrpc = jsonrpc.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetProof]
  }
}

