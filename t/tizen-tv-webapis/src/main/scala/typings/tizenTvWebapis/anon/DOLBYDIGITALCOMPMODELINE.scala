package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOLBYDIGITALCOMPMODELINE extends StObject {
  
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
  implicit class DOLBYDIGITALCOMPMODELINEMutableBuilder[Self <: DOLBYDIGITALCOMPMODELINE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDOLBY_DIGITAL_COMP_MODE_LINE(value: `0`): Self = StObject.set(x, "DOLBY_DIGITAL_COMP_MODE_LINE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOLBY_DIGITAL_COMP_MODE_RF(value: `1`): Self = StObject.set(x, "DOLBY_DIGITAL_COMP_MODE_RF", value.asInstanceOf[js.Any])
  }
}
