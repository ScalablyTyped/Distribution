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

