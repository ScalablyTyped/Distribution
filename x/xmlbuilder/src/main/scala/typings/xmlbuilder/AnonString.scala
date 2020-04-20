package typings.xmlbuilder

import typings.xmlbuilder.mod.XMLAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonString extends js.Object {
  var string: XMLAttribute
}

object AnonString {
  @scala.inline
  def apply(string: XMLAttribute): AnonString = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonString]
  }
}

