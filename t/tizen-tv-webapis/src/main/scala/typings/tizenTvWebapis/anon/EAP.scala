package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EAP extends js.Object {
  
  /**
    * EAP security mode
    */
  var EAP: `4` = js.native
  
  /**
    * Open security mode
    */
  var NONE: `5` = js.native
  
  /**
    * Security mode unknown
    */
  var UNKNOWN: `6` = js.native
  
  /**
    * WEP security mode
    */
  var WEP: `1` = js.native
  
  /**
    * WPA2_PSK security mode
    */
  var WPA2_PSK: `3` = js.native
  
  /**
    * PSK security mode
    */
  var WPA_PSK: `2` = js.native
}
object EAP {
  
  @scala.inline
  def apply(EAP: `4`, NONE: `5`, UNKNOWN: `6`, WEP: `1`, WPA2_PSK: `3`, WPA_PSK: `2`): EAP = {
    val __obj = js.Dynamic.literal(EAP = EAP.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WEP = WEP.asInstanceOf[js.Any], WPA2_PSK = WPA2_PSK.asInstanceOf[js.Any], WPA_PSK = WPA_PSK.asInstanceOf[js.Any])
    __obj.asInstanceOf[EAP]
  }
  
  @scala.inline
  implicit class EAPOps[Self <: EAP] (val x: Self) extends AnyVal {
    
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
    def setEAP(value: `4`): Self = this.set("EAP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `5`): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `6`): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEP(value: `1`): Self = this.set("WEP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWPA2_PSK(value: `3`): Self = this.set("WPA2_PSK", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWPA_PSK(value: `2`): Self = this.set("WPA_PSK", value.asInstanceOf[js.Any])
  }
}
