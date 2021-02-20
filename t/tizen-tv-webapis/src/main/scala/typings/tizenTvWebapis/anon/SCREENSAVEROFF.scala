package typings.tizenTvWebapis.anon

import typings.tizenTvWebapis.tizenTvWebapisNumbers.`0`
import typings.tizenTvWebapis.tizenTvWebapisNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SCREENSAVEROFF extends StObject {
  
  /**
    * Screensaver off
    * @since 2.3
    */
  var SCREEN_SAVER_OFF: `0` = js.native
  
  /**
    * Screensaver on
    * @since 2.3
    */
  var SCREEN_SAVER_ON: `1` = js.native
}
object SCREENSAVEROFF {
  
  @scala.inline
  def apply(SCREEN_SAVER_OFF: `0`, SCREEN_SAVER_ON: `1`): SCREENSAVEROFF = {
    val __obj = js.Dynamic.literal(SCREEN_SAVER_OFF = SCREEN_SAVER_OFF.asInstanceOf[js.Any], SCREEN_SAVER_ON = SCREEN_SAVER_ON.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCREENSAVEROFF]
  }
  
  @scala.inline
  implicit class SCREENSAVEROFFMutableBuilder[Self <: SCREENSAVEROFF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSCREEN_SAVER_OFF(value: `0`): Self = StObject.set(x, "SCREEN_SAVER_OFF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSCREEN_SAVER_ON(value: `1`): Self = StObject.set(x, "SCREEN_SAVER_ON", value.asInstanceOf[js.Any])
  }
}
