package typings.winrtUwp.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WinRTEvent[TSender] extends StObject {
  
  var detail: js.Array[js.Any]
  
  var target: TSender
  
  var `type`: String
}
object WinRTEvent {
  
  @scala.inline
  def apply[TSender](detail: js.Array[js.Any], target: TSender, `type`: String): WinRTEvent[TSender] = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WinRTEvent[TSender]]
  }
  
  @scala.inline
  implicit class WinRTEventMutableBuilder[Self <: WinRTEvent[?], TSender] (val x: Self & WinRTEvent[TSender]) extends AnyVal {
    
    @scala.inline
    def setDetail(value: js.Array[js.Any]): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailVarargs(value: js.Any*): Self = StObject.set(x, "detail", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: TSender): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
