package typings.web3Utils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Units extends js.Object {
  
  var Gwei: String = js.native
  
  var Kwei: String = js.native
  
  var Mwei: String = js.native
  
  var babbage: String = js.native
  
  var ether: String = js.native
  
  var femtoether: String = js.native
  
  var finney: String = js.native
  
  var gether: String = js.native
  
  var grand: String = js.native
  
  var gwei: String = js.native
  
  var kether: String = js.native
  
  var kwei: String = js.native
  
  var lovelace: String = js.native
  
  var mether: String = js.native
  
  var micro: String = js.native
  
  var microether: String = js.native
  
  var milli: String = js.native
  
  var milliether: String = js.native
  
  var mwei: String = js.native
  
  var nano: String = js.native
  
  var nanoether: String = js.native
  
  var noether: String = js.native
  
  var picoether: String = js.native
  
  var shannon: String = js.native
  
  var szabo: String = js.native
  
  var tether: String = js.native
  
  var wei: String = js.native
}
object Units {
  
  @scala.inline
  def apply(
    Gwei: String,
    Kwei: String,
    Mwei: String,
    babbage: String,
    ether: String,
    femtoether: String,
    finney: String,
    gether: String,
    grand: String,
    gwei: String,
    kether: String,
    kwei: String,
    lovelace: String,
    mether: String,
    micro: String,
    microether: String,
    milli: String,
    milliether: String,
    mwei: String,
    nano: String,
    nanoether: String,
    noether: String,
    picoether: String,
    shannon: String,
    szabo: String,
    tether: String,
    wei: String
  ): Units = {
    val __obj = js.Dynamic.literal(Gwei = Gwei.asInstanceOf[js.Any], Kwei = Kwei.asInstanceOf[js.Any], Mwei = Mwei.asInstanceOf[js.Any], babbage = babbage.asInstanceOf[js.Any], ether = ether.asInstanceOf[js.Any], femtoether = femtoether.asInstanceOf[js.Any], finney = finney.asInstanceOf[js.Any], gether = gether.asInstanceOf[js.Any], grand = grand.asInstanceOf[js.Any], gwei = gwei.asInstanceOf[js.Any], kether = kether.asInstanceOf[js.Any], kwei = kwei.asInstanceOf[js.Any], lovelace = lovelace.asInstanceOf[js.Any], mether = mether.asInstanceOf[js.Any], micro = micro.asInstanceOf[js.Any], microether = microether.asInstanceOf[js.Any], milli = milli.asInstanceOf[js.Any], milliether = milliether.asInstanceOf[js.Any], mwei = mwei.asInstanceOf[js.Any], nano = nano.asInstanceOf[js.Any], nanoether = nanoether.asInstanceOf[js.Any], noether = noether.asInstanceOf[js.Any], picoether = picoether.asInstanceOf[js.Any], shannon = shannon.asInstanceOf[js.Any], szabo = szabo.asInstanceOf[js.Any], tether = tether.asInstanceOf[js.Any], wei = wei.asInstanceOf[js.Any])
    __obj.asInstanceOf[Units]
  }
  
  @scala.inline
  implicit class UnitsOps[Self <: Units] (val x: Self) extends AnyVal {
    
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
    def setGwei(value: String): Self = this.set("Gwei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKwei(value: String): Self = this.set("Kwei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMwei(value: String): Self = this.set("Mwei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBabbage(value: String): Self = this.set("babbage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEther(value: String): Self = this.set("ether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFemtoether(value: String): Self = this.set("femtoether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinney(value: String): Self = this.set("finney", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGether(value: String): Self = this.set("gether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrand(value: String): Self = this.set("grand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKether(value: String): Self = this.set("kether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLovelace(value: String): Self = this.set("lovelace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMether(value: String): Self = this.set("mether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicro(value: String): Self = this.set("micro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMicroether(value: String): Self = this.set("microether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilli(value: String): Self = this.set("milli", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMilliether(value: String): Self = this.set("milliether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNano(value: String): Self = this.set("nano", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNanoether(value: String): Self = this.set("nanoether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoether(value: String): Self = this.set("noether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPicoether(value: String): Self = this.set("picoether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShannon(value: String): Self = this.set("shannon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSzabo(value: String): Self = this.set("szabo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTether(value: String): Self = this.set("tether", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWei(value: String): Self = this.set("wei", value.asInstanceOf[js.Any])
  }
}
