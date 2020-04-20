package typings.terminalKit

import typings.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChar extends js.Object {
  var attr: Attributes
  var char: String
}

object AnonChar {
  @scala.inline
  def apply(attr: Attributes, char: String): AnonChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChar]
  }
}

