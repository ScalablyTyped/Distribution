package typings.webdriverio.typesMod

import typings.webdriverio.webdriverioStrings.pause
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoneActionEntity extends StObject {
  
  var duration: Double
  
  var `type`: pause
}
object NoneActionEntity {
  
  inline def apply(duration: Double): NoneActionEntity = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pause")
    __obj.asInstanceOf[NoneActionEntity]
  }
  
  extension [Self <: NoneActionEntity](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setType(value: pause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
