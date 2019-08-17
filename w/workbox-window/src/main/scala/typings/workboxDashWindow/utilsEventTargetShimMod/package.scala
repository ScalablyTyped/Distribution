package typings.workboxDashWindow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsEventTargetShimMod {
  import typings.workboxDashWindow.utilsWorkboxEventMod.WorkboxEvent

  type EventListenerShim = js.Function1[/* evt */ WorkboxEvent, Unit]
}
