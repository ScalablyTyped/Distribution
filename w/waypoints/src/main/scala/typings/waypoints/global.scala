package typings.waypoints

import typings.std.HTMLElement
import typings.std.Window
import typings.waypoints.anon.FindByElement
import typings.waypoints.anon.Horizontal
import typings.waypoints.anon.Left
import typings.waypoints.anon.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class Waypoint protected ()
    extends typings.waypoints.Waypoint {
    def this(options: WaypointOptions) = this()
    // properties
    /* CompleteClass */
    override var adapter: typings.waypoints.WaypointAdapter = js.native
    /* CompleteClass */
    override var context: typings.waypoints.WaypointContext = js.native
    /* CompleteClass */
    override var element: HTMLElement = js.native
    /* CompleteClass */
    override var group: typings.waypoints.WaypointGroup = js.native
    /* CompleteClass */
    override var options: WaypointOptions = js.native
    /* CompleteClass */
    override var triggerPoint: Double = js.native
    // Instance Methods
    /* CompleteClass */
    override def destroy(): typings.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def disable(): typings.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def enable(): typings.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def next(): typings.waypoints.Waypoint | String = js.native
     // actually `null` not string
    /* CompleteClass */
    override def previous(): typings.waypoints.Waypoint | String = js.native
  }
  
  @js.native
  class WaypointAdapter protected ()
    extends typings.waypoints.WaypointAdapter {
    def this(element: HTMLElement) = this()
    /* CompleteClass */
    override def innerHeight(): Double = js.native
    /* CompleteClass */
    override def innerWidth(): Double = js.native
    /* CompleteClass */
    override def off(event: String): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def offset(): Left = js.native
    /* CompleteClass */
    override def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
    /* CompleteClass */
    override def outerHeight(includeMargin: Boolean): Double = js.native
    /* CompleteClass */
    override def outerWidth(includeMargin: Boolean): Double = js.native
    /* CompleteClass */
    override def scrollLeft(): Double = js.native
    /* CompleteClass */
    override def scrollTop(): Double = js.native
  }
  
  @js.native
  class WaypointContext ()
    extends typings.waypoints.WaypointContext {
    /* CompleteClass */
    override var adapter: typings.waypoints.WaypointAdapter = js.native
    /* CompleteClass */
    override var element: HTMLElement | Window = js.native
    /* CompleteClass */
    override var waypoints: Horizontal = js.native
     // http://imakewebthings.com/waypoints/api/context/#waypoints-property
    /* CompleteClass */
    override def destroy(): typings.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def refresh(): typings.waypoints.Waypoint = js.native
  }
  
  @js.native
  class WaypointGroup ()
    extends typings.waypoints.WaypointGroup {
    /* CompleteClass */
    override var axis: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var waypoints: js.Array[typings.waypoints.Waypoint] = js.native
    /* CompleteClass */
    override def first(): typings.waypoints.Waypoint = js.native
    /* CompleteClass */
    override def last(): typings.waypoints.Waypoint = js.native
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
  
  /* static members */
  @js.native
  object WaypointAdapter extends js.Object {
    def extend(objects: js.Any*): js.Any = js.native
    def inArray(value: js.Any, array: js.Array[_], startIndex: Double): Double = js.native
    def isEmptyObject(`object`: js.Any): Boolean = js.native
  }
  
}

