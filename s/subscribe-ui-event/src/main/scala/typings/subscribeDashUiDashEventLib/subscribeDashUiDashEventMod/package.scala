package typings
package subscribeDashUiDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscribeDashUiDashEventMod {
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ stdLib.TouchEvent, /* payload */ ArgmentedEvent[T], js.Any]
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ stdLib.UIEvent, /* payload */ ArgmentedEvent[T], js.Any]
}
