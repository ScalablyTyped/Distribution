package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bzz extends js.Object {
  var Bzz: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.typesMod.Bzz]
  var Eth: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethMod.Eth]
  var Net: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethTypesMod.Net]
  var Personal: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethTypesMod.Personal]
  var Shh: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.typesMod.Shh]
}

object Anon_Bzz {
  @scala.inline
  def apply(
    Bzz: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.typesMod.Bzz],
    Eth: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethMod.Eth],
    Net: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethTypesMod.Net],
    Personal: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.ethTypesMod.Personal],
    Shh: org.scalablytyped.runtime.Instantiable1[/* provider */ web3Lib.providersMod.Provider, web3Lib.typesMod.Shh]
  ): Anon_Bzz = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Bzz")(Bzz)
    __obj.updateDynamic("Eth")(Eth)
    __obj.updateDynamic("Net")(Net)
    __obj.updateDynamic("Personal")(Personal)
    __obj.updateDynamic("Shh")(Shh)
    __obj.asInstanceOf[Anon_Bzz]
  }
}

