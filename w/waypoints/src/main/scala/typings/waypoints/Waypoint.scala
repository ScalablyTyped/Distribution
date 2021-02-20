package typings.waypoints

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Waypoint extends StObject {
  
  // properties
  var adapter: WaypointAdapter = js.native
  
  var context: WaypointContext = js.native
  
  // Instance Methods
  def destroy(): Waypoint = js.native
  
  def disable(): Waypoint = js.native
  
  var element: HTMLElement = js.native
  
  def enable(): Waypoint = js.native
  
  var group: WaypointGroup = js.native
  
  def next(): Waypoint | String = js.native
  
  var options: WaypointOptions = js.native
  
  // actually `null` not string
  def previous(): Waypoint | String = js.native
  
  var triggerPoint: Double = js.native
}
object Waypoint {
  
  @scala.inline
  def apply(
    adapter: WaypointAdapter,
    context: WaypointContext,
    destroy: () => Waypoint,
    disable: () => Waypoint,
    element: HTMLElement,
    enable: () => Waypoint,
    group: WaypointGroup,
    next: () => Waypoint | String,
    options: WaypointOptions,
    previous: () => Waypoint | String,
    triggerPoint: Double
  ): Waypoint = {
    val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), disable = js.Any.fromFunction0(disable), element = element.asInstanceOf[js.Any], enable = js.Any.fromFunction0(enable), group = group.asInstanceOf[js.Any], next = js.Any.fromFunction0(next), options = options.asInstanceOf[js.Any], previous = js.Any.fromFunction0(previous), triggerPoint = triggerPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Waypoint]
  }
  
  @scala.inline
  implicit class WaypointMutableBuilder[Self <: Waypoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdapter(value: WaypointAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: WaypointContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Waypoint): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: () => Waypoint): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnable(value: () => Waypoint): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGroup(value: WaypointGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => Waypoint | String): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: WaypointOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevious(value: () => Waypoint | String): Self = StObject.set(x, "previous", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTriggerPoint(value: Double): Self = StObject.set(x, "triggerPoint", value.asInstanceOf[js.Any])
  }
}
