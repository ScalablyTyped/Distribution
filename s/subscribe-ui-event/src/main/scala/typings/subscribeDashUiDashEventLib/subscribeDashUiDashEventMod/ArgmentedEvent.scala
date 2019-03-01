package typings
package subscribeDashUiDashEventLib.subscribeDashUiDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArgmentedEvent[T /* <: EventType */] extends js.Object {
  var mainType: java.lang.String
  var resize: subscribeDashUiDashEventLib.Anon_Height
  var scroll: subscribeDashUiDashEventLib.Anon_Delta
  var subType: java.lang.String
  var touch: subscribeDashUiDashEventLib.`Anon_`
  var `type`: T
}

object ArgmentedEvent {
  @scala.inline
  def apply[T /* <: EventType */](
    mainType: java.lang.String,
    resize: subscribeDashUiDashEventLib.Anon_Height,
    scroll: subscribeDashUiDashEventLib.Anon_Delta,
    subType: java.lang.String,
    touch: subscribeDashUiDashEventLib.`Anon_`,
    `type`: T
  ): ArgmentedEvent[T] = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("mainType")(mainType)
    __obj.updateDynamic("resize")(resize)
    __obj.updateDynamic("scroll")(scroll)
    __obj.updateDynamic("subType")(subType)
    __obj.updateDynamic("touch")(touch)
    __obj.asInstanceOf[ArgmentedEvent[T]]
  }
}

