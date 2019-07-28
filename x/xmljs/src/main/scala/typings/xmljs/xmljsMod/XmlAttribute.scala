package typings.xmljs.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * XML Attribute, an attribute with a namespace
  */
trait XmlAttribute extends Attribute {
  var ns: String
}

object XmlAttribute {
  @scala.inline
  def apply(name: String, ns: String, text: String): XmlAttribute = {
    val __obj = js.Dynamic.literal(name = name, ns = ns, text = text)
  
    __obj.asInstanceOf[XmlAttribute]
  }
}

