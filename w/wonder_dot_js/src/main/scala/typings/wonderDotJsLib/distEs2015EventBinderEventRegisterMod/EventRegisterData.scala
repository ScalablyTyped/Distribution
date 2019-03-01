package typings
package wonderDotJsLib.distEs2015EventBinderEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegisterData extends js.Object {
  var domHandler: js.Function
  var handler: js.Function
  var originHandler: js.Function
  var priority: scala.Double
}

object EventRegisterData {
  @scala.inline
  def apply(domHandler: js.Function, handler: js.Function, originHandler: js.Function, priority: scala.Double): EventRegisterData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domHandler")(domHandler)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("originHandler")(originHandler)
    __obj.updateDynamic("priority")(priority)
    __obj.asInstanceOf[EventRegisterData]
  }
}

