package typings.w3cCssTypedObjectModelLevel1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSKeywordValue extends CSSStyleValue {
  var value: String
}

object CSSKeywordValue {
  @scala.inline
  def apply(value: String): CSSKeywordValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSKeywordValue]
  }
}

