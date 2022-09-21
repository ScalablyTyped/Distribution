package typings.webostvjs.mod

import typings.webostvjs.anon.Start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaOptionsTransmission extends StObject {
  
  var playTime: js.UndefOr[Start] = js.undefined
}
object MediaOptionsTransmission {
  
  inline def apply(): MediaOptionsTransmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaOptionsTransmission]
  }
  
  extension [Self <: MediaOptionsTransmission](x: Self) {
    
    inline def setPlayTime(value: Start): Self = StObject.set(x, "playTime", value.asInstanceOf[js.Any])
    
    inline def setPlayTimeUndefined: Self = StObject.set(x, "playTime", js.undefined)
  }
}
