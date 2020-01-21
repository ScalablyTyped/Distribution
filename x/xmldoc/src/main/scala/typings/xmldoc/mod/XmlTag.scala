package typings.xmldoc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XmlTag extends js.Object {
  var attributes: XmlAttributes
  var name: String
}

object XmlTag {
  @scala.inline
  def apply(attributes: XmlAttributes, name: String): XmlTag = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[XmlTag]
  }
}

