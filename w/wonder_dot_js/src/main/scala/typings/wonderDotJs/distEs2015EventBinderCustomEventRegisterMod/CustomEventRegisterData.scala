package typings.wonderDotJs.distEs2015EventBinderCustomEventRegisterMod

import typings.wonderDotJs.distEs2015CoreEntityObjectEntityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEventRegisterData extends js.Object {
  var domHandler: js.Function
  var handler: js.Function
  var originHandler: js.Function
  var priority: Double
  var target: EntityObject
}

object CustomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    handler: js.Function,
    originHandler: js.Function,
    priority: Double,
    target: EntityObject
  ): CustomEventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler, handler = handler, originHandler = originHandler, priority = priority, target = target)
  
    __obj.asInstanceOf[CustomEventRegisterData]
  }
}

