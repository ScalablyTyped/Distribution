package typings.wonderJs.domEventRegisterMod

import typings.std.HTMLElement
import typings.wonderJs.entityObjectMod.EntityObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomEventRegisterData extends js.Object {
  var dom: js.UndefOr[HTMLElement] = js.undefined
  var domHandler: js.Function
  var eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any
  var handler: js.Function
  var originHandler: js.Function
  var priority: Double
  var target: js.UndefOr[EntityObject] = js.undefined
}

object DomEventRegisterData {
  @scala.inline
  def apply(
    domHandler: js.Function,
    eventData: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Hash<any> */ js.Any,
    handler: js.Function,
    originHandler: js.Function,
    priority: Double,
    dom: HTMLElement = null,
    target: EntityObject = null
  ): DomEventRegisterData = {
    val __obj = js.Dynamic.literal(domHandler = domHandler.asInstanceOf[js.Any], eventData = eventData.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], originHandler = originHandler.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomEventRegisterData]
  }
}

