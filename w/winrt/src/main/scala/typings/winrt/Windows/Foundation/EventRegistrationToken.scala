package typings.winrt.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventRegistrationToken extends StObject {
  
  var value: Double
}
object EventRegistrationToken {
  
  @scala.inline
  def apply(value: Double): EventRegistrationToken = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventRegistrationToken]
  }
  
  @scala.inline
  implicit class EventRegistrationTokenMutableBuilder[Self <: EventRegistrationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
