package typings.wonderDotJs.distEs2015EventBinderEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRegisterData extends js.Object {
  var domHandler: js.Function
  var handler: js.Function
  var originHandler: js.Function
  var priority: Double
}

object EventRegisterData {
  @scala.inline
  def apply(domHandler: js.Function, handler: js.Function, originHandler: js.Function, priority: Double): EventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventRegisterData]
  }
}

