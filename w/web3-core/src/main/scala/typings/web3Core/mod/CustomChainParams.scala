package typings.web3Core.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChainParams extends js.Object {
  var chainId: Double
  var name: js.UndefOr[String] = js.undefined
  var networkId: Double
}

object CustomChainParams {
  @scala.inline
  def apply(chainId: Double, networkId: Double, name: String = null): CustomChainParams = {
    val __obj = js.Dynamic.literal(chainId = chainId.asInstanceOf[js.Any], networkId = networkId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomChainParams]
  }
}

