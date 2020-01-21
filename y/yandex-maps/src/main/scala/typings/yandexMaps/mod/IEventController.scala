package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventController extends js.Object {
  var onStartListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.undefined
  var onStopListening: js.UndefOr[js.Function2[/* events */ IEventManager, /* type */ String, Unit]] = js.undefined
}

object IEventController {
  @scala.inline
  def apply(
    onStartListening: (/* events */ IEventManager, /* type */ String) => Unit = null,
    onStopListening: (/* events */ IEventManager, /* type */ String) => Unit = null
  ): IEventController = {
    val __obj = js.Dynamic.literal()
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(js.Any.fromFunction2(onStartListening))
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(js.Any.fromFunction2(onStopListening))
    __obj.asInstanceOf[IEventController]
  }
}

