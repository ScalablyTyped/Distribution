package typings.three

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictattachment
  extends /* attachment */ StringDictionary[js.Any] {
  var `type`: String
}

object AnonDictattachment {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* attachment */ StringDictionary[js.Any] = null): AnonDictattachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictattachment]
  }
}

