package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EaseToOptions
  extends StObject
     with AnimationOptions
     with CameraOptions {
  
  var delayEndEvents: js.UndefOr[Double] = js.undefined
}
object EaseToOptions {
  
  inline def apply(): EaseToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseToOptions]
  }
  
  extension [Self <: EaseToOptions](x: Self) {
    
    inline def setDelayEndEvents(value: Double): Self = StObject.set(x, "delayEndEvents", value.asInstanceOf[js.Any])
    
    inline def setDelayEndEventsUndefined: Self = StObject.set(x, "delayEndEvents", js.undefined)
  }
}
