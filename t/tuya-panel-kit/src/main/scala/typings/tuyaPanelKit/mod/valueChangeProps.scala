package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait valueChangeProps extends StObject {
  
  var hour: Double
  
  var minute: Double
  
  var value: Double
}
object valueChangeProps {
  
  @scala.inline
  def apply(hour: Double, minute: Double, value: Double): valueChangeProps = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[valueChangeProps]
  }
  
  @scala.inline
  implicit class valueChangePropsMutableBuilder[Self <: valueChangeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
