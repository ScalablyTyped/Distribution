package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomEvent[OriginalEvent, TargetGeometry] extends StObject {
  
  var domEvent: OriginalEventOriginalEvent[OriginalEvent]
  
  var target: Geometry[TargetGeometry]
}
object DomEvent {
  
  inline def apply[OriginalEvent, TargetGeometry](domEvent: OriginalEventOriginalEvent[OriginalEvent], target: Geometry[TargetGeometry]): DomEvent[OriginalEvent, TargetGeometry] = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent[OriginalEvent, TargetGeometry]]
  }
  
  extension [Self <: DomEvent[?, ?], OriginalEvent, TargetGeometry](x: Self & (DomEvent[OriginalEvent, TargetGeometry])) {
    
    inline def setDomEvent(value: OriginalEventOriginalEvent[OriginalEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Geometry[TargetGeometry]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
