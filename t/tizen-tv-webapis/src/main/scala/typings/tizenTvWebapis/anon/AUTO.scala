package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`2`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`3`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`4`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUTO extends js.Object {
  
  /**
    *  DHCP: Connected to wired or wireless IPv4 network through automatic IP configuration
    */
  var AUTO: `3` = js.native
  
  /**
    * Connected to wired or wireless IPv6 network through dynamic IP configuration
    */
  var DYNAMIC: `2` = js.native
  
  /**
    * Connected to cellular network through fixed IP configuration
    */
  var FIXED: `4` = js.native
  
  /**
    * No network IP mode configured
    */
  var NONE: `0` = js.native
  
  /**
    * Connected to wired or wireless IPv4 network through static IP configuration
    */
  var STATIC: `1` = js.native
  
  /**
    * No wired or wireless connection
    */
  var UNKNOWN: `5` = js.native
}
object AUTO {
  
  @scala.inline
  def apply(AUTO: `3`, DYNAMIC: `2`, FIXED: `4`, NONE: `0`, STATIC: `1`, UNKNOWN: `5`): AUTO = {
    val __obj = js.Dynamic.literal(AUTO = AUTO.asInstanceOf[js.Any], DYNAMIC = DYNAMIC.asInstanceOf[js.Any], FIXED = FIXED.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], STATIC = STATIC.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTO]
  }
  
  @scala.inline
  implicit class AUTOOps[Self <: AUTO] (val x: Self) extends AnyVal {
    
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
    def setAUTO(value: `3`): Self = this.set("AUTO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDYNAMIC(value: `2`): Self = this.set("DYNAMIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFIXED(value: `4`): Self = this.set("FIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: `0`): Self = this.set("NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSTATIC(value: `1`): Self = this.set("STATIC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: `5`): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
}
