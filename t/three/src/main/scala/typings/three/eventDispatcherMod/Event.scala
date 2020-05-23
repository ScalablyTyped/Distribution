package typings.three.eventDispatcherMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends /* attachment */ StringDictionary[js.Any] {
  var target: js.UndefOr[js.Any] = js.undefined
  var `type`: String
}

object Event {
  @scala.inline
  def apply(
    `type`: String,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    target: js.Any = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

