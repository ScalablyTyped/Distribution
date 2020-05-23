package typings.uirouterCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var token: js.Any
  var value: js.Any
}

object Token {
  @scala.inline
  def apply(token: js.Any, value: js.Any): Token = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

