package typings
package web3Lib.web3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Web3 extends js.Object {
  var BatchRequest: ScalablyTyped.runtime.Instantiable0[web3Lib.ethTypesMod.BatchRequest]
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

