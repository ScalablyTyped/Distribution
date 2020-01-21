package typings.yandexMaps

import typings.yandexMaps.mod.IEventManager
import typings.yandexMaps.mod.IEventWorkflowController
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContext extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var controllers: js.UndefOr[js.Array[IEventWorkflowController]] = js.undefined
  var parent: js.UndefOr[IEventManager] = js.undefined
}

object AnonContext {
  @scala.inline
  def apply(
    context: js.Object = null,
    controllers: js.Array[IEventWorkflowController] = null,
    parent: IEventManager = null
  ): AnonContext = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (controllers != null) __obj.updateDynamic("controllers")(controllers.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContext]
  }
}

