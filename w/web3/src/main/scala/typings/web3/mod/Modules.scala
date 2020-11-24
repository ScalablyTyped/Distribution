package typings.web3.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.netMod.Socket
import typings.web3Bzz.mod.Bzz
import typings.web3Core.mod.provider
import typings.web3Eth.mod.Eth
import typings.web3EthPersonal.mod.Personal
import typings.web3Net.mod.Network
import typings.web3Shh.mod.Shh
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Modules extends js.Object {
  
  var Bzz: Instantiable1[/* provider */ provider, typings.web3Bzz.mod.Bzz] = js.native
  
  var Eth: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3Eth.mod.Eth] = js.native
  
  var Net: Instantiable2[/* provider */ provider, /* net */ Socket, Network] = js.native
  
  var Personal: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3EthPersonal.mod.Personal] = js.native
  
  var Shh: Instantiable2[/* provider */ provider, /* net */ Socket, typings.web3Shh.mod.Shh] = js.native
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
    val __obj = js.Dynamic.literal(Bzz = Bzz.asInstanceOf[js.Any], Eth = Eth.asInstanceOf[js.Any], Net = Net.asInstanceOf[js.Any], Personal = Personal.asInstanceOf[js.Any], Shh = Shh.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modules]
  }
  
  @scala.inline
  implicit class ModulesOps[Self <: Modules] (val x: Self) extends AnyVal {
    
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
    def setBzz(value: Instantiable1[/* provider */ provider, Bzz]): Self = this.set("Bzz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEth(value: Instantiable2[/* provider */ provider, /* net */ Socket, Eth]): Self = this.set("Eth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNet(value: Instantiable2[/* provider */ provider, /* net */ Socket, Network]): Self = this.set("Net", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPersonal(value: Instantiable2[/* provider */ provider, /* net */ Socket, Personal]): Self = this.set("Personal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShh(value: Instantiable2[/* provider */ provider, /* net */ Socket, Shh]): Self = this.set("Shh", value.asInstanceOf[js.Any])
  }
}
