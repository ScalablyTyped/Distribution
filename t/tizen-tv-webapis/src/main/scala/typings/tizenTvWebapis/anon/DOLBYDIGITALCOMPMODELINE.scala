package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOLBYDIGITALCOMPMODELINE extends StObject {
  
  /**
    * line mode
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var DOLBY_DIGITAL_COMP_MODE_LINE: `0`
  
  /**
    * rf mode
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var DOLBY_DIGITAL_COMP_MODE_RF: `1`
}
object DOLBYDIGITALCOMPMODELINE {
  
  inline def apply(): DOLBYDIGITALCOMPMODELINE = {
    val __obj = js.Dynamic.literal(DOLBY_DIGITAL_COMP_MODE_LINE = 0, DOLBY_DIGITAL_COMP_MODE_RF = 1)
    __obj.asInstanceOf[DOLBYDIGITALCOMPMODELINE]
  }
  
  extension [Self <: DOLBYDIGITALCOMPMODELINE](x: Self) {
    
    inline def setDOLBY_DIGITAL_COMP_MODE_LINE(value: `0`): Self = StObject.set(x, "DOLBY_DIGITAL_COMP_MODE_LINE", value.asInstanceOf[js.Any])
    
    inline def setDOLBY_DIGITAL_COMP_MODE_RF(value: `1`): Self = StObject.set(x, "DOLBY_DIGITAL_COMP_MODE_RF", value.asInstanceOf[js.Any])
  }
}
