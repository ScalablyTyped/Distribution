package typings.waypoints

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WaypointGroup extends StObject {
  
  var axis: String = js.native
  
  def first(): Waypoint = js.native
  
  def last(): Waypoint = js.native
  
  var name: String = js.native
  
  var waypoints: js.Array[Waypoint] = js.native
}
object WaypointGroup {
  
  @scala.inline
  def apply(
    axis: String,
    first: () => Waypoint,
    last: () => Waypoint,
    name: String,
    waypoints: js.Array[Waypoint]
  ): WaypointGroup = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], first = js.Any.fromFunction0(first), last = js.Any.fromFunction0(last), name = name.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaypointGroup]
  }
  
  @scala.inline
  implicit class WaypointGroupMutableBuilder[Self <: WaypointGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst(value: () => Waypoint): Self = StObject.set(x, "first", js.Any.fromFunction0(value))
    
    @scala.inline
    def setLast(value: () => Waypoint): Self = StObject.set(x, "last", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypoints(value: js.Array[Waypoint]): Self = StObject.set(x, "waypoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaypointsVarargs(value: Waypoint*): Self = StObject.set(x, "waypoints", js.Array(value :_*))
  }
}
