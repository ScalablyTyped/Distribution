package typings.xmljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute
  */
trait Attribute extends js.Object {
  var name: String
  var text: String
}

object Attribute {
  @scala.inline
  def apply(name: String, text: String): Attribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attribute]
  }
}

