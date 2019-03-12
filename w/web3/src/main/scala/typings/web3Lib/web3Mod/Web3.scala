package typings
package web3Lib.web3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3 extends js.Object {
  var BatchRequest: org.scalablytyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest]
   // TODO
  var bzz: web3Lib.typesMod.Bzz
  var currentProvider: web3Lib.providersMod.Provider
  var eth: web3Lib.ethMod.Eth
  var givenProvider: web3Lib.providersMod.Provider
  var providers: web3Lib.providersMod.Providers
  var shh: web3Lib.typesMod.Shh
  var utils: web3Lib.utilsMod.Utils
  var version: java.lang.String
  def extend(methods: js.Any): js.Any
  def setProvider(provider: web3Lib.providersMod.Provider): scala.Unit
}

object Web3 {
  @scala.inline
  def apply(
    BatchRequest: org.scalablytyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest],
    bzz: web3Lib.typesMod.Bzz,
    currentProvider: web3Lib.providersMod.Provider,
    eth: web3Lib.ethMod.Eth,
    extend: js.Any => js.Any,
    givenProvider: web3Lib.providersMod.Provider,
    providers: web3Lib.providersMod.Providers,
    setProvider: web3Lib.providersMod.Provider => scala.Unit,
    shh: web3Lib.typesMod.Shh,
    utils: web3Lib.utilsMod.Utils,
    version: java.lang.String
  ): Web3 = {
    val __obj = js.Dynamic.literal(BatchRequest = BatchRequest, bzz = bzz, currentProvider = currentProvider, eth = eth, extend = js.Any.fromFunction1(extend), givenProvider = givenProvider, providers = providers, setProvider = js.Any.fromFunction1(setProvider), shh = shh, utils = utils, version = version)
  
    __obj.asInstanceOf[Web3]
  }
}

