package typings.web3

import org.scalablytyped.runtime.Instantiable1
import typings.web3.ethMod.Eth
import typings.web3.ethTypesMod.Net
import typings.web3.ethTypesMod.Personal
import typings.web3.providersMod.Provider
import typings.web3.typesMod.Bzz
import typings.web3.typesMod.Shh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bzz extends js.Object {
  var Bzz: Instantiable1[/* provider */ Provider, typings.web3.typesMod.Bzz]
  var Eth: Instantiable1[/* provider */ Provider, typings.web3.ethMod.Eth]
  var Net: Instantiable1[/* provider */ Provider, typings.web3.ethTypesMod.Net]
  var Personal: Instantiable1[/* provider */ Provider, typings.web3.ethTypesMod.Personal]
  var Shh: Instantiable1[/* provider */ Provider, typings.web3.typesMod.Shh]
}

object Anon_Bzz {
  @scala.inline
  def apply(
    Bzz: Instantiable1[/* provider */ Provider, Bzz],
    Eth: Instantiable1[/* provider */ Provider, Eth],
    Net: Instantiable1[/* provider */ Provider, Net],
    Personal: Instantiable1[/* provider */ Provider, Personal],
    Shh: Instantiable1[/* provider */ Provider, Shh]
  ): Anon_Bzz = {
    val __obj = js.Dynamic.literal(Bzz = Bzz, Eth = Eth, Net = Net, Personal = Personal, Shh = Shh)
  
    __obj.asInstanceOf[Anon_Bzz]
  }
}

