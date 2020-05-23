package typings.three.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictattachment
  extends /* attachment */ StringDictionary[js.Any] {
  var `type`: String
}

object Dictattachment {
  @scala.inline
  def apply(`type`: String, StringDictionary: /* name */ StringDictionary[js.Any] = null): Dictattachment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictattachment]
  }
}

