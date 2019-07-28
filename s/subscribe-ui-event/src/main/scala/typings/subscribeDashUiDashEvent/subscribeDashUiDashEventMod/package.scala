package typings.subscribeDashUiDashEvent

import typings.std.TouchEvent
import typings.std.UIEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscribeDashUiDashEventMod {
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ TouchEvent, /* payload */ ArgmentedEvent[T], js.Any]
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ UIEvent, /* payload */ ArgmentedEvent[T], js.Any]
}
