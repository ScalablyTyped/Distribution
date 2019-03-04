package typings
package wonderDotJsLib.distEs2015EventBinderDomEventRegisterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEventRegisterData extends js.Object {
  var dom: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var domHandler: js.Function
  var eventData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<any> */ js.Any
  var handler: js.Function
  var originHandler: js.Function
  var priority: scala.Double
  var target: js.UndefOr[wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject] = js.undefined
}

object DomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    eventData: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
    handler: js.Function,
    originHandler: js.Function,
    priority: scala.Double,
    dom: stdLib.HTMLElement = null,
    target: wonderDotJsLib.distEs2015CoreEntityObjectEntityObjectMod.EntityObject = null
  ): DomEventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler, eventData = eventData, handler = handler, originHandler = originHandler, priority = priority)
    if (dom != null) __obj.updateDynamic("dom")(dom)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[DomEventRegisterData]
  }
}

