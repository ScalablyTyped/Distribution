package typings.winkTokenizer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var tag: Tag
  var value: String
}

object Token {
  @scala.inline
  def apply(tag: Tag, value: String): Token = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Token]
  }
}

