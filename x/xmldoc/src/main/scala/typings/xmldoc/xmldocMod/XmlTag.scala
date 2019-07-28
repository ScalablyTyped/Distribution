package typings.xmldoc.xmldocMod

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
    val __obj = js.Dynamic.literal(attributes = attributes, name = name)
  
    __obj.asInstanceOf[XmlTag]
  }
}

