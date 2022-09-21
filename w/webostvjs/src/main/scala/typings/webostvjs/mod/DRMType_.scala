package typings.webostvjs.mod

import typings.webostvjs.webostvjsStrings.PLAYREADY
import typings.webostvjs.webostvjsStrings.WIDEVINE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DRMType_ extends StObject {
  
  var PLAYREADY: typings.webostvjs.webostvjsStrings.PLAYREADY
  
  var WIDEVINE: typings.webostvjs.webostvjsStrings.WIDEVINE
}
object DRMType_ {
  
  inline def apply(): DRMType_ = {
    val __obj = js.Dynamic.literal(PLAYREADY = "PLAYREADY", WIDEVINE = "WIDEVINE")
    __obj.asInstanceOf[DRMType_]
  }
  
  extension [Self <: DRMType_](x: Self) {
    
    inline def setPLAYREADY(value: PLAYREADY): Self = StObject.set(x, "PLAYREADY", value.asInstanceOf[js.Any])
    
    inline def setWIDEVINE(value: WIDEVINE): Self = StObject.set(x, "WIDEVINE", value.asInstanceOf[js.Any])
  }
}
