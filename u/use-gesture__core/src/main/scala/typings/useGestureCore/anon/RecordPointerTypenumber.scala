package typings.useGestureCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Record<@use-gesture/core.@use-gesture/core/dist/declarations/src/types/utils.PointerType, number> */
trait RecordPointerTypenumber extends StObject {
  
  var mouse: Double
  
  var pen: Double
  
  var touch: Double
}
object RecordPointerTypenumber {
  
  inline def apply(mouse: Double, pen: Double, touch: Double): RecordPointerTypenumber = {
    val __obj = js.Dynamic.literal(mouse = mouse.asInstanceOf[js.Any], pen = pen.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordPointerTypenumber]
  }
  
  extension [Self <: RecordPointerTypenumber](x: Self) {
    
    inline def setMouse(value: Double): Self = StObject.set(x, "mouse", value.asInstanceOf[js.Any])
    
    inline def setPen(value: Double): Self = StObject.set(x, "pen", value.asInstanceOf[js.Any])
    
    inline def setTouch(value: Double): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
  }
}
