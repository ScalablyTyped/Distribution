package typings.thepiratebay

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLink
  extends /* propName */ StringDictionary[js.Any] {
  var link: String
}

object AnonLink {
  @scala.inline
  def apply(link: String, StringDictionary: /* propName */ StringDictionary[js.Any] = null): AnonLink = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonLink]
  }
}

