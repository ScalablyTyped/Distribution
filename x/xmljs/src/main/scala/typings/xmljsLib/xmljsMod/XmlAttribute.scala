package typings
package xmljsLib.xmljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * XML Attribute, an attribute with a namespace
  */
trait XmlAttribute extends Attribute {
  var ns: java.lang.String
}

object XmlAttribute {
  @scala.inline
  def apply(name: java.lang.String, ns: java.lang.String, text: java.lang.String): XmlAttribute = {
    val __obj = js.Dynamic.literal(name = name, ns = ns, text = text)
  
    __obj.asInstanceOf[XmlAttribute]
  }
}

