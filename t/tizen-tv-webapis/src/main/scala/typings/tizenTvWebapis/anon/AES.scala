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
trait AES extends js.Object {
  
  /**
    * AES encryption
    */
  var AES: `3` = js.native
  
  /**
    * No encryption
    */
  var NONE: `5` = js.native
  
  /**
    * TKIP encryption
    */
  var TKIP: `2` = js.native
  
  /**
    * TKIP_AES_MIXED encryption
    */
  var TKIP_AES_MIXED: `4` = js.native
  
  /**
    * Encryption type unknown
    */
  var UNKNOWN: `6` = js.native
  
  /**
    * WEP encryption
    */
  var WEP: `1` = js.native
}
object AES {
  
  @scala.inline
  def apply(AES: `3`, NONE: `5`, TKIP: `2`, TKIP_AES_MIXED: `4`, UNKNOWN: `6`, WEP: `1`): AES = {
    val __obj = js.Dynamic.literal(AES = AES.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], TKIP = TKIP.asInstanceOf[js.Any], TKIP_AES_MIXED = TKIP_AES_MIXED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any], WEP = WEP.asInstanceOf[js.Any])
    __obj.asInstanceOf[AES]
  }
  
  @scala.inline
  implicit class AESOps[Self <: AES] (val x: Self) extends AnyVal {
    
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
    def setAES(value: `3`): Self = this.set("AES", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `5`): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP(value: `2`): Self = this.set("TKIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTKIP_AES_MIXED(value: `4`): Self = this.set("TKIP_AES_MIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `6`): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWEP(value: `1`): Self = this.set("WEP", value.asInstanceOf[js.Any])
  }
}
