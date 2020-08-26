package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Scrollable extends js.Object {
  def getScrollState(): js.Any = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
}

object Scrollable {
  @scala.inline
  def apply(getScrollState: () => js.Any, scrollTo: (Double, Double) => Unit): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = js.Any.fromFunction0(getScrollState), scrollTo = js.Any.fromFunction2(scrollTo))
    __obj.asInstanceOf[Scrollable]
  }
  @scala.inline
  implicit class ScrollableOps[Self <: Scrollable] (val x: Self) extends AnyVal {
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
    def setGetScrollState(value: () => js.Any): Self = this.set("getScrollState", js.Any.fromFunction0(value))
    @scala.inline
    def setScrollTo(value: (Double, Double) => Unit): Self = this.set("scrollTo", js.Any.fromFunction2(value))
  }
  
}

