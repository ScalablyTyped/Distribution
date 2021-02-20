package typings.waypoints

import typings.std.HTMLElement
import typings.waypoints.anon.Adapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Waypoint")
  @js.native
  class Waypoint protected ()
    extends typings.waypoints.Waypoint {
    def this(options: WaypointOptions) = this()
  }
  object Waypoint {
    
    @JSGlobal("Waypoint")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Waypoint.Adapter")
    @js.native
    def Adapter: typings.waypoints.WaypointAdapter = js.native
    @scala.inline
    def Adapter_=(x: typings.waypoints.WaypointAdapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Adapter")(x.asInstanceOf[js.Any])
    
    // Waypoint.Context
    /* static member */
    object Context {
      
      @JSGlobal("Waypoint.Context.findByElement")
      @js.native
      def findByElement(element: HTMLElement): js.UndefOr[typings.waypoints.WaypointContext] = js.native
    }
    
    /* static member */
    object adapters {
      
      @JSGlobal("Waypoint.adapters")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("Waypoint.adapters.push")
      @js.native
      def push: Adapter = js.native
      @scala.inline
      def push_=(x: Adapter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("push")(x.asInstanceOf[js.Any])
    }
    
    // actually `null` not string
    // Class Methods
    /* static member */
    @JSGlobal("Waypoint.destroyAll")
    @js.native
    def destroyAll(): Unit = js.native
    
    /* static member */
    @JSGlobal("Waypoint.disableAll")
    @js.native
    def disableAll(): Unit = js.native
    
    /* static member */
    @JSGlobal("Waypoint.enableAll")
    @js.native
    def enableAll(): Unit = js.native
    
    /* static member */
    @JSGlobal("Waypoint.refreshAll")
    @js.native
    def refreshAll(): Unit = js.native
    
    /* static member */
    @JSGlobal("Waypoint.viewportHeight")
    @js.native
    def viewportHeight(): Double = js.native
    
    /* static member */
    @JSGlobal("Waypoint.viewportWidth")
    @js.native
    def viewportWidth(): Double = js.native
  }
  
  @JSGlobal("WaypointAdapter")
  @js.native
  class WaypointAdapter protected ()
    extends typings.waypoints.WaypointAdapter {
    def this(element: HTMLElement) = this()
  }
  object WaypointAdapter {
    
    /* static member */
    @JSGlobal("WaypointAdapter.extend")
    @js.native
    def extend(objects: js.Any*): js.Any = js.native
    
    /* static member */
    @JSGlobal("WaypointAdapter.inArray")
    @js.native
    def inArray(value: js.Any, array: js.Array[_], startIndex: Double): Double = js.native
    
    /* static member */
    @JSGlobal("WaypointAdapter.isEmptyObject")
    @js.native
    def isEmptyObject(`object`: js.Any): Boolean = js.native
  }
  
  @JSGlobal("WaypointContext")
  @js.native
  class WaypointContext ()
    extends typings.waypoints.WaypointContext
  
  @JSGlobal("WaypointGroup")
  @js.native
  class WaypointGroup ()
    extends typings.waypoints.WaypointGroup
}
