package typings.web3DashEthDashContract.web3DashEthDashContractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeployOptions extends js.Object {
  var arguments: js.UndefOr[js.Array[_]] = js.undefined
  var data: String
}

object DeployOptions {
  @scala.inline
  def apply(data: String, arguments: js.Array[_] = null): DeployOptions = {
    val __obj = js.Dynamic.literal(data = data)
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    __obj.asInstanceOf[DeployOptions]
  }
}

