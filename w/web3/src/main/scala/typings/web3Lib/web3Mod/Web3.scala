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
    extend: js.Function1[js.Any, js.Any],
    givenProvider: web3Lib.providersMod.Provider,
    providers: web3Lib.providersMod.Providers,
    setProvider: js.Function1[web3Lib.providersMod.Provider, scala.Unit],
    shh: web3Lib.typesMod.Shh,
    utils: web3Lib.utilsMod.Utils,
    version: java.lang.String
  ): Web3 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BatchRequest")(BatchRequest)
    __obj.updateDynamic("bzz")(bzz)
    __obj.updateDynamic("currentProvider")(currentProvider)
    __obj.updateDynamic("eth")(eth)
    __obj.updateDynamic("extend")(extend)
    __obj.updateDynamic("givenProvider")(givenProvider)
    __obj.updateDynamic("providers")(providers)
    __obj.updateDynamic("setProvider")(setProvider)
    __obj.updateDynamic("shh")(shh)
    __obj.updateDynamic("utils")(utils)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Web3]
  }
}

