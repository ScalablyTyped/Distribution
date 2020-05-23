package typings.xmlbuilder.anon

import typings.xmlbuilder.mod.XMLAttribute
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  var string: XMLAttribute
}

object String {
  @scala.inline
  def apply(string: XMLAttribute): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
}

