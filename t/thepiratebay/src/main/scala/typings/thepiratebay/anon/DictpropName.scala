package typings.thepiratebay.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DictpropName
  extends /* propName */ StringDictionary[js.Any] {
  var link: String
}

object DictpropName {
  @scala.inline
  def apply(link: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): DictpropName = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[DictpropName]
  }
}

