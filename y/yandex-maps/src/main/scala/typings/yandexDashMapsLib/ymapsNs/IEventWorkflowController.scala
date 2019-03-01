package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventWorkflowController extends IEventController {
  var onAfterEventFiring: js.UndefOr[
    js.Function3[
      /* events */ IEventManager, 
      /* type */ java.lang.String, 
      /* event */ js.UndefOr[IEvent], 
      scala.Unit
    ]
  ] = js.undefined
  var onBeforeEventFiring: js.UndefOr[
    js.Function3[
      /* events */ IEventManager, 
      /* type */ java.lang.String, 
      /* event */ js.UndefOr[IEvent], 
      scala.Unit
    ]
  ] = js.undefined
}

object IEventWorkflowController {
  @scala.inline
  def apply(
    onAfterEventFiring: js.Function3[
      /* events */ IEventManager, 
      /* type */ java.lang.String, 
      /* event */ js.UndefOr[IEvent], 
      scala.Unit
    ] = null,
    onBeforeEventFiring: js.Function3[
      /* events */ IEventManager, 
      /* type */ java.lang.String, 
      /* event */ js.UndefOr[IEvent], 
      scala.Unit
    ] = null,
    onStartListening: js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit] = null,
    onStopListening: js.Function2[/* events */ IEventManager, /* type */ java.lang.String, scala.Unit] = null
  ): IEventWorkflowController = {
    val __obj = js.Dynamic.literal()
    if (onAfterEventFiring != null) __obj.updateDynamic("onAfterEventFiring")(onAfterEventFiring)
    if (onBeforeEventFiring != null) __obj.updateDynamic("onBeforeEventFiring")(onBeforeEventFiring)
    if (onStartListening != null) __obj.updateDynamic("onStartListening")(onStartListening)
    if (onStopListening != null) __obj.updateDynamic("onStopListening")(onStopListening)
    __obj.asInstanceOf[IEventWorkflowController]
  }
}

