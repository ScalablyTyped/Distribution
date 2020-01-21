package typings.web3.mod

import org.scalablytyped.runtime.Instantiable0
import typings.web3Bzz.mod.Bzz
import typings.web3Core.mod.BatchRequest
import typings.web3Core.mod.Extension
import typings.web3Core.mod.provider
import typings.web3Eth.mod.Eth
import typings.web3Shh.mod.Shh
import typings.web3Utils.mod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3 extends js.Object {
  var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest]
  var bzz: Bzz
  val currentProvider: provider
  var defaultAccount: String | Null
  var defaultBlock: String | Double
  var eth: Eth
  val givenProvider: js.Any
  var shh: Shh
  var utils: Utils
  var version: String
  def extend(extension: Extension): js.Any
  def setProvider(provider: provider): Boolean
}

object Web3 {
  @scala.inline
  def apply(
    BatchRequest: Instantiable0[BatchRequest],
    bzz: Bzz,
    defaultBlock: String | Double,
    eth: Eth,
    extend: Extension => js.Any,
    givenProvider: js.Any,
    setProvider: provider => Boolean,
    shh: Shh,
    utils: Utils,
    version: String,
    currentProvider: provider = null,
    defaultAccount: String = null
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest.asInstanceOf[js.Any], bzz = bzz.asInstanceOf[js.Any], defaultBlock = defaultBlock.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), givenProvider = givenProvider.asInstanceOf[js.Any], setProvider = js.Any.fromFunction1(setProvider), shh = shh.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (currentProvider != null) __obj.updateDynamic("currentProvider")(currentProvider.asInstanceOf[js.Any])
    if (defaultAccount != null) __obj.updateDynamic("defaultAccount")(defaultAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3]
  }
}

