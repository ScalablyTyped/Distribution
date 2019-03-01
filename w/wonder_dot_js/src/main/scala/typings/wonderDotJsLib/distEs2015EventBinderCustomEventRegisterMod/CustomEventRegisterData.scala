package typings
package wonderDotJsLib.distEs2015EventBinderCustomEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventRegisterData extends js.Object {
  var domHandler: js.Function
  var handler: js.Function
  var originHandler: js.Function
  var priority: scala.Double
  var target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
}

object CustomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    handler: js.Function,
    originHandler: js.Function,
    priority: scala.Double,
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
  ): CustomEventRegisterData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domHandler")(domHandler)
    __obj.updateDynamic("handler")(handler)
    __obj.updateDynamic("originHandler")(originHandler)
    __obj.updateDynamic("priority")(priority)
    __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[CustomEventRegisterData]
  }
}

