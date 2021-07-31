package typings.tuyaPanelKit.anon

import typings.std.Extract
import typings.tuyaPanelKit.typesMod.EventMapBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetTypeEventName[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] extends StObject {
  
  var target: js.UndefOr[String] = js.undefined
  
  var `type`: EventName
}
object TargetTypeEventName {
  
  @scala.inline
  def apply[EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */](`type`: EventName): TargetTypeEventName[EventName, EventMap] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetTypeEventName[EventName, EventMap]]
  }
  
  @scala.inline
  implicit class TargetTypeEventNameMutableBuilder[Self <: TargetTypeEventName[?, ?], EventName /* <: Extract[/* keyof EventMap */ String, String] */, EventMap /* <: EventMapBase */] (val x: Self & (TargetTypeEventName[EventName, EventMap])) extends AnyVal {
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
