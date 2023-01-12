package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DurationChangeEvent extends StObject {
  
  var duration: Double
}
object DurationChangeEvent {
  
  inline def apply(duration: Double): DurationChangeEvent = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DurationChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}
