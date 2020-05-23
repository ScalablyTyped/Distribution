package typings.waypoints

import typings.waypoints.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WaypointAdapter extends js.Object {
  def innerHeight(): Double
  def innerWidth(): Double
  def off(event: String): js.UndefOr[scala.Nothing]
  def offset(): Left
  def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing]
  def outerHeight(includeMargin: Boolean): Double
  def outerWidth(includeMargin: Boolean): Double
  def scrollLeft(): Double
  def scrollTop(): Double
}

object WaypointAdapter {
  @scala.inline
  def apply(
    innerHeight: () => Double,
    innerWidth: () => Double,
    off: String => js.UndefOr[scala.Nothing],
    offset: () => Left,
    on: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing],
    outerHeight: Boolean => Double,
    outerWidth: Boolean => Double,
    scrollLeft: () => Double,
    scrollTop: () => Double
  ): WaypointAdapter = {
    val __obj = js.Dynamic.literal(innerHeight = js.Any.fromFunction0(innerHeight), innerWidth = js.Any.fromFunction0(innerWidth), off = js.Any.fromFunction1(off), offset = js.Any.fromFunction0(offset), on = js.Any.fromFunction2(on), outerHeight = js.Any.fromFunction1(outerHeight), outerWidth = js.Any.fromFunction1(outerWidth), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollTop = js.Any.fromFunction0(scrollTop))
    __obj.asInstanceOf[WaypointAdapter]
  }
}

