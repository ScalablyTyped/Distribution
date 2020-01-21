package typings.wxServerSdk

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFieldName
  extends /* fieldName */ StringDictionary[js.Any] {
  var _id: js.Any
}

object AnonFieldName {
  @scala.inline
  def apply(_id: js.Any, StringDictionary: /* fieldName */ StringDictionary[js.Any] = null): AnonFieldName = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonFieldName]
  }
}

