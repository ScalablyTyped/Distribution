package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scrollable extends js.Object {
  def getScrollState(): js.Any
  def scrollTo(x: Double, y: Double): Unit
}

object Scrollable {
  @scala.inline
  def apply(getScrollState: () => js.Any, scrollTo: (Double, Double) => Unit): Scrollable = {
    val __obj = js.Dynamic.literal(getScrollState = js.Any.fromFunction0(getScrollState), scrollTo = js.Any.fromFunction2(scrollTo))
    __obj.asInstanceOf[Scrollable]
  }
}

