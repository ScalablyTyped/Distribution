package typings.web3.web3Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.netMod.Socket
import typings.web3DashBzz.web3DashBzzMod.Bzz
import typings.web3DashCore.web3DashCoreMod.provider
import typings.web3DashEth.web3DashEthMod.Eth
import typings.web3DashEthDashPersonal.web3DashEthDashPersonalMod.Personal
import typings.web3DashNet.web3DashNetMod.Network
import typings.web3DashShh.web3DashShhMod.Shh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modules extends js.Object {
  var Bzz: Instantiable1[/* provider */ provider, typings.web3DashBzz.web3DashBzzMod.Bzz]
  var Eth: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3DashEth.web3DashEthMod.Eth]
  var Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network]
  var Personal: Instantiable2[
    /* provider */ provider, 
    /* net */ Socket, 
    typings.web3DashEthDashPersonal.web3DashEthDashPersonalMod.Personal
  ]
  var Shh: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3DashShh.web3DashShhMod.Shh]
}

object Modules {
  @scala.inline
  def apply(
    Bzz: Instantiable1[/* provider */ provider, Bzz],
    Eth: Instantiable2[/* provider */ provider, /* net */ Socket, Eth],
    Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network],
    Personal: Instantiable2[/* provider */ provider, /* net */ Socket, Personal],
    Shh: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]
  ): Modules = {
    val __obj = js.Dynamic.literal(Bzz = Bzz, Eth = Eth, Net = Net, Personal = Personal, Shh = Shh)
  
    __obj.asInstanceOf[Modules]
  }
}

