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
    disable: js.Function0[scala.Unit],
    enable: js.Function0[scala.Unit],
    limit: js.Function1[scala.Boolean, scala.Unit],
    scrollTo: js.Function4[stdLib.HTMLElement, scala.Double, scala.Double, java.lang.String, scala.Unit]
  ): Touch = {
    val __obj = js.Dynamic.literal(config = config, disable = disable, enable = enable, limit = limit, scrollTo = scrollTo)
  
    __obj.asInstanceOf[Touch]
  }
}

