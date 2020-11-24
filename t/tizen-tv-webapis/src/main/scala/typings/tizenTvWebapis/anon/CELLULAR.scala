package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CELLULAR extends js.Object {
  
  /**
    * Connected to a cellular network.
    */
  var CELLULAR: `2` = js.native
  
  /**
    * No network configured
    */
  var DISCONNECTED: `0` = js.native
  
  /**
    * Connected to an Ethernet network.
    */
  var ETHERNET: `3` = js.native
  
  /**
    * Connected to a Wi-Fi network.
    */
  var WIFI: `1` = js.native
}
object CELLULAR {
  
  @scala.inline
  def apply(CELLULAR: `2`, DISCONNECTED: `0`, ETHERNET: `3`, WIFI: `1`): CELLULAR = {
    val __obj = js.Dynamic.literal(CELLULAR = CELLULAR.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ETHERNET = ETHERNET.asInstanceOf[js.Any], WIFI = WIFI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CELLULAR]
  }
  
  @scala.inline
  implicit class CELLULAROps[Self <: CELLULAR] (val x: Self) extends AnyVal {
    
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
    def setCELLULAR(value: `2`): Self = this.set("CELLULAR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISCONNECTED(value: `0`): Self = this.set("DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setETHERNET(value: `3`): Self = this.set("ETHERNET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWIFI(value: `1`): Self = this.set("WIFI", value.asInstanceOf[js.Any])
  }
}
