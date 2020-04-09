package typings.webidl2.mod

import typings.webidl2.webidl2Strings.decimal
import typings.webidl2.webidl2Strings.identifier
import typings.webidl2.webidl2Strings.integer
import typings.webidl2.webidl2Strings.other
import typings.webidl2.webidl2Strings.string
import typings.webidl2.webidl2Strings.whitespace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `type`: decimal | integer | identifier | string | whitespace | other
  var value: String
}

object Token {
  @scala.inline
  def apply(`type`: decimal | integer | identifier | string | whitespace | other, value: String): Token = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

