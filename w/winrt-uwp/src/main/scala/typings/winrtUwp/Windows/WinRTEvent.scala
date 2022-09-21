package typings.winrtUwp.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WinRTEvent[TSender] extends StObject {
  
  var detail: js.Array[Any]
  
  var target: TSender
  
  var `type`: String
}
object WinRTEvent {
  
  inline def apply[TSender](detail: js.Array[Any], target: TSender, `type`: String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
  
  extension [Self <: WinRTEvent[?], TSender](x: Self & WinRTEvent[TSender]) {
    
    inline def setDetail(value: js.Array[Any]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailVarargs(value: Any*): Self = StObject.set(x, "detail", js.Array(value*))
    
    inline def setTarget(value: TSender): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
