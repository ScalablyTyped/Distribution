package typings.webidl2.mod

import typings.webidl2.webidl2Strings.dictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescriptionDictionary extends ValueDescription {
  var `type`: dictionary
}

object ValueDescriptionDictionary {
  @scala.inline
  def apply(`type`: dictionary): ValueDescriptionDictionary = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescriptionDictionary]
  }
}

