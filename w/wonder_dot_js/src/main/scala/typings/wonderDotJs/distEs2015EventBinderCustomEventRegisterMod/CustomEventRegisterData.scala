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
    val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CustomEventRegisterData]
  }
}

