package typings.waypoints

import typings.std.HTMLElement
import typings.waypoints.anon.FindByElement
import typings.waypoints.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  class Waypoint protected ()
    extends typings.waypoints.Waypoint {
    def this(options: WaypointOptions) = this()
  }
  /* static members */
  @js.native
  object Waypoint extends js.Object {
    
    var Adapter: typings.waypoints.WaypointAdapter = js.native
    
    // Waypoint.Context
    var Context: FindByElement = js.native
    
    var adapters: Push = js.native
    
     // actually `null` not string
    // Class Methods
    def destroyAll(): Unit = js.native
    
    def disableAll(): Unit = js.native
    
    def enableAll(): Unit = js.native
    
    def refreshAll(): Unit = js.native
    
    def viewportHeight(): Double = js.native
    
    def viewportWidth(): Double = js.native
  }
  
  @js.native
  class WaypointAdapter protected ()
    extends typings.waypoints.WaypointAdapter {
    def this(element: HTMLElement) = this()
  }
  /* static members */
  @js.native
  object WaypointAdapter extends js.Object {
    
    def extend(objects: js.Any*): js.Any = js.native
    
    def inArray(value: js.Any, array: js.Array[_], startIndex: Double): Double = js.native
    
    def isEmptyObject(`object`: js.Any): Boolean = js.native
  }
  
  @js.native
  class WaypointContext ()
    extends typings.waypoints.WaypointContext
  
  @js.native
  class WaypointGroup ()
    extends typings.waypoints.WaypointGroup
}
