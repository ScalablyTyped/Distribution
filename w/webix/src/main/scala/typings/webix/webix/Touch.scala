package typings.webix.webix

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var config: js.Any
  def disable(): Unit
  def enable(): Unit
  def limit(mode: Boolean): Unit
  def scrollTo(node: HTMLElement, x: Double, y: Double, speed: String): Unit
}

object Touch {
  @scala.inline
  def apply(
    config: js.Any,
    disable: () => Unit,
    enable: () => Unit,
    limit: Boolean => Unit,
    scrollTo: (HTMLElement, Double, Double, String) => Unit
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), limit = js.Any.fromFunction1(limit), scrollTo = js.Any.fromFunction4(scrollTo))
    __obj.asInstanceOf[Touch]
  }
}

