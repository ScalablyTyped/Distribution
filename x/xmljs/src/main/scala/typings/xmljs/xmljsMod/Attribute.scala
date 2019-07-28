package typings.xmljs.xmljsMod

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
    val __obj = js.Dynamic.literal(name = name, text = text)
  
    __obj.asInstanceOf[Attribute]
  }
}

