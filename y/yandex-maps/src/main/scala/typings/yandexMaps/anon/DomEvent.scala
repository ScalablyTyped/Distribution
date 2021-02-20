package typings.yandexMaps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEvent[OriginalEvent, TargetGeometry] extends StObject {
  
  var domEvent: OriginalEventOriginalEvent[OriginalEvent] = js.native
  
  var target: Geometry[TargetGeometry] = js.native
}
object DomEvent {
  
  @scala.inline
  def apply[OriginalEvent, TargetGeometry](domEvent: OriginalEventOriginalEvent[OriginalEvent], target: Geometry[TargetGeometry]): DomEvent[OriginalEvent, TargetGeometry] = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEvent[OriginalEvent, TargetGeometry]]
  }
  
  @scala.inline
  implicit class DomEventMutableBuilder[Self <: DomEvent[_, _], OriginalEvent, TargetGeometry] (val x: Self with (DomEvent[OriginalEvent, TargetGeometry])) extends AnyVal {
    
    @scala.inline
    def setDomEvent(value: OriginalEventOriginalEvent[OriginalEvent]): Self = StObject.set(x, "domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Geometry[TargetGeometry]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
