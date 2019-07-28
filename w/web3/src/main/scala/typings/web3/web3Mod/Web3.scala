package typings.web3.web3Mod

import org.scalablytyped.runtime.Instantiable0
import typings.web3.ethMod.Eth
import typings.web3.ethTypesMod.BatchRequest
import typings.web3.providersMod.Provider
import typings.web3.providersMod.Providers
import typings.web3.typesMod.Bzz
import typings.web3.typesMod.Shh
import typings.web3.utilsMod.Utils
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3 extends js.Object {
  var BatchRequest: Instantiable0[typings.web3.ethTypesMod.BatchRequest]
   // TODO
  var bzz: Bzz
  var currentProvider: Provider
  var eth: Eth
  var givenProvider: Provider
  var providers: Providers
  var shh: Shh
  var utils: Utils
  var version: String
  def extend(methods: js.Any): js.Any
  def setProvider(provider: Provider): Unit
}

object Web3 {
  @scala.inline
  def apply(
    BatchRequest: Instantiable0[BatchRequest],
    bzz: Bzz,
    currentProvider: Provider,
    eth: Eth,
    extend: js.Any => js.Any,
    givenProvider: Provider,
    providers: Providers,
    setProvider: Provider => Unit,
    shh: Shh,
    utils: Utils,
    version: String
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest, bzz = bzz, currentProvider = currentProvider, eth = eth, extend = js.Any.fromFunction1(extend), givenProvider = givenProvider, providers = providers, setProvider = js.Any.fromFunction1(setProvider), shh = shh, utils = utils, version = version)
  
    __obj.asInstanceOf[Web3]
  }
}

