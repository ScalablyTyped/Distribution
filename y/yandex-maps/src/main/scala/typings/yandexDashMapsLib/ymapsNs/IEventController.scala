package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventController extends js.Object {
  var onStartListening: js.UndefOr[
    js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit]
  ] = js.undefined
  var onStopListening: js.UndefOr[
    js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit]
  ] = js.undefined
}

object IEventController {
  @scala.inline
  def apply(
    onStartListening: js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit] = null,
    onStopListening: js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit] = null
  ): IEventController = {
    val __obj = js.Dynamic.literal()
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(onStartListening)
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(onStopListening)
    __obj.asInstanceOf[IEventController]
  }
}

