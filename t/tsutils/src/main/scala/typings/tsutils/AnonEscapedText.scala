package typings.tsutils

import typings.tsutils.tsutilsStrings.Symbol
import typings.tsutils.tsutilsStrings.symbol_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEscapedText extends js.Object {
  var escapedText: symbol_
  var text: Symbol
}

object AnonEscapedText {
  @scala.inline
  def apply(escapedText: symbol_, text: Symbol): AnonEscapedText = {
    val __obj = js.Dynamic.literal(escapedText = escapedText.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEscapedText]
  }
}

