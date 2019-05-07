package typings
package yandexDashMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Context extends js.Object {
  var context: js.UndefOr[js.Object] = js.undefined
  var controllers: js.UndefOr[js.Array[yandexDashMapsLib.yandexDashMapsMod.IEventWorkflowController]] = js.undefined
  var parent: js.UndefOr[yandexDashMapsLib.yandexDashMapsMod.IEventManager] = js.undefined
}

object Anon_Context {
  @scala.inline
  def apply(
    context: js.Object = null,
    controllers: js.Array[yandexDashMapsLib.yandexDashMapsMod.IEventWorkflowController] = null,
    parent: yandexDashMapsLib.yandexDashMapsMod.IEventManager = null
  ): Anon_Context = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (controllers != null) __obj.updateDynamic("controllers")(controllers)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    __obj.asInstanceOf[Anon_Context]
  }
}

