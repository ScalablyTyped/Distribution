package typings.web3.ethAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EthAbiDecodeParametersType extends js.Object {
  var name: String
  var `type`: String
}

object EthAbiDecodeParametersType {
  @scala.inline
  def apply(name: String, `type`: String): EthAbiDecodeParametersType = {
    val __obj = js.Dynamic.literal(name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[EthAbiDecodeParametersType]
  }
}

