package typings
package winkDashTokenizerLib.winkDashTokenizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var tag: Tag
  var value: java.lang.String
}

object Token {
  @scala.inline
  def apply(tag: Tag, value: java.lang.String): Token = {
    val __obj = js.Dynamic.literal(tag = tag, value = value)
  
    __obj.asInstanceOf[Token]
  }
}

