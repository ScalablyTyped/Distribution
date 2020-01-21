package typings.waypoints

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WaypointAdapter")
@js.native
class WaypointAdapter protected () extends js.Object {
  def this(element: HTMLElement) = this()
  def innerHeight(): Double = js.native
  def innerWidth(): Double = js.native
  def off(event: String): js.UndefOr[scala.Nothing] = js.native
  def offset(): AnonLeft = js.native
  def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  def outerHeight(includeMargin: Boolean): Double = js.native
  def outerWidth(includeMargin: Boolean): Double = js.native
  def scrollLeft(): Double = js.native
  def scrollTop(): Double = js.native
}

/* static members */
@JSGlobal("WaypointAdapter")
@js.native
object WaypointAdapter extends js.Object {
  def extend(objects: js.Any*): js.Any = js.native
  def inArray(value: js.Any, array: js.Array[_], startIndex: Double): Double = js.native
  def isEmptyObject(`object`: js.Any): Boolean = js.native
}

