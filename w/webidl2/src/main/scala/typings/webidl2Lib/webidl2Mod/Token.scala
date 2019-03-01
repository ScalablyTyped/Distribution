package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var `type`: webidl2Lib.webidl2LibStrings.float | webidl2Lib.webidl2LibStrings.integer | webidl2Lib.webidl2LibStrings.identifier | webidl2Lib.webidl2LibStrings.string | webidl2Lib.webidl2LibStrings.whitespace | webidl2Lib.webidl2LibStrings.other
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(
    `type`: webidl2Lib.webidl2LibStrings.float | webidl2Lib.webidl2LibStrings.integer | webidl2Lib.webidl2LibStrings.identifier | webidl2Lib.webidl2LibStrings.string | webidl2Lib.webidl2LibStrings.whitespace | webidl2Lib.webidl2LibStrings.other,
    value: java.lang.String
  ): Token = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Token]
  }
}

