package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touch extends js.Object {
  var config: js.Any
  def disable(): scala.Unit
  def enable(): scala.Unit
  def limit(mode: scala.Boolean): scala.Unit
  def scrollTo(node: stdLib.HTMLElement, x: scala.Double, y: scala.Double, speed: java.lang.String): scala.Unit
}

object Touch {
  @scala.inline
  def apply(
    config: js.Any,
    disable: () => scala.Unit,
    enable: () => scala.Unit,
    limit: scala.Boolean => scala.Unit,
    scrollTo: (stdLib.HTMLElement, scala.Double, scala.Double, java.lang.String) => scala.Unit
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config, disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), limit = js.Any.fromFunction1(limit), scrollTo = js.Any.fromFunction4(scrollTo))
  
    __obj.asInstanceOf[Touch]
  }
}

