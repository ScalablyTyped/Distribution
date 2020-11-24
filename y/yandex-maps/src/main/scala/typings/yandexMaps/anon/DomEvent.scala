package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DomEvent[OriginalEvent, TargetGeometry] extends js.Object {
  
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
  implicit class DomEventOps[Self <: DomEvent[_, _], OriginalEvent, TargetGeometry] (val x: Self with (DomEvent[OriginalEvent, TargetGeometry])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomEvent(value: OriginalEventOriginalEvent[OriginalEvent]): Self = this.set("domEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Geometry[TargetGeometry]): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}
