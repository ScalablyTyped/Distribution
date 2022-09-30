package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisInts.`0`
import typings.tizenTvWebapis.tizenTvWebapisInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SCREENSAVEROFF extends StObject {
  
  /**
    * Screensaver off
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var SCREEN_SAVER_OFF: `0`
  
  /**
    * Screensaver on
    *
    * @version 1.0
    *
    * @since 2.3
    */
  var SCREEN_SAVER_ON: `1`
}
object SCREENSAVEROFF {
  
  inline def apply(): SCREENSAVEROFF = {
    val __obj = js.Dynamic.literal(SCREEN_SAVER_OFF = 0, SCREEN_SAVER_ON = 1)
    __obj.asInstanceOf[SCREENSAVEROFF]
  }
  
  extension [Self <: SCREENSAVEROFF](x: Self) {
    
    inline def setSCREEN_SAVER_OFF(value: `0`): Self = StObject.set(x, "SCREEN_SAVER_OFF", value.asInstanceOf[js.Any])
    
    inline def setSCREEN_SAVER_ON(value: `1`): Self = StObject.set(x, "SCREEN_SAVER_ON", value.asInstanceOf[js.Any])
  }
}
