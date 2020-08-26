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

@js.native
trait Web3 extends js.Object {
  var BatchRequest: Instantiable0[typings.web3Core.mod.BatchRequest] = js.native
  var bzz: Bzz = js.native
  val currentProvider: provider = js.native
  var defaultAccount: String | Null = js.native
  var defaultBlock: String | Double = js.native
  var eth: Eth = js.native
  val givenProvider: js.Any = js.native
  var shh: Shh = js.native
  var utils: Utils = js.native
  var version: String = js.native
  def extend(extension: Extension): js.Any = js.native
  def setProvider(provider: provider): Boolean = js.native
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
    version: String
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest.asInstanceOf[js.Any], bzz = bzz.asInstanceOf[js.Any], defaultBlock = defaultBlock.asInstanceOf[js.Any], eth = eth.asInstanceOf[js.Any], extend = js.Any.fromFunction1(extend), givenProvider = givenProvider.asInstanceOf[js.Any], setProvider = js.Any.fromFunction1(setProvider), shh = shh.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3]
  }
  @scala.inline
  implicit class Web3Ops[Self <: Web3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBatchRequest(value: Instantiable0[BatchRequest]): Self = this.set("BatchRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setBzz(value: Bzz): Self = this.set("bzz", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultBlock(value: String | Double): Self = this.set("defaultBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setEth(value: Eth): Self = this.set("eth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtend(value: Extension => js.Any): Self = this.set("extend", js.Any.fromFunction1(value))
    @scala.inline
    def setGivenProvider(value: js.Any): Self = this.set("givenProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetProvider(value: provider => Boolean): Self = this.set("setProvider", js.Any.fromFunction1(value))
    @scala.inline
    def setShh(value: Shh): Self = this.set("shh", value.asInstanceOf[js.Any])
    @scala.inline
    def setUtils(value: Utils): Self = this.set("utils", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentProvider(value: provider): Self = this.set("currentProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentProviderNull: Self = this.set("currentProvider", null)
    @scala.inline
    def setDefaultAccount(value: String): Self = this.set("defaultAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultAccountNull: Self = this.set("defaultAccount", null)
  }
  
}

