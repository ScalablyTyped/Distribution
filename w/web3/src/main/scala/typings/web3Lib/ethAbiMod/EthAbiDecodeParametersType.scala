package typings
package web3Lib.ethAbiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EthAbiDecodeParametersType extends js.Object {
  var name: java.lang.String
  var `type`: java.lang.String
}

object EthAbiDecodeParametersType {
  @scala.inline
  def apply(name: java.lang.String, `type`: java.lang.String): EthAbiDecodeParametersType = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[EthAbiDecodeParametersType]
  }
}

