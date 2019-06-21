package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute
  */
trait Attribute extends js.Object {
  var name: java.lang.String
  var text: java.lang.String
}

object Attribute {
  @scala.inline
  def apply(name: java.lang.String, text: java.lang.String): Attribute = {
    val __obj = js.Dynamic.literal(name = name, text = text)
  
    __obj.asInstanceOf[Attribute]
  }
}

