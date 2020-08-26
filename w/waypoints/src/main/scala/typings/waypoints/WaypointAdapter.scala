package typings.waypoints

import typings.waypoints.anon.Left
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaypointAdapter extends js.Object {
  def innerHeight(): Double = js.native
  def innerWidth(): Double = js.native
  def off(event: String): js.UndefOr[scala.Nothing] = js.native
  def offset(): Left = js.native
  def on(event: String, handler: js.Function0[Unit]): js.UndefOr[scala.Nothing] = js.native
  def outerHeight(includeMargin: Boolean): Double = js.native
  def outerWidth(includeMargin: Boolean): Double = js.native
  def scrollLeft(): Double = js.native
  def scrollTop(): Double = js.native
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
  @scala.inline
  implicit class WaypointAdapterOps[Self <: WaypointAdapter] (val x: Self) extends AnyVal {
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
    def setInnerHeight(value: () => Double): Self = this.set("innerHeight", js.Any.fromFunction0(value))
    @scala.inline
    def setInnerWidth(value: () => Double): Self = this.set("innerWidth", js.Any.fromFunction0(value))
    @scala.inline
    def setOff(value: String => js.UndefOr[scala.Nothing]): Self = this.set("off", js.Any.fromFunction1(value))
    @scala.inline
    def setOffset(value: () => Left): Self = this.set("offset", js.Any.fromFunction0(value))
    @scala.inline
    def setOn(value: (String, js.Function0[Unit]) => js.UndefOr[scala.Nothing]): Self = this.set("on", js.Any.fromFunction2(value))
    @scala.inline
    def setOuterHeight(value: Boolean => Double): Self = this.set("outerHeight", js.Any.fromFunction1(value))
    @scala.inline
    def setOuterWidth(value: Boolean => Double): Self = this.set("outerWidth", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollLeft(value: () => Double): Self = this.set("scrollLeft", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollTop(value: () => Double): Self = this.set("scrollTop", js.Any.fromFunction0(value))
  }
  
}

