package typings
package subscribeDashUiDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object subscribeDashUiDashEventMod {
  type EventType = UIEventType | TouchEventType
  type TouchEventCallback[T /* <: TouchEventType */] = js.Function2[/* event */ stdLib.TouchEvent, /* payload */ ArgmentedEvent[T], js.Any]
  type TouchEventType = subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.touchend | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.touchmove | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.touchmoveEnd | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.touchmoveStart | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.touchstart
  type UIEventCallback[T /* <: UIEventType */] = js.Function2[/* event */ stdLib.UIEvent, /* payload */ ArgmentedEvent[T], js.Any]
  type UIEventType = subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.resize | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.resizeEnd | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.resizeStart | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.scroll | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.scrollEnd | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.scrollStart | subscribeDashUiDashEventLib.subscribeDashUiDashEventLibStrings.visibilitychange
}
