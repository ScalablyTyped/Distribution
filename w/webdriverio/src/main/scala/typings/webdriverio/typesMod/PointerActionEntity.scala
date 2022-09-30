package typings.webdriverio.typesMod

import typings.webdriverio.webdriverioStrings.pause
import typings.webdriverio.webdriverioStrings.pointerCancel
import typings.webdriverio.webdriverioStrings.pointerDown
import typings.webdriverio.webdriverioStrings.pointerMove
import typings.webdriverio.webdriverioStrings.pointerUp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointerActionEntity extends StObject {
  
  var button: js.UndefOr[Double] = js.undefined
  
  var duration: js.UndefOr[Double] = js.undefined
  
  var `type`: pointerMove | pointerDown | pointerUp | pointerCancel | pause
  
  var x: js.UndefOr[Double] = js.undefined
  
  var y: js.UndefOr[Double] = js.undefined
}
object PointerActionEntity {
  
  inline def apply(`type`: pointerMove | pointerDown | pointerUp | pointerCancel | pause): PointerActionEntity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointerActionEntity]
  }
  
  extension [Self <: PointerActionEntity](x: Self) {
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setType(value: pointerMove | pointerDown | pointerUp | pointerCancel | pause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
