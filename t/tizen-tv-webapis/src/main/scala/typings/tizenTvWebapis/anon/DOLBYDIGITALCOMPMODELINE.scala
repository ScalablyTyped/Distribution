package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOLBYDIGITALCOMPMODELINE extends js.Object {
  
  /**
    * line mode
    * @since 2.3
    */
  var DOLBY_DIGITAL_COMP_MODE_LINE: `0` = js.native
  
  /**
    * rf mode
    * @since 2.3
    */
  var DOLBY_DIGITAL_COMP_MODE_RF: `1` = js.native
}
object DOLBYDIGITALCOMPMODELINE {
  
  @scala.inline
  def apply(DOLBY_DIGITAL_COMP_MODE_LINE: `0`, DOLBY_DIGITAL_COMP_MODE_RF: `1`): DOLBYDIGITALCOMPMODELINE = {
    val __obj = js.Dynamic.literal(DOLBY_DIGITAL_COMP_MODE_LINE = DOLBY_DIGITAL_COMP_MODE_LINE.asInstanceOf[js.Any], DOLBY_DIGITAL_COMP_MODE_RF = DOLBY_DIGITAL_COMP_MODE_RF.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOLBYDIGITALCOMPMODELINE]
  }
  
  @scala.inline
  implicit class DOLBYDIGITALCOMPMODELINEOps[Self <: DOLBYDIGITALCOMPMODELINE] (val x: Self) extends AnyVal {
    
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
    def setDOLBY_DIGITAL_COMP_MODE_LINE(value: `0`): Self = this.set("DOLBY_DIGITAL_COMP_MODE_LINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOLBY_DIGITAL_COMP_MODE_RF(value: `1`): Self = this.set("DOLBY_DIGITAL_COMP_MODE_RF", value.asInstanceOf[js.Any])
  }
}
