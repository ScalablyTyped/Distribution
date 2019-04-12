package typings
package threeLib.srcCoreFace3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event
  extends /* attachment */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var target: js.UndefOr[js.Any] = js.undefined
  var `type`: java.lang.String
}

object Event {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    StringDictionary: /* attachment */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    target: js.Any = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (target != null) __obj.updateDynamic("target")(target)
    __obj.asInstanceOf[Event]
  }
}

