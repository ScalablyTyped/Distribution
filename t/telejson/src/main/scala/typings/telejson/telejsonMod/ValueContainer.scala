package typings.telejson.telejsonMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueContainer
  extends /* keys */ StringDictionary[js.Any] {
  var `_constructor-name_`: String
}

object ValueContainer {
  @scala.inline
  def apply(`_constructor-name_`: String, StringDictionary: /* keys */ StringDictionary[js.Any] = null): ValueContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_constructor-name_")(`_constructor-name_`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValueContainer]
  }
}

