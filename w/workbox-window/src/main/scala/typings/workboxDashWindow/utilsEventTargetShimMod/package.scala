package typings.workboxDashWindow

import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsEventTargetShimMod {
  type EventListenerShim = js.Function1[/* evt */ WorkboxEvent, Unit]
}
