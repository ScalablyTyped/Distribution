package typings.webdriverio.typesMod

import typings.webdriverio.webdriverioStrings.keyDown
import typings.webdriverio.webdriverioStrings.keyUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyActionEntity extends StObject {
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var `type`: keyUp | keyDown
  
  var value: js.UndefOr[String] = js.undefined
}
object KeyActionEntity {
  
  inline def apply(`type`: keyUp | keyDown): KeyActionEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyActionEntity]
  }
  
  extension [Self <: KeyActionEntity](x: Self) {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setType(value: keyUp | keyDown): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
